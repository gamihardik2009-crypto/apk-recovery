package com.example.bulksmsscheduler.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * A recipient of the broadcast ("client" in the app's own wording).
 */
@Entity(tableName = "clients")
data class Client(
    @PrimaryKey val id: String,
    val name: String,
    val phone: String,
    val notes: String = "",
    val active: Boolean = true,
    val orderIndex: Int,
    val useNameInTemplate: Boolean = true,
    @ColumnInfo(name = "source")
    val source: String = ClientSource.MANUAL,
    val smsPerWeek: Int = -1, // -1 means use global settings default
)

object ClientSource {
    const val MANUAL = "MANUAL"
    const val CONTACT = "CONTACT"
}

object ClientPhones {
    fun normalize(phone: String): String = phone.filter { it.isDigit() }
}
