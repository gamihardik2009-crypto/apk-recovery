package com.example.bulksmsscheduler.utils

import android.content.Context
import androidx.work.BackoffPolicy
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

/**
 * Helper around the work requests.
 *
 * RECOVERED from `MainActivity.onCreate()`, which literally did:
 *
 * ```
 * val request = PeriodicWorkRequestBuilder<SmsWorker>(15, TimeUnit.MINUTES)
 *     .setBackoffCriteria(BackoffPolicy.LINEAR, 1, TimeUnit.MINUTES)
 *     .build()
 * WorkManager.getInstance(this)
 *     .enqueueUniquePeriodicWork("SmsWorker", ExistingPeriodicWorkPolicy.UPDATE, request)
 * ```
 *
 * (The original decompiles to direct `WorkSpec` field writes because R8 inlined
 * the builders - interval 15 min is WorkManager's minimum, backoff delay 1 min is
 * clamped by WorkManager to 10 s .. 5 h, and the enqueue policy integer was `2`,
 * which is `UPDATE` in `ExistingPeriodicWorkPolicy`.)
 */
object SmsWorkerSchedule {

    /**
     * RECOVERED: enqueued from `MainActivity.onCreate()` on every app start, with a
     * policy that keeps a running schedule but updates its parameters.
     */
    fun ensurePeriodicWork(context: Context) {
        val request =
            PeriodicWorkRequestBuilder<SmsWorker>(
                SmsWorker.PERIODIC_INTERVAL_MINUTES,
                TimeUnit.MINUTES,
            )
                .setBackoffCriteria(BackoffPolicy.LINEAR, 1, TimeUnit.MINUTES)
                .addTag(SmsWorker.PERIODIC_WORK_NAME)
                .build()

        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            SmsWorker.PERIODIC_WORK_NAME,
            ExistingPeriodicWorkPolicy.UPDATE,
            request,
        )

        val contactRequest =
            PeriodicWorkRequestBuilder<ContactSyncWorker>(
                15,
                TimeUnit.MINUTES,
            )
                .setBackoffCriteria(BackoffPolicy.LINEAR, 1, TimeUnit.MINUTES)
                .addTag("ContactSyncWorker")
                .build()

        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            "ContactSyncWorker",
            ExistingPeriodicWorkPolicy.UPDATE,
            contactRequest,
        )
    }

    /** Replaces the periodic worker (used when automation is switched on). */
    fun restartPeriodicWork(context: Context) {
        val request =
            PeriodicWorkRequestBuilder<SmsWorker>(
                SmsWorker.PERIODIC_INTERVAL_MINUTES,
                TimeUnit.MINUTES,
            )
                .setBackoffCriteria(BackoffPolicy.LINEAR, 1, TimeUnit.MINUTES)
                .addTag(SmsWorker.PERIODIC_WORK_NAME)
                .build()

        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            SmsWorker.PERIODIC_WORK_NAME,
            ExistingPeriodicWorkPolicy.REPLACE,
            request,
        )
    }

    /** Cancels the periodic sender and the self-scheduled one-time worker. */
    fun cancelAll(context: Context) {
        val workManager = WorkManager.getInstance(context)
        workManager.cancelUniqueWork(SmsWorker.PERIODIC_WORK_NAME)
        workManager.cancelUniqueWork(SmsWorker.NEXT_WORK_NAME)
    }

    /**
     * Runs the worker immediately - used by "Restart engine" / "Send now"
     * (the original app relied on the periodic + self-rescheduling workers only,
     * so this immediate variant is an addition, see RECOVERY_REPORT.md).
     */
    fun runNow(context: Context) {
        val request =
            OneTimeWorkRequestBuilder<SmsWorker>()
                .addTag(SmsWorker.NEXT_WORK_TAG)
                .build()

        WorkManager.getInstance(context).enqueueUniqueWork(
            SmsWorker.NEXT_WORK_NAME,
            ExistingWorkPolicy.REPLACE,
            request,
        )
    }

    fun runContactSync(context: Context) {
        val request = OneTimeWorkRequestBuilder<ContactSyncWorker>().build()
        WorkManager.getInstance(context).enqueueUniqueWork(
            "ContactSyncOneTime",
            ExistingWorkPolicy.REPLACE,
            request,
        )
    }
}
