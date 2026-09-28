package com.example.bulksmsscheduler.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.bulksmsscheduler.model.PlanUpdateLog
import kotlinx.coroutines.flow.Flow

@Dao
interface PlanUpdateLogDao {
    @Query("SELECT * FROM plan_update_logs ORDER BY id DESC")
    fun observeAllLogs(): Flow<List<PlanUpdateLog>>

    @Query("SELECT * FROM plan_update_logs ORDER BY id DESC")
    suspend fun getAllLogs(): List<PlanUpdateLog>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLog(log: PlanUpdateLog)

    @Query("DELETE FROM plan_update_logs")
    suspend fun deleteAllLogs()
}
