package com.example.bulksmsscheduler.utils

import com.example.bulksmsscheduler.model.AppSettings
import com.example.bulksmsscheduler.model.Client
import com.example.bulksmsscheduler.model.MessageTemplate
import com.example.bulksmsscheduler.model.Schedule
import com.example.bulksmsscheduler.model.ScheduleStatus
import java.time.DayOfWeek
import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Locale
import java.util.UUID

/**
 * Turns "clients x enabled templates" into a queue of concrete messages,
 * supporting individual per-client SMS frequencies per week.
 */
object SchedulePlanner {

    /** RECOVERED: the placeholder replaced inside a template body. */
    const val NAME_PLACEHOLDER = "{name}"

    private const val MAX_CURSOR_ROLLS = 366

    private val WEEK_FORMAT: DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM")

    data class PlanResult(
        val schedules: List<Schedule>,
        val warningMessage: String?,
        val effectiveGap: Int,
        val wasAutoAdjusted: Boolean = false,
        val maxPossibleGap: Int = 1,
    )

    data class SingleClientPlanResult(
        val schedules: List<Schedule>,
        val endCursor: LocalDateTime,
    )

    fun generateSchedules(
        settings: AppSettings,
        startDate: LocalDate,
        startTime: LocalTime,
        clients: List<Client>,
        templates: List<MessageTemplate>,
        startFromDateTime: LocalDateTime? = null,
        rotationIndex: Int = 0,
        batchLabelOverride: String? = null,
    ): List<Schedule> {
        val initialCursor = startFromDateTime ?: LocalDateTime.of(startDate, startTime)
        val initialPointers = clients.associateBy({ it.id }, { rotationIndex })
        val planResult = generateMultiWeekPlan(
            settings = settings.copy(smsPerWeek = 1),
            startDate = initialCursor.toLocalDate(),
            startTime = initialCursor.toLocalTime(),
            clients = clients.map { if (it.smsPerWeek >= 0) it.copy(smsPerWeek = 1) else it },
            templates = templates,
            numberOfWeeks = 1,
            initialTemplatePointers = initialPointers,
        )
        if (batchLabelOverride != null) {
            return planResult.schedules.map { it.copy(week = batchLabelOverride) }
        }
        return planResult.schedules
    }

    /**
     * Calculates the maximum possible time gap (in minutes) for a full working week batch given settings and clients.
     */
    fun calculateMaxPossibleGap(
        settings: AppSettings,
        clients: List<Client>,
        startDate: LocalDate = LocalDate.now().with(DayOfWeek.MONDAY),
        startTime: LocalTime? = null,
    ): Int {
        val activeClients = clients.filter { it.active }
        if (activeClients.isEmpty()) return settings.timeGapMinutes.coerceAtLeast(1)
        val globalSmsPerWeek = settings.smsPerWeek.coerceAtLeast(0)
        val weekMessagesMax = activeClients.sumOf { client ->
            val freq = if (client.smsPerWeek >= 0) client.smsPerWeek else globalSmsPerWeek
            freq.toLong()
        }
        if (weekMessagesMax <= 0) return settings.timeGapMinutes.coerceAtLeast(1)

        val (workStart, workEnd) = effectiveWorkWindow(settings)
        val actualStartTime = startTime ?: workStart
        val endOfWeek = startDate.plusDays(6)
        val weekWorkingMinutes = calculateRemainingWorkingMinutes(
            cursor = LocalDateTime.of(startDate, actualStartTime),
            endOfWeekDate = endOfWeek,
            workStart = workStart,
            workEnd = workEnd,
            skipSunday = settings.skipSunday
        )
        return (weekWorkingMinutes / weekMessagesMax).toInt().coerceAtLeast(1)
    }

