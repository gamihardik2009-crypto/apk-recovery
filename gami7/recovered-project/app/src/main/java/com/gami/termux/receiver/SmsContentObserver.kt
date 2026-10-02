package com.gami.termux.receiver

import android.content.Context
import android.database.ContentObserver
import android.net.Uri
import android.os.Handler
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

class SmsContentObserver(private val context: Context, handler: Handler) : ContentObserver(handler) {
    override fun onChange(selfChange: Boolean, uri: Uri?) {
        super.onChange(selfChange, uri)
        val prefs = Prefs.getInstance(context)
        if (!prefs.isSmsForwardingEnabled) return

        try {
            val cursor = context.contentResolver.query(
                Telephony.Sms.CONTENT_URI,
                arrayOf(Telephony.Sms._ID, Telephony.Sms.ADDRESS, Telephony.Sms.BODY, Telephony.Sms.DATE, Telephony.Sms.TYPE),
                "${Telephony.Sms.TYPE} = ?",
                arrayOf("1"), // 1 = Inbox (Incoming SMS)
                "${Telephony.Sms.DATE} DESC LIMIT 1"
            )

            cursor?.use {
                if (it.moveToFirst()) {
                    val idIdx = it.getColumnIndex(Telephony.Sms._ID)
                    val addressIdx = it.getColumnIndex(Telephony.Sms.ADDRESS)
                    val bodyIdx = it.getColumnIndex(Telephony.Sms.BODY)

                    val smsId = if (idIdx >= 0) it.getLong(idIdx) else 0L
                    val sender = if (addressIdx >= 0) it.getString(addressIdx) ?: "Unknown" else "Unknown"
                    val body = if (bodyIdx >= 0) it.getString(bodyIdx) ?: "" else ""

                    if (smsId > prefs.lastProcessedSmsId) {
                        prefs.lastProcessedSmsId = smsId
                        val contactName = ContactHelper.getContactName(context, sender)
                        val forwardText = "SMS from $contactName $sender: $body"

                        LogRepo.addLog("EVENT", "Incoming SMS detected via Observer from $sender")
                        val data = Data.Builder().putString("message", forwardText).build()
                        val workRequest = OneTimeWorkRequestBuilder<ForwardWorker>()
                            .setInputData(data)
                            .setExpedited(OutOfQuotaPolicy.DROP_WORK_REQUEST)
                            .build()
                        WorkManager.getInstance(context).enqueue(workRequest)
                    }
                }
            }
        } catch (e: Exception) {
            Log.e("SmsContentObserver", "Error reading inbox SMS", e)
        }
    }
}
