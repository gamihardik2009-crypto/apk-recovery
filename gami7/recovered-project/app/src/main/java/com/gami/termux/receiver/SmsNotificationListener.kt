package com.gami.termux.receiver

import android.app.Notification
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.OutOfQuotaPolicy
import androidx.work.WorkManager
import com.gami.termux.data.Prefs
import com.gami.termux.util.LogRepo
import com.gami.termux.worker.ForwardWorker

class SmsNotificationListener : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification) {
        super.onNotificationPosted(sbn)
        val prefs = Prefs.getInstance(applicationContext)
        if (!prefs.isSmsForwardingEnabled && !prefs.isCallForwardingEnabled) return

        val packageName = sbn.packageName
        val extras = sbn.notification.extras
        val title = extras.getCharSequence(Notification.EXTRA_TITLE)?.toString() ?: "Unknown"
        val text = extras.getCharSequence(Notification.EXTRA_TEXT)?.toString() ?: ""

        Log.d("SmsNotificationListener", "Notification from $packageName: title=$title, text=$text")

        val isSmsApp = packageName.contains("messaging") || 
                       packageName.contains("sms") || 
                       packageName.contains("mms") ||
                       packageName.contains("whatsapp") ||
                       packageName.contains("telecom") ||
                       packageName.contains("dialer") ||
                       packageName.contains("phone")

        if (isSmsApp && text.isNotBlank()) {
            val forwardText = "Alert from $title: $text"
            LogRepo.addLog("EVENT", "Detected notification from $title")

            val data = Data.Builder()
                .putString("message", forwardText)
                .build()

            val workRequest = OneTimeWorkRequestBuilder<ForwardWorker>()
                .setInputData(data)
                .setExpedited(OutOfQuotaPolicy.DROP_WORK_REQUEST)
                .build()

            WorkManager.getInstance(applicationContext).enqueue(workRequest)
        }
    }
}
