package com.example.bulksmsscheduler.ui

import com.example.bulksmsscheduler.model.Schedule
import com.example.bulksmsscheduler.model.ScheduleStatus
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * The date tabs of the Plan screen select ONE batch, so the status chips and the search
 * box must never look outside it.  Regression test for "the 24/09 tab showed Pending (4)
 * while that batch only had one message".
 */
class ScheduleFiltersTest {

    private val names = mapOf("c1" to "try", "c2" to "dkd")
    private val nameOf: (String) -> String = { names[it] ?: "" }

    private fun schedule(
        id: String,
        clientId: String,
        batch: String,
        status: ScheduleStatus,
        message: String = "hii {name}"
    ) = Schedule(
        id = id,
        clientId = clientId,
        templateId = "t1",
        scheduledDate = "2026-09-24",
        scheduledTime = "09:00",
        status = status,
        week = batch,
        message = message
    )

    /** 24/09: one pending message (what the phone had); 29/09: three pending + one sent. */
    private val batch2409 = listOf(schedule("a", "c1", "24/09", ScheduleStatus.PENDING))
    private val batch2909 = listOf(
        schedule("b", "c1", "29/09", ScheduleStatus.PENDING),
        schedule("c", "c2", "29/09", ScheduleStatus.PENDING, "hello dkd"),
        schedule("d", "c1", "29/09", ScheduleStatus.PENDING),
        schedule("e", "c2", "29/09", ScheduleStatus.SENT)
    )

    @Test
    fun `chips count only the selected batch`() {
        assertEquals(1, ScheduleFilters.count(batch2409, null))
        assertEquals(1, ScheduleFilters.count(batch2409, ScheduleStatus.PENDING))
        assertEquals(0, ScheduleFilters.count(batch2409, ScheduleStatus.SENT))
        assertEquals(0, ScheduleFilters.count(batch2409, ScheduleStatus.FAILED))

        assertEquals(4, ScheduleFilters.count(batch2909, null))
        assertEquals(3, ScheduleFilters.count(batch2909, ScheduleStatus.PENDING))
        assertEquals(1, ScheduleFilters.count(batch2909, ScheduleStatus.SENT))
    }

    @Test
    fun `status chip filters inside the batch`() {
        val pending = ScheduleFilters.filter(batch2909, ScheduleStatus.PENDING, "", nameOf)
        assertEquals(listOf("b", "c", "d"), pending.map { it.id })

        val sent = ScheduleFilters.filter(batch2909, ScheduleStatus.SENT, "", nameOf)
        assertEquals(listOf("e"), sent.map { it.id })

        assertTrue(ScheduleFilters.filter(batch2909, ScheduleStatus.FAILED, "", nameOf).isEmpty())
    }

    @Test
    fun `search does not spill into other batches`() {
        // "dkd" only appears in the 29/09 batch, so the 24/09 tab must stay empty.
        assertTrue(ScheduleFilters.filter(batch2409, null, "dkd", nameOf).isEmpty())
        assertEquals(listOf("c", "e"), ScheduleFilters.filter(batch2909, null, "dkd", nameOf).map { it.id })
    }

    @Test
    fun `search matches the client name and the stored message body`() {
        assertEquals(listOf("a"), ScheduleFilters.filter(batch2409, null, "try", nameOf).map { it.id })
        assertEquals(listOf("c"), ScheduleFilters.filter(batch2909, null, "hello", nameOf).map { it.id })
    }

    @Test
    fun `status chip and search combine`() {
        assertEquals(
            listOf("c"),
            ScheduleFilters.filter(batch2909, ScheduleStatus.PENDING, "dkd", nameOf).map { it.id }
        )
        // The sent message of the same client is hidden while "Pending" is selected.
        assertTrue(ScheduleFilters.filter(batch2909, ScheduleStatus.SENT, "hello", nameOf).isEmpty())
    }

    @Test
    fun `no chip and no query lists the whole batch`() {
        assertEquals(listOf("b", "c", "d", "e"), ScheduleFilters.filter(batch2909, null, "", nameOf).map { it.id })
    }
}
