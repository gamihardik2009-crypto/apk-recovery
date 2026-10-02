package com.example.bulksmsscheduler.ui

import android.content.Context
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bulksmsscheduler.model.MessageTemplate
import com.example.bulksmsscheduler.repository.SmsRepository
import kotlinx.coroutines.launch
import java.util.UUID
import java.util.zip.ZipInputStream

enum class ImportMode { REPLACE, ADD }

@Composable
fun TemplatesScreen(
    repository: SmsRepository,
    templates: List<MessageTemplate>,
    cardBg: Color = Color(0xFF282C35),
    textPrimary: Color,
    textSecondary: Color,
    onMessage: (String) -> Unit = {}
) {
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    var searchQuery by remember { mutableStateOf("") }
    var showAddDialog by remember { mutableStateOf(false) }
    var editingTemplate by remember { mutableStateOf<MessageTemplate?>(null) }
    var deletingTemplate by remember { mutableStateOf<MessageTemplate?>(null) }

    var showImportModeDialog by remember { mutableStateOf(false) }
    var pendingIsExcel by remember { mutableStateOf(true) }
    var pendingImportMode by remember { mutableStateOf(ImportMode.REPLACE) }

    val handleFileUri: (Uri?) -> Unit = { uri ->
        if (uri != null) {
            scope.launch {
                val importedMsgs = parseTemplateFile(context, uri, isExcel = pendingIsExcel)
                if (importedMsgs.isNotEmpty()) {
                    val nextOrder = if (pendingImportMode == ImportMode.ADD) repository.getNextTemplateOrder() else 1
                    val newTemplates = importedMsgs.mapIndexed { idx, msgText ->
                        val templateNo = nextOrder + idx
                        MessageTemplate(
                            id = UUID.randomUUID().toString(),
                            title = "id: $templateNo",
                            greeting = "",
                            message = msgText,
                            enabled = true,
                            order = templateNo
                        )
                    }
                    val fileTypeLabel = if (pendingIsExcel) "Excel" else "CSV"
                    if (pendingImportMode == ImportMode.REPLACE) {
                        repository.replaceTemplates(newTemplates, "Templates replaced from $fileTypeLabel")
                        onMessage("Replaced with ${newTemplates.size} SMS template(s) from $fileTypeLabel & scheduled plan")
                    } else {
                        repository.saveTemplates(newTemplates)
                        onMessage("Added ${newTemplates.size} SMS template(s) from $fileTypeLabel & scheduled plan")
                    }
                } else {
                    val fileTypeLabel = if (pendingIsExcel) "Excel" else "CSV"
                    onMessage("No valid SMS template text found in $fileTypeLabel file")
                }
            }
        }
    }

    val csvPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent(),
        onResult = handleFileUri
    )

    val excelPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent(),
        onResult = handleFileUri
    )

    // Dark theme palette matching ClientsScreen & app aesthetics
    val searchBg = Color(0xFF232731)
    val templateCardBg = cardBg
    val fabBg = Color(0xFF9CB7F5)
    val blueAccent = Color(0xFF9CB7F5)
    val optionButtonBg = Color(0xFF353B47)

    val filteredTemplates = remember(templates, searchQuery) {
        if (searchQuery.isBlank()) templates
        else templates.filter {
            it.title.contains(searchQuery, ignoreCase = true) ||
                    it.message.contains(searchQuery, ignoreCase = true) ||
                    it.greeting.contains(searchQuery, ignoreCase = true)
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Top Bar: 4 Action Boxes (Count Badge, Excel, CSV, Add)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Box 1: Template Count Badge
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(36.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(optionButtonBg)
                        .padding(horizontal = 4.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(2.dp)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.List,
                            contentDescription = "Templates Count",
                            tint = blueAccent,
                            modifier = Modifier.size(14.dp)
                        )
                        Text(
                            text = "${templates.size}",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = textPrimary,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                // Box 2: Import Excel Button with + icon
                Button(
                    onClick = {
                        pendingIsExcel = true
                        showImportModeDialog = true
                    },
                    modifier = Modifier
                        .weight(1f)
                        .height(36.dp),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(horizontal = 2.dp, vertical = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = optionButtonBg,
                        contentColor = blueAccent
                    )
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = null,
                            modifier = Modifier.size(12.dp)
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = "Excel",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                    }
                }

                // Box 3: Import CSV Button with + icon
                Button(
                    onClick = {
                        pendingIsExcel = false
                        showImportModeDialog = true
                    },
                    modifier = Modifier
                        .weight(1f)
                        .height(36.dp),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(horizontal = 2.dp, vertical = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = optionButtonBg,
                        contentColor = blueAccent
                    )
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = null,
                            modifier = Modifier.size(12.dp)
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = "CSV",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                    }
                }

                // Box 4: Add Manually Button with + icon
                Button(
                    onClick = { showAddDialog = true },
                    modifier = Modifier
                        .weight(1f)
                        .height(36.dp),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(horizontal = 2.dp, vertical = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = optionButtonBg,
                        contentColor = blueAccent
                    )
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = null,
                            modifier = Modifier.size(12.dp)
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = "Add",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Search Bar
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("Search templates...", color = Color(0xFF8E95A5)) },
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

            Spacer(modifier = Modifier.height(16.dp))

            // Template Cards List
            if (filteredTemplates.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = if (templates.isEmpty()) "No templates added yet.\nClick '+' or Import Excel/CSV above." else "No templates match your search.",
                        color = textSecondary,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            } else {
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(14.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(filteredTemplates, key = { it.id }) { template ->
                        val templateIndex = if (template.order > 0) template.order else (templates.indexOf(template) + 1)
                        TemplateCard(
                            template = template,
                            templateIndex = templateIndex,
                            cardBg = templateCardBg,
                            textPrimary = textPrimary,
                            blueAccent = blueAccent,
                            onEdit = { editingTemplate = template },
                            onDelete = { deletingTemplate = template }
                        )
                    }
                }
            }
        }
    }

    // Import Mode Dialog (Replace All vs Add to Existing)
    if (showImportModeDialog) {
        AlertDialog(
            onDismissRequest = { showImportModeDialog = false },
            containerColor = Color(0xFF282C35),
            shape = RoundedCornerShape(22.dp),
            title = {
                Text(
                    text = if (pendingIsExcel) "Import Excel Templates" else "Import CSV Templates",
                    color = textPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Text(
                        text = "How would you like to import templates?",
                        color = Color(0xFFD0D4E0),
                        fontSize = 14.sp,
                        lineHeight = 20.sp
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Button(
                        onClick = {
                            pendingImportMode = ImportMode.REPLACE
                            showImportModeDialog = false
                            if (pendingIsExcel) excelPickerLauncher.launch("*/*")
                            else csvPickerLauncher.launch("*/*")
                        },
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF9CB7F5),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Replace All (Delete old & import new)", fontWeight = FontWeight.Bold)
                    }

                    Button(
                        onClick = {
                            pendingImportMode = ImportMode.ADD
                            showImportModeDialog = false
                            if (pendingIsExcel) excelPickerLauncher.launch("*/*")
                            else csvPickerLauncher.launch("*/*")
                        },
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF353B47),
                            contentColor = Color(0xFF9CB7F5)
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Add to Existing (Keep old & append)", fontWeight = FontWeight.Bold)
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { showImportModeDialog = false }) {
                    Text("Cancel", color = Color(0xFFB0B5C0))
                }
            }
        )
    }

    // Add / Edit Template Dialog
    if (showAddDialog || editingTemplate != null) {
        val templateToEdit = editingTemplate
        val templateIndex = if (templateToEdit != null) {
            if (templateToEdit.order > 0) templateToEdit.order else (templates.indexOf(templateToEdit) + 1)
        } else {
            templates.size + 1
        }
        AddOrEditTemplateDialog(
            template = templateToEdit,
            templateIndex = templateIndex,
            textPrimary = textPrimary,
            blueAccent = blueAccent,
            onDismiss = {
                showAddDialog = false
                editingTemplate = null
            },
            onSave = { messageText ->
                scope.launch {
                    if (templateToEdit != null) {
                        repository.updateTemplate(
                            templateToEdit.copy(
                                message = messageText
                            )
                        )
                    } else {
                        val nextOrder = repository.getNextTemplateOrder()
                        val newTemplate = MessageTemplate(
                            id = UUID.randomUUID().toString(),
                            title = "id: $nextOrder",
                            greeting = "",
                            message = messageText,
                            order = nextOrder,
                            enabled = true
                        )
                        repository.saveTemplate(newTemplate)
                    }
                    showAddDialog = false
                    editingTemplate = null
                }
            }
        )
    }

    // Delete Template Confirmation Dialog
    deletingTemplate?.let { template ->
        val templateIndex = if (template.order > 0) template.order else (templates.indexOf(template) + 1)
        DeleteTemplateConfirmationDialog(
            template = template,
            templateIndex = templateIndex,
            textPrimary = textPrimary,
            onDismiss = { deletingTemplate = null },
            onConfirmDelete = {
                scope.launch {
                    repository.deleteTemplate(template)
                    deletingTemplate = null
                }
            }
        )
    }
}

