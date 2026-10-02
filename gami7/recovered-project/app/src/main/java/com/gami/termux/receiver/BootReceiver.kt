package com.gami.termux.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            Log.d("BootReceiver", "Termux Forwarder initialized on boot")
            // No specific action needed as static receivers are handled by OS,
            // but we could start a long-running service here if required.
        }
    }
}