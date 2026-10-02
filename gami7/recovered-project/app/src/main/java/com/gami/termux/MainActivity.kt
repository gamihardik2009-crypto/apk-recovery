package com.gami.termux

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.PowerManager
import android.provider.Settings
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.ui.text.style.TextOverflow
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import com.gami.termux.worker.ForwardWorker
import com.gami.termux.util.LogEntry
import androidx.compose.runtime.collectAsState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import com.gami.termux.data.Prefs
import com.gami.termux.util.LogRepo
import com.gami.termux.ui.theme.TermuxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TermuxTheme {
                MainAppFlow()
            }
        }
    }
}

@Composable
fun MainAppFlow() {
    val context = LocalContext.current
    val prefs = remember { Prefs.getInstance(context) }
    
    var currentScreen by remember { mutableStateOf(if (prefs.destinationNumber.isBlank()) "settings" else "dashboard") }
    var destinationNumber by remember { mutableStateOf(prefs.destinationNumber) }
    var isCallForwardingEnabled by remember { mutableStateOf(prefs.isCallForwardingEnabled) }
    var isSmsForwardingEnabled by remember { mutableStateOf(prefs.isSmsForwardingEnabled) }

    val requiredPermissions = arrayOf(
        Manifest.permission.RECEIVE_SMS,
        Manifest.permission.SEND_SMS,
        Manifest.permission.READ_PHONE_STATE,
        Manifest.permission.READ_CALL_LOG,
        Manifest.permission.READ_CONTACTS
    )

    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        val allGranted = permissions.entries.all { it.value }
        if (allGranted) {
            Toast.makeText(context, "All permissions granted!", Toast.LENGTH_SHORT).show()
            LogRepo.addLog("EVENT", "Permissions granted")
        } else {
            Toast.makeText(context, "Permissions are required for forwarding to work.", Toast.LENGTH_LONG).show()
            LogRepo.addLog("ERROR", "Some permissions denied")
        }
    }

    LaunchedEffect(Unit) {
        val needsPermissions = requiredPermissions.any {
            ContextCompat.checkSelfPermission(context, it) != PackageManager.PERMISSION_GRANTED
        }
        if (needsPermissions) {
            launcher.launch(requiredPermissions)
        }
    }

    Crossfade(targetState = currentScreen, label = "ScreenTransition") { screen ->
        when (screen) {
            "settings" -> SettingsScreen(
                number = destinationNumber,
                onNumberChange = { destinationNumber = it },
                callEnabled = isCallForwardingEnabled,
                onCallToggle = { isCallForwardingEnabled = it },
                smsEnabled = isSmsForwardingEnabled,
                onSmsToggle = { isSmsForwardingEnabled = it },
                onSave = {
                    val cleanedNumber = destinationNumber.filter { it.isDigit() || it == '+' }
                    destinationNumber = cleanedNumber
                    prefs.destinationNumber = cleanedNumber
                    prefs.isCallForwardingEnabled = isCallForwardingEnabled
                    prefs.isSmsForwardingEnabled = isSmsForwardingEnabled
                    currentScreen = "dashboard"
                }
            )
            "dashboard" -> DashboardScreen(
                number = destinationNumber,
                callEnabled = isCallForwardingEnabled,
                onCallToggle = { 
                    isCallForwardingEnabled = it
                    prefs.isCallForwardingEnabled = it
                },
                smsEnabled = isSmsForwardingEnabled,
                onSmsToggle = {
                    isSmsForwardingEnabled = it
                    prefs.isSmsForwardingEnabled = it
                },
                onBack = { currentScreen = "settings" }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    number: String,
    onNumberChange: (String) -> Unit,
    callEnabled: Boolean,
    onCallToggle: (Boolean) -> Unit,
    smsEnabled: Boolean,
    onSmsToggle: (Boolean) -> Unit,
    onSave: () -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text("Forwarding Configuration") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Set your secondary phone number and enable features below.",
                style = MaterialTheme.typography.bodyMedium
            )

            OutlinedTextField(
                value = number,
                onValueChange = onNumberChange,
                label = { Text("Secondary Number (Destination)") },
                placeholder = { Text("e.g. +1234567890") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                modifier = Modifier.fillMaxWidth(),
                singleLine = true
            )

            Text(
                text = "Note: If the destination number is in the same country as this SIM card, a simple number works perfectly. For international forwarding, please include the country code (e.g., +1 for US) so carriers route it correctly.",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Missed Call Forwarding", style = MaterialTheme.typography.titleMedium)
                    Text("Forward missed call alerts", style = MaterialTheme.typography.bodySmall)
                }
                Switch(checked = callEnabled, onCheckedChange = onCallToggle)
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("SMS Forwarding", style = MaterialTheme.typography.titleMedium)
                    Text("Forward all incoming SMS", style = MaterialTheme.typography.bodySmall)
                }
                Switch(checked = smsEnabled, onCheckedChange = onSmsToggle)
            }

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = onSave,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Save & Activate")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(
    number: String,
    callEnabled: Boolean,
    onCallToggle: (Boolean) -> Unit,
    smsEnabled: Boolean,
    onSmsToggle: (Boolean) -> Unit,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    val isPreview = LocalInspectionMode.current
    val powerManager = remember { context.getSystemService(Context.POWER_SERVICE) as PowerManager }
    
    var isBatteryOptimized by remember { 
        mutableStateOf(if (isPreview) true else !powerManager.isIgnoringBatteryOptimizations(context.packageName)) 
    }

    val dateFormat = remember { SimpleDateFormat("HH:mm:ss", Locale.getDefault()) }

    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_RESUME && !isPreview) {
                isBatteryOptimized = !powerManager.isIgnoringBatteryOptimizations(context.packageName)
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text("Active Monitor") },
                actions = {
                    IconButton(onClick = { LogRepo.clearLogs() }) {
                        Icon(Icons.Default.Delete, contentDescription = "Clear Logs")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onSecondaryContainer
                )
            )
        }
    ) { innerPadding ->
        val hasSmsPerm = ContextCompat.checkSelfPermission(context, Manifest.permission.RECEIVE_SMS) == PackageManager.PERMISSION_GRANTED
        val hasPhonePerm = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED
        val hasCallLogPerm = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_CALL_LOG) == PackageManager.PERMISSION_GRANTED
        val allPermissionsGranted = hasSmsPerm && hasPhonePerm && hasCallLogPerm

        val permLauncher = rememberLauncherForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { _ -> }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            if (!allPermissionsGranted) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF5C2426)),
                    border = BorderStroke(1.dp, Color(0xFF7A2E30))
                ) {
                    Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text("⚠️ Permissions Required", fontWeight = FontWeight.Bold, color = Color.White)
                        Text("SMS and Call Forwarding require SMS, Phone State, and Call Log permissions to work.", style = MaterialTheme.typography.bodySmall, color = Color(0xFFE0E0E0))
                        Button(
                            onClick = {
                                permLauncher.launch(
                                    arrayOf(
                                        Manifest.permission.RECEIVE_SMS,
                                        Manifest.permission.SEND_SMS,
                                        Manifest.permission.READ_PHONE_STATE,
                                        Manifest.permission.READ_CALL_LOG,
                                        Manifest.permission.READ_CONTACTS
                                    )
                                )
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC62828))
                        ) {
                            Text("Grant Permissions Now", color = Color.White)
                        }
                    }
                }
            }

            // Controls Card
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Column(Modifier.weight(1f)) {
                            Text("Service Master Control", style = MaterialTheme.typography.titleMedium)
                            Text("Target: $number", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.primary)
                        }
                        Switch(
                            checked = callEnabled || smsEnabled,
                            onCheckedChange = { active ->
                                onCallToggle(active)
                                onSmsToggle(active)
                            }
                        )
                    }
                    HorizontalDivider(modifier = Modifier.padding(vertical = 4.dp))
                    
                    // Integrated Battery Management Box
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = if (isBatteryOptimized) Color(0xFF3D1618) else Color(0xFF1B3B22)
                        ),
                        border = BorderStroke(1.dp, if (isBatteryOptimized) Color(0xFF5C2426) else Color(0xFF2E7D32))
                    ) {
                        Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Column(Modifier.weight(1f)) {
                                    Text(
                                        text = if (isBatteryOptimized) "Battery Optimization: Restricted" else "Battery Optimization: Unrestricted",
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = if (isBatteryOptimized) Color(0xFFEF9A9A) else Color(0xFFA5D6A7)
                                    )
                                }
                                Button(
                                    onClick = {
                                        if (isBatteryOptimized) {
                                            try {
                                                val intent = Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS).apply {
                                                    data = Uri.parse("package:${context.packageName}")
                                                }
                                                context.startActivity(intent)
                                            } catch (e: Exception) {
                                                val intent = Intent(Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS)
                                                context.startActivity(intent)
                                            }
                                        } else {
                                            val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                                                data = Uri.parse("package:${context.packageName}")
                                            }
                                            context.startActivity(intent)
                                        }
                                    },
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = if (isBatteryOptimized) Color(0xFFC62828) else Color(0xFF2E7D32)
                                    ),
                                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
                                    modifier = Modifier.height(32.dp)
                                ) {
                                    Text(
                                        text = if (isBatteryOptimized) "TURN OFF" else "SETTINGS",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = Color.White
                                    )
                                }
                            }
                            Text(
                                text = "It is highly recommended to turn off battery optimization and turn on background activity to ensure stable operation and reliable background processing.",
                                style = MaterialTheme.typography.bodySmall,
                                color = if (isBatteryOptimized) Color(0xFFD7CCC8) else Color(0xFFC8E6C9)
                            )
                        }
                    }

                    HorizontalDivider(modifier = Modifier.padding(vertical = 4.dp))

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("Forward Missed Calls", Modifier.weight(1f), style = MaterialTheme.typography.bodyMedium)
                        Switch(checked = callEnabled, onCheckedChange = onCallToggle)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("Forward Incoming SMS", Modifier.weight(1f), style = MaterialTheme.typography.bodyMedium)
                        Switch(checked = smsEnabled, onCheckedChange = onSmsToggle)
                    }
                }
            }

            // Action Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedButton(
                    onClick = {
                        val data = Data.Builder()
                            .putString("message", "TEST SMS from Termux Forwarder: System check successful.")
                            .build()
                        val workRequest = OneTimeWorkRequestBuilder<ForwardWorker>()
                            .setInputData(data)
                            .build()
                        WorkManager.getInstance(context).enqueue(workRequest)
                        Toast.makeText(context, "Test SMS triggered", Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Send Test SMS")
                }
                OutlinedButton(
                    onClick = onBack,
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Settings")
                }
            }

            Text("System Activity Log:", style = MaterialTheme.typography.labelLarge)

            // Persistent Logs Card
            Card(
                modifier = Modifier.fillMaxWidth().weight(1f),
                colors = CardDefaults.cardColors(containerColor = Color.Black),
                border = BorderStroke(1.dp, Color.DarkGray)
            ) {
                val logs = LogRepo.logs
                if (logs.isEmpty()) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text("No events recorded", color = Color.Gray, style = MaterialTheme.typography.bodyMedium)
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier.padding(8.dp).fillMaxSize(),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        items(logs) { entry ->
                            LogItem(entry, dateFormat)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun LogItem(entry: LogEntry, dateFormat: SimpleDateFormat) {
    val color = when (entry.type) {
        "SUCCESS" -> Color.Green
        "ERROR" -> Color.Red
        "EVENT" -> Color.Cyan
        else -> Color.White
    }
    
    val icon = when (entry.type) {
        "SUCCESS" -> "✅"
        "ERROR" -> "❌"
        "EVENT" -> "ℹ️"
        else -> "•"
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = dateFormat.format(Date(entry.timestamp)),
            color = Color.Gray,
            fontFamily = FontFamily.Monospace,
            style = MaterialTheme.typography.labelSmall,
            modifier = Modifier.width(60.dp)
        )
        Text(
            text = icon,
            style = MaterialTheme.typography.labelSmall
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = entry.message,
            color = color,
            fontFamily = FontFamily.Monospace,
            style = MaterialTheme.typography.bodySmall,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FlowPreview() {
    TermuxTheme {
        MainAppFlow()
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardPreview() {
    TermuxTheme {
        DashboardScreen(
            number = "1234567890",
            callEnabled = true,
            onCallToggle = {},
            smsEnabled = true,
            onSmsToggle = {},
            onBack = {}
        )
    }
}