package com.example.bulksmsscheduler.utils

import com.example.bulksmsscheduler.model.AppSettings
import com.example.bulksmsscheduler.model.Client
import com.example.bulksmsscheduler.model.MessageTemplate
import com.example.bulksmsscheduler.model.Schedule
import com.example.bulksmsscheduler.ui.getNextWorkingStartDate
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

/**
 * Locks down the timing rules of the updated planner:
 *  - Time Gap is automatically calculated from weekly working hours / total weekly SMS count.
 *  - Next working hours start date calculation logic.
 *  - "SMS Per Week" determines templates per week with rotation.
 *  - Every new batch/week starts on Monday of that week (for week > 0).
 */
class SchedulePlannerTest {

    /** 2026-09-21 is a Monday - fixed so the expectations are deterministic. */
    private val monday: LocalDate = LocalDate.of(2026, 9, 21)
    private val nineAm: LocalTime = LocalTime.of(9, 0)

    private fun settings(
        gapMinutes: Int = 5,
        smsPerWeek: Int = 2,
        skipSunday: Boolean = false,
        workStart: String = "09:00",
        workEnd: String = "18:00"
    ) = AppSettings(
        workStartTime = workStart,
        workEndTime = workEnd,
        skipSunday = skipSunday,
        timeGapMinutes = gapMinutes,
        smsPerWeek = smsPerWeek,
        automationEnabled = true
    )

    private fun clients(count: Int): List<Client> = (1..count).map { index ->
        Client(
            id = "c$index",
            name = "Client $index",
            phone = "900000000$index",
            orderIndex = index
        )
    }

    private fun templates(count: Int = 4): List<MessageTemplate> = (1..count).map { index ->
        MessageTemplate(
            id = "t$index",
            title = "Template $index",
            greeting = "",
            message = "message $index",
            order = index
        )
    }

    private fun clientMessages(plan: List<Schedule>, clientId: String): List<Schedule> =
        plan.filter { it.clientId == clientId }
            .sortedBy { it.scheduledDate + it.scheduledTime }

    private fun Schedule.at(): Pair<String, String> = scheduledDate to scheduledTime

    @Test
    fun `next working start date calculation`() {
        val appSettings = settings(workStart = "09:00", skipSunday = true)

        // Case 1: Before work start time today (8:00 AM Mon) -> starts TODAY
        val before8am = LocalDateTime.of(monday, LocalTime.of(8, 0))
        assertEquals(monday, getNextWorkingStartDate(appSettings, before8am))

        // Case 2: At or after work start time today (1:00 PM Mon) -> starts TOMORROW (Tuesday)
        val after1pm = LocalDateTime.of(monday, LocalTime.of(13, 0))
        assertEquals(monday.plusDays(1), getNextWorkingStartDate(appSettings, after1pm))

        // Case 3: Saturday 1:00 PM with skipSunday = true -> skips Sunday to Monday
        val saturday1pm = LocalDateTime.of(LocalDate.of(2026, 9, 19), LocalTime.of(13, 0))
        assertEquals(monday, getNextWorkingStartDate(appSettings, saturday1pm))
    }

    @Test
    fun `auto calculated time gap distributes messages evenly across week`() {
        // 7 days * 540 minutes = 3780 total week minutes
        // 756 total messages -> gap = 3780 / 756 = 5 minutes
        val (plan, _, planGap) = SchedulePlanner.generateMultiWeekPlan(
            settings = settings(smsPerWeek = 1),
            startDate = monday,
            startTime = nineAm,
            clients = clients(756),
            templates = templates(1),
            numberOfWeeks = 1
        )

        assertEquals(756, plan.size)
        assertEquals(5, planGap)
        assertEquals("09:00", plan[0].scheduledTime)
        assertEquals("09:05", plan[1].scheduledTime)
        assertEquals("09:10", plan[2].scheduledTime)
    }

    @Test
    fun `multi week plan rotates templates per week and starts on mondays`() {
        // 1 client with 2 SMS per week over 7 working days (3780 min / 2 = 1890 min gap = +1d 7h 30m)
        val (plan, _) = SchedulePlanner.generateMultiWeekPlan(
            settings = settings(gapMinutes = 1890, smsPerWeek = 2),
            startDate = monday,
            startTime = nineAm,
            clients = clients(1),
            templates = templates(4),
            numberOfWeeks = 2
        )

        val clientSchedules = clientMessages(plan, "c1")
        assertEquals(4, clientSchedules.size)
        // Week 1 (Monday 2026-09-21): templates t1, t2
        assertEquals("2026-09-21" to "09:00", clientSchedules[0].at())
        assertEquals("t1", clientSchedules[0].templateId)
        assertEquals("2026-09-22" to "16:30", clientSchedules[1].at())
        assertEquals("t2", clientSchedules[1].templateId)

        // Week 2 (Monday 2026-09-28): templates t3, t4
        assertEquals("2026-09-28" to "09:00", clientSchedules[2].at())
        assertEquals("t3", clientSchedules[2].templateId)
        assertEquals("2026-09-29" to "16:30", clientSchedules[3].at())
        assertEquals("t4", clientSchedules[3].templateId)
    }

    @Test
    fun `sunday is skipped when skipSunday is on`() {
        val plan = SchedulePlanner.generateSchedules(
            settings = settings(gapMinutes = 1, workEnd = "09:10", skipSunday = true),
            startDate = LocalDate.of(2026, 9, 19),
            startTime = nineAm,
            clients = clients(20),
            templates = templates(1)
        )

        assertFalse(plan.any { it.scheduledDate == "2026-09-20" })
        assertTrue(plan.any { it.scheduledDate == "2026-09-21" })
    }

