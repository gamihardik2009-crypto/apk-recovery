package com.example.bulksmsscheduler.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.SecondaryScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bulksmsscheduler.model.AppSettings
import com.example.bulksmsscheduler.model.Client
import com.example.bulksmsscheduler.model.Schedule
import com.example.bulksmsscheduler.model.ScheduleStatus
import com.example.bulksmsscheduler.repository.SmsRepository
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

/**
 * Plan Screen:
 * - Compact Search Bar at top.
 * - Rotating batch week tabs.
 * - Individual 6-7 day view chips.
 * - Status filter chips (All, Pending, Sent, Failed).
 * - Schedules remain visible in plan, updating their status when sent or failed.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlanScreen(
    repository: SmsRepository,
    schedules: List<Schedule>,
    clients: List<Client> = emptyList(),
    settings: AppSettings? = null,
    cardBg: Color = Color(0xFF282C35),
    textPrimary: Color,
    textSecondary: Color
) {
    var selectedFilter by remember { mutableStateOf<ScheduleStatus?>(null) }
    var searchQuery by remember { mutableStateOf("") }
    var selectedWeek by remember { mutableStateOf<String?>(null) }
    var selectedDay by remember { mutableStateOf<LocalDate?>(null) }

    val clientMap = remember(clients) { clients.associateBy { it.id } }

    // Group schedules by batch string (e.g. "25/09")
    val weekMap = remember(schedules) {
        schedules.groupBy { it.week.ifBlank { LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM")) } }
    }

    val weekKeys = remember(weekMap, schedules) {
        if (weekMap.isNotEmpty()) {
            val today = LocalDate.now()
            weekMap.keys
                .map { key ->
                    val sampleSchedule = weekMap[key]?.firstOrNull()
                    val startDate = if (sampleSchedule != null) {
                        runCatching { LocalDate.parse(sampleSchedule.scheduledDate) }.getOrDefault(LocalDate.MIN)
                    } else {
                        runCatching {
                            LocalDate.parse("$key/${today.year}", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                        }.getOrDefault(LocalDate.MIN)
                    }
                    key to startDate
                }
                .sortedBy { it.second }
                .filter { (_, startDate) -> !startDate.isBefore(today.minusDays(6)) }
                .map { it.first }
                .take(4)
                .ifEmpty {
                    // Fallback if all keys were filtered out
                    weekMap.keys.sorted().take(4)
                }
        } else {
            val now = LocalDate.now()
            listOf(
                now.format(DateTimeFormatter.ofPattern("dd/MM")),
                now.plusDays(7).format(DateTimeFormatter.ofPattern("dd/MM")),
                now.plusDays(14).format(DateTimeFormatter.ofPattern("dd/MM")),
                now.plusDays(21).format(DateTimeFormatter.ofPattern("dd/MM"))
            )
        }
    }

    val currentWeekKey = remember(selectedWeek, weekKeys) {
        selectedWeek ?: weekKeys.firstOrNull() ?: LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM"))
    }

    // Reset selected day when week tab changes
    LaunchedEffect(currentWeekKey) {
        selectedDay = null
    }

    val batchSchedules = remember(weekMap, currentWeekKey) {
        weekMap[currentWeekKey] ?: emptyList()
    }

    // Calculate the week's 7 days starting from the week key date (Monday)
    val weekStartDate = remember(currentWeekKey, weekMap) {
        val sampleSchedule = weekMap[currentWeekKey]?.firstOrNull()
        if (sampleSchedule != null) {
            runCatching { LocalDate.parse(sampleSchedule.scheduledDate) }.getOrDefault(LocalDate.now())
        } else {
            runCatching {
                LocalDate.parse("$currentWeekKey/${LocalDate.now().year}", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            }.getOrDefault(LocalDate.now())
        }
    }
    val weekDays = remember(weekStartDate) {
        (0 until 7).map { weekStartDate.plusDays(it.toLong()) }
    }

    // Filter by search query first
    val searchedSchedules = remember(batchSchedules, searchQuery, clientMap) {
        if (searchQuery.isBlank()) batchSchedules
        else batchSchedules.filter { schedule ->
            val client = clientMap[schedule.clientId]
            val name = client?.name ?: ""
            val phone = client?.phone ?: ""
            name.contains(searchQuery, ignoreCase = true) ||
                    phone.contains(searchQuery, ignoreCase = true) ||
                    schedule.message.contains(searchQuery, ignoreCase = true)
        }
    }

    // Schedules filtered by selected day (or whole searched batch if All Days is selected)
    val daySchedules = remember(searchedSchedules, selectedDay) {
        if (selectedDay != null) {
            val dateStr = selectedDay.toString()
            searchedSchedules.filter { it.scheduledDate == dateStr }
        } else {
            searchedSchedules
        }
    }

    // Dynamic chip counts based on current day selection
    val pendingCount = remember(daySchedules) { ScheduleFilters.count(daySchedules, ScheduleStatus.PENDING) }
    val sentCount = remember(daySchedules) { ScheduleFilters.count(daySchedules, ScheduleStatus.SENT) }
    val failedCount = remember(daySchedules) { ScheduleFilters.count(daySchedules, ScheduleStatus.FAILED) }

    // Filter schedules by selected status
    val filteredSchedules = remember(daySchedules, selectedFilter) {
        if (selectedFilter == null) daySchedules
        else daySchedules.filter { it.status == selectedFilter }
    }

    val searchBg = Color(0xFF232731)
    val scheduleCardBg = Color(0xFF282C35)

    Column(modifier = Modifier.fillMaxSize()) {
        // 1. Compact Search Field at top
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = { Text("Search by client name or phone...", color = Color(0xFF8E95A5), fontSize = 13.sp) },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = Color(0xFF8E95A5), modifier = Modifier.size(18.dp)) },
            singleLine = true,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                focusedContainerColor = searchBg,
                unfocusedContainerColor = searchBg,
                focusedTextColor = textPrimary,
                unfocusedTextColor = textPrimary
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        // 2. Compact & Sleek Batch Week Selector
        if (weekKeys.isNotEmpty()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                weekKeys.forEach { weekLabel ->
                    val isSelected = weekLabel == currentWeekKey
                    val batchCount = weekMap[weekLabel]?.size ?: 0
                    val containerColor = if (isSelected) Color(0xFFC62828) else Color(0xFF232731)

                    Card(
                        onClick = { selectedWeek = weekLabel },
                        shape = RoundedCornerShape(10.dp),
                        colors = CardDefaults.cardColors(containerColor = containerColor),
                        border = if (isSelected) BorderStroke(1.5.dp, Color(0xFFFF8A80)) else BorderStroke(1.dp, Color(0xFF323B4E)),
                        modifier = Modifier.height(44.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(horizontal = 12.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = weekLabel,
                                fontSize = 13.sp,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                color = Color.White
                            )
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(if (isSelected) Color.Black.copy(alpha = 0.3f) else Color(0xFF1E2330))
                                    .padding(horizontal = 6.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    text = "($batchCount)",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF81C784)
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))
        }

        // 3. Individual Days View Chips Row (Breathable, 20% more space)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FilterChip(
                selected = selectedDay == null,
                onClick = { selectedDay = null },
                label = { Text("All Days (${searchedSchedules.size})", fontSize = 12.sp, fontWeight = FontWeight.SemiBold) },
                modifier = Modifier.height(38.dp),
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = Color(0xFF3B4358),
                    selectedLabelColor = Color.White,
                    containerColor = searchBg,
                    labelColor = textSecondary
                )
            )
            weekDays.forEach { day ->
                val dayCount = searchedSchedules.count { it.scheduledDate == day.toString() }
                val dayLabel = "${day.format(DateTimeFormatter.ofPattern("EEE dd/MM", Locale.US))} ($dayCount)"
                FilterChip(
                    selected = selectedDay == day,
                    onClick = { selectedDay = day },
                    label = { Text(dayLabel, fontSize = 12.sp, fontWeight = FontWeight.SemiBold) },
                    modifier = Modifier.height(38.dp),
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = Color(0xFF3B4358),
                        selectedLabelColor = Color.White,
                        containerColor = searchBg,
                        labelColor = textSecondary
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        // 4. Status Filter Chips Row (Breathable, 20% more space)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            listOf(
                null to "All Status (${daySchedules.size})",
                ScheduleStatus.PENDING to "Pending ($pendingCount)",
                ScheduleStatus.SENT to "Sent ($sentCount)",
                ScheduleStatus.FAILED to "Failed ($failedCount)"
            ).forEach { (status, label) ->
                FilterChip(
                    selected = selectedFilter == status,
                    onClick = { selectedFilter = status },
                    label = { Text(label, fontSize = 12.sp, fontWeight = FontWeight.SemiBold) },
                    modifier = Modifier.height(38.dp),
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = Color(0xFF3B4358),
                        selectedLabelColor = Color.White,
                        containerColor = searchBg,
                        labelColor = textSecondary
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // 5. Schedules List / Empty State (Maximized vertical space)
        if (filteredSchedules.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = if (schedules.isEmpty()) "Start automation to see your plan here" else "No messages found for this filter.",
                    color = textSecondary,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(filteredSchedules, key = { it.id }) { schedule ->
                    val client = clientMap[schedule.clientId]
                    ScheduleCard(
                        schedule = schedule,
                        client = client,
                        cardBg = scheduleCardBg,
                        textPrimary = textPrimary,
                        textSecondary = textSecondary
                    )
                }
            }
        }
    }
}

@Composable
private fun ScheduleCard(
    schedule: Schedule,
    client: Client?,
    cardBg: Color,
    textPrimary: Color,
    textSecondary: Color
) {
    val statusBg = when (schedule.status) {
        ScheduleStatus.PENDING -> Color(0xFF3E3B2E)
        ScheduleStatus.SENT -> Color(0xFF283C32)
        ScheduleStatus.FAILED -> Color(0xFF402A2C)
    }

    val statusTint = when (schedule.status) {
        ScheduleStatus.PENDING -> Color(0xFFFFD54F)
        ScheduleStatus.SENT -> Color(0xFF81C784)
        ScheduleStatus.FAILED -> Color(0xFFE57373)
    }

    val recipientName = remember(client, schedule.clientId) {
        client?.name ?: "Client #${schedule.clientId.take(6)}"
    }

    val recipientPhone = remember(client) {
        client?.phone ?: ""
    }

    val formattedDateTime = remember(schedule.scheduledDate, schedule.scheduledTime) {
        try {
            val date = LocalDate.parse(schedule.scheduledDate)
            val dateStr = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US))

            val timeParts = schedule.scheduledTime.split(":")
            val timeStr = if (timeParts.size == 2) {
                val hour = timeParts[0].toIntOrNull() ?: 0
                val minute = timeParts[1]
                val amPm = if (hour >= 12) "PM" else "AM"
                val hour12 = when {
                    hour == 0 -> 12
                    hour > 12 -> hour - 12
                    else -> hour
                }
                String.format(Locale.US, "%02d:%s %s", hour12, minute, amPm)
            } else {
                schedule.scheduledTime
            }

            "$dateStr, $timeStr"
        } catch (_: Exception) {
            "${schedule.scheduledDate}, ${schedule.scheduledTime}"
        }
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = cardBg)
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .size(34.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF2E3D52)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = null,
                            tint = Color(0xFF9CB7F5),
                            modifier = Modifier.size(18.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(
                            text = recipientName,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = textPrimary
                        )
                        if (recipientPhone.isNotBlank()) {
                            Spacer(modifier = Modifier.height(1.dp))
                            Text(
                                text = recipientPhone,
                                fontSize = 11.sp,
                                color = textSecondary
                            )
                        }
                    }
                }

                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(statusBg)
                            .padding(horizontal = 8.dp, vertical = 3.dp)
                    ) {
                        Text(
                            text = schedule.status.name,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = statusTint
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = null,
                            tint = Color(0xFF9CB7F5),
                            modifier = Modifier.size(11.dp)
                        )
                        Text(
                            text = formattedDateTime,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF9CB7F5)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFF1E2330))
                    .padding(10.dp)
            ) {
                Text(
                    text = schedule.message,
                    fontSize = 13.sp,
                    color = Color(0xFFE0E0E0),
                    lineHeight = 18.sp
                )
            }
        }
    }
}
