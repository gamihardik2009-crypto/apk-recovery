package com.gami.termux.util

import androidx.compose.runtime.mutableStateListOf
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class LogEntry(
    val timestamp: Long,
    val type: String, // SUCCESS, ERROR, EVENT
    val message: String
)

object LogRepo {
    val logs = mutableStateListOf<LogEntry>()
    private val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

    fun addLog(type: String, message: String) {
        val entry = LogEntry(
            timestamp = System.currentTimeMillis(),
            type = type,
            message = message
        )
        logs.add(0, entry)
        if (logs.size > 50) logs.removeAt(logs.size - 1)
    }

    fun clearLogs() {
        logs.clear()
    }
}