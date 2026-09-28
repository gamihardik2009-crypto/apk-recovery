package com.example.bulksmsscheduler.engine

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.telephony.SmsManager
import com.example.bulksmsscheduler.model.Schedule
import com.example.bulksmsscheduler.model.ScheduleStatus
import com.example.bulksmsscheduler.repository.SmsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import java.util.concurrent.ConcurrentHashMap

/**
 * The "engine" that actually hands messages to the telephony stack.
 *
 * RECOVERED behaviour (original class name was obfuscated):
 *  - holds `SmsManager` obtained via `getSystemService(SmsManager::class.java)` on
 *    API 31+ and `SmsManager.getDefault()` below that;
 *  - owns its own `CoroutineScope(Dispatchers.IO)`;
 *  - registers a *dynamic* `SMS_SENT` broadcast receiver (see [SmsSentReceiver]);
 *  - `divideMessage()` first: multi-part bodies go out through
 *    `sendMultipartTextMessage(...)` with one sent-`PendingIntent` per part, a
 *    single-part body goes out through `sendTextMessage(...)`;
 *  - delivery reports are NOT requested (the `deliveryIntent` argument is always
 *    `null`) - the app only tracks SENT / FAILED;
 *  - if the `SmsManager` call itself throws, the schedule is immediately marked
 *    [ScheduleStatus.FAILED];
 *  - before calling `SmsManager` the destination number is stripped of every
 *    character that is not a digit or `+` (`Regex("[^0-9+]")`).
 */
class SmsSender(
    private val context: Context,
    private val repository: SmsRepository,
) {

    private data class MultiPartTracker(
        val totalParts: Int,
        val successfulParts: MutableSet<Int> = mutableSetOf(),
    )

    private val multiPartTrackers = ConcurrentHashMap<String, MultiPartTracker>()

    private val smsManager: SmsManager? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            context.getSystemService(SmsManager::class.java)
        } else {
            @Suppress("DEPRECATION")
            SmsManager.getDefault()
        }

    /** RECOVERED: the engine keeps its own scope so sends outlive the caller. */
    val scope: CoroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    val smsSentReceiver: SmsSentReceiver = SmsSentReceiver(this)

    suspend fun send(schedule: Schedule, destination: String) {
        val settings = repository.getSettings()
        val subId = settings?.selectedSubscriptionId ?: -1

        val subManager = if (subId >= 0) {
            runCatching {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                    context.getSystemService(SmsManager::class.java)?.createForSubscriptionId(subId)
                } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
                    @Suppress("DEPRECATION")
                    SmsManager.getSmsManagerForSubscriptionId(subId)
                } else null
            }.getOrNull()
        } else {
            null
        }

        val manager = subManager ?: smsManager ?: runCatching {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                context.getSystemService(SmsManager::class.java)
            } else {
                @Suppress("DEPRECATION")
                SmsManager.getDefault()
            }
        }.getOrNull()

        if (manager == null || destination.isBlank()) {
            repository.updateSchedule(schedule.copy(status = ScheduleStatus.FAILED))
            return
        }

        val parts = runCatching { manager.divideMessage(schedule.message) }.getOrNull()
        if (parts == null || parts.isEmpty()) {
            repository.updateSchedule(schedule.copy(status = ScheduleStatus.FAILED))
            return
        }

        try {
            if (parts.size > 1) {
                multiPartTrackers[schedule.id] = MultiPartTracker(parts.size)
                val sentIntents = ArrayList<PendingIntent>(parts.size)
                for (index in parts.indices) {
                    sentIntents.add(sentPendingIntent(context, schedule.id, index))
                }
                manager.sendMultipartTextMessage(destination, null, parts, sentIntents, null)
                repository.updateSchedule(schedule.copy(status = ScheduleStatus.SENT))
            } else {
                manager.sendTextMessage(
                    destination,
                    null,
                    schedule.message,
                    sentPendingIntent(context, schedule.id, 0),
                    null,
                )
                repository.updateSchedule(schedule.copy(status = ScheduleStatus.SENT))
            }
        } catch (error: Exception) {
            multiPartTrackers.remove(schedule.id)
            // RECOVERED: an immediate exception marks the message failed.
            repository.updateSchedule(schedule.copy(status = ScheduleStatus.FAILED))
        }
    }

    suspend fun onPartSent(scheduleId: String, partIndex: Int) {
        val tracker = multiPartTrackers[scheduleId]
        if (tracker == null) {
            onSmsSent(scheduleId)
            return
        }
        tracker.successfulParts.add(partIndex)
        if (tracker.successfulParts.size >= tracker.totalParts) {
            multiPartTrackers.remove(scheduleId)
            onSmsSent(scheduleId)
        }
    }

    /** Marks a delivered-to-network message as SENT, keeping any other state. */
    suspend fun onSmsSent(scheduleId: String) {
        val schedule = repository.getScheduleById(scheduleId) ?: return
        if (schedule.status != ScheduleStatus.SENT) {
            repository.updateSchedule(schedule.copy(status = ScheduleStatus.SENT))
        }
    }

    /** Marks a rejected message as FAILED. */
    suspend fun onSmsFailed(scheduleId: String) {
        multiPartTrackers.remove(scheduleId)
        val schedule = repository.getScheduleById(scheduleId) ?: return
        if (schedule.status != ScheduleStatus.FAILED) {
            repository.updateSchedule(schedule.copy(status = ScheduleStatus.FAILED))
        }
    }

    companion object {
        /** RECOVERED action string of the sent-`PendingIntent`. */
        const val ACTION_SMS_SENT = "SMS_SENT"
        const val EXTRA_SCHEDULE_ID = "scheduleId"
        const val EXTRA_PART_INDEX = "partIndex"

        /** RECOVERED flags: FLAG_UPDATE_CURRENT | FLAG_IMMUTABLE (0x0C000000). */
        private const val PENDING_INTENT_FLAGS =
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE

        private val PHONE_SANITIZER = Regex("[^0-9+]")

        /**
         * RECOVERED: strips spaces, dashes, brackets and letters so that
         * `SmsManager` receives a dialable destination.
         */
        fun normalizePhoneNumber(raw: String): String = PHONE_SANITIZER.replace(raw, "")

        /**
         * RECOVERED: request code is `(scheduleId + partIndex).hashCode()`, which
         * makes every part of a multi-part message addressable.
         */
        fun sentPendingIntent(context: Context, scheduleId: String, partIndex: Int): PendingIntent {
            val intent = Intent(ACTION_SMS_SENT).apply {
                putExtra(EXTRA_SCHEDULE_ID, scheduleId)
                putExtra(EXTRA_PART_INDEX, partIndex)
                setPackage(context.packageName)
            }
            return PendingIntent.getBroadcast(
                context,
                (scheduleId + partIndex).hashCode(),
                intent,
                PENDING_INTENT_FLAGS,
            )
        }
    }
}
