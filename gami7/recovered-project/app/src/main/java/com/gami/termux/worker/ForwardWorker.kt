package com.gami.termux.worker

import android.content.Context
import android.os.Build
import android.telephony.SmsManager
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.gami.termux.data.Prefs
import com.gami.termux.util.LogRepo

class ForwardWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    override fun doWork(): Result {
        val message = inputData.getString("message") ?: return Result.failure()
        val destination = Prefs.getInstance(applicationContext).destinationNumber

        if (destination.isBlank()) {
            Log.e("ForwardWorker", "No destination number set")
            LogRepo.addLog("ERROR", "No destination number set")
            return Result.failure()
        }

        return try {
            val smsManager: SmsManager? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                applicationContext.getSystemService(SmsManager::class.java)
            } else {
                @Suppress("DEPRECATION")
                SmsManager.getDefault()
            }
            
            if (smsManager == null) {
                LogRepo.addLog("ERROR", "SmsManager not available")
                return Result.failure()
            }
            
            val parts = smsManager.divideMessage(message)
            smsManager.sendMultipartTextMessage(destination, null, parts, null, null)
            Log.d("ForwardWorker", "SMS forwarded to $destination: $message")
            LogRepo.addLog("SUCCESS", "Forwarded to $destination")
            Result.success()
        } catch (e: Exception) {
            Log.e("ForwardWorker", "Failed to send SMS", e)
            LogRepo.addLog("ERROR", "Failed to send: ${e.message}")
            Result.retry()
        }
    }
}