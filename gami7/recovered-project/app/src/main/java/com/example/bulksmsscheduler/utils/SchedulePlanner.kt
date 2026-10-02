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
            settings = settings,
            startDate = initialCursor.toLocalDate(),
            startTime = initialCursor.toLocalTime(),
            clients = clients,
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
     * Each client progresses through enabled templates ONCE in sequential order (Template 1, Template 2, ...).
     * Message scheduling order in each week rounds through clients by SMS frequency (round-robin).
     *
     * If [numberOfWeeks] <= 0, it automatically generates all weeks until all active clients have received
     * all available enabled templates.
     */
    fun generateMultiWeekPlan(
        settings: AppSettings,
        startDate: LocalDate = LocalDate.now(),
        startTime: LocalTime = LocalTime.now(),
        clients: List<Client>,
        templates: List<MessageTemplate>,
        numberOfWeeks: Int = -1,
        initialTemplatePointers: Map<String, Int> = emptyMap(),
    ): PlanResult {
        val enabledTemplates = templates.filter { it.enabled }.sortedBy { it.order }
        val userTargetGap = settings.timeGapMinutes.coerceAtLeast(1)
        val activeClients = clients.filter { it.active }
        if (activeClients.isEmpty() || enabledTemplates.isEmpty()) {
            return PlanResult(
                schedules = emptyList(),
                warningMessage = null,
                effectiveGap = userTargetGap,
                wasAutoAdjusted = false,
                maxPossibleGap = userTargetGap,
            )
        }

        val totalTemplates = enabledTemplates.size
        val globalSmsPerWeek = settings.smsPerWeek.coerceAtLeast(0)
        val (workStart, workEnd) = effectiveWorkWindow(settings)

        // Track each client's template index position continuously across weeks
        val clientPointers = activeClients.associateBy(
            keySelector = { it.id },
            valueTransform = { client -> initialTemplatePointers[client.id] ?: 0 },
        ).toMutableMap()

        val result = ArrayList<Schedule>()
        var overallEffectiveGap = userTargetGap
        var overallMaxPossibleGap = userTargetGap
        var wasAnyWeekAdjusted = false
        var firstWeekWarning: String? = null

        var w = 0
        while (true) {
            if (numberOfWeeks > 0 && w >= numberOfWeeks) break

            // Check if any active client still needs unsent templates
            val clientsNeedingMessages = activeClients.filter { client ->
                (clientPointers[client.id] ?: 0) < totalTemplates
            }
            if (clientsNeedingMessages.isEmpty()) break

            val weekStartDate = startDate.plusWeeks(w.toLong())
            val weekStartTime = if (w == 0) startTime else workStart
            val batchLabel = weekStartDate.format(WEEK_FORMAT)
            val endOfWeek = weekStartDate.plusDays(6)

            // Calculate how many messages each client will get this week
            val clientWeeklyQuotas = activeClients.associate { client ->
                val currentPtr = clientPointers[client.id] ?: 0
                val remainingTemplates = maxOf(0, totalTemplates - currentPtr)
                val targetFreq = if (client.smsPerWeek >= 0) client.smsPerWeek else globalSmsPerWeek
                client.id to minOf(targetFreq, remainingTemplates)
            }

            val weekMessagesMax = clientWeeklyQuotas.values.sumOf { it.toLong() }
            if (weekMessagesMax <= 0L) break

            val weekWorkingMinutes = calculateRemainingWorkingMinutes(
                cursor = LocalDateTime.of(weekStartDate, weekStartTime),
                endOfWeekDate = endOfWeek,
                workStart = workStart,
                workEnd = workEnd,
                skipSunday = settings.skipSunday
            )

            val maxGapForWeek = (weekWorkingMinutes / weekMessagesMax).toInt().coerceAtLeast(1)
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
            val maxFreqInWeek = clientWeeklyQuotas.values.maxOrNull() ?: 0

            if (maxFreqInWeek > 0) {
                for (r in 1..maxFreqInWeek) {
                    activeClients.forEachIndexed { clientIndex, client ->
                        val quota = clientWeeklyQuotas[client.id] ?: 0
                        if (quota >= r) {
                            val currentPointer = clientPointers.getOrDefault(client.id, 0)
                            if (currentPointer < totalTemplates) {
                                val templateIndex = (clientIndex + currentPointer) % totalTemplates
                                val template = enabledTemplates[templateIndex]
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

            w++
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
            if (currentPointer >= enabledTemplates.size) break
            val template = enabledTemplates[currentPointer]
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
