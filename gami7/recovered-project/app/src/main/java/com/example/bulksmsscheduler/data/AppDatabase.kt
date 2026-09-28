package com.example.bulksmsscheduler.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.bulksmsscheduler.data.dao.ClientDao
import com.example.bulksmsscheduler.data.dao.ScheduleDao
import com.example.bulksmsscheduler.data.dao.SettingsDao
import com.example.bulksmsscheduler.data.dao.TemplateDao
import com.example.bulksmsscheduler.model.AppSettings
import com.example.bulksmsscheduler.model.Client
import com.example.bulksmsscheduler.model.MessageTemplate
import com.example.bulksmsscheduler.model.Schedule

/**
 * Recovered Room database.
 */
@Database(
    entities = [
        Client::class,
        MessageTemplate::class,
        Schedule::class,
        AppSettings::class,
    ],
    version = 16,
    exportSchema = true,
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun clientDao(): ClientDao

    abstract fun templateDao(): TemplateDao

    abstract fun scheduleDao(): ScheduleDao

    abstract fun settingsDao(): SettingsDao

    companion object {
        private const val DATABASE_NAME = "sms_scheduler_database"

        @Volatile
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            instance ?: synchronized(this) {
                instance ?: build(context.applicationContext).also { instance = it }
            }

        private fun build(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration(true)
                .build()
    }
}
