package com.example.bulksmsscheduler.data

import androidx.room.TypeConverter
import com.example.bulksmsscheduler.model.ScheduleStatus

/**
 * `schedules.status` is stored as TEXT ("SENT"/"FAILED"/"PENDING").
 *
 * The original app had an equivalent converter (the recovered code calls
 * `ScheduleStatus.valueOf(...)` when reading rows and `.name` when binding);
 * it is reconstructed here because Room needs an explicit converter for enums.
 */
class Converters {

    @TypeConverter
    fun fromScheduleStatus(status: ScheduleStatus?): String? = status?.name

    @TypeConverter
    fun toScheduleStatus(value: String?): ScheduleStatus? =
        value?.let { name -> ScheduleStatus.entries.firstOrNull { it.name == name } }
}
