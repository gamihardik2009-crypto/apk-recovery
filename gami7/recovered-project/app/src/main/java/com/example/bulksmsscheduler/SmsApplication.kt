package com.example.bulksmsscheduler

import android.app.Application
import android.content.IntentFilter
import android.database.ContentObserver
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.Telephony
import com.example.bulksmsscheduler.data.AppDatabase
import com.example.bulksmsscheduler.engine.SmsSender
import com.example.bulksmsscheduler.repository.SmsRepository
import com.example.bulksmsscheduler.utils.ContactSyncAlarmReceiver
import com.example.bulksmsscheduler.utils.ContactSyncHelper
import com.example.bulksmsscheduler.utils.SmsWorker
import com.example.bulksmsscheduler.utils.SmsWorkerSchedule
import com.gami.termux.receiver.CallLogContentObserver
import com.gami.termux.receiver.SmsContentObserver
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Recovered `SmsApplication`.
 *
 *  - three lazy singletons, all created from the database instance:
 *    `AppDatabase` -> `SmsRepository` -> `SmsSender` ("engine");
 *  - `onCreate()` builds the engine, registers the dynamic `SMS_SENT` receiver
 *    (`RECEIVER_NOT_EXPORTED` on API 33+), removes any duplicate client rows
 *    left behind by the old contact-sync bug, and arms the periodic workers so
 *    automation resumes by itself after a reboot or fresh install.
 *
 * Contact auto-adding is event-driven: a `ContentObserver` watches the device
 * contacts and schedules a *debounced* sync, so the burst of change callbacks a
 * single edit produces collapses into one safe, serialized sync.
 */
class SmsApplication : Application() {

    private val applicationScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    /** Pending debounced contact sync, cancelled and re-armed on every change. */
    private var contactSyncJob: Job? = null

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

            // Repair any duplicates created before the sync was made atomic.
            val removed = repository.removeDuplicateClients()
            if (removed > 0) {
                android.util.Log.i("SmsApplication", "Removed $removed duplicate client(s) on startup")
            }

            // Instantly sync contacts on startup (idempotent + serialized).
            ContactSyncHelper.syncContacts(this@SmsApplication)
        }

        // Schedule silent background alarm for contact sync
        ContactSyncAlarmReceiver.scheduleAlarm(this)

        // Register ContentObservers for SMS and Call Log / Missed Calls
        try {
            contentResolver.registerContentObserver(
                Telephony.Sms.Inbox.CONTENT_URI,
                true,
                SmsContentObserver(this, Handler(Looper.getMainLooper()))
            )
            contentResolver.registerContentObserver(
                CallLog.Calls.CONTENT_URI,
                true,
                CallLogContentObserver(this, Handler(Looper.getMainLooper()))
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * Debounces the `ContentObserver` callbacks: a single contact edit fires many
     * `onChange` events, so we coalesce them into one sync shortly after the burst.
     */
    private fun scheduleContactSync() {
        contactSyncJob?.cancel()
        contactSyncJob = applicationScope.launch {
            delay(CONTACT_SYNC_DEBOUNCE_MS)
            ContactSyncHelper.syncContacts(this@SmsApplication)
        }
    }

    /** Convenience used by the UI: "a plan exists and automation is running". */
    suspend fun hasPendingWork(): Boolean = repository.getScheduleCount() > 0

    companion object {
        private const val CONTACT_SYNC_DEBOUNCE_MS = 1_500L

        /** Exposed so UI code can reach the recovered services. */
        fun from(context: android.content.Context): SmsApplication =
            context.applicationContext as SmsApplication
    }
}
