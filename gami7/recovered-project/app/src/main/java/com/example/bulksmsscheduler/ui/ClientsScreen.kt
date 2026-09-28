package com.example.bulksmsscheduler.ui

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.provider.ContactsContract
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bulksmsscheduler.model.AppSettings
import com.example.bulksmsscheduler.model.Client
import com.example.bulksmsscheduler.model.ClientPhones
import com.example.bulksmsscheduler.model.ClientSource
import com.example.bulksmsscheduler.model.ScheduleWithClient
import com.example.bulksmsscheduler.repository.SmsRepository
import kotlinx.coroutines.launch
import java.util.UUID

@Composable
fun ClientsScreen(
    repository: SmsRepository,
    clients: List<Client>,
    settings: AppSettings? = null,
    cardBg: Color,
    textPrimary: Color,
    textSecondary: Color,
    onMessage: (String) -> Unit = {}
) {
    val scope = rememberCoroutineScope()
    var searchQuery by remember { mutableStateOf("") }
    var showAddDialog by remember { mutableStateOf(false) }
    var showImportScreen by remember { mutableStateOf(false) }
    var editingClient by remember { mutableStateOf<Client?>(null) }
    var deletingClient by remember { mutableStateOf<Client?>(null) }
    var showDeleteAllDialog by remember { mutableStateOf(false) }
    var viewingClientData by remember { mutableStateOf<Pair<Client, List<ScheduleWithClient>>?>(null) }

    val searchBg = Color(0xFF232731)
    val clientCardBg = Color(0xFF282C35)
    val avatarBg = Color(0xFF9CB7F5)
    val optionButtonBg = Color(0xFF353B47)

    val filteredClients = remember(clients, searchQuery) {
        if (searchQuery.isBlank()) clients
        else clients.filter {
            it.name.contains(searchQuery, ignoreCase = true) ||
                    it.phone.contains(searchQuery)
        }
    }

    if (showImportScreen) {
        ImportContactsScreen(
            cardBg = clientCardBg,
            textPrimary = textPrimary,
            textSecondary = textSecondary,
            onBack = { showImportScreen = false },
            onImport = { selectedContacts ->
                scope.launch {
                    val count = repository.getClientCount()
                    val newClients = selectedContacts.mapIndexed { index, contact ->
                        Client(
                            id = UUID.randomUUID().toString(),
                            name = contact.name,
                            phone = contact.phone,
                            active = true,
                            orderIndex = count + index + 1,
                            source = ClientSource.CONTACT,
                            smsPerWeek = -1
                        )
                    }
                    val imported = repository.saveClients(newClients)
                    val skipped = selectedContacts.size - imported
                    showImportScreen = false
                    onMessage(
                        if (skipped > 0) "Imported $imported contacts, skipped $skipped duplicate(s)"
                        else "Imported $imported contacts"
                    )
                }
            }
        )
        return
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Top Bar: Client Count Badge + 3 Action Buttons (Import, Add, Delete All)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Client Count Badge (Just client icon + count, no text)
                Box(
                    modifier = Modifier
                        .height(36.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(optionButtonBg)
                        .padding(horizontal = 10.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Client Count",
                            tint = Color(0xFF9CB7F5),
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = "${clients.size}",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = textPrimary
                        )
                    }
                }

                // Import Contacts Button
                Button(
                    onClick = { showImportScreen = true },
                    modifier = Modifier
                        .weight(1f)
                        .height(36.dp),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(horizontal = 4.dp, vertical = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = optionButtonBg,
                        contentColor = Color(0xFF9CB7F5)
                    )
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Import",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                    }
                }

                // Add Manually Button
                Button(
                    onClick = { showAddDialog = true },
                    modifier = Modifier
                        .weight(1f)
                        .height(36.dp),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(horizontal = 4.dp, vertical = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = optionButtonBg,
                        contentColor = Color(0xFF9CB7F5)
                    )
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = null,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Add",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                    }
                }

                // Delete All Button
                Button(
                    onClick = { if (clients.isNotEmpty()) showDeleteAllDialog = true },
                    enabled = clients.isNotEmpty(),
                    modifier = Modifier
                        .weight(1f)
                        .height(36.dp),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(horizontal = 4.dp, vertical = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = optionButtonBg,
                        contentColor = Color(0xFFE54B4B),
                        disabledContainerColor = optionButtonBg.copy(alpha = 0.5f),
                        disabledContentColor = Color(0xFFE54B4B).copy(alpha = 0.5f)
                    )
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = null,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Clear",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Search Bar: "Search by name or phone..."
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("Search by name or phone...", color = Color(0xFF8E95A5)) },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = Color(0xFF8E95A5)) },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    focusedContainerColor = searchBg,
                    unfocusedContainerColor = searchBg,
                    focusedTextColor = textPrimary,
                    unfocusedTextColor = textPrimary
                )
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Client Cards List (Maximized space)
            if (filteredClients.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = if (clients.isEmpty()) "No clients found.\nClick 'Add' or 'Import' above to add clients." else "No clients match your search.",
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
                    items(filteredClients, key = { it.id }) { client ->
                        ClientItemCard(
                            client = client,
                            settings = settings,
                            cardBg = clientCardBg,
                            avatarBg = avatarBg,
                            textPrimary = textPrimary,
                            textSecondary = textSecondary,
                            onEdit = { editingClient = client },
                            onDelete = { deletingClient = client },
                            onClick = {
                                scope.launch {
                                    val schedules = repository.getSchedulesForClient(client.id)
                                    viewingClientData = client to schedules
                                }
                            }
                        )
                    }
                }
            }
        }
    }

    // Client SMS Schedule Dialog Box
    viewingClientData?.let { (client, schedules) ->
        ClientSmsDialog(
            client = client,
            items = schedules,
            textPrimary = textPrimary,
            onDismiss = { viewingClientData = null }
        )
    }

    // Add / Edit Client Dialog
    if (showAddDialog || editingClient != null) {
        val clientToEdit = editingClient
        AddOrEditClientDialog(
            client = clientToEdit,
            clients = clients,
            textPrimary = textPrimary,
            onDismiss = {
                showAddDialog = false
                editingClient = null
            },
            onSave = { name, phone, useName, source, smsPerWeek ->
                scope.launch {
                    val saved = if (clientToEdit != null) {
                        repository.updateClient(
                            clientToEdit.copy(
                                name = name,
                                phone = phone,
                                useNameInTemplate = useName,
                                source = source,
                                smsPerWeek = smsPerWeek
                            )
                        )
                    } else {
                        val count = repository.getClientCount()
                        repository.saveClient(
                            Client(
                                id = UUID.randomUUID().toString(),
                                name = name,
                                phone = phone,
                                active = true,
                                orderIndex = count + 1,
                                useNameInTemplate = useName,
                                source = source.ifBlank { ClientSource.MANUAL },
                                smsPerWeek = smsPerWeek
                            )
                        )
                    }
                    if (saved) {
                        showAddDialog = false
                        editingClient = null
                    } else {
                        onMessage("That mobile number is already saved for another client.")
                    }
                }
            }
        )
    }

    // Delete Single Client Dialog
    deletingClient?.let { client ->
        AlertDialog(
            onDismissRequest = { deletingClient = null },
            containerColor = Color(0xFF282C35),
            title = { Text("Delete Client", color = textPrimary, fontWeight = FontWeight.Bold) },
            text = { Text("Are you sure you want to delete '${client.name}'?", color = Color.White) },
            confirmButton = {
                Button(
                    onClick = {
                        scope.launch {
                            repository.deleteClient(client)
                            deletingClient = null
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE54B4B))
                ) {
                    Text("Delete")
                }
            },
            dismissButton = {
                TextButton(onClick = { deletingClient = null }) {
                    Text("Cancel", color = Color.White)
                }
            }
        )
    }

    // Delete All Clients Warning Dialog
    if (showDeleteAllDialog) {
        AlertDialog(
            onDismissRequest = { showDeleteAllDialog = false },
            containerColor = Color(0xFF282C35),
            title = { Text("Delete All Clients", color = textPrimary, fontWeight = FontWeight.Bold) },
            text = { Text("Are you sure you want to delete all ${clients.size} clients? This action cannot be undone.", color = Color.White) },
            confirmButton = {
                Button(
                    onClick = {
                        scope.launch {
                            repository.deleteAllClients()
                            showDeleteAllDialog = false
                            onMessage("All clients deleted")
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE54B4B))
                ) {
                    Text("Delete All")
                }
            },
            dismissButton = {
                TextButton(onClick = { showDeleteAllDialog = false }) {
                    Text("Cancel", color = Color.White)
                }
            }
        )
    }
}

