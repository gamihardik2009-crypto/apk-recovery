package com.example.bulksmsscheduler.ui

import android.content.Intent
import android.net.Uri
import android.provider.Settings
import android.text.format.DateFormat
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TimeInput
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.bulksmsscheduler.model.AppSettings
import java.time.LocalTime
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsDialog(
    settings: AppSettings,
    textPrimary: Color,
    onDismiss: () -> Unit,
    onSave: (updatedSettings: AppSettings) -> Unit
) {
    val context = LocalContext.current
    // RECOVERED: the settings screen keeps the working hours as java.time.LocalTime
    // (original: C1/y.java -> mutableStateOf(LocalTime.of(9, 0)) / LocalTime.of(18, 0)).
    var startTime by remember {
        mutableStateOf(parseWorkTime(settings.workStartTime, LocalTime.of(9, 0)))
    }
    var endTime by remember {
        mutableStateOf(parseWorkTime(settings.workEndTime, LocalTime.of(18, 0)))
    }
    var timeGapMinutes by remember { mutableFloatStateOf(settings.timeGapMinutes.toFloat().coerceAtLeast(1f)) }
    var smsPerWeek by remember { mutableFloatStateOf(settings.smsPerWeek.toFloat()) }
    var skipSunday by remember { mutableStateOf(settings.skipSunday) }

    var showStartPicker by remember { mutableStateOf(false) }
    var showEndPicker by remember { mutableStateOf(false) }
    // Inline validation: a window whose end is not after its start can never hold a
    // message slot (the planner would have to roll past midnight), so it is refused
    // instead of being stored and breaking the engine.
    var timeError by remember { mutableStateOf<String?>(null) }

    val cardBg = Color(0xFF282C35)
    val dialogBg = Color(0xFF1E2330)
    val accentRed = Color(0xFFE53935)
    val textSecondary = Color(0xFF9E9E9E)
    // Palette of the ORIGINAL app (e2/AbstractC0658a + sampled from its screenshots).
    val accentBlue = Color(0xFF8AB4F8) // primary
    val timeFieldText = Color(0xFFE8EAED) // onSurface
    val timeFieldLabel = Color(0xFFBDC1C6) // onSurfaceVariant
    val timeFieldBorder = Color(0xFF938F99) // outline
    val pickerDialogBg = Color(0xFF3A3F49) // AlertDialog surfaceContainerHigh

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.94f)
                .padding(vertical = 16.dp),
            shape = RoundedCornerShape(24.dp),
            color = dialogBg
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                // Top Navigation Bar matching compiled DEX c2/b.smali TopAppBar
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = onDismiss) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = textPrimary
                            )
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Settings",
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = textPrimary
                        )
                    }

                    Button(
                        onClick = {
                            val invalid = !endTime.isAfter(startTime)
                            timeError = if (invalid) {
                                "End time must be later than start time."
                            } else {
                                null
                            }
                            if (!invalid) {
                                onSave(
                                    settings.copy(
                                        // RECOVERED: the DB keeps the 24-hour "HH:mm" strings
                                        // (original: C1/y.java:450 DateTimeFormatter.ofPattern("HH:mm")).
                                        workStartTime = formatWorkTimeForStorage(startTime),
                                        workEndTime = formatWorkTimeForStorage(endTime),
                                        timeGapMinutes = timeGapMinutes.toInt().coerceAtLeast(1),
                                        smsPerWeek = smsPerWeek.toInt(),
                                        skipSunday = skipSunday
                                    )
                                )
                            }
                        },
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = accentRed)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Save", fontWeight = FontWeight.Bold)
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Card 1: Working Hours (Start Time & End Time)
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(containerColor = cardBg)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(38.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFF2E3D52)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = null,
                                    tint = Color(0xFF9CB7F5),
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                text = "Working Hours",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = textPrimary
                            )
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        // RECOVERED time input (original: W1/C0386g):
                        // two read-only OutlinedTextFields side by side, 12 dp apart,
                        // each showing the time as "hh:mm a" and opening a picker on tap.
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            WorkTimeField(
                                label = "Start Time",
                                value = formatWorkTimeForDisplay(startTime),
                                textColor = timeFieldText,
                                labelColor = timeFieldLabel,
                                borderColor = timeFieldBorder,
                                focusColor = accentBlue,
                                onClick = { showStartPicker = true },
                                modifier = Modifier.weight(1f)
                            )
                            WorkTimeField(
                                label = "End Time",
                                value = formatWorkTimeForDisplay(endTime),
                                textColor = timeFieldText,
                                labelColor = timeFieldLabel,
                                borderColor = timeFieldBorder,
                                focusColor = accentBlue,
                                onClick = { showEndPicker = true },
                                modifier = Modifier.weight(1f)
                            )
                        }

                        timeError?.let { message ->
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = message,
                                color = accentRed,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Card 2: Sending Interval / Time Gap (Manual)
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(containerColor = cardBg)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(
                                modifier = Modifier.weight(1f),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(38.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF3E3B2E)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Refresh,
                                        contentDescription = null,
                                        tint = Color(0xFFFFD54F),
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(12.dp))
                                Column {
                                    Text(
                                        text = "Time Gap (Manual)",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = textPrimary
                                    )
                                    Text(
                                        text = "Interval between consecutive scheduled messages",
                                        fontSize = 11.sp,
                                        color = textSecondary
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RepeatingIconButton(
                                onClick = {
                                    if (timeGapMinutes > 1f) timeGapMinutes -= 1f
                                },
                                enabled = timeGapMinutes > 1f,
                                modifier = Modifier.size(42.dp),
                                backgroundColor = if (timeGapMinutes > 1f) Color(0xFF3E3B2E) else Color(0xFF23262F)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Remove,
                                    contentDescription = "Decrease Time Gap",
                                    tint = if (timeGapMinutes > 1f) Color(0xFFFFD54F) else Color.Gray
                                )
                            }

                            Spacer(modifier = Modifier.width(20.dp))

                            Text(
                                text = "${timeGapMinutes.toInt()} min",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFFFFD54F)
                            )

                            Spacer(modifier = Modifier.width(20.dp))

                            RepeatingIconButton(
                                onClick = {
                                    if (timeGapMinutes < 60f) timeGapMinutes += 1f
                                },
                                enabled = timeGapMinutes < 60f,
                                modifier = Modifier.size(42.dp),
                                backgroundColor = if (timeGapMinutes < 60f) Color(0xFF3E3B2E) else Color(0xFF23262F)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "Increase Time Gap",
                                    tint = if (timeGapMinutes < 60f) Color(0xFFFFD54F) else Color.Gray
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Note: If input exceeds available week capacity, app will automatically cap it to the maximum possible gap for that week.",
                            fontSize = 11.sp,
                            color = textSecondary,
                            lineHeight = 15.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Card: SMS Per Week (Templates per week)
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(containerColor = cardBg)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(
                                modifier = Modifier.weight(1f),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(38.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF2E3A4E)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.DateRange,
                                        contentDescription = null,
                                        tint = Color(0xFF9CB7F5),
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(12.dp))
                                Column {
                                    Text(
                                        text = "SMS Per Week",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = textPrimary
                                    )
                                    Text(
                                        text = "Number of templates sent per week",
                                        fontSize = 11.sp,
                                        color = textSecondary
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RepeatingIconButton(
                                onClick = {
                                    if (smsPerWeek > 1f) smsPerWeek -= 1f
                                },
                                enabled = smsPerWeek > 1f,
                                modifier = Modifier.size(42.dp),
                                backgroundColor = if (smsPerWeek > 1f) Color(0xFF2E3A4E) else Color(0xFF23262F)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Remove,
                                    contentDescription = "Decrease SMS Per Week",
                                    tint = if (smsPerWeek > 1f) Color(0xFF9CB7F5) else Color.Gray
                                )
                            }

                            Spacer(modifier = Modifier.width(20.dp))

                            Text(
                                text = "${smsPerWeek.toInt()} per week",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF9CB7F5)
                            )

                            Spacer(modifier = Modifier.width(20.dp))

                            RepeatingIconButton(
                                onClick = {
                                    if (smsPerWeek < 10f) smsPerWeek += 1f
                                },
                                enabled = smsPerWeek < 10f,
                                modifier = Modifier.size(42.dp),
                                backgroundColor = if (smsPerWeek < 10f) Color(0xFF2E3A4E) else Color(0xFF23262F)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "Increase SMS Per Week",
                                    tint = if (smsPerWeek < 10f) Color(0xFF9CB7F5) else Color.Gray
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Card 3: Skip Sundays
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(containerColor = cardBg)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "Skip Sundays",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = textPrimary
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "Do not send any messages on Sundays",
                                fontSize = 12.sp,
                                color = textSecondary
                            )
                        }

                        Switch(
                            checked = skipSunday,
                            onCheckedChange = { skipSunday = it },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = Color.White,
                                checkedTrackColor = accentRed,
                                uncheckedThumbColor = Color(0xFFB0BEC5),
                                uncheckedTrackColor = Color(0xFF424242)
                            )
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Card 4: Battery Optimization matching DEX c2/a.smali string
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF402A2C))
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Warning,
                                contentDescription = null,
                                tint = Color(0xFFE57373),
                                modifier = Modifier.size(22.dp)
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "Battery Optimization",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Android may stop the SMS service to save battery. To ensure scheduled messages are sent on time, please disable optimization for Bulk SMS Scheduler.",
                            fontSize = 12.sp,
                            color = Color(0xFFE0E0E0),
                            lineHeight = 16.sp
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        OutlinedButton(
                            onClick = {
                                try {
                                    val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                                        data = Uri.fromParts("package", context.packageName, null)
                                    }
                                    context.startActivity(intent)
                                } catch (_: Exception) {
                                    // Fallback
                                }
                            },
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White)
                        ) {
                            Text("Open App Settings", fontSize = 13.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }

    // RECOVERED start/end time pickers.
    // Original: C1/y.java (lines 458-532) opens an AlertDialog whose title is
    // "Select Start Time" / "Select End Time" and whose body is the Material3
    // *TimeInput* (H.K5.b) - keyboard entry with an AM/PM toggle - plus plain
    // "Cancel" / "OK" text buttons.
    if (showStartPicker) {
        WorkTimeInputDialog(
            title = "Select Start Time",
            initialTime = startTime,
            textColor = textPrimary,
            accentColor = accentBlue,
            containerColor = pickerDialogBg,
            onDismiss = { showStartPicker = false },
            onConfirm = {
                startTime = it
                timeError = null
                showStartPicker = false
            }
        )
    }

    if (showEndPicker) {
        WorkTimeInputDialog(
            title = "Select End Time",
            initialTime = endTime,
            textColor = textPrimary,
            accentColor = accentBlue,
            containerColor = pickerDialogBg,
            onDismiss = { showEndPicker = false },
            onConfirm = {
                endTime = it
                timeError = null
                showEndPicker = false
            }
        )
    }
}

/**
 * Persistence format of `AppSettings.workStartTime` / `workEndTime`.
 * RECOVERED: `DateTimeFormatter.ofPattern("HH:mm")` (original `C1/y.java:450`).
 */
private val WORK_TIME_STORAGE_FORMAT: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm")

/**
 * Display format of the "Start Time" / "End Time" fields.
 * RECOVERED: `DateTimeFormatter.ofPattern("hh:mm a")` (original `C1/y.java:449`),
 * i.e. the settings screen always shows 12-hour times such as `09:00 AM`.
 */
private val WORK_TIME_DISPLAY_FORMAT: DateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a")

/**
 * Parses a stored `HH:mm` value, falling back to [fallback] for empty/garbage rows
 * (the original catches the parse exception and uses 09:00 / 18:00 - `C0627d`).
 */
internal fun parseWorkTime(stored: String, fallback: LocalTime): LocalTime =
    try {
        LocalTime.parse(stored)
    } catch (_: Exception) {
        fallback
    }

/** `09:00` -> `09:00 AM` (what the settings screen displays). */
internal fun formatWorkTimeForDisplay(time: LocalTime): String =
    time.format(WORK_TIME_DISPLAY_FORMAT)

/** `LocalTime(9, 0)` -> `09:00` (what is persisted, keeps the DB/planner 24-hour). */
internal fun formatWorkTimeForStorage(time: LocalTime): String =
    time.format(WORK_TIME_STORAGE_FORMAT)

/**
 * A non-editable outlined time field that opens a picker when tapped - the exact
 * construction used by the original settings screen (`W1/C0386g`):
 * `OutlinedTextField(value, {}, Modifier.clickable { showPicker = true },
 *  enabled = false, readOnly = true, singleLine = true, label = { Text("Start Time") },
 *  shape = RoundedCornerShape(12), colors = ...)`.
 *
 * `enabled = false` + `readOnly = true` keep the field from consuming the tap, so the
 * clickable modifier (and its ripple) receives it, while the custom disabled colours
 * keep the text/label/border as bright as in the original.
 */
@Composable
private fun WorkTimeField(
    label: String,
    value: String,
    textColor: Color,
    labelColor: Color,
    borderColor: Color,
    focusColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = {},
        modifier = modifier.clickable { onClick() },
        enabled = false,
        readOnly = true,
        singleLine = true,
        label = { Text(label) },
        shape = RoundedCornerShape(percent = 12),
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = textColor,
            unfocusedTextColor = textColor,
            disabledTextColor = textColor,
            focusedLabelColor = labelColor,
            unfocusedLabelColor = labelColor,
            disabledLabelColor = labelColor,
            focusedBorderColor = focusColor,
            unfocusedBorderColor = borderColor,
            disabledBorderColor = borderColor,
            disabledContainerColor = Color.Transparent
        )
    )
}

