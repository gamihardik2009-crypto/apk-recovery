package com.example.bulksmsscheduler.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "plan_update_logs")
data class PlanUpdateLog(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val timestamp: String,
    val message: String,
    val reason: String
)
