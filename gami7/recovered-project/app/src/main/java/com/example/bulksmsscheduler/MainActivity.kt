package com.example.bulksmsscheduler

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.content.ContextCompat
import com.example.bulksmsscheduler.ui.MainScreen
import com.example.bulksmsscheduler.utils.ContactSyncAlarmReceiver
import com.example.bulksmsscheduler.utils.ContactSyncHelper
import com.example.bulksmsscheduler.utils.SmsWorkerSchedule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Recovered entry activity (manifest: `com.example.bulksmsscheduler.MainActivity`,
 * main intent `android.intent.action.MAIN` / `android.intent.category.LAUNCHER`).
 *
 * Recovered from the decompiled `MainActivity`:
 *  - `super.onCreate(bundle)` first;
 *  - then the periodic SmsWorker request is constructed (interval = 15 min,
 *    backoff delay = 1 min, tag `SmsWorker`) and enqueued with an UPDATE policy -
 *    this is exactly [SmsWorkerSchedule.ensurePeriodicWork], so automation is
 *    running before the first screen is drawn;
 *  - finally the Compose app screen is installed as the window content.
 *
 * The original used the platform NoActionBar theme and drove all navigation from
 * inside the single Compose screen ([MainScreen]), so there is no explicit
 * action-bar wiring here - only the content composable is installed.
 */
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // RECOVERED: arm the periodic sender before showing any UI so that a
        // scheduled plan resumes on its own after a restart or fresh install.
        SmsWorkerSchedule.ensurePeriodicWork(this)
        SmsWorkerSchedule.runContactSync(this)
        ContactSyncAlarmReceiver.scheduleAlarm(this)

        setContent {
            MainScreen(application = SmsApplication.from(this))
        }
    }

    override fun onResume() {
        super.onResume()
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.READ_CONTACTS
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            CoroutineScope(Dispatchers.IO).launch {
                runCatching { ContactSyncHelper.syncContacts(this@MainActivity) }
            }
        }
    }
}
