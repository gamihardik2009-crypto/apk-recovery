package com.example.bulksmsscheduler.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.bulksmsscheduler.data.dao.ClientDao
import com.example.bulksmsscheduler.data.dao.ScheduleDao
import com.example.bulksmsscheduler.data.dao.SettingsDao
import com.example.bulksmsscheduler.data.dao.SyncedContactDao
import com.example.bulksmsscheduler.data.dao.TemplateDao
import com.example.bulksmsscheduler.model.AppSettings
import com.example.bulksmsscheduler.model.Client
import com.example.bulksmsscheduler.model.MessageTemplate
import com.example.bulksmsscheduler.model.Schedule
import com.example.bulksmsscheduler.model.SyncedContact

/**
 * Recovered Room database.
 */
@Database(
    entities = [
        Client::class,
        MessageTemplate::class,
        Schedule::class,
        AppSettings::class,
        SyncedContact::class,
    ],
    version = 17,
    exportSchema = true,
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun clientDao(): ClientDao

    abstract fun templateDao(): TemplateDao

    abstract fun scheduleDao(): ScheduleDao

    abstract fun settingsDao(): SettingsDao

    abstract fun syncedContactDao(): SyncedContactDao

    companion object {
        private const val DATABASE_NAME = "sms_scheduler_database"

        /** Adds the `synced_contacts` table used by the auto contact sync. */
        private val MIGRATION_16_17 = object : Migration(16, 17) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL(
                    "CREATE TABLE IF NOT EXISTS `synced_contacts` (" +
                        "`phone` TEXT NOT NULL, " +
                        "`name` TEXT NOT NULL, " +
                        "`syncedAt` INTEGER NOT NULL, " +
                        "PRIMARY KEY(`phone`))"
                )
            }
        }

        @Volatile
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            instance ?: synchronized(this) {
                instance ?: build(context.applicationContext).also { instance = it }
            }

        private fun build(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                .addMigrations(MIGRATION_16_17)
                .fallbackToDestructiveMigration(true)
                .build()
    }
}
