package com.example.bulksmsscheduler

import android.app.Application
import android.content.IntentFilter
import android.os.Build
import com.example.bulksmsscheduler.data.AppDatabase
import com.example.bulksmsscheduler.engine.SmsSender
import com.example.bulksmsscheduler.repository.SmsRepository
import com.example.bulksmsscheduler.utils.SchedulePlanner
import com.example.bulksmsscheduler.utils.SmsWorker
import com.example.bulksmsscheduler.utils.SmsWorkerSchedule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

/**
 * Recovered `SmsApplication`.
 *
 * RECOVERED structure:
 *  - three lazy singletons, all created from the database instance:
 *    `AppDatabase` -> `SmsRepository` -> `SmsSender` ("engine");
 *  - `onCreate()` builds the engine, registers the dynamic `SMS_SENT` receiver
 *    (`RECEIVER_NOT_EXPORTED` on API 33+) and then launches a coroutine that
 *    performs the start-up work.
 *
 * The original start-up coroutine (recovered) made sure the settings row exists
 * and that a periodic [SmsWorker] is armed, so that automation resumes by itself
 * after a reboot or a fresh install without the UI being opened first.
 */
class SmsApplication : Application() {

    private val applicationScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    val database: AppDatabase by lazy { AppDatabase.getInstance(this) }

    val repository: SmsRepository by lazy { SmsRepository(database, this) }

    val smsSender: SmsSender by lazy { SmsSender(this, repository) }

    override fun onCreate() {
        super.onCreate()

        // RECOVERED: the receiver is registered dynamically, not in the manifest.
        val filter = IntentFilter(SmsSender.ACTION_SMS_SENT)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            registerReceiver(smsSender.smsSentReceiver, filter, RECEIVER_NOT_EXPORTED)
        } else {
            @Suppress("UnspecifiedRegisterReceiverFlag")
            registerReceiver(smsSender.smsSentReceiver, filter)
        }

        applicationScope.launch {
            // Create the settings row on first launch (recovered behaviour).
            repository.getOrCreateSettings()

            // Arm the periodic sender so automation works without opening the UI.
            SmsWorkerSchedule.ensurePeriodicWork(this@SmsApplication)
        }
    }

    /** Convenience used by the UI: "a plan exists and automation is running". */
    suspend fun hasPendingWork(): Boolean = repository.getScheduleCount() > 0

    companion object {
        /** Exposed so UI code can reach the recovered services. */
        fun from(context: android.content.Context): SmsApplication =
            context.applicationContext as SmsApplication
    }
}
