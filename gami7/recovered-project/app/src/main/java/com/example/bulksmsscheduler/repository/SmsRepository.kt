package com.example.bulksmsscheduler.repository

import com.example.bulksmsscheduler.data.AppDatabase
import com.example.bulksmsscheduler.engine.SmsSender
import com.example.bulksmsscheduler.model.AppSettings
import com.example.bulksmsscheduler.model.Client
import com.example.bulksmsscheduler.model.ClientPhones
import com.example.bulksmsscheduler.model.ClientSource
import com.example.bulksmsscheduler.model.DeviceContact
import com.example.bulksmsscheduler.model.HomeStatsData
import com.example.bulksmsscheduler.model.MessageTemplate
import com.example.bulksmsscheduler.model.Schedule
import com.example.bulksmsscheduler.model.ScheduleStatus
import com.example.bulksmsscheduler.model.ScheduleWithClient
import com.example.bulksmsscheduler.model.SyncedContact
import com.example.bulksmsscheduler.utils.ContactSyncPolicy
import com.example.bulksmsscheduler.utils.SchedulePlanner
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale
import java.util.UUID

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
    private val syncedContactDao = database.syncedContactDao()

    companion object {
        /** Serializes every client write so concurrent syncs cannot create duplicates. */
        private val clientWriteMutex = Mutex()
    }

    // ---------------------------------------------------------------- flows --

    val clientsFlow: Flow<List<Client>> = clientDao.observeAllClients()

    val templatesFlow: Flow<List<MessageTemplate>> = templateDao.observeAllTemplates()

    val schedulesFlow: Flow<List<Schedule>> = scheduleDao.observeAllSchedules()

    val recentSchedulesFlow: Flow<List<ScheduleWithClient>> =
        scheduleDao.observeRecentSchedulesWithClient()

    val recentActivityPastWeekFlow: Flow<List<ScheduleWithClient>> = flow {
        val sevenDaysAgo = LocalDate.now().minusDays(7).toString()
        emitAll(scheduleDao.observeRecentSchedulesPastWeek(sevenDaysAgo))
    }

    val settingsFlow: Flow<AppSettings?> = settingsDao.observeSettings()

    /** Dashboard counters. */
    val statsFlow: Flow<HomeStatsData> = scheduleDao.observeStats()



    // -------------------------------------------------------------- clients --

    suspend fun getAllClients(): List<Client> = clientDao.getAllClients()

    suspend fun getActiveClients(): List<Client> = clientDao.getActiveClients()

    suspend fun getClientCount(): Int = clientDao.getClientCount()

    suspend fun getClientById(id: String): Client? = clientDao.getClientById(id)

    suspend fun saveClient(client: Client): Boolean = clientWriteMutex.withLock {
        val existing = clientDao.getAllClients()
        if (findDuplicate(existing, client.phone) != null) return@withLock false
        clientDao.insertClient(client)
        val norm = ClientPhones.normalize(client.phone)
        if (norm.isNotEmpty()) {
            syncedContactDao.insertContacts(listOf(SyncedContact(phone = norm, name = client.name)))
        }
        markNewDataAdded()
        refreshSchedules("New client added")
        true
    }

    suspend fun saveClients(clients: List<Client>): Int = clientWriteMutex.withLock {
        val fresh = dedupeAgainstExisting(clients, clientDao.getAllClients())
        if (fresh.isEmpty()) return@withLock 0
        clientDao.insertClients(fresh)
        val synced = fresh.mapNotNull { client ->
            val norm = ClientPhones.normalize(client.phone)
            if (norm.isNotEmpty()) SyncedContact(phone = norm, name = client.name) else null
        }
        if (synced.isNotEmpty()) {
            syncedContactDao.insertContacts(synced)
        }
        markNewDataAdded()
        refreshSchedules("Clients imported")
        fresh.size
    }

    suspend fun updateClient(client: Client): Boolean = clientWriteMutex.withLock {
        val existing = clientDao.getAllClients()
        if (findDuplicate(existing, client.phone, ignoreId = client.id) != null) return@withLock false
        clientDao.updateClient(client)
        refreshSchedules("Client updated")
        true
    }

    /**
     * Scans the device contact list and adds only contacts that are genuinely new.
     *
     * This is the single, serialized entry point for the automatic contact sync.
     * Holding [clientWriteMutex] for the whole read-verify-insert cycle removes the
     * race that used to create duplicate clients when the app-startup sync, the
     * `ContentObserver` and the WorkManager jobs ran at the same time.
     *
     * @return the clients that were actually inserted, so callers can notify once.
     */
    suspend fun syncDeviceContacts(deviceContacts: List<DeviceContact>): List<Client> =
        clientWriteMutex.withLock {
            val existing = clientDao.getAllClients()
            val existingPhones = existing
                .mapNotNull { ClientPhones.normalize(it.phone).ifEmpty { null } }
                .toMutableSet()
            val knownPhones = syncedContactDao.getAllPhones().toMutableSet()

            // Collapse the device list to one entry per normalized phone.
            val contactByPhone = LinkedHashMap<String, DeviceContact>()
            for (contact in deviceContacts) {
                val normalized = ClientPhones.normalize(contact.phone)
                if (normalized.isNotEmpty()) contactByPhone.putIfAbsent(normalized, contact)
            }

            val decision = ContactSyncPolicy.decide(
                devicePhones = contactByPhone.keys.toList(),
                existingClientPhones = existingPhones,
                knownPhones = knownPhones,
            )

            if (decision.newlyKnownPhones.isNotEmpty()) {
                syncedContactDao.insertContacts(
                    decision.newlyKnownPhones.map { phone ->
                        SyncedContact(phone = phone, name = contactByPhone[phone]?.name.orEmpty())
                    }
                )
            }
            if (decision.phonesToAdd.isEmpty()) return@withLock emptyList()

            var nextOrderIndex = (existing.maxOfOrNull { it.orderIndex } ?: -1) + 1
            val toInsert = decision.phonesToAdd.mapNotNull { phone ->
                val contact = contactByPhone[phone] ?: return@mapNotNull null
                Client(
                    id = UUID.randomUUID().toString(),
                    name = contact.name,
                    phone = contact.phone,
                    active = true,
                    useNameInTemplate = true,
                    source = ClientSource.CONTACT,
                    smsPerWeek = -1,
                    orderIndex = nextOrderIndex++,
                )
            }

            if (toInsert.isEmpty()) return@withLock emptyList()

            clientDao.insertClients(toInsert)
            markNewDataAdded()
            refreshSchedules("New contacts added")
            toInsert
        }

    /**
     * One-time repair for rows already duplicated by the old racy sync. Keeps the
     * first (lowest `orderIndex`) client per phone number, preferring a manually
     * managed entry, and deletes the rest together with their pending schedules.
     *
     * @return how many duplicate rows were removed.
     */
    suspend fun removeDuplicateClients(): Int = clientWriteMutex.withLock {
        val ordered = clientDao.getAllClients().sortedBy { it.orderIndex }
        if (ordered.size < 2) return@withLock 0

        val keepByPhone = LinkedHashMap<String, Client>()
        val duplicateIds = mutableListOf<String>()
        for (client in ordered) {
            val normalized = ClientPhones.normalize(client.phone)
            if (normalized.isEmpty()) continue
            val current = keepByPhone[normalized]
            when {
                current == null -> keepByPhone[normalized] = client
                current.source != ClientSource.MANUAL && client.source == ClientSource.MANUAL -> {
                    keepByPhone[normalized] = client
                    duplicateIds.add(current.id)
                }
                else -> duplicateIds.add(client.id)
            }
        }
        if (duplicateIds.isEmpty()) return@withLock 0

        clientDao.deleteClientsByIds(duplicateIds)
        duplicateIds.forEach { scheduleDao.deletePendingSchedulesForClient(it) }
        refreshSchedules("Duplicate contacts merged")
        duplicateIds.size
    }

    private fun dedupeAgainstExisting(
        candidates: List<Client>,
        existing: List<Client>,
    ): List<Client> {
        if (candidates.isEmpty()) return emptyList()
        val existingPhones = existing
            .mapNotNull { ClientPhones.normalize(it.phone).ifEmpty { null } }
            .toMutableSet()
        return candidates.filter { candidate ->
            val normalized = ClientPhones.normalize(candidate.phone)
            normalized.isNotEmpty() && existingPhones.add(normalized)
        }
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
        normalizeTemplateOrders()
        markNewDataAdded()
        refreshSchedules("New template added")
    }

    suspend fun saveTemplates(templates: List<MessageTemplate>) {
        templateDao.insertTemplates(templates)
        normalizeTemplateOrders()
        markNewDataAdded()
        refreshSchedules("Templates added")
    }

    suspend fun replaceTemplates(templates: List<MessageTemplate>, reason: String = "Templates imported from file") {
        templateDao.deleteAllTemplates()
        templateDao.insertTemplates(templates)
        normalizeTemplateOrders()
        markNewDataAdded()
        refreshSchedules(reason)
    }

    suspend fun updateTemplate(template: MessageTemplate) {
        templateDao.updateTemplate(template)
        normalizeTemplateOrders()
        refreshSchedules("Template updated")
    }

    suspend fun deleteTemplate(template: MessageTemplate) {
        templateDao.deleteTemplate(template)
        normalizeTemplateOrders()
        markNewDataAdded()
        refreshSchedules("Template deleted")
    }

    suspend fun deleteTemplateById(id: String) {
        templateDao.deleteTemplateById(id)
        normalizeTemplateOrders()
        markNewDataAdded()
        refreshSchedules("Template deleted")
    }

    private suspend fun normalizeTemplateOrders() {
        val all = templateDao.getAllTemplates().sortedBy { it.order }
        val reordered = all.mapIndexed { index, tmpl ->
            val newOrder = index + 1
            tmpl.copy(
                order = newOrder,
                title = if (tmpl.title.isBlank() || tmpl.title.startsWith("id:", ignoreCase = true) || tmpl.title.startsWith("SMS Template", ignoreCase = true)) "id: $newOrder" else tmpl.title
            )
        }
        if (reordered.isNotEmpty()) {
            templateDao.insertTemplates(reordered)
        }
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
        numberOfWeeks: Int = -1,
    ): Int = withContext(Dispatchers.Default) {
        scheduleDao.deletePendingSchedules()
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
        if (newSchedules.isNotEmpty()) {
            scheduleDao.insertSchedules(newSchedules)
        }
        newSchedules.size
    }

    suspend fun restartEngineWithStartDate(
        settings: AppSettings,
        startDate: LocalDate,
        numberOfWeeks: Int = -1,
    ): Int = withContext(Dispatchers.Default) {
        scheduleDao.deletePendingSchedules()

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

    suspend fun getCurrentWeekFailedAndRescheduledSchedules(): List<ScheduleWithClient> {
        val now = LocalDate.now()
        val monday = now.with(DayOfWeek.MONDAY).toString()
        val sunday = now.with(DayOfWeek.SUNDAY).toString()
        return scheduleDao.getFailedAndRescheduledSchedulesForWeek(monday, sunday)
    }

    suspend fun rescheduleFailedMessageOnce(failedSchedule: Schedule) {
        if (failedSchedule.retryCount > 0) return

        val lastSchedule = scheduleDao.getLastScheduled()
        val nextDate = try {
            val lastDate = LocalDate.parse(lastSchedule?.scheduledDate ?: failedSchedule.scheduledDate)
            lastDate.plusDays(1).toString()
        } catch (_: Exception) {
            LocalDate.now().plusDays(1).toString()
        }

        val retrySchedule = Schedule(
            id = UUID.randomUUID().toString(),
            clientId = failedSchedule.clientId,
            templateId = failedSchedule.templateId,
            scheduledDate = nextDate,
            scheduledTime = "17:00",
            status = ScheduleStatus.PENDING,
            retryCount = 1,
            week = failedSchedule.week,
            message = failedSchedule.message
        )
        scheduleDao.insertSchedule(retrySchedule)
        refreshSchedules("Failed SMS rescheduled")
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
            scheduleDao.deletePendingSchedules()
            val timeFormat = SimpleDateFormat("h:mm a, MMM dd", Locale.US)
            val timeStr = timeFormat.format(Date())
            settingsDao.upsertSettings(settings.copy(lastPlanUpdateMessage = "Plan updated at $timeStr ($reason)", newDataAdded = false))
            return
        }

        val now = LocalDate.now()
        val configuredStartDate = runCatching {
            if (settings.automationStartDate.isNotBlank()) LocalDate.parse(settings.automationStartDate) else null
        }.getOrNull()

        var warningMessage: String? = null
        var effectiveGap = settings.timeGapMinutes
        var wasAutoAdjusted = false

        withContext(Dispatchers.Default) {
            scheduleDao.deletePendingSchedules()

            val sentCountsList = scheduleDao.getSentCountsPerClient()
            val initialPointers = sentCountsList.associateBy({ it.clientId }, { it.count })

            val startDate = if (configuredStartDate != null && configuredStartDate.isAfter(now)) {
                configuredStartDate
            } else {
                now
            }

            val startTime = if (configuredStartDate != null && configuredStartDate.isAfter(now)) {
                runCatching { LocalTime.parse(settings.workStartTime) }.getOrDefault(LocalTime.of(9, 0))
            } else {
                LocalTime.now()
            }

            val planResult = SchedulePlanner.generateMultiWeekPlan(
                settings = settings,
                startDate = startDate,
                startTime = startTime,
                clients = activeClients,
                templates = enabledTemplates,
                numberOfWeeks = -1,
                initialTemplatePointers = initialPointers,
            )

            warningMessage = planResult.warningMessage
            effectiveGap = planResult.effectiveGap
            wasAutoAdjusted = planResult.wasAutoAdjusted

            if (planResult.schedules.isNotEmpty()) {
                scheduleDao.insertSchedules(planResult.schedules)
            }
        }

        if (wasAutoAdjusted && context != null) {
            NotificationUtils.showTimeGapAdjustedNotification(context, effectiveGap)
        }

        val timeFormat = SimpleDateFormat("h:mm a, MMM dd", Locale.US)
        val timeStr = timeFormat.format(Date())
        val updateMsg = buildString {
            append("Plan updated at $timeStr ($reason)")
            if (wasAutoAdjusted) {
                append(" - Time gap auto-adjusted")
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