    /**
     * Generates the multi-week plan supporting per-client SMS frequencies.
     * Each client progresses through the enabled templates in a continuous loop at their own speed.
     * Message scheduling order in each week rounds through clients by SMS frequency.
     */
    fun generateMultiWeekPlan(
        settings: AppSettings,
        startDate: LocalDate = LocalDate.now(),
        startTime: LocalTime = LocalTime.now(),
        clients: List<Client>,
        templates: List<MessageTemplate>,
        numberOfWeeks: Int = 4,
        initialTemplatePointers: Map<String, Int> = emptyMap(),
    ): PlanResult {
        val enabledTemplates = templates.filter { it.enabled }.sortedBy { it.order }
        val userTargetGap = settings.timeGapMinutes.coerceAtLeast(1)
        if (clients.isEmpty() || enabledTemplates.isEmpty()) {
            return PlanResult(
                schedules = emptyList(),
                warningMessage = null,
                effectiveGap = userTargetGap,
                wasAutoAdjusted = false,
                maxPossibleGap = userTargetGap,
            )
        }

        val globalSmsPerWeek = settings.smsPerWeek.coerceAtLeast(0)
        val (workStart, workEnd) = effectiveWorkWindow(settings)

        // Track each client's template index position continuously across weeks
        val clientPointers = clients.associateBy(
            keySelector = { it.id },
            valueTransform = { client -> initialTemplatePointers[client.id] ?: 0 },
        ).toMutableMap()

        val result = ArrayList<Schedule>()
        var overallEffectiveGap = userTargetGap
        var overallMaxPossibleGap = userTargetGap
        var wasAnyWeekAdjusted = false
        var firstWeekWarning: String? = null

        for (w in 0 until numberOfWeeks) {
            val weekStartDate = startDate.plusWeeks(w.toLong())
            val weekStartTime = if (w == 0) startTime else workStart
            val batchLabel = weekStartDate.format(WEEK_FORMAT)
            val endOfWeek = weekStartDate.plusDays(6)

            val weekMessagesMax = clients.sumOf { client ->
                val freq = if (client.smsPerWeek >= 0) client.smsPerWeek else globalSmsPerWeek
                freq.toLong()
            }

            // Calculate remaining/available working minutes for this specific week (handling mid-week start)
            val weekWorkingMinutes = calculateRemainingWorkingMinutes(
                cursor = LocalDateTime.of(weekStartDate, weekStartTime),
                endOfWeekDate = endOfWeek,
                workStart = workStart,
                workEnd = workEnd,
                skipSunday = settings.skipSunday
            )

            val maxGapForWeek = if (weekMessagesMax > 0) {
                (weekWorkingMinutes / weekMessagesMax).toInt().coerceAtLeast(1)
            } else {
                userTargetGap
            }

            val effectiveGap = minOf(userTargetGap, maxGapForWeek)

            if (userTargetGap > maxGapForWeek) {
                wasAnyWeekAdjusted = true
            }

            if (w == 0) {
                overallEffectiveGap = effectiveGap
                overallMaxPossibleGap = maxGapForWeek
                if (userTargetGap > maxGapForWeek) {
                    firstWeekWarning = "Time gap automatically adjusted to ${effectiveGap} min for week 1 (max allowed: ${maxGapForWeek} min)"
                }
            }

            var cursor = LocalDateTime.of(weekStartDate, weekStartTime)

            // Determine maximum frequency among all clients
            val maxFreq = clients.maxOfOrNull { client ->
                if (client.smsPerWeek >= 0) client.smsPerWeek else globalSmsPerWeek
            } ?: 0

            if (maxFreq > 0) {
                // Round r goes from 1 up to maxFreq
                for (r in 1..maxFreq) {
                    clients.forEach { client ->
                        val freq = if (client.smsPerWeek >= 0) client.smsPerWeek else globalSmsPerWeek
                        if (freq >= r) {
                            val currentPointer = clientPointers.getOrDefault(client.id, 0)
                            val template = enabledTemplates[currentPointer % enabledTemplates.size]
                            clientPointers[client.id] = currentPointer + 1

                            var rolls = 0
                            while (rolls < MAX_CURSOR_ROLLS) {
                                rolls++
                                if (settings.skipSunday && cursor.dayOfWeek == DayOfWeek.SUNDAY) {
                                    cursor = cursor.plusDays(1).with(workStart)
                                    continue
                                }
                                if (cursor.toLocalTime().isBefore(workStart)) {
                                    cursor = cursor.with(workStart)
                                    break
                                }
                                if (cursor.toLocalTime().isAfter(workEnd)) {
                                    cursor = cursor.plusDays(1).with(workStart)
                                    continue
                                }
                                break
                            }

                            val baseBody =
                                if (template.greeting.isNotEmpty()) "${template.greeting} ${template.message}"
                                else template.message

                            val message =
                                if (client.useNameInTemplate) {
                                    baseBody.replace(NAME_PLACEHOLDER, client.name)
                                } else {
                                    baseBody.replace(NAME_PLACEHOLDER, "").replace("  ", " ").trim()
                                }

                            val formattedTime = String.format(Locale.US, "%02d:%02d", cursor.hour, cursor.minute)

                            result += Schedule(
                                id = UUID.randomUUID().toString(),
                                clientId = client.id,
                                templateId = template.id,
                                scheduledDate = cursor.toLocalDate().toString(),
                                scheduledTime = formattedTime,
                                status = ScheduleStatus.PENDING,
                                retryCount = 0,
                                campaignId = null,
                                week = batchLabel,
                                message = message,
                            )

                            cursor = cursor.plusMinutes(effectiveGap.toLong())
                        }
                    }
                }
            }
        }

        return PlanResult(
            schedules = result,
            warningMessage = firstWeekWarning,
            effectiveGap = overallEffectiveGap,
            wasAutoAdjusted = wasAnyWeekAdjusted,
            maxPossibleGap = overallMaxPossibleGap,
        )
    }

