package com.example.bulksmsscheduler.utils

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class ContactSyncWorker(
    appContext: Context,
    params: WorkerParameters,
) : CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result {
        return try {
            ContactSyncHelper.syncContacts(applicationContext)
            Result.success()
        } catch (e: Exception) {
            e.printStackTrace()
            Result.retry()
        }
    }
}
