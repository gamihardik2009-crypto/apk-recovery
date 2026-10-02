package com.gami.termux.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony
import android.util.Log
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.OutOfQuotaPolicy
import androidx.work.WorkManager
import com.gami.termux.data.Prefs
import com.gami.termux.util.ContactHelper
import com.gami.termux.util.LogRepo
import com.gami.termux.worker.ForwardWorker

class SmsReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d("SmsReceiver", "onReceive: ${intent.action}")
        if (intent.action != Telephony.Sms.Intents.SMS_RECEIVED_ACTION) return

        val prefs = Prefs.getInstance(context)
        if (!prefs.isSmsForwardingEnabled) return

        val messages = Telephony.Sms.Intents.getMessagesFromIntent(intent)
        for (sms in messages) {
            val sender = sms.originatingAddress ?: "Unknown"
            val body = sms.messageBody ?: ""
            val contactName = ContactHelper.getContactName(context, sender)

            LogRepo.addLog("EVENT", "SMS from $sender")

            // Format: “SMS from [Contact-Name or ‘Unknown’] [Phone-Number]: [Original-Message-Body]”
            val forwardText = "SMS from $contactName $sender: $body"

            val data = Data.Builder()
                .putString("message", forwardText)
                .build()

            val workRequest = OneTimeWorkRequestBuilder<ForwardWorker>()
                .setInputData(data)
                .setExpedited(OutOfQuotaPolicy.DROP_WORK_REQUEST)
                .build()

            WorkManager.getInstance(context).enqueue(workRequest)
        }
    }
}
