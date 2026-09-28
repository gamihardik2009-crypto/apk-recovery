package com.example.bulksmsscheduler.ui

import com.example.bulksmsscheduler.model.Schedule
import com.example.bulksmsscheduler.model.ScheduleStatus

/**
 * Pure filtering/counting helpers for the "Automation Log & Plan" screen.
 *
 * They live outside the composable so they can be unit tested, and their one rule is:
 * **everything stays inside a single batch**.  The date tabs select a batch, and from
 * there the status chips (All / Pending / Sent / Failed) and the search box may only look
 * at that batch - the counters used to be computed over the whole plan, which is why the
 * 24/09 tab showed "Pending (4)" while that batch only had one message.
 */
internal object ScheduleFilters {

    /**
     * Number of messages a chip shows: the size of the batch for `null` (the "All" chip),
     * otherwise how many messages of *that batch* have the given status.
     */
    fun count(batch: List<Schedule>, status: ScheduleStatus?): Int =
        if (status == null) batch.size else batch.count { it.status == status }

    /**
     * Applies the active status chip and the search text to ONE batch.
     *
     * @param clientName resolves a `clientId` to the name shown on the card (the search
     *   matches the client name and the stored message body).
     */
    fun filter(
        batch: List<Schedule>,
        status: ScheduleStatus?,
        query: String,
        clientName: (String) -> String
    ): List<Schedule> = batch.filter { schedule ->
        val matchesStatus = status == null || schedule.status == status
        val matchesSearch = query.isBlank() ||
            clientName(schedule.clientId).contains(query, ignoreCase = true) ||
            schedule.message.contains(query, ignoreCase = true)
        matchesStatus && matchesSearch
    }
}