@Composable
private fun TemplateCard(
    template: MessageTemplate,
    templateIndex: Int = 1,
    cardBg: Color,
    textPrimary: Color,
    blueAccent: Color,
    onEdit: () -> Unit,
    onDelete: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(containerColor = cardBg)
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            // Header Row: Number Badge (#1, #2), Message Content Box, Edit/Delete Action Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF1E2C4A))
                            .border(1.dp, blueAccent.copy(alpha = 0.5f), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "#$templateIndex",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = blueAccent
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = if (template.title.isNotBlank()) template.title else "id: $templateIndex",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = textPrimary,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                // Edit and Delete Buttons
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Surface(
                        onClick = onEdit,
                        shape = RoundedCornerShape(12.dp),
                        color = Color(0xFF1E2C4A),
                        border = BorderStroke(1.dp, Color(0xFF3A5285))
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Edit,
                                contentDescription = "Edit Template",
                                tint = Color(0xFF9CB7F5),
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Edit",
                                color = Color(0xFF9CB7F5),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }

                    Surface(
                        onClick = onDelete,
                        shape = RoundedCornerShape(12.dp),
                        color = Color(0xFF3B1E22),
                        border = BorderStroke(1.dp, Color(0xFF752B33))
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Delete,
                                contentDescription = "Delete Template",
                                tint = Color(0xFFFF6B6B),
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Delete",
                                color = Color(0xFFFF6B6B),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Template Message Content Box with highlighted {name} placeholder
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFF1E2330))
                    .border(1.dp, Color(0xFF333846), RoundedCornerShape(12.dp))
                    .padding(12.dp)
            ) {
                val formattedMessage = remember(template.message) {
                    buildAnnotatedString {
                        val messageText = template.message
                        val tag = "{name}"
                        var startIndex = 0
                        while (true) {
                            val tagIndex = messageText.indexOf(tag, startIndex)
                            if (tagIndex == -1) {
                                append(messageText.substring(startIndex))
                                break
                            }
                            append(messageText.substring(startIndex, tagIndex))
                            withStyle(
                                style = SpanStyle(
                                    color = blueAccent,
                                    fontWeight = FontWeight.Bold
                                )
                            ) {
                                append(tag)
                            }
                            startIndex = tagIndex + tag.length
                        }
                    }
                }

                Text(
                    text = formattedMessage,
                    fontSize = 13.sp,
                    color = Color(0xFFE0E0E0),
                    lineHeight = 18.sp
                )
            }
        }
    }
}