/** Single Client Card showing name, phone, and clean green badge for SMS frequency in top right corner. Clicking opens dialog showing SMS schedule. */
@Composable
private fun ClientItemCard(
    client: Client,
    settings: AppSettings?,
    cardBg: Color,
    avatarBg: Color,
    textPrimary: Color,
    textSecondary: Color,
    onEdit: () -> Unit,
    onDelete: () -> Unit,
    onClick: () -> Unit
) {
    val initial = remember(client.name) {
        client.name.trim().take(1).uppercase()
    }

    val defaultFreq = settings?.smsPerWeek ?: 1
    val freqDisplay = if (client.smsPerWeek >= 0) client.smsPerWeek.toString() else defaultFreq.toString()

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = cardBg)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .size(42.dp)
                        .clip(CircleShape)
                        .background(avatarBg),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = initial,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        text = client.name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = textPrimary
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = client.phone,
                        fontSize = 12.sp,
                        color = textSecondary
                    )
                }
            }

            // Top Right Corner: SMS Per Week badge (Green) + Edit / Delete buttons
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFF283C32))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = "$freqDisplay / wk",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF81C784)
                    )
                }

                IconButton(onClick = onEdit, modifier = Modifier.size(36.dp)) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Edit",
                        tint = Color(0xFF9CB7F5),
                        modifier = Modifier.size(18.dp)
                    )
                }

                IconButton(onClick = onDelete, modifier = Modifier.size(36.dp)) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Delete",
                        tint = Color(0xFFE54B4B),
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }
    }
}

