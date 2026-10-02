package com.example.bulksmsscheduler.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.bulksmsscheduler.model.AppSettings
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.TextStyle
import java.time.temporal.TemporalAdjusters
import java.util.Locale

@Composable
fun ManualEngineStartDialog(
    settings: AppSettings,
    textPrimary: Color,
    onDismiss: () -> Unit,
    onStartConfirmed: (startDate: LocalDate) -> Unit
) {
    var startChoice by remember { mutableStateOf(StartChoice.NEXT_WORKING_HOURS) }
    var selectedDayOfWeek by remember { mutableStateOf(DayOfWeek.MONDAY) }

    val nextWorkingDate = remember(settings) { getNextWorkingStartDate(settings) }
    val isToday = nextWorkingDate == LocalDate.now()
    val isTomorrow = nextWorkingDate == LocalDate.now().plusDays(1)
    val dayLabel = when {
        isToday -> "Today"
        isTomorrow -> "Tomorrow"
        else -> nextWorkingDate.dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault())
    }
    val formattedStartTime = RecoveredStrings.formatTimeToAmPm(settings.workStartTime)
    val nextWorkingText = "Next Working Hours ($dayLabel at $formattedStartTime)"

    val dialogBg = Color(0xFF1E2330)
    val cardBg = Color(0xFF282C35)
    val accentRed = Color(0xFFE53935)
    val accentBlue = Color(0xFF8AB4F8)

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .padding(16.dp),
            shape = RoundedCornerShape(24.dp),
            color = dialogBg
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                // Header
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = null,
                        tint = accentBlue,
                        modifier = Modifier.size(28.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "Restart Engine",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = textPrimary
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Choose when you want the engine batch to start from:",
                    fontSize = 14.sp,
                    color = Color(0xFFBDC1C6)
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Option 1: Next Working Hours
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { startChoice = StartChoice.NEXT_WORKING_HOURS }
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = startChoice == StartChoice.NEXT_WORKING_HOURS,
                        onClick = { startChoice = StartChoice.NEXT_WORKING_HOURS },
                        colors = RadioButtonDefaults.colors(selectedColor = accentRed)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = nextWorkingText,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = textPrimary
                    )
                }

                // Option 2: Specific Day of the Week
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { startChoice = StartChoice.DAY_OF_WEEK }
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = startChoice == StartChoice.DAY_OF_WEEK,
                        onClick = { startChoice = StartChoice.DAY_OF_WEEK },
                        colors = RadioButtonDefaults.colors(selectedColor = accentRed)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Choose a day of the week",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = textPrimary
                    )
                }

                // Day of Week Picker
                if (startChoice == StartChoice.DAY_OF_WEEK) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = cardBg),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Text(
                                text = "Select starting weekday as first day of batch:",
                                fontSize = 13.sp,
                                color = Color(0xFF9E9E9E)
                            )
                            Spacer(modifier = Modifier.height(8.dp))

                            DayOfWeek.entries.forEach { day ->
                                val isSelected = day == selectedDayOfWeek
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { selectedDayOfWeek = day }
                                        .background(
                                            if (isSelected) accentBlue.copy(alpha = 0.2f) else Color.Transparent,
                                            shape = RoundedCornerShape(8.dp)
                                        )
                                        .padding(horizontal = 12.dp, vertical = 8.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = day.getDisplayName(TextStyle.FULL, Locale.getDefault()),
                                        color = if (isSelected) accentBlue else textPrimary,
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                                    )
                                    if (isSelected) {
                                        RadioButton(selected = true, onClick = null, colors = RadioButtonDefaults.colors(selectedColor = accentBlue))
                                    }
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Action Buttons
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = onDismiss) {
                        Text("Cancel", color = Color(0xFF9E9E9E))
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = {
                            val targetDate = when (startChoice) {
                                StartChoice.NEXT_WORKING_HOURS -> getNextWorkingStartDate(settings)
                                StartChoice.DAY_OF_WEEK -> {
                                    val today = LocalDate.now()
                                    val workStart = runCatching { LocalTime.parse(settings.workStartTime) }.getOrDefault(LocalTime.of(9, 0))
                                    var calculated = today.with(TemporalAdjusters.nextOrSame(selectedDayOfWeek))
                                    if (calculated == today && LocalTime.now().isAfter(workStart)) {
                                        calculated = calculated.plusWeeks(1)
                                    }
                                    if (settings.skipSunday && calculated.dayOfWeek == DayOfWeek.SUNDAY) {
                                        calculated = calculated.plusDays(1)
                                    }
                                    calculated
                                }
                            }
                            onStartConfirmed(targetDate)
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = accentRed),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text("Start Engine", fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

enum class StartChoice {
    NEXT_WORKING_HOURS, DAY_OF_WEEK
}

fun getNextWorkingStartDate(
    settings: AppSettings,
    now: LocalDateTime = LocalDateTime.now()
): LocalDate {
    val workStart = runCatching { LocalTime.parse(settings.workStartTime) }.getOrDefault(LocalTime.of(9, 0))
    var targetDate = if (now.toLocalTime().isBefore(workStart)) {
        now.toLocalDate()
    } else {
        now.toLocalDate().plusDays(1)
    }
    if (settings.skipSunday && targetDate.dayOfWeek == DayOfWeek.SUNDAY) {
        targetDate = targetDate.plusDays(1)
    }
    return targetDate
}