@Composable
private fun AddOrEditTemplateDialog(
    template: MessageTemplate?,
    templateIndex: Int,
    textPrimary: Color,
    blueAccent: Color,
    onDismiss: () -> Unit,
    onSave: (messageText: String) -> Unit
) {
    var messageText by remember { mutableStateOf(template?.message ?: "") }
    var isSaving by remember { mutableStateOf(false) }

    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = Color(0xFF282C35),
        shape = RoundedCornerShape(22.dp),
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(if (template != null) Color(0xFF1E2C4A) else Color(0xFF1E2C4A)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = if (template != null) Icons.Default.Edit else Icons.Default.Add,
                        contentDescription = null,
                        tint = if (template != null) Color(0xFF9CB7F5) else blueAccent,
                        modifier = Modifier.size(18.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = if (template != null) "Edit Template #$templateIndex" else "Add SMS Template",
                    color = textPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text(
                    text = "SMS Message Content",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFFA0A5B5)
                )

                // Single Text Field for SMS Message Text
                OutlinedTextField(
                    value = messageText,
                    onValueChange = { messageText = it },
                    placeholder = { Text("Type your SMS message text here...", color = Color(0xFF6C7280)) },
                    minLines = 4,
                    maxLines = 8,
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = textPrimary,
                        unfocusedTextColor = textPrimary,
                        focusedBorderColor = Color(0xFF9CB7F5),
                        unfocusedBorderColor = Color(0xFF424855)
                    ),
                    modifier = Modifier.fillMaxWidth()
                )

                // Small Note Box for {name} placeholder
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color(0xFF1E2330))
                        .border(1.dp, Color(0xFF333846), RoundedCornerShape(10.dp))
                        .padding(10.dp)
                ) {
                    val tagInstruction = remember {
                        buildAnnotatedString {
                            append("Tip: Use ")
                            withStyle(SpanStyle(color = blueAccent, fontWeight = FontWeight.Bold)) {
                                append("{name}")
                            }
                            append(" in your message to automatically insert the client's name.")
                        }
                    }
                    Text(
                        text = tagInstruction,
                        fontSize = 12.sp,
                        color = Color(0xFFB0B5C0),
                        lineHeight = 16.sp
                    )
                }
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    if (messageText.isNotBlank() && !isSaving) {
                        isSaving = true
                        onSave(messageText)
                    }
                },
                enabled = messageText.isNotBlank() && !isSaving,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF9CB7F5),
                    contentColor = Color.Black
                )
            ) {
                Text("Save Template", fontWeight = FontWeight.Bold)
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel", color = Color(0xFFB0B5C0))
            }
        }
    )
}

