package com.example.bulksmsscheduler.utils

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import com.example.bulksmsscheduler.R

object NotificationUtils {

    const val CHANNEL_ID = "schedule_info_channel"
    const val CHANNEL_NAME = "Schedule Capacity Notice"
    const val NOTIFICATION_ID_ADJUSTED = 2002

    fun showTimeGapAdjustedNotification(context: Context, adjustedGap: Int) {
        val notificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as? NotificationManager ?: return

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                CHANNEL_NAME,
                NotificationManager.IMPORTANCE_DEFAULT
            )
            notificationManager.createNotificationChannel(channel)
        }

        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("Time Gap Adjusted")
            .setContentText("Time gap automatically adjusted to $adjustedGap min to fit scheduled messages within working hours.")
            .setStyle(
                NotificationCompat.BigTextStyle()
                    .bigText("Time gap automatically adjusted to $adjustedGap min to fit all scheduled messages within working hours.")
            )
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)
            .build()

        notificationManager.notify(NOTIFICATION_ID_ADJUSTED, notification)
    }
}