private data class ContactItem(val name: String, val phone: String)

@Composable
private fun ImportContactsScreen(
    cardBg: Color,
    textPrimary: Color,
    textSecondary: Color,
    onBack: () -> Unit,
    onImport: (List<ContactItem>) -> Unit
) {
    val context = LocalContext.current
    var searchContactQuery by remember { mutableStateOf("") }

    var hasPermission by remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.READ_CONTACTS
            ) == PackageManager.PERMISSION_GRANTED
        )
    }

    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        hasPermission = isGranted
    }

    var loadedContacts by remember { mutableStateOf<List<ContactItem>>(emptyList()) }
    var isLoading by remember { mutableStateOf(false) }

    LaunchedEffect(hasPermission) {
        if (hasPermission) {
            isLoading = true
            loadedContacts = loadDeviceContacts(context)
            isLoading = false
        } else {
            permissionLauncher.launch(Manifest.permission.READ_CONTACTS)
        }
    }

    val selectedContacts = remember { mutableStateListOf<ContactItem>() }

    val filteredContacts = remember(searchContactQuery, loadedContacts) {
        if (searchContactQuery.isBlank()) loadedContacts
        else loadedContacts.filter {
            it.name.contains(searchContactQuery, ignoreCase = true) ||
                    it.phone.contains(searchContactQuery)
        }
    }

    val isAllSelected = selectedContacts.size == loadedContacts.size && loadedContacts.isNotEmpty()

    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBack) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = textPrimary)
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text("Import Contacts", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = textPrimary)
        }

        Spacer(modifier = Modifier.height(14.dp))

        if (!hasPermission) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = cardBg)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Permission Required",
                        color = textPrimary,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        "Contacts permission is required to import contacts from your phone.",
                        color = textSecondary,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = { permissionLauncher.launch(Manifest.permission.READ_CONTACTS) },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9CB7F5))
                    ) {
                        Text("Grant Permission", fontWeight = FontWeight.Bold)
                    }
                }
            }
        } else if (isLoading) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(color = Color(0xFF9CB7F5))
            }
        } else if (loadedContacts.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "No contacts found on this device.",
                    color = textSecondary,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        } else {
            OutlinedTextField(
                value = searchContactQuery,
                onValueChange = { searchContactQuery = it },
                placeholder = { Text("Search contacts...", color = textSecondary) },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = textSecondary) },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    focusedContainerColor = cardBg,
                    unfocusedContainerColor = cardBg,
                    focusedTextColor = textPrimary,
                    unfocusedTextColor = textPrimary
                )
            )

            Spacer(modifier = Modifier.height(14.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isAllSelected,
                        onCheckedChange = { checked ->
                            selectedContacts.clear()
                            if (checked) selectedContacts.addAll(loadedContacts)
                        },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFF9CB7F5),
                            uncheckedColor = Color(0xFF888888)
                        )
                    )
                    Text("Select All", color = textPrimary, fontWeight = FontWeight.Bold, fontSize = 15.sp)
                }

                Text(
                    text = "${selectedContacts.size} selected",
                    color = Color(0xFF9CB7F5),
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.weight(1f)
            ) {
                items(filteredContacts) { contact ->
                    val isSelected = selectedContacts.contains(contact)
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(14.dp)),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = cardBg)
                    ) {
                        Row(
                            modifier = Modifier.padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Checkbox(
                                    checked = isSelected,
                                    onCheckedChange = { checked ->
                                        if (checked) selectedContacts.add(contact)
                                        else selectedContacts.remove(contact)
                                    },
                                    colors = CheckboxDefaults.colors(
                                        checkedColor = Color(0xFF9CB7F5),
                                        uncheckedColor = Color(0xFF888888)
                                    )
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Column {
                                    Text(contact.name, color = textPrimary, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                                    Text(contact.phone, color = textSecondary, fontSize = 13.sp)
                                }
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            Button(
                onClick = { onImport(selectedContacts) },
                enabled = selectedContacts.isNotEmpty(),
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9CB7F5), contentColor = Color.White)
            ) {
                Text("Import ${selectedContacts.size} Contacts", fontWeight = FontWeight.Bold)
            }
        }
    }
}