    @Test
    fun `multi client rotation with different sms frequencies per week`() {
        val client1 = Client(id = "c1", name = "C1", phone = "101", orderIndex = 1, smsPerWeek = 3)
        val client2 = Client(id = "c2", name = "C2", phone = "102", orderIndex = 2, smsPerWeek = 1)
        val client3 = Client(id = "c3", name = "C3", phone = "103", orderIndex = 3, smsPerWeek = 2)

        val tmpl = templates(5) // t1, t2, t3, t4, t5

        val (plan, _) = SchedulePlanner.generateMultiWeekPlan(
            settings = settings(gapMinutes = 5),
            startDate = monday,
            startTime = nineAm,
            clients = listOf(client1, client2, client3),
            templates = tmpl,
            numberOfWeeks = 2
        )

        // Week 1 schedules
        val week1Schedules = plan.filter { it.week == "21/09" }
        assertEquals(6, week1Schedules.size) // C1 (3) + C2 (1) + C3 (2) = 6

        // Check Round-robin order within Week 1:
        // Round 1: C1 (t1), C2 (t1), C3 (t1)
        assertEquals("c1" to "t1", week1Schedules[0].clientId to week1Schedules[0].templateId)
        assertEquals("c2" to "t1", week1Schedules[1].clientId to week1Schedules[1].templateId)
        assertEquals("c3" to "t1", week1Schedules[2].clientId to week1Schedules[2].templateId)

        // Round 2: C1 (t2), C3 (t2)
        assertEquals("c1" to "t2", week1Schedules[3].clientId to week1Schedules[3].templateId)
        assertEquals("c3" to "t2", week1Schedules[4].clientId to week1Schedules[4].templateId)

        // Round 3: C1 (t3)
        assertEquals("c1" to "t3", week1Schedules[5].clientId to week1Schedules[5].templateId)

        // Week 2 schedules (Monday 2026-09-28)
        val week2Schedules = plan.filter { it.week == "28/09" }
        assertEquals(6, week2Schedules.size)

        // Check Round-robin order and continuous template rotation within Week 2:
        // Round 1: C1 (t4), C2 (t2), C3 (t3)
        assertEquals("c1" to "t4", week2Schedules[0].clientId to week2Schedules[0].templateId)
        assertEquals("c2" to "t2", week2Schedules[1].clientId to week2Schedules[1].templateId)
        assertEquals("c3" to "t3", week2Schedules[2].clientId to week2Schedules[2].templateId)

        // Round 2: C1 (t5), C3 (t4)
        assertEquals("c1" to "t5", week2Schedules[3].clientId to week2Schedules[3].templateId)
        assertEquals("c3" to "t4", week2Schedules[4].clientId to week2Schedules[4].templateId)

        // Round 3: C1 wraps around to t1!
        assertEquals("c1" to "t1", week2Schedules[5].clientId to week2Schedules[5].templateId)
    }

    @Test
    fun `initial template pointers pick up from where client left off`() {
        val client1 = Client(id = "c1", name = "C1", phone = "101", orderIndex = 1, smsPerWeek = 2)
        val tmpl = templates(3) // t1, t2, t3

        // Suppose client1 already sent 1 message previously (started at t1, so next is t2)
        val initialPointers = mapOf("c1" to 1)

        val (plan, _) = SchedulePlanner.generateMultiWeekPlan(
            settings = settings(gapMinutes = 5),
            startDate = monday,
            startTime = nineAm,
            clients = listOf(client1),
            templates = tmpl,
            numberOfWeeks = 1,
            initialTemplatePointers = initialPointers
        )

        val schedules = plan.filter { it.clientId == "c1" }
        assertEquals(2, schedules.size)
        // Client1 sent 1 previously, so current pointer is 1 => t2, then 2 => t3
        assertEquals("t2", schedules[0].templateId)
        assertEquals("t3", schedules[1].templateId)
    }

    @Test
    fun `manual time gap respected when within max capacity limit`() {
        // 7 days * 540 minutes = 3780 total week minutes
        // 10 messages -> max gap = 378 minutes.
        // User sets manual gap = 15 minutes.
        val planResult = SchedulePlanner.generateMultiWeekPlan(
            settings = settings(gapMinutes = 15, smsPerWeek = 1),
            startDate = monday,
            startTime = nineAm,
            clients = clients(10),
            templates = templates(1),
            numberOfWeeks = 1
        )

        assertEquals(15, planResult.effectiveGap)
        assertFalse(planResult.wasAutoAdjusted)
        assertEquals("09:00", planResult.schedules[0].scheduledTime)
        assertEquals("09:15", planResult.schedules[1].scheduledTime)
    }

    @Test
    fun `manual time gap capped at week max gap when user input exceeds max gap`() {
        // 7 days * 540 minutes = 3780 total week minutes
        // 756 messages -> max gap = 5 minutes.
        // User sets manual gap = 30 minutes (exceeds max gap of 5 mins).
        val planResult = SchedulePlanner.generateMultiWeekPlan(
            settings = settings(gapMinutes = 30, smsPerWeek = 1),
            startDate = monday,
            startTime = nineAm,
            clients = clients(756),
            templates = templates(1),
            numberOfWeeks = 1
        )

        assertEquals(5, planResult.effectiveGap)
        assertTrue(planResult.wasAutoAdjusted)
        assertEquals("09:00", planResult.schedules[0].scheduledTime)
        assertEquals("09:05", planResult.schedules[1].scheduledTime)
    }
}
