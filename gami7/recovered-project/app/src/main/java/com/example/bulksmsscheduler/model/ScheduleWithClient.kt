package com.example.bulksmsscheduler.model

import androidx.room.Embedded
import androidx.room.Relation

/**
 * RECOVERED: `ScheduleWithClient(schedule, client)` - produced by Room from the
 * `INNER JOIN clients ON schedules.clientId = clients.id` queries.
 *
 * `client` is nullable because the join is only used for display and a client
 * row may legitimately be missing (the DB has no foreign keys).
 */
data class ScheduleWithClient(
    @Embedded val schedule: Schedule,
    @Relation(parentColumn = "clientId", entityColumn = "id")
    val client: Client?,
)
