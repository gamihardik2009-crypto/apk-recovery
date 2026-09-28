package com.example.bulksmsscheduler

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.lifecycleScope
import com.example.bulksmsscheduler.ui.AppContainer
import com.example.bulksmsscheduler.utils.GithubAutoUpdater
import com.example.bulksmsscheduler.utils.SmsWorkerSchedule
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
 * inside the single Compose screen ([AppContainer]), so there is no explicit
 * action-bar wiring here - only the content composable is installed.
 */
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // RECOVERED: arm the periodic sender before showing any UI so that a
        // scheduled plan resumes on its own after a restart or fresh install.
        SmsWorkerSchedule.ensurePeriodicWork(this)

        // Check for GitHub release updates in background
        lifecycleScope.launch {
            val update = GithubAutoUpdater.checkForUpdate()
            if (update != null) {
                GithubAutoUpdater.downloadAndInstall(this@MainActivity, update.apkUrl)
            }
        }

        setContent {
            AppContainer(application = SmsApplication.from(this))
        }
    }
}