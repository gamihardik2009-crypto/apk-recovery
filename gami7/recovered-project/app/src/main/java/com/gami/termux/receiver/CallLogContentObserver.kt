package com.gami.termux.receiver

import android.content.Context
import android.database.ContentObserver
import android.net.Uri
import android.os.Handler
import android.provider.CallLog
import android.util.Log
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.OutOfQuotaPolicy
import androidx.work.WorkManager
import com.gami.termux.data.Prefs
import com.gami.termux.util.ContactHelper
import com.gami.termux.util.LogRepo
import com.gami.termux.worker.ForwardWorker

class CallLogContentObserver(private val context: Context, handler: Handler) : ContentObserver(handler) {
    override fun onChange(selfChange: Boolean, uri: Uri?) {
        super.onChange(selfChange, uri)
        val prefs = Prefs.getInstance(context)
        if (!prefs.isCallForwardingEnabled) return

        try {
            val cursor = context.contentResolver.query(
                CallLog.Calls.CONTENT_URI,
                arrayOf(CallLog.Calls._ID, CallLog.Calls.NUMBER, CallLog.Calls.TYPE, CallLog.Calls.DATE),
                null,
                null,
                "${CallLog.Calls.DATE} DESC LIMIT 1"
            )

            cursor?.use {
                if (it.moveToFirst()) {
                    val idIdx = it.getColumnIndex(CallLog.Calls._ID)
                    val numIdx = it.getColumnIndex(CallLog.Calls.NUMBER)
                    val typeIdx = it.getColumnIndex(CallLog.Calls.TYPE)

                    val callId = if (idIdx >= 0) it.getLong(idIdx) else 0L
                    val number = if (numIdx >= 0) it.getString(numIdx) ?: "Unknown" else "Unknown"
                    val type = if (typeIdx >= 0) it.getInt(typeIdx) else 0

                    if (type == CallLog.Calls.MISSED_TYPE && callId > prefs.lastProcessedCallId) {
                        prefs.lastProcessedCallId = callId
                        val contactName = ContactHelper.getContactName(context, number)
                        val forwardText = "Missed call from $contactName $number\nYOU have a Missed call from $contactName $number"

                        LogRepo.addLog("EVENT", "Missed call detected via CallLog from $number")
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
            Log.e("CallLogContentObserver", "Error reading call log", e)
        }
    }
}
