package com.example.bulksmsscheduler.model

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * One queued SMS: "send [message] to the client of [clientId] at
 * [scheduledDate] [scheduledTime]".
 *
 * RECOVERED table definition (note: the message text is *pre-composed* and
 * stored, it is not re-derived at send time):
 * ```
 * CREATE TABLE IF NOT EXISTS `schedules` (
 *   `id` TEXT NOT NULL, `clientId` TEXT NOT NULL, `templateId` TEXT NOT NULL,
 *   `scheduledDate` TEXT NOT NULL, `scheduledTime` TEXT NOT NULL,
 *   `status` TEXT NOT NULL, `retryCount` INTEGER NOT NULL, `campaignId` TEXT,
 *   `week` TEXT NOT NULL, `message` TEXT NOT NULL, PRIMARY KEY(`id`))
 * CREATE INDEX ... `index_schedules_status_scheduledDate_scheduledTime`
 * ```
 *
 * `scheduledDate` is an ISO `yyyy-MM-dd` string and `scheduledTime` is an ISO
 * `HH:mm[:ss]` string; the worker compares them lexicographically, which is why
 * they are TEXT and not epoch numbers.
 */
@Entity(
    tableName = "schedules",
    indices = [Index(value = ["status", "scheduledDate", "scheduledTime"])],
)
data class Schedule(
    @PrimaryKey val id: String,
    val clientId: String,
    val templateId: String,
    val scheduledDate: String,
    val scheduledTime: String,
    val status: ScheduleStatus,
    val retryCount: Int = 0,
    /** Nullable in the DB - never written by the recovered code paths. */
    val campaignId: String? = null,
    /** Human readable bucket, e.g. `"Week 23/09"` (see SchedulePlanner). */
    val week: String,
    val message: String,
)
