package com.example.bulksmsscheduler.repository

import com.example.bulksmsscheduler.data.AppDatabase
import com.example.bulksmsscheduler.engine.SmsSender
import com.example.bulksmsscheduler.model.AppSettings
import com.example.bulksmsscheduler.model.Client
import com.example.bulksmsscheduler.model.ClientPhones
import com.example.bulksmsscheduler.model.HomeStatsData
import com.example.bulksmsscheduler.model.MessageTemplate
import com.example.bulksmsscheduler.model.Schedule
import com.example.bulksmsscheduler.model.ScheduleStatus
import com.example.bulksmsscheduler.model.ScheduleWithClient
import com.example.bulksmsscheduler.utils.SchedulePlanner
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

import android.content.Context
import com.example.bulksmsscheduler.utils.NotificationUtils

/**
 * Single access point to the database.
 */
class SmsRepository(
    private val database: AppDatabase,
    private val context: Context? = null,
) {

    private val clientDao = database.clientDao()
    private val templateDao = database.templateDao()
    private val scheduleDao = database.scheduleDao()
    private val settingsDao = database.settingsDao()

    // ---------------------------------------------------------------- flows --

    val clientsFlow: Flow<List<Client>> = clientDao.observeAllClients()

    val templatesFlow: Flow<List<MessageTemplate>> = templateDao.observeAllTemplates()

    val schedulesFlow: Flow<List<Schedule>> = scheduleDao.observeAllSchedules()

    val recentSchedulesFlow: Flow<List<ScheduleWithClient>> =
        scheduleDao.observeRecentSchedulesWithClient()

    val settingsFlow: Flow<AppSettings?> = settingsDao.observeSettings()

    /** Dashboard counters. */
    val statsFlow: Flow<HomeStatsData> = flow {
        val (currentStart, currentEnd) = getCurrentWeekBounds()
        emitAll(scheduleDao.observeStatsBetween(currentStart.toString(), currentEnd.toString()))
    }

    private suspend fun getCurrentWeekBounds(): Pair<LocalDate, LocalDate> {
        val now = LocalDate.now()
        val settings = settingsDao.getSettings()
        val configuredStartDate = runCatching {
            if (settings != null && settings.automationStartDate.isNotBlank()) LocalDate.parse(settings.automationStartDate) else null
        }.getOrNull()

        val firstSchedule = scheduleDao.getFirstPendingSchedule() ?: scheduleDao.getLastScheduled()
        val baseDate = configuredStartDate 
            ?: runCatching { firstSchedule?.let { LocalDate.parse(it.scheduledDate) } }.getOrNull() 
            ?: now

        var currentWeekStart = baseDate
        while (currentWeekStart.plusDays(6).isBefore(now)) {
            currentWeekStart = currentWeekStart.plusWeeks(1)
        }
        val currentWeekEnd = currentWeekStart.plusDays(6)
        return currentWeekStart to currentWeekEnd
    }

    // -------------------------------------------------------------- clients --

    suspend fun getAllClients(): List<Client> = clientDao.getAllClients()

    suspend fun getActiveClients(): List<Client> = clientDao.getActiveClients()

    suspend fun getClientCount(): Int = clientDao.getClientCount()

    suspend fun getClientById(id: String): Client? = clientDao.getClientById(id)

    suspend fun saveClient(client: Client): Boolean {
        val existing = clientDao.getAllClients()
        if (findDuplicate(existing, client.phone) != null) return false
        clientDao.insertClient(client)
        markNewDataAdded()
        refreshSchedules("New client added")
        return true
    }

    suspend fun saveClients(clients: List<Client>): Int {
        if (clients.isEmpty()) return 0
        val existing = clientDao.getAllClients()
            .mapNotNull { ClientPhones.normalize(it.phone).ifEmpty { null } }
            .toMutableSet()
        val fresh = clients.filter { candidate ->
            val normalized = ClientPhones.normalize(candidate.phone)
            normalized.isNotEmpty() && existing.add(normalized)
        }
        if (fresh.isEmpty()) return 0
        clientDao.insertClients(fresh)
        markNewDataAdded()
        refreshSchedules("Clients imported")
        return fresh.size
    }

    suspend fun updateClient(client: Client): Boolean {
        val existing = clientDao.getAllClients()
        if (findDuplicate(existing, client.phone, ignoreId = client.id) != null) return false
        clientDao.updateClient(client)
        refreshSchedules("Client updated")
        return true
    }

    private fun findDuplicate(existing: List<Client>, phone: String, ignoreId: String? = null): Client? {
        val normalized = ClientPhones.normalize(phone)
        if (normalized.isEmpty()) return null
        return existing.firstOrNull {
            it.id != ignoreId && ClientPhones.normalize(it.phone) == normalized
        }
    }

    suspend fun deleteClient(client: Client) {
        clientDao.deleteClient(client)
        scheduleDao.deletePendingSchedulesForClient(client.id)
        refreshSchedules("Client deleted")
    }

    suspend fun deleteClientsByIds(ids: List<String>) {
        clientDao.deleteClientsByIds(ids)
        ids.forEach { scheduleDao.deletePendingSchedulesForClient(it) }
        refreshSchedules("Clients deleted")
    }

    suspend fun deleteClientsBySource(source: String) {
        clientDao.deleteClientsBySource(source)
        refreshSchedules("Imported clients cleared")
    }

    suspend fun deleteAllClients() {
        clientDao.deleteAllClients()
        refreshSchedules("All clients cleared")
    }

    // ------------------------------------------------------------ templates --

    suspend fun getAllTemplates(): List<MessageTemplate> = templateDao.getAllTemplates()

    suspend fun getEnabledTemplates(): List<MessageTemplate> = templateDao.getEnabledTemplates()

    suspend fun getEnabledTemplateCount(): Int = templateDao.getEnabledTemplateCount()

    suspend fun getTemplateById(id: String): MessageTemplate? = templateDao.getTemplateById(id)

    suspend fun getNextTemplateOrder(): Int = templateDao.getMaxOrder() + 1

    suspend fun saveTemplate(template: MessageTemplate) {
        templateDao.insertTemplate(template)
        markNewDataAdded()
        refreshSchedules("New template added")
    }

    suspend fun saveTemplates(templates: List<MessageTemplate>) {
        templateDao.insertTemplates(templates)
        markNewDataAdded()
        refreshSchedules("Templates added")
    }

    suspend fun updateTemplate(template: MessageTemplate) {
        templateDao.updateTemplate(template)
        refreshSchedules("Template updated")
    }

    suspend fun deleteTemplate(template: MessageTemplate) {
        templateDao.deleteTemplate(template)
        markNewDataAdded()
        refreshSchedules("Template deleted")
    }

    suspend fun deleteTemplateById(id: String) {
        templateDao.deleteTemplateById(id)
        markNewDataAdded()
        refreshSchedules("Template deleted")
    }

    // ------------------------------------------------------------ schedules --

    suspend fun getAllSchedules(): List<Schedule> = scheduleDao.getAllSchedules()

    suspend fun getScheduleById(id: String): Schedule? = scheduleDao.getScheduleById(id)

    suspend fun getScheduleCount(): Int = scheduleDao.getScheduleCount()

    suspend fun saveSchedules(schedules: List<Schedule>) = scheduleDao.insertSchedules(schedules)

    suspend fun saveSchedule(schedule: Schedule) = scheduleDao.insertSchedule(schedule)

    suspend fun updateSchedule(schedule: Schedule) = scheduleDao.updateSchedule(schedule)

    suspend fun deleteSchedule(schedule: Schedule) = scheduleDao.deleteSchedule(schedule)

    suspend fun deleteScheduleById(id: String) = scheduleDao.deleteScheduleById(id)

    fun searchSchedules(query: String, status: ScheduleStatus?): Flow<List<ScheduleWithClient>> =
        scheduleDao.searchSchedulesWithClient(query, status)

    suspend fun getDuePendingSchedules(today: String, nowTime: String): List<Schedule> =
        scheduleDao.getDuePendingSchedules(today, nowTime)

    suspend fun getNextPendingSchedule(today: String, nowTime: String): Schedule? =
        scheduleDao.getNextPendingSchedule(today, nowTime)

    suspend fun getFirstPendingSchedule(): Schedule? =
        scheduleDao.getFirstPendingSchedule()

    suspend fun getLastScheduled(): Schedule? = scheduleDao.getLastScheduled()

    suspend fun deletePendingSchedules() = scheduleDao.deletePendingSchedules()

    suspend fun deleteAllSchedules() = scheduleDao.deleteAllSchedules()

    suspend fun getSchedulesForClient(clientId: String): List<ScheduleWithClient> =
        scheduleDao.getSchedulesForClient(clientId)

    suspend fun generateAndSavePlan(
        settings: AppSettings,
        clients: List<Client>,
        templates: List<MessageTemplate>,
        numberOfWeeks: Int = 4,
    ): Int = withContext(Dispatchers.Default) {
        scheduleDao.deleteAllSchedules()
        val sentCountsList = scheduleDao.getSentCountsPerClient()
        val initialPointers = sentCountsList.associateBy({ it.clientId }, { it.count })
        val planResult = SchedulePlanner.generateMultiWeekPlan(
            settings = settings,
            startDate = LocalDate.now(),
            startTime = LocalTime.now(),
            clients = clients,
            templates = templates,
            numberOfWeeks = numberOfWeeks,
            initialTemplatePointers = initialPointers,
        )
        if (planResult.wasAutoAdjusted && context != null) {
            NotificationUtils.showTimeGapAdjustedNotification(context, planResult.effectiveGap)
        }
        val newSchedules = planResult.schedules
        if (newSchedules.isEmpty()) return@withContext 0
        scheduleDao.insertSchedules(newSchedules)
        newSchedules.size
    }

    suspend fun restartEngineWithStartDate(
        settings: AppSettings,
        startDate: LocalDate,
        numberOfWeeks: Int = 4,
    ): Int = withContext(Dispatchers.Default) {
        scheduleDao.deleteAllSchedules()

        val activeClients = getActiveClients()
        val enabledTemplates = getEnabledTemplates()
        if (activeClients.isEmpty() || enabledTemplates.isEmpty()) return@withContext 0

        val sentCountsList = scheduleDao.getSentCountsPerClient()
        val initialPointers = sentCountsList.associateBy({ it.clientId }, { it.count })

        val startTime = runCatching { LocalTime.parse(settings.workStartTime) }.getOrDefault(LocalTime.of(9, 0))

        val planResult = SchedulePlanner.generateMultiWeekPlan(
            settings = settings,
            startDate = startDate,
            startTime = startTime,
            clients = activeClients,
            templates = enabledTemplates,
            numberOfWeeks = numberOfWeeks,
            initialTemplatePointers = initialPointers,
        )

        if (planResult.wasAutoAdjusted && context != null) {
            NotificationUtils.showTimeGapAdjustedNotification(context, planResult.effectiveGap)
        }

        val newSchedules = planResult.schedules
        if (newSchedules.isNotEmpty()) {
            scheduleDao.insertSchedules(newSchedules)
        }
        newSchedules.size
    }

    // ------------------------------------------------------------- settings --

    suspend fun getSettings(): AppSettings? = settingsDao.getSettings()

    suspend fun getOrCreateSettings(): AppSettings {
        val stored = settingsDao.getSettings() ?: AppSettings()
        val cleared = stored.copy(newDataAdded = false)
        settingsDao.upsertSettings(cleared)
        return cleared
    }

    suspend fun getCurrentWeekSentSchedules(): List<ScheduleWithClient> {
        val now = LocalDate.now()
        val monday = now.with(DayOfWeek.MONDAY).toString()
        val sunday = now.with(DayOfWeek.SUNDAY).toString()
        return scheduleDao.getSentSchedulesForWeek(monday, sunday)
    }

    suspend fun getCurrentWeekFailedSchedules(): List<ScheduleWithClient> {
        val now = LocalDate.now()
        val monday = now.with(DayOfWeek.MONDAY).toString()
        val sunday = now.with(DayOfWeek.SUNDAY).toString()
        return scheduleDao.getFailedSchedulesForWeek(monday, sunday)
    }

    suspend fun updateSettingsOnly(settings: AppSettings) {
        settingsDao.upsertSettings(settings)
    }

    suspend fun updateSettings(
        settings: AppSettings,
        reason: String = "Settings updated",
        recalculateCurrentWeek: Boolean = true
    ) {
        settingsDao.upsertSettings(settings)
        refreshSchedules(reason, recalculateCurrentWeek = recalculateCurrentWeek)
    }

    suspend fun clearPlanUpdateMessage() {
        val stored = settingsDao.getSettings() ?: AppSettings()
        if (stored.lastPlanUpdateMessage.isNotEmpty()) {
            settingsDao.upsertSettings(stored.copy(lastPlanUpdateMessage = ""))
        }
    }

    private suspend fun refreshSchedules(
        reason: String,
        recalculateCurrentWeek: Boolean = false
    ) {
        val settings = settingsDao.getSettings() ?: AppSettings()
        val activeClients = clientDao.getActiveClients()
        val enabledTemplates = templateDao.getEnabledTemplates()

        if (activeClients.isEmpty() || enabledTemplates.isEmpty()) {
            val timeFormat = SimpleDateFormat("h:mm a, MMM dd", Locale.US)
            val timeStr = timeFormat.format(Date())
            settingsDao.upsertSettings(settings.copy(lastPlanUpdateMessage = "Plan updated at $timeStr ($reason)", newDataAdded = false))
            return
        }

        val now = LocalDate.now()
        val (currentWeekStart, currentWeekEnd) = getCurrentWeekBounds()
        val currentWeekStartStr = currentWeekStart.toString()
        val currentWeekEndStr = currentWeekEnd.toString()

        // 1. Remove fully finished past weeks automatically
        scheduleDao.deleteSchedulesBefore(currentWeekStartStr)

        val configuredStartDate = runCatching {
            if (settings.automationStartDate.isNotBlank()) LocalDate.parse(settings.automationStartDate) else null
        }.getOrNull()

        var warningMessage: String? = null
        var effectiveGap = settings.timeGapMinutes
        var wasAutoAdjusted = false
        var isCurrentWeekRecalculated = false

        withContext(Dispatchers.Default) {
            if (configuredStartDate != null && configuredStartDate.isAfter(now)) {
                // Future start date configured via manual restart: respect & follow configuredStartDate
                scheduleDao.deleteAllSchedules()

                val sentCountsList = scheduleDao.getSentCountsPerClient()
                val initialPointers = sentCountsList.associateBy({ it.clientId }, { it.count })
                val workStart = runCatching { LocalTime.parse(settings.workStartTime) }.getOrDefault(LocalTime.of(9, 0))

                val planResult = SchedulePlanner.generateMultiWeekPlan(
                    settings = settings,
                    startDate = configuredStartDate,
                    startTime = workStart,
                    clients = activeClients,
                    templates = enabledTemplates,
                    numberOfWeeks = 4,
                    initialTemplatePointers = initialPointers,
                )

                warningMessage = planResult.warningMessage
                effectiveGap = planResult.effectiveGap
                wasAutoAdjusted = planResult.wasAutoAdjusted

                if (planResult.schedules.isNotEmpty()) {
                    scheduleDao.insertSchedules(planResult.schedules)
                }
            } else if (recalculateCurrentWeek) {
                isCurrentWeekRecalculated = true
                // 1. Delete all PENDING schedules from current week onwards
                scheduleDao.deletePendingSchedulesFrom(currentWeekStartStr)

                // 2. Recalculate remaining quota for current week starting from now
                val sentInWeek = scheduleDao.getSentSchedulesForWeek(currentWeekStartStr, currentWeekEndStr)
                val sentCountsMap = sentInWeek.groupBy { it.schedule.clientId }

                val globalSmsPerWeek = settings.smsPerWeek.coerceAtLeast(0)
                val currentWeekClients = activeClients.map { client ->
                    val sentCount = sentCountsMap[client.id]?.size ?: 0
                    val targetFreq = if (client.smsPerWeek >= 0) client.smsPerWeek else globalSmsPerWeek
                    val needed = maxOf(0, targetFreq - sentCount)
                    client.copy(smsPerWeek = needed)
                }

                val initialPointers = scheduleDao.getTemplatePointersUpToDate(currentWeekStartStr)
                    .associateBy({ it.clientId }, { it.count })

                val currentWeekPlan = SchedulePlanner.generateMultiWeekPlan(
                    settings = settings,
                    startDate = LocalDate.now(),
                    startTime = LocalTime.now(),
                    clients = currentWeekClients,
                    templates = enabledTemplates,
                    numberOfWeeks = 1,
                    initialTemplatePointers = initialPointers,
                )

                if (currentWeekPlan.schedules.isNotEmpty()) {
                    scheduleDao.insertSchedules(currentWeekPlan.schedules)
                }

                // 3. Regenerate future weeks (weeks 2, 3, 4 starting from next week batch start)
                val nextWeekStart = currentWeekStart.plusWeeks(1)
                val futurePointers = scheduleDao.getTemplatePointersUpToDate(currentWeekEndStr)
                    .associateBy({ it.clientId }, { it.count })

                val futurePlan = SchedulePlanner.generateMultiWeekPlan(
                    settings = settings,
                    startDate = nextWeekStart,
                    startTime = LocalTime.of(9, 0),
                    clients = activeClients,
                    templates = enabledTemplates,
                    numberOfWeeks = 3,
                    initialTemplatePointers = futurePointers,
                )

                warningMessage = currentWeekPlan.warningMessage ?: futurePlan.warningMessage
                effectiveGap = minOf(currentWeekPlan.effectiveGap, futurePlan.effectiveGap)
                wasAutoAdjusted = currentWeekPlan.wasAutoAdjusted || futurePlan.wasAutoAdjusted

                if (futurePlan.schedules.isNotEmpty()) {
                    scheduleDao.insertSchedules(futurePlan.schedules)
                }
            } else {
                // Template / Client Data Change: Keep current week schedules intact, append missing if needed, regenerate future weeks
                val currentWeekSchedulesToInsert = mutableListOf<Schedule>()
                val lastScheduledInWeek = scheduleDao.getLastScheduledInWeek(currentWeekStartStr, currentWeekEndStr)

                var currentAppendCursor: LocalDateTime = if (lastScheduledInWeek != null) {
                    val d = runCatching { LocalDate.parse(lastScheduledInWeek.scheduledDate) }.getOrDefault(LocalDate.now())
                    val t = runCatching { LocalTime.parse(lastScheduledInWeek.scheduledTime) }.getOrDefault(LocalTime.now())
                    val dt = LocalDateTime.of(d, t).plusMinutes(settings.timeGapMinutes.coerceAtLeast(1).toLong())
                    if (dt.isAfter(LocalDateTime.now())) dt else LocalDateTime.now()
                } else {
                    LocalDateTime.now()
                }

                val globalSmsPerWeek = settings.smsPerWeek.coerceAtLeast(0)

                for (client in activeClients) {
                    // New client added during current week should start from next week (skip current week plan)
                    val clientAllSchedules = scheduleDao.getSchedulesForClient(client.id)
                    if (clientAllSchedules.isEmpty()) {
                        continue
                    }

                    val currentWeekCount = scheduleDao.getSchedulesCountForClientInWeek(client.id, currentWeekStartStr, currentWeekEndStr)
                    val targetFreq = if (client.smsPerWeek >= 0) client.smsPerWeek else globalSmsPerWeek
                    val missing = targetFreq - currentWeekCount

                    if (missing > 0) {
                        val totalHistoricalCount = scheduleDao.getTemplatePointersUpToDate(currentWeekEndStr)
                            .firstOrNull { it.clientId == client.id }?.count ?: 0

                        val newSchedules = SchedulePlanner.generateSchedulesForSingleClient(
                            settings = settings,
                            client = client,
                            templates = enabledTemplates,
                            missingCount = missing,
                            startCursor = currentAppendCursor,
                            initialPointer = totalHistoricalCount,
                            batchLabel = currentWeekStart.format(DateTimeFormatter.ofPattern("dd/MM")),
                        )

                        currentWeekSchedulesToInsert.addAll(newSchedules.schedules)
                        if (newSchedules.schedules.isNotEmpty()) {
                            currentAppendCursor = newSchedules.endCursor
                        }
                    }
                }

                if (currentWeekSchedulesToInsert.isNotEmpty()) {
                    scheduleDao.insertSchedules(currentWeekSchedulesToInsert)
                }

                // Delete ONLY future pending schedules (scheduledDate > currentWeekEndStr)
                scheduleDao.deletePendingSchedulesAfter(currentWeekEndStr)

                // Regenerate future weeks (weeks 2, 3, 4 starting from next week batch start)
                val nextWeekStart = currentWeekStart.plusWeeks(1)
                val futurePointers = scheduleDao.getTemplatePointersUpToDate(currentWeekEndStr)
                    .associateBy({ it.clientId }, { it.count })

                val futurePlan = SchedulePlanner.generateMultiWeekPlan(
                    settings = settings,
                    startDate = nextWeekStart,
                    startTime = LocalTime.of(9, 0),
                    clients = activeClients,
                    templates = enabledTemplates,
                    numberOfWeeks = 3,
                    initialTemplatePointers = futurePointers,
                )

                warningMessage = futurePlan.warningMessage
                effectiveGap = futurePlan.effectiveGap
                wasAutoAdjusted = futurePlan.wasAutoAdjusted

                if (futurePlan.schedules.isNotEmpty()) {
                    scheduleDao.insertSchedules(futurePlan.schedules)
                }
            }
        }

        if (wasAutoAdjusted && context != null) {
            NotificationUtils.showTimeGapAdjustedNotification(context, effectiveGap)
        }

        val timeFormat = SimpleDateFormat("h:mm a, MMM dd", Locale.US)
        val timeStr = timeFormat.format(Date())
        val updateMsg = buildString {
            append("Plan updated at $timeStr ($reason)")
            if (isCurrentWeekRecalculated) {
                append(" - Current week gap adjusted based on remaining time")
            }
            if (!warningMessage.isNullOrBlank()) {
                append(" - $warningMessage")
            }
        }
        settingsDao.upsertSettings(settings.copy(lastPlanUpdateMessage = updateMsg, newDataAdded = false))
    }

    suspend fun markNewDataAdded() {
        val current = settingsDao.getSettings() ?: AppSettings()
        if (!current.newDataAdded) {
            settingsDao.upsertSettings(current.copy(newDataAdded = true))
        }
    }

    suspend fun processDueSchedules(sender: SmsSender) {
        val settings = getSettings() ?: return
        if (!settings.automationEnabled) return

        val now = LocalDateTime.now()
        if (settings.skipSunday && now.dayOfWeek == DayOfWeek.SUNDAY) return

        val workStart = runCatching { LocalTime.parse(settings.workStartTime) }.getOrDefault(LocalTime.of(9, 0))
        val workEnd = runCatching { LocalTime.parse(settings.workEndTime) }.getOrDefault(LocalTime.of(18, 0))
        val currentTime = now.toLocalTime()

        if (currentTime.isBefore(workStart) || currentTime.isAfter(workEnd)) return

        val today = now.toLocalDate().toString()
        val nowTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm"))

        val dueSchedules = scheduleDao.getDuePendingSchedules(today, nowTime)
        if (dueSchedules.isEmpty()) return

        for (schedule in dueSchedules) {
            val client = clientDao.getClientById(schedule.clientId)
            if (client == null) {
                scheduleDao.updateSchedule(schedule.copy(status = ScheduleStatus.FAILED))
                continue
            }

            scheduleDao.updateSchedule(schedule.copy(status = ScheduleStatus.SENT))

            sender.scope.launch {
                sender.send(schedule, SmsSender.normalizePhoneNumber(client.phone))
            }

            delay(2000L)
        }
    }
}