private fun loadDeviceContacts(context: Context): List<ContactItem> {
    val contacts = mutableListOf<ContactItem>()
    val seenPhones = mutableSetOf<String>()
    val contentResolver = context.contentResolver
    val phoneSanitizer = Regex("[^0-9+]")

    try {
        val cursor = contentResolver.query(
            ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
            arrayOf(
                ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
                ContactsContract.CommonDataKinds.Phone.NUMBER
            ),
            null,
            null,
            "${ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME} ASC"
        )

        cursor?.use {
            val nameIndex = it.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)
            val numberIndex = it.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)

            while (it.moveToNext()) {
                val rawName = if (nameIndex >= 0) it.getString(nameIndex) else null
                val name = rawName?.takeIf { n -> n.isNotBlank() } ?: "Unknown"
                val rawNumber = if (numberIndex >= 0) it.getString(numberIndex) else null
                val cleanPhone = if (rawNumber != null) phoneSanitizer.replace(rawNumber, "") else ""

                if (cleanPhone.isNotBlank() && seenPhones.add(cleanPhone)) {
                    contacts.add(ContactItem(name = name, phone = cleanPhone))
                }
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }

    return contacts
}

@Composable
private fun AddOrEditClientDialog(
    client: Client?,
    clients: List<Client>,
    textPrimary: Color,
    onDismiss: () -> Unit,
    onSave: (name: String, phone: String, useName: Boolean, source: String, smsPerWeek: Int) -> Unit
) {
    var name by remember { mutableStateOf(client?.name ?: "") }
    var phone by remember { mutableStateOf(client?.phone ?: "") }
    var useName by remember { mutableStateOf(client?.useNameInTemplate ?: true) }
    var source by remember { mutableStateOf(client?.source ?: ClientSource.MANUAL) }
    var smsPerWeekInput by remember { mutableStateOf(if (client != null && client.smsPerWeek >= 0) client.smsPerWeek.toString() else "") }

    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = Color(0xFF282C35),
        title = {
            Text(
                if (client != null) "Edit Client" else "Add Client",
                color = textPrimary,
                fontWeight = FontWeight.Bold
            )
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Client Name") },
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = textPrimary,
                        unfocusedTextColor = textPrimary
                    )
                )

                OutlinedTextField(
                    value = phone,
                    onValueChange = { phone = it },
                    label = { Text("Mobile Number") },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = textPrimary,
                        unfocusedTextColor = textPrimary
                    )
                )

                OutlinedTextField(
                    value = smsPerWeekInput,
                    onValueChange = { smsPerWeekInput = it },
                    label = { Text("SMS Per Week (leave blank for default)") },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = textPrimary,
                        unfocusedTextColor = textPrimary
                    )
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Use Name in Template", color = textPrimary, fontSize = 14.sp)
                    Switch(
                        checked = useName,
                        onCheckedChange = { useName = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            checkedTrackColor = Color(0xFF9CB7F5)
                        )
                    )
                }
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    val trimmedName = name.trim()
                    val trimmedPhone = phone.trim()
                    if (trimmedName.isNotBlank() && trimmedPhone.isNotBlank()) {
                        val normalizedInput = ClientPhones.normalize(trimmedPhone)
                        val duplicate = clients.firstOrNull {
                            it.id != client?.id && ClientPhones.normalize(it.phone) == normalizedInput
                        }
                        if (duplicate != null) {
                            return@Button
                        }
                        val perWeek = smsPerWeekInput.toIntOrNull() ?: -1
                        onSave(trimmedName, trimmedPhone, useName, source, perWeek)
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9CB7F5))
            ) {
                Text("Save")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }
    )
}
