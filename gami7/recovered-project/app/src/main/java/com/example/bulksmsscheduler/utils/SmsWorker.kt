package com.example.bulksmsscheduler.utils

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.ServiceInfo
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.work.CoroutineWorker
import androidx.work.ForegroundInfo
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.example.bulksmsscheduler.R
import com.example.bulksmsscheduler.SmsApplication
import com.example.bulksmsscheduler.data.AppDatabase
import com.example.bulksmsscheduler.engine.SmsSender
import com.example.bulksmsscheduler.model.ScheduleStatus
import com.example.bulksmsscheduler.repository.SmsRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.time.Duration
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter

/**
 * The background sender.
 *
 * RECOVERED behaviour, in the original order:
 *
 * ```
 * 1.  Log.d("SmsWorker", "Worker started")
 * 2.  settings = repository.getOrCreateSettings()
 * 3.  if (settings == null)              -> log "Settings not found"        -> success
 * 4.  if (!settings.automationEnabled)    -> log "Automation disabled"        -> success
 * 5.  if (settings.skipSunday && today is Sunday)
 *                                         -> log "Skipping Sunday"            -> reschedule -> success
 * 6.  workStart = parse(settings.workStartTime) ?: 09:00
 *     workEnd   = parse(settings.workEndTime)   ?: 18:00
 *     if (now < workStart || now > workEnd)
 *                                         -> log "Outside work hours: n (Range: a-b)"
 *                                                                            -> reschedule -> success
 * 7.  due = scheduleDao.getDuePendingSchedules(today, today, now)
 * 8.  engine = (applicationContext as SmsApplication).smsSender
 * 9.  for (schedule in due) {
 *         if (isStopped) { log "Worker stopped, terminating batch"; break }
 *         client = clientDao.getClientById(schedule.clientId)
 *         if (client == null) { schedule.copy(status = FAILED); update; continue }
 *         log "Processing schedule <id> for <client name>"
 *         update(schedule.copy(status = SENT))       // optimistic claim
 *         engine.scope.launch { engine.send(schedule, normalized(client.phone)) }
 *         delay(2.seconds)                            // throttle between messages
 *     }
 * 10. reschedule()
 * 11. return success
 * ```
 *
 * `reschedule()` (also recovered):
 *  - find the next future PENDING schedule;
 *  - log "No future pending schedules found to auto-schedule" when there is none;
 *  - otherwise parse `"<scheduledDate>T<scheduledTime>"` (appending `":00"` when
 *    the stored time has only 5 characters), delay until then (minimum 3 s),
 *    log "Scheduling next worker in <n> seconds at <time>" and enqueue a unique
 *    one-time worker tagged `SmsWorker_Tag` / named `SmsWorker_Next`.
 *
 * Two known quirks inherited from the original are documented in
 * analysis/RECOVERY_REPORT.md ("Known bugs"):
 *  - the message is marked SENT *before* it is handed to `SmsManager`;
 *  - the `catch`/`reschedule` branches therefore race with the SMS_SENT receiver.
 */