@Composable
private fun DeleteTemplateConfirmationDialog(
    template: MessageTemplate,
    templateIndex: Int,
    textPrimary: Color,
    onDismiss: () -> Unit,
    onConfirmDelete: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = Color(0xFF282C35),
        shape = RoundedCornerShape(22.dp),
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF3B1E22)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Warning,
                        contentDescription = null,
                        tint = Color(0xFFFF6B6B),
                        modifier = Modifier.size(20.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Delete Template #$templateIndex",
                    color = textPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Text(
                    text = "Are you sure you want to delete SMS Template #$templateIndex?",
                    color = Color(0xFFD0D4E0),
                    fontSize = 14.sp
                )

                if (template.message.isNotBlank()) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color(0xFF1E2330))
                            .border(1.dp, Color(0xFF3B1E22), RoundedCornerShape(12.dp))
                            .padding(10.dp)
                    ) {
                        Text(
                            text = template.message,
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis,
                            fontSize = 12.sp,
                            color = Color(0xFFA0A5B5)
                        )
                    }
                }
            }
        },
        confirmButton = {
            Button(
                onClick = onConfirmDelete,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE54B4B),
                    contentColor = Color.White
                )
            ) {
                Text("Delete", fontWeight = FontWeight.Bold)
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel", color = Color.White)
            }
        }
    )
}

