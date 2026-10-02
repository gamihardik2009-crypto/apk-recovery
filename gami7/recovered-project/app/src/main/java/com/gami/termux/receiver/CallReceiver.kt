package com.gami.termux.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import android.util.Log
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.gami.termux.data.Prefs
import com.gami.termux.util.ContactHelper
import com.gami.termux.util.LogRepo
import com.gami.termux.worker.ForwardWorker

class CallReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != TelephonyManager.ACTION_PHONE_STATE_CHANGED) return

        val prefs = Prefs.getInstance(context)
        if (!prefs.isCallForwardingEnabled) return

        val stateString = intent.getStringExtra(TelephonyManager.EXTRA_STATE)
        val number = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER)
        
        Log.d("CallReceiver", "State: $stateString, Number: $number")

        val state = when (stateString) {
            TelephonyManager.EXTRA_STATE_RINGING -> TelephonyManager.CALL_STATE_RINGING
            TelephonyManager.EXTRA_STATE_OFFHOOK -> TelephonyManager.CALL_STATE_OFFHOOK
            TelephonyManager.EXTRA_STATE_IDLE -> TelephonyManager.CALL_STATE_IDLE
            else -> TelephonyManager.CALL_STATE_IDLE
        }

        val tempPrefs = context.getSharedPreferences("call_temp", Context.MODE_PRIVATE)
        val lastSavedState = tempPrefs.getInt("last_state", TelephonyManager.CALL_STATE_IDLE)

        if (state == TelephonyManager.CALL_STATE_RINGING && number != null) {
            tempPrefs.edit().putString("incoming_number", number).apply()
            LogRepo.addLog("EVENT", "Incoming call from $number")
        }

        if (lastSavedState == TelephonyManager.CALL_STATE_RINGING && state == TelephonyManager.CALL_STATE_IDLE) {
            val savedNumber = tempPrefs.getString("incoming_number", null)
            val finalNumber = savedNumber ?: number ?: "Unknown"
            val contactName = ContactHelper.getContactName(context, finalNumber)

            // Updated to be absolute plain text to prevent accidental clickables/links
            // while following the requested message content.
            val forwardText = "Missed call from $contactName $finalNumber\nYOU have a Missed call from $contactName $finalNumber"
            
            LogRepo.addLog("EVENT", "Missed call from $finalNumber - Forwarding...")
            
            val data = Data.Builder()
                .putString("message", forwardText)
                .build()

            val workRequest = OneTimeWorkRequestBuilder<ForwardWorker>()
                .setInputData(data)
                .build()

            WorkManager.getInstance(context).enqueue(workRequest)
            
            tempPrefs.edit().remove("incoming_number").apply()
        }

        tempPrefs.edit().putInt("last_state", state).apply()
    }
}