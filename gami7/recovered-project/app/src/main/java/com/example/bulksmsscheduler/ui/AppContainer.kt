package com.example.bulksmsscheduler.ui

import android.Manifest
import android.content.pm.PackageManager
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.SimCard
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.ui.window.Dialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.bulksmsscheduler.SmsApplication
import com.example.bulksmsscheduler.model.AppSettings
import com.example.bulksmsscheduler.model.Client
import com.example.bulksmsscheduler.model.HomeStatsData
import com.example.bulksmsscheduler.model.ScheduleWithClient
import com.example.bulksmsscheduler.utils.SchedulePlanner
import com.example.bulksmsscheduler.utils.SmsWorkerSchedule
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * Root of the recovered UI matching the original Bulk SMS Scheduler dashboard design.
 */
@Composable
fun AppContainer(application: SmsApplication) {
    val repository = application.repository
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val snackbarHostState = remember { SnackbarHostState() }

    var hasSendSmsPermission by remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.SEND_SMS
            ) == PackageManager.PERMISSION_GRANTED
        )
    }

    val settingsState by repository.settingsFlow.collectAsState(initial = AppSettings())
    val settings = settingsState ?: AppSettings()

    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        hasSendSmsPermission = isGranted
        if (!isGranted) {
            scope.launch {
                snackbarHostState.showSnackbar("SMS permission is required to send messages")
            }
        }
    }

    LaunchedEffect(Unit) {
        if (!hasSendSmsPermission) {
            permissionLauncher.launch(Manifest.permission.SEND_SMS)
        } else {
            repository.processDueSchedules(application.smsSender)
        }
    }

    LaunchedEffect(settings.automationEnabled, hasSendSmsPermission) {
        if (settings.automationEnabled && hasSendSmsPermission) {
            while (true) {
                repository.processDueSchedules(application.smsSender)
                delay(10_000L)
            }
        }
    }

    val statsState by repository.statsFlow.collectAsState(initial = HomeStatsData())
    val stats = statsState

    val clientsState by repository.clientsFlow.collectAsState(initial = emptyList())
    val templatesState by repository.templatesFlow.collectAsState(initial = emptyList())
    val schedulesState by repository.schedulesFlow.collectAsState(initial = emptyList())

    var selectedTab by remember { mutableIntStateOf(0) }
    var showSettingsDialog by remember { mutableStateOf(false) }
    var showSimSwitchDialog by remember { mutableStateOf(false) }
    var showManualStartDialog by remember { mutableStateOf(false) }
    var showTurnOffEngineDialog by remember { mutableStateOf(false) }

    var showSentHistoryDialog by remember { mutableStateOf(false) }
    var showFailedHistoryDialog by remember { mutableStateOf(false) }
    var sentHistoryItems by remember { mutableStateOf<List<ScheduleWithClient>>(emptyList()) }
    var failedHistoryItems by remember { mutableStateOf<List<ScheduleWithClient>>(emptyList()) }

    // Dark theme color palette
    val darkBg = Color(0xFF181C24)
    val cardBg = Color(0xFF242A38)
    val engineCardBg = Color(0xFF5C2426)
    val engineSubcardBg = Color(0xFF3D1618)
    val engineIconBg = Color(0xFF7A2E30)
    val bottomNavBg = Color(0xFF151821)
    val textPrimary = Color.White
    val textSecondary = Color(0xFF9E9E9E)

    Scaffold(
        containerColor = darkBg,
        snackbarHost = { SnackbarHost(snackbarHostState) },
        bottomBar = {
            NavigationBar(
                containerColor = bottomNavBg,
                tonalElevation = 0.dp
            ) {
                val navItems = listOf(
                    NavItem("Home", Icons.Default.Home),
                    NavItem("Clients", Icons.Default.Person),
                    NavItem("Templates", Icons.AutoMirrored.Filled.List),
                    NavItem("Plan", Icons.Default.DateRange)
                )
                navItems.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        icon = { Icon(item.icon, contentDescription = item.label) },
                        label = { Text(item.label) },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = Color.White,
                            selectedTextColor = Color.White,
                            unselectedIconColor = textSecondary,
                            unselectedTextColor = textSecondary,
                            indicatorColor = Color(0xFF3B4358)
                        )
                    )
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(20.dp)
        ) {
            when (selectedTab) {
                0 -> HomeScreen(
                    settings = settings,
                    stats = stats,
                    clientCount = clientsState.size,
                    clients = clientsState,
                    cardBg = cardBg,
                    engineCardBg = engineCardBg,
                    engineSubcardBg = engineSubcardBg,
                    engineIconBg = engineIconBg,
                    textPrimary = textPrimary,
                    textSecondary = textSecondary,
                    onOpenSettings = { showSettingsDialog = true },
                    onOpenSimSwitch = { showSimSwitchDialog = true },
                    onToggleEngine = { enabled ->
                        scope.launch {
                            if (enabled) {
                                if (ContextCompat.checkSelfPermission(context, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
                                    permissionLauncher.launch(Manifest.permission.SEND_SMS)
                                    snackbarHostState.showSnackbar("Please grant SMS permission to start automation")
                                    return@launch
                                }

                                val activeClients = repository.getActiveClients()
                                val enabledTemplates = repository.getEnabledTemplates()

                                if (activeClients.isEmpty()) {
                                    snackbarHostState.showSnackbar("Please add at least one client first")
                                    return@launch
                                }

                                if (enabledTemplates.isEmpty()) {
                                    snackbarHostState.showSnackbar("Please add and enable at least one SMS template")
                                    return@launch
                                }

                                showManualStartDialog = true
                            } else {
                                showTurnOffEngineDialog = true
                            }
                        }
                    },
                    onClearUpdateMessage = {
                        scope.launch {
                            repository.clearPlanUpdateMessage()
                        }
                    },
                    onShowSentHistory = {
                        scope.launch {
                            sentHistoryItems = repository.getCurrentWeekSentSchedules()
                            showSentHistoryDialog = true
                        }
                    },
                    onShowFailedHistory = {
                        scope.launch {
                            failedHistoryItems = repository.getCurrentWeekFailedSchedules()
                            showFailedHistoryDialog = true
                        }
                    }
                )
                1 -> ClientsScreen(
                    repository = repository,
                    clients = clientsState,
                    settings = settings,
                    cardBg = cardBg,
                    textPrimary = textPrimary,
                    textSecondary = textSecondary,
                    onMessage = { message ->
                        scope.launch { snackbarHostState.showSnackbar(message) }
                    }
                )
                2 -> TemplatesScreen(
                    repository = repository,
                    templates = templatesState,
                    cardBg = cardBg,
                    textPrimary = textPrimary,
                    textSecondary = textSecondary
                )
                3 -> PlanScreen(
                    repository = repository,
                    schedules = schedulesState,
                    clients = clientsState,
                    settings = settings,
                    cardBg = cardBg,
                    textPrimary = textPrimary,
                    textSecondary = textSecondary
                )
            }
        }
    }

    if (showSettingsDialog) {
        SettingsDialog(
            settings = settings,
            textPrimary = textPrimary,
            onDismiss = { showSettingsDialog = false },
            onSave = { updatedSettings ->
                scope.launch {
                    repository.updateSettings(updatedSettings)
                    if (updatedSettings.automationEnabled) {
                        SmsWorkerSchedule.ensurePeriodicWork(context)
                        SmsWorkerSchedule.runNow(context)
                    }
                    showSettingsDialog = false
                }
            }
        )
    }

    if (showSimSwitchDialog) {
        SimSwitchDialog(
            currentSubId = settings.selectedSubscriptionId,
            textPrimary = textPrimary,
            onDismiss = { showSimSwitchDialog = false },
            onSelectSim = { subId, simName ->
                scope.launch {
                    repository.updateSettingsOnly(
                        settings.copy(selectedSubscriptionId = subId)
                    )
                    showSimSwitchDialog = false
                    snackbarHostState.showSnackbar("SMS sending switched to $simName")
                }
            }
        )
    }

    if (showManualStartDialog) {
        ManualEngineStartDialog(
            settings = settings,
            textPrimary = textPrimary,
            onDismiss = { showManualStartDialog = false },
            onStartConfirmed = { startDate ->
                scope.launch {
                    showManualStartDialog = false
                    repository.restartEngineWithStartDate(settings, startDate)
                    repository.updateSettingsOnly(
                        settings.copy(
                            automationEnabled = true,
                            newDataAdded = false,
                            automationStartDate = startDate.toString()
                        )
                    )
                    SmsWorkerSchedule.ensurePeriodicWork(context)
                    SmsWorkerSchedule.runNow(context)
                    repository.processDueSchedules(application.smsSender)
                    snackbarHostState.showSnackbar("Engine restarted with batch starting $startDate")
                }
            }
        )
    }

    if (showTurnOffEngineDialog) {
        TurnOffEngineDialog(
            textPrimary = textPrimary,
            onDismiss = { showTurnOffEngineDialog = false },
            onConfirmTurnOff = {
                scope.launch {
                    repository.updateSettingsOnly(settings.copy(automationEnabled = false))
                    showTurnOffEngineDialog = false
                    snackbarHostState.showSnackbar("Automation engine turned off")
                }
            }
        )
    }

    if (showSentHistoryDialog) {
        SmsHistoryDialog(
            title = "Sent SMS (This Week)",
            items = sentHistoryItems,
            textPrimary = textPrimary,
            onDismiss = { showSentHistoryDialog = false }
        )
    }

    if (showFailedHistoryDialog) {
        SmsHistoryDialog(
            title = "Failed SMS (This Week)",
            items = failedHistoryItems,
            textPrimary = textPrimary,
            onDismiss = { showFailedHistoryDialog = false }
        )
    }
}

private data class NavItem(val label: String, val icon: ImageVector)

@Composable
private fun HomeScreen(
    settings: AppSettings,
    stats: HomeStatsData,
    clientCount: Int,
    clients: List<Client> = emptyList(),
    cardBg: Color,
    engineCardBg: Color,
    engineSubcardBg: Color,
    engineIconBg: Color,
    textPrimary: Color,
    textSecondary: Color,
    onOpenSettings: () -> Unit,
    onOpenSimSwitch: () -> Unit,
    onToggleEngine: (Boolean) -> Unit,
    onClearUpdateMessage: () -> Unit,
    onShowSentHistory: () -> Unit,
    onShowFailedHistory: () -> Unit
) {
    val dateStr = remember {
        val sdf = SimpleDateFormat("EEEE, MMM d", Locale.getDefault())
        sdf.format(Date())
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        // Top Header: Gami Dashboard (SIM Switch Button & Settings Gear Icon)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Gami",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = textPrimary
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = dateStr,
                    fontSize = 14.sp,
                    color = textSecondary
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // SIM Card Switch Button
                Box(
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF2A3142))
                        .clickable { onOpenSimSwitch() },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.SimCard,
                        contentDescription = "Switch SIM",
                        tint = Color(0xFF81C784)
                    )
                }

                // Settings Gear Button
                Box(
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF2A3142))
                        .clickable { onOpenSettings() },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Settings",
                        tint = Color(0xFF8A99AD)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // 1. Automation Engine Card (Red)
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = engineCardBg)
        ) {
            Column(modifier = Modifier.padding(18.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .clip(CircleShape)
                                .background(engineIconBg),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Build,
                                contentDescription = null,
                                tint = Color(0xFFE57373)
                            )
                        }

                        Spacer(modifier = Modifier.width(14.dp))

                        Column {
                            Text(
                                text = "Automation Engine",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = textPrimary
                            )
                            Text(
                                text = if (settings.automationEnabled) "Engine Running" else "Engine Stopped",
                                fontSize = 14.sp,
                                color = Color(0xFFE0E0E0)
                            )
                        }
                    }

                    Switch(
                        checked = settings.automationEnabled,
                        onCheckedChange = onToggleEngine,
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            checkedTrackColor = Color(0xFFE53935),
                            uncheckedThumbColor = Color(0xFFB0BEC5),
                            uncheckedTrackColor = Color(0xFF424242)
                        )
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Sub-card inside engine (Working Hours, Time Gap, SMS Per Week, Skip Sundays)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(engineSubcardBg)
                        .padding(14.dp)
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        // 1. Working Hours
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = null,
                                    tint = Color(0xFFE0E0E0),
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Working Hours", fontSize = 14.sp, color = Color(0xFFD0D0D0))
                            }
                            Text("${settings.workStartTime} - ${settings.workEndTime}", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = textPrimary)
                        }

                        // 2. Time Gap
                        val maxPossibleGap = remember(settings, clients) {
                            SchedulePlanner.calculateMaxPossibleGap(settings, clients)
                        }
                        val effectiveGap = minOf(settings.timeGapMinutes.coerceAtLeast(1), maxPossibleGap)
                        val timeGapDisplayText = if (effectiveGap < settings.timeGapMinutes) {
                            "${effectiveGap} min / Target ${settings.timeGapMinutes} min"
                        } else {
                            "${settings.timeGapMinutes} min"
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.Refresh,
                                    contentDescription = null,
                                    tint = Color(0xFFE0E0E0),
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Time Gap", fontSize = 14.sp, color = Color(0xFFD0D0D0))
                            }
                            Text(
                                text = timeGapDisplayText,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (effectiveGap < settings.timeGapMinutes) Color(0xFFFFD54F) else textPrimary
                            )
                        }

                        // 3. SMS Per Week
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = null,
                                    tint = Color(0xFFE0E0E0),
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("SMS Per Week", fontSize = 14.sp, color = Color(0xFFD0D0D0))
                            }
                            Text("${settings.smsPerWeek} per week", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = textPrimary)
                        }

                        // 4. Skip Sundays
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = null,
                                    tint = Color(0xFFE0E0E0),
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Skip Sundays", fontSize = 14.sp, color = Color(0xFFD0D0D0))
                            }
                            Text(if (settings.skipSunday) "Yes" else "No", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = textPrimary)
                        }
                    }
                }
            }
        }

        // 2. Plan Update Notification Card (if present)
        if (settings.lastPlanUpdateMessage.isNotBlank()) {
            Spacer(modifier = Modifier.height(16.dp))
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF323B4E))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        modifier = Modifier.weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = null,
                            tint = Color(0xFFFFD54F),
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Plan Updated",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = textPrimary
                            )
                            Text(
                                text = settings.lastPlanUpdateMessage,
                                fontSize = 12.sp,
                                color = Color(0xFFD0D0D0)
                            )
                        }
                    }
                    TextButton(onClick = onClearUpdateMessage) {
                        Text("Clear", color = Color(0xFF8AB4F8), fontWeight = FontWeight.Bold)
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // 3. The 4 Summary Statistic Cards (Clients, Pending, Sent, Failed) at the bottom
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            StatCard(
                title = "Total Clients",
                count = clientCount.toString(),
                color = Color(0xFF8AB4F8),
                modifier = Modifier.weight(1f)
            )
            StatCard(
                title = "Pending SMS",
                count = stats.pending.toString(),
                color = Color(0xFFFFD54F),
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            StatCard(
                title = "Sent SMS (Week)",
                count = stats.sent.toString(),
                color = Color(0xFF81C784),
                modifier = Modifier.weight(1f),
                onClick = onShowSentHistory
            )
            StatCard(
                title = "Failed SMS (Week)",
                count = stats.failed.toString(),
                color = Color(0xFFE57373),
                modifier = Modifier.weight(1f),
                onClick = onShowFailedHistory
            )
        }
    }
}

@Composable
private fun StatCard(
    title: String,
    count: String,
    color: Color,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null
) {
    Card(
        modifier = modifier.then(
            if (onClick != null) Modifier.clickable { onClick() } else Modifier
        ),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF242A38))
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = title,
                fontSize = 13.sp,
                color = Color(0xFF9E9E9E),
                fontWeight = FontWeight.Medium
            )
            Text(
                text = count,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = color
            )
        }
    }
}

@Composable
private fun TurnOffEngineDialog(
    textPrimary: Color,
    onDismiss: () -> Unit,
    onConfirmTurnOff: () -> Unit
) {
    val dialogBg = Color(0xFF1E2330)
    val accentRed = Color(0xFFE53935)
    val textSecondary = Color(0xFFBDC1C6)

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
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Warning,
                        contentDescription = null,
                        tint = accentRed,
                        modifier = Modifier.size(28.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "Turn Off Engine?",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = textPrimary
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Are you sure you want to turn off automation? After restarting the engine, it will restart the schedule of sending SMS starting from client 1.",
                    fontSize = 14.sp,
                    color = textSecondary,
                    lineHeight = 20.sp
                )

                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = onDismiss) {
                        Text("Cancel", color = Color(0xFF9E9E9E))
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = onConfirmTurnOff,
                        colors = ButtonDefaults.buttonColors(containerColor = accentRed),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text("Turn Off Engine", fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
