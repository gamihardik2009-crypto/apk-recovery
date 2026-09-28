package com.example.bulksmsscheduler.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.bulksmsscheduler.model.AppSettings
import kotlinx.coroutines.flow.Flow

/**
 * RECOVERED settings DAO ("SettingsDao" - original class name was obfuscated).
 *
 * Recovered statements:
 *  - `SELECT * FROM app_settings WHERE id = 0`
 *  - `INSERT OR REPLACE INTO app_settings (...) VALUES (?,?,?,?,?,?,?,?,?)`
 */
@Dao
interface SettingsDao {

    @Query("SELECT * FROM app_settings WHERE id = 0")
    fun observeSettings(): Flow<AppSettings?>

    @Query("SELECT * FROM app_settings WHERE id = 0")
    suspend fun getSettings(): AppSettings?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertSettings(settings: AppSettings)
}
