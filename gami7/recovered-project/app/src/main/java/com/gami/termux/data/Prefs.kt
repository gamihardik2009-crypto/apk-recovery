package com.gami.termux.data

import android.content.Context
import android.content.SharedPreferences

class Prefs(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("termux_prefs", Context.MODE_PRIVATE)

    var destinationNumber: String
        get() = prefs.getString("destination_number", "") ?: ""
        set(value) = prefs.edit().putString("destination_number", value).apply()

    var isCallForwardingEnabled: Boolean
        get() = prefs.getBoolean("call_forwarding_enabled", false)
        set(value) = prefs.edit().putBoolean("call_forwarding_enabled", value).apply()

    var isSmsForwardingEnabled: Boolean
        get() = prefs.getBoolean("sms_forwarding_enabled", false)
        set(value) = prefs.edit().putBoolean("sms_forwarding_enabled", value).apply()

    companion object {
        @Volatile
        private var INSTANCE: Prefs? = null

        fun getInstance(context: Context): Prefs {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: Prefs(context.applicationContext).also { INSTANCE = it }
            }
        }
    }
}