package com.example.bulksmsscheduler.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Single-row settings table (`id = 0`).
 */
@Entity(tableName = "app_settings")
data class AppSettings(
    @PrimaryKey val id: Int = SINGLETON_ID,
    val workStartTime: String = "09:00",
    val workEndTime: String = "18:00",
    val skipSunday: Boolean = true,
    /** Delay inserted between two consecutive messages of a plan. */
    val timeGapMinutes: Int = 5,
    /** Number of SMS templates sent per week for each client. */
    val smsPerWeek: Int = 2,
    /**
     * How many templates take part in the rotation.
     */
    val messageRotationCount: Int = 4,
    val automationEnabled: Boolean = false,
    /** "New data added, restart the engine" flag. */
    val newDataAdded: Boolean = false,
    /** ISO `yyyy-MM-dd`; empty means "start today". */
    val automationStartDate: String = "",
    /** Message describing the last plan update/regeneration and reason. */
    val lastPlanUpdateMessage: String = "",
    /** Selected SIM card subscription ID (-1 for default/primary). */
    val selectedSubscriptionId: Int = -1,
) {
    companion object {
        const val SINGLETON_ID = 0
    }
}