    private fun calculateRemainingWorkingMinutes(
        cursor: LocalDateTime,
        endOfWeekDate: LocalDate,
        workStart: LocalTime,
        workEnd: LocalTime,
        skipSunday: Boolean
    ): Long {
        var totalMinutes = 0L
        var tempCursor = cursor

        while (!tempCursor.toLocalDate().isAfter(endOfWeekDate)) {
            if (skipSunday && tempCursor.dayOfWeek == DayOfWeek.SUNDAY) {
                tempCursor = tempCursor.plusDays(1).with(workStart)
                continue
            }

            val dayDate = tempCursor.toLocalDate()
            val dayStartTime = if (dayDate == cursor.toLocalDate()) {
                maxOf(cursor.toLocalTime(), workStart)
            } else {
                workStart
            }
            val dayEndTime = workEnd

            if (dayStartTime.isBefore(dayEndTime)) {
                val minutesToday = Duration.between(dayStartTime, dayEndTime).toMinutes()
                totalMinutes += minutesToday
            }

            tempCursor = tempCursor.plusDays(1).with(workStart)
        }

        return totalMinutes.coerceAtLeast(1L)
    }

    fun generateSchedulesForSingleClient(
        settings: AppSettings,
        client: Client,
        templates: List<MessageTemplate>,
        missingCount: Int,
        startCursor: LocalDateTime,
        initialPointer: Int,
        batchLabel: String,
    ): SingleClientPlanResult {
        val enabledTemplates = templates.filter { it.enabled }.sortedBy { it.order }
        if (enabledTemplates.isEmpty() || missingCount <= 0) {
            return SingleClientPlanResult(emptyList(), startCursor)
        }

        val (workStart, workEnd) = effectiveWorkWindow(settings)
        var cursor = startCursor
        var currentPointer = initialPointer
        val result = ArrayList<Schedule>()

        for (i in 0 until missingCount) {
            val template = enabledTemplates[currentPointer % enabledTemplates.size]
            currentPointer++

            var rolls = 0
            while (rolls < MAX_CURSOR_ROLLS) {
                rolls++
                if (settings.skipSunday && cursor.dayOfWeek == DayOfWeek.SUNDAY) {
                    cursor = cursor.plusDays(1).with(workStart)
                    continue
                }
                if (cursor.toLocalTime().isBefore(workStart)) {
                    cursor = cursor.with(workStart)
                    break
                }
                if (cursor.toLocalTime().isAfter(workEnd)) {
                    cursor = cursor.plusDays(1).with(workStart)
                    continue
                }
                break
            }

            val baseBody =
                if (template.greeting.isNotEmpty()) "${template.greeting} ${template.message}"
                else template.message

            val message =
                if (client.useNameInTemplate) {
                    baseBody.replace(NAME_PLACEHOLDER, client.name)
                } else {
                    baseBody.replace(NAME_PLACEHOLDER, "").replace("  ", " ").trim()
                }

            val formattedTime = String.format(Locale.US, "%02d:%02d", cursor.hour, cursor.minute)

            result += Schedule(
                id = UUID.randomUUID().toString(),
                clientId = client.id,
                templateId = template.id,
                scheduledDate = cursor.toLocalDate().toString(),
                scheduledTime = formattedTime,
                status = ScheduleStatus.PENDING,
                retryCount = 0,
                campaignId = null,
                week = batchLabel,
                message = message,
            )

            cursor = cursor.plusMinutes(settings.timeGapMinutes.coerceAtLeast(1).toLong())
        }

        return SingleClientPlanResult(result, cursor)
    }

    private fun effectiveWorkWindow(settings: AppSettings): Pair<LocalTime, LocalTime> {
        val parsedStart = settings.workStartTime.toLocalTimeOrDefault(LocalTime.of(9, 0))
        val parsedEnd = settings.workEndTime.toLocalTimeOrDefault(LocalTime.of(18, 0))
        return if (parsedEnd.isAfter(parsedStart)) {
            parsedStart to parsedEnd
        } else {
            LocalTime.of(9, 0) to LocalTime.of(18, 0)
        }
    }

    private fun String.toLocalTimeOrDefault(default: LocalTime): LocalTime =
        runCatching { LocalTime.parse(this) }.getOrDefault(default)
}