/**
 * The recovered time picker dialog.
 *
 * The picker state is built exactly like the original (`H.K5.k`):
 * `rememberTimePickerState(hour, minute, is24Hour = DateFormat.is24HourFormat(context))`
 * - the *input* follows the device's 24-hour setting while the fields above always
 * display `hh:mm a`.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun WorkTimeInputDialog(
    title: String,
    initialTime: LocalTime,
    textColor: Color,
    accentColor: Color,
    containerColor: Color,
    onDismiss: () -> Unit,
    onConfirm: (LocalTime) -> Unit
) {
    val context = LocalContext.current
    val timePickerState = rememberTimePickerState(
        initialHour = initialTime.hour,
        initialMinute = initialTime.minute,
        is24Hour = DateFormat.is24HourFormat(context)
    )

    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = containerColor,
        shape = RoundedCornerShape(28.dp),
        title = { Text(text = title, color = textColor) },
        text = { TimeInput(state = timePickerState) },
        confirmButton = {
            TextButton(
                onClick = { onConfirm(LocalTime.of(timePickerState.hour, timePickerState.minute)) }
            ) {
                Text("OK", color = accentColor, fontWeight = FontWeight.Bold)
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel", color = accentColor)
            }
        }
    )
}

@Composable
private fun RepeatingIconButton(
    onClick: () -> Unit,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    content: @Composable () -> Unit
) {
    val currentOnClick by rememberUpdatedState(onClick)

    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(backgroundColor)
            .pointerInput(enabled) {
                if (!enabled) return@pointerInput
                coroutineScope {
                    awaitPointerEventScope {
                        while (true) {
                            val down = awaitFirstDown(requireUnconsumed = false)
                            down.consume()

                            currentOnClick()

                            val repeatJob = launch {
                                delay(350L)
                                while (isActive) {
                                    currentOnClick()
                                    delay(80L)
                                }
                            }

                            val up = waitForUpOrCancellation()
                            up?.consume()

                            repeatJob.cancel()
                        }
                    }
                }
            },
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}