private fun parseTemplateFile(context: Context, uri: Uri, isExcel: Boolean): List<String> {
    val contentResolver = context.contentResolver
    if (isExcel) {
        try {
            val sharedStrings = mutableListOf<String>()
            val sheetRows = mutableMapOf<Int, MutableMap<String, String>>()

            contentResolver.openInputStream(uri)?.use { inputStream ->
                val zipStream = ZipInputStream(inputStream)
                var entry = zipStream.nextEntry

                var sharedStringsXml: String? = null
                var sheet1Xml: String? = null

                while (entry != null) {
                    if (entry.name == "xl/sharedStrings.xml") {
                        sharedStringsXml = zipStream.readBytes().toString(Charsets.UTF_8)
                    } else if (entry.name == "xl/worksheets/sheet1.xml" || (sheet1Xml == null && entry.name.startsWith("xl/worksheets/sheet"))) {
                        sheet1Xml = zipStream.readBytes().toString(Charsets.UTF_8)
                    }
                    entry = zipStream.nextEntry
                }

                if (sharedStringsXml != null) {
                    val regex = Regex("<t[^>]*>(.*?)</t>", RegexOption.DOT_MATCHES_ALL)
                    regex.findAll(sharedStringsXml).forEach { match ->
                        val text = match.groupValues[1]
                            .replace("&lt;", "<")
                            .replace("&gt;", ">")
                            .replace("&amp;", "&")
                            .trim()
                        sharedStrings.add(text)
                    }
                }

                if (sheet1Xml != null) {
                    val cellRegex = Regex("""<c\s+r="([A-Z]+)(\d+)"(?:\s+t="([^"]+)")?[^>]*>(.*?)</c>""", RegexOption.DOT_MATCHES_ALL)
                    cellRegex.findAll(sheet1Xml).forEach { match ->
                        val col = match.groupValues[1]
                        val rowNum = match.groupValues[2].toIntOrNull() ?: 0
                        val type = match.groupValues[3]
                        val inner = match.groupValues[4]

                        var cellValue = ""
                        if (type == "s") {
                            val vMatch = Regex("<v>(.*?)</v>").find(inner)
                            val idx = vMatch?.groupValues?.get(1)?.toIntOrNull()
                            if (idx != null && idx in sharedStrings.indices) {
                                cellValue = sharedStrings[idx]
                            }
                        } else if (type == "inlineStr") {
                            val tMatch = Regex("<t[^>]*>(.*?)</t>").find(inner)
                            cellValue = tMatch?.groupValues?.get(1) ?: ""
                        } else {
                            val vMatch = Regex("<v>(.*?)</v>").find(inner)
                            cellValue = vMatch?.groupValues?.get(1) ?: ""
                        }

                        cellValue = cellValue.trim()
                        if (cellValue.isNotEmpty()) {
                            val rowMap = sheetRows.getOrPut(rowNum) { mutableMapOf() }
                            rowMap[col] = cellValue
                        }
                    }
                }
            }

            val templateMap = mutableMapOf<Int, String>()

            fun extractNum(s: String): Int? {
                return s.toIntOrNull() ?: s.toDoubleOrNull()?.toInt() ?: Regex("""^(\d+)""").find(s)?.groupValues?.get(1)?.toIntOrNull()
            }

            sheetRows.keys.sorted().forEach { rowNum ->
                val rowMap = sheetRows[rowNum] ?: return@forEach

                val valB = rowMap["B"]?.trim() ?: ""
                val valC = rowMap["C"]?.trim() ?: ""
                val valA = rowMap["A"]?.trim() ?: ""

                var num: Int? = null
                var msgText: String? = null

                // Case 1: Col B has number or "1:sdvhdh", Col C has SMS Body (or Col B has both)
                if (valB.isNotEmpty()) {
                    val colonMatch = Regex("""^(\d+)[:.\-\s]\s*(.+)""", RegexOption.DOT_MATCHES_ALL).find(valB)
                    if (colonMatch != null) {
                        num = colonMatch.groupValues[1].toIntOrNull()
                        val bodyInB = colonMatch.groupValues[2].trim()
                        msgText = if (valC.isNotEmpty() && !valC.equals("message", ignoreCase = true) && !valC.equals("template", ignoreCase = true)) valC else bodyInB
                    } else {
                        val parsedNum = extractNum(valB)
                        if (parsedNum != null) {
                            num = parsedNum
                            if (valC.isNotEmpty()) {
                                msgText = valC
                            }
                        }
                    }
                }

                // Case 2: Col A has number or "1:sdvhdh", Col B has SMS Body
                if (num == null && valA.isNotEmpty()) {
                    val colonMatch = Regex("""^(\d+)[:.\-\s]\s*(.+)""", RegexOption.DOT_MATCHES_ALL).find(valA)
                    if (colonMatch != null) {
                        num = colonMatch.groupValues[1].toIntOrNull()
                        val bodyInA = colonMatch.groupValues[2].trim()
                        msgText = if (valB.isNotEmpty() && !valB.equals("message", ignoreCase = true) && !valB.equals("template", ignoreCase = true)) valB else bodyInA
                    } else {
                        val parsedNum = extractNum(valA)
                        if (parsedNum != null) {
                            num = parsedNum
                            if (valB.isNotEmpty()) {
                                msgText = valB
                            }
                        }
                    }
                }

                // Case 3: Any cell in the row matching "1: sdvhdh"
                if (num == null) {
                    rowMap.values.forEach { valStr ->
                        val colonMatch = Regex("""^(\d+)[:.\-\s]\s*(.+)""", RegexOption.DOT_MATCHES_ALL).find(valStr.trim())
                        if (colonMatch != null) {
                            val parsedNum = colonMatch.groupValues[1].toIntOrNull()
                            val body = colonMatch.groupValues[2].trim()
                            if (parsedNum != null && body.isNotBlank()) {
                                num = parsedNum
                                msgText = body
                            }
                        }
                    }
                }

                val headers = listOf("message", "template", "text", "id", "sms", "body")
                if (num != null && !msgText.isNullOrBlank() && 
                    headers.none { msgText.equals(it, ignoreCase = true) }) {
                    templateMap[num] = msgText
                }
            }

            if (templateMap.isNotEmpty()) {
                return templateMap.keys.sorted().map { templateMap.getValue(it) }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    // Fallback for CSV / TXT / TSV lines or general format
    val fallbackResults = mutableListOf<Pair<Int, String>>()
    val linesList = mutableListOf<String>()

    try {
        contentResolver.openInputStream(uri)?.bufferedReader()?.useLines { lines ->
            lines.forEach { line ->
                val trimmed = line.trim()
                if (trimmed.isNotBlank()) {
                    linesList.add(trimmed)
                }
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }

    linesList.forEach { line ->
        val parts = line.split(",", "\t", ";")
        if (parts.size >= 2) {
            val first = parts[0].trim().removeSurrounding("\"")
            val second = parts[1].trim().removeSurrounding("\"")
            val num = first.toIntOrNull() ?: Regex("""^(\d+)""").find(first)?.groupValues?.get(1)?.toIntOrNull()
            if (num != null && second.isNotBlank() && !second.equals("message", ignoreCase = true)) {
                fallbackResults.add(num to second)
            }
        } else {
            val colonMatch = Regex("""^(\d+)[:.\-\s]\s*(.+)""", RegexOption.DOT_MATCHES_ALL).find(line)
            if (colonMatch != null) {
                val num = colonMatch.groupValues[1].toIntOrNull()
                val body = colonMatch.groupValues[2].trim().removeSurrounding("\"")
                if (num != null && body.isNotBlank()) {
                    fallbackResults.add(num to body)
                }
            }
        }
    }

    if (fallbackResults.isNotEmpty()) {
        return fallbackResults.sortedBy { it.first }.map { it.second }
    }

    return linesList.filter { msg ->
        !msg.equals("message", ignoreCase = true) && !msg.equals("template", ignoreCase = true) && !msg.equals("text", ignoreCase = true)
    }
}