class SmsWorker(
    context: Context,
    workerParameters: WorkerParameters,
) : CoroutineWorker(context, workerParameters) {

    override suspend fun doWork(): Result {
        Log.d(TAG, "Worker started")

        val database = AppDatabase.getInstance(applicationContext)
        val repository = SmsRepository(database, applicationContext)

        try {
            ContactSyncHelper.syncContacts(applicationContext)
        } catch (e: Exception) {
            Log.e(TAG, "Background contact sync failed", e)
        }

        val settings = repository.getOrCreateSettings()
        if (!settings.automationEnabled) {
            Log.d(TAG, "Automation disabled")
            return Result.success()
        }

        val now = LocalDateTime.now()

        if (settings.skipSunday && now.dayOfWeek == java.time.DayOfWeek.SUNDAY) {
            Log.d(TAG, "Skipping Sunday")
            reschedule(applicationContext, repository)
            return Result.success()
        }

        val workStart = settings.workStartTime.toLocalTimeOr(DefaultWorkStart)
        val workEnd = settings.workEndTime.toLocalTimeOr(DefaultWorkEnd)
        val currentTime = now.toLocalTime()

        if (currentTime.isBefore(workStart) || currentTime.isAfter(workEnd)) {
            Log.d(TAG, "Outside work hours: $currentTime (Range: $workStart-$workEnd)")
            reschedule(applicationContext, repository)
            return Result.success()
        }

        val today = now.toLocalDate().toString()
        val nowTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm"))
        val dueSchedules = repository.getDuePendingSchedules(today, nowTime)
        val sender = (applicationContext as SmsApplication).smsSender

        showForegroundNotification()

        for (schedule in dueSchedules) {
            if (isStopped) {
                Log.d(TAG, "Worker stopped, terminating batch")
                break
            }

            val client = repository.getClientById(schedule.clientId)
            if (client == null) {
                repository.updateSchedule(schedule.copy(status = ScheduleStatus.FAILED))
                continue
            }

            Log.d(TAG, "Processing schedule ${schedule.id} for ${client.name}")

            // FIXED: Status update is handled inside SmsSender.send() after successful dispatch
            // instead of prematurely marking SENT before transmission attempt.
            sender.scope.launch {
                sender.send(schedule, SmsSender.normalizePhoneNumber(client.phone))
            }

            // RECOVERED: fixed two-second gap between two messages of a batch.
            delay(BATCH_GAP_MILLIS)
        }

        reschedule(applicationContext, repository)
        return Result.success()
    }

    /**
     * RECOVERED `reschedule()` - arms a one-time worker for the next pending
     * message instead of waiting for the next 15-minute periodic tick.
     */
    private suspend fun reschedule(context: Context, repository: SmsRepository) {
        val now = LocalDateTime.now()

        val next = repository.getFirstPendingSchedule()
        if (next == null) {
            Log.d(TAG, "No pending schedules found to auto-schedule")
            return
        }

        try {
            // Robust parsing for "HH:mm" or "HH:mm:ss"
            val cleanTime = next.scheduledTime.trim()
            val timePart = when {
                cleanTime.length == 5 -> "$cleanTime:00"
                cleanTime.length >= 8 -> cleanTime.substring(0, 8)
                else -> cleanTime
            }
            val fireAt = LocalDateTime.parse("${next.scheduledDate}T$timePart")

            var delayMillis = Duration.between(now, fireAt).toMillis()
            if (delayMillis <= 0) delayMillis = MIN_RESCHEDULE_DELAY_MILLIS

            Log.d(TAG, "Scheduling next worker in ${delayMillis / 1000} seconds at $fireAt")

            val request =
                OneTimeWorkRequestBuilder<SmsWorker>()
                    .setInitialDelay(delayMillis, java.util.concurrent.TimeUnit.MILLISECONDS)
                    .addTag(NEXT_WORK_TAG)
                    .setInputData(workDataOf(KEY_SCHEDULED_FOR to fireAt.toString()))
                    .build()

            WorkManager.getInstance(context).enqueueUniqueWork(
                NEXT_WORK_NAME,
                androidx.work.ExistingWorkPolicy.REPLACE,
                request,
            )
        } catch (error: Exception) {
            Log.e(TAG, "Failed to parse schedule: ${next.scheduledDate} ${next.scheduledTime}", error)
        }
    }

    /**
     * RECOVERED notification: channel `sms_worker_channel` ("SMS Scheduler
     * Service", IMPORTANCE_LOW), title "Sending SMS", body
     * "Bulk SMS Scheduler is processing messages", notification id 1.
     */
    private suspend fun showForegroundNotification() {
        val notificationManager =
            applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                CHANNEL_NAME,
                NotificationManager.IMPORTANCE_LOW,
            )
            notificationManager.createNotificationChannel(channel)
        }

        val notification = NotificationCompat.Builder(applicationContext, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle(NOTIFICATION_TITLE)
            .setContentText(NOTIFICATION_TEXT)
            .setOngoing(true)
            .setSilent(true)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .build()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            setForeground(ForegroundInfo(NOTIFICATION_ID, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC))
        } else {
            setForeground(ForegroundInfo(NOTIFICATION_ID, notification))
        }
    }

    private fun String.toLocalTimeOr(default: LocalTime): LocalTime =
        runCatching { LocalTime.parse(this) }.getOrDefault(default)

    companion object {
        /** RECOVERED log tag. */
        const val TAG = "SmsWorker"

        /** RECOVERED unique periodic work name used by MainActivity. */
        const val PERIODIC_WORK_NAME = "SmsWorker"

        /** RECOVERED unique one-time work name used when rescheduling. */
        const val NEXT_WORK_NAME = "SmsWorker_Next"

        /** RECOVERED tag added to the one-time request. */
        const val NEXT_WORK_TAG = "SmsWorker_Tag"

        const val KEY_SCHEDULED_FOR = "scheduledFor"

        /** RECOVERED notification id + channel. */
        const val NOTIFICATION_ID = 1
        const val CHANNEL_ID = "sms_worker_channel"
        const val CHANNEL_NAME = "SMS Scheduler Service"
        const val NOTIFICATION_TITLE = "Sending SMS"
        const val NOTIFICATION_TEXT = "Bulk SMS Scheduler is processing messages"

        /** RECOVERED periodic interval: 15 minutes (WorkManager minimum). */
        const val PERIODIC_INTERVAL_MINUTES = 15L

        /** RECOVERED: 2 seconds between messages of one batch. */
        const val BATCH_GAP_MILLIS = 2_000L

        /** RECOVERED: minimum self-reschedule delay (3 s). */
        const val MIN_RESCHEDULE_DELAY_MILLIS = 3_000L

        private val DefaultWorkStart = LocalTime.of(9, 0)
        private val DefaultWorkEnd = LocalTime.of(18, 0)
    }
}
