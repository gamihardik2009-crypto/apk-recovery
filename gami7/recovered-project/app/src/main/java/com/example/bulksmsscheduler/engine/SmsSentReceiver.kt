package com.example.bulksmsscheduler.engine

import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import kotlinx.coroutines.launch

/**
 * Receives the `SMS_SENT` `PendingIntent` results.
 *
 * RECOVERED logic:
 *  - `EXTRA_SCHEDULE_ID` must be present, otherwise nothing happens;
 *  - `EXTRA_PART_INDEX` defaults to 0;
 *  - success (`Activity.RESULT_OK` == -1) *and* `partIndex == 0` ->
 *    [SmsSender.onSmsSent] (which only promotes a PENDING schedule to SENT);
 *  - any other result code -> [SmsSender.onSmsFailed] (always FAILED).
 *
 * The original receiver was a private inner class of the engine and was
 * registered dynamically in `SmsApplication.onCreate()` - it is NOT declared in
 * the manifest.  On API 33+ it is registered with `RECEIVER_NOT_EXPORTED`.
 */
class SmsSentReceiver(private val sender: SmsSender) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val scheduleId = intent.getStringExtra(SmsSender.EXTRA_SCHEDULE_ID) ?: return
        val partIndex = intent.getIntExtra(SmsSender.EXTRA_PART_INDEX, 0)
        val sentOk = getResultCode() == Activity.RESULT_OK

        sender.scope.launch {
            if (sentOk) {
                sender.onPartSent(scheduleId, partIndex)
            } else {
                sender.onSmsFailed(scheduleId)
            }
        }
    }
}
