package com.example.bulksmsscheduler.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.HorizontalDivider
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

@Composable
fun TemplatesScreen(
    repository: SmsRepository,
    templates: List<MessageTemplate>,
    cardBg: Color = Color(0xFF282C35),
    textPrimary: Color,
    textSecondary: Color
) {
    val scope = rememberCoroutineScope()
    var searchQuery by remember { mutableStateOf("") }
    var showAddDialog by remember { mutableStateOf(false) }
    var editingTemplate by remember { mutableStateOf<MessageTemplate?>(null) }
    var deletingTemplate by remember { mutableStateOf<MessageTemplate?>(null) }

    // Dark theme palette matching ClientsScreen & app aesthetics
    val searchBg = Color(0xFF232731)
    val templateCardBg = cardBg
    val fabBg = Color(0xFF9CB7F5)
    val goldAccent = Color(0xFFFFD54F)

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
            // Header Row: Title & Total Count Badge
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "SMS Templates",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = textPrimary
                )

                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = Color(0xFF353B47)
                ) {
                    Text(
                        text = "${templates.size} Templates",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF9CB7F5),
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                    )
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
                        text = if (templates.isEmpty()) "No templates added yet.\nClick '+' to create your first template." else "No templates match your search.",
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
                        TemplateCard(
                            template = template,
                            cardBg = templateCardBg,
                            textPrimary = textPrimary,
                            goldAccent = goldAccent,
                            onToggleEnabled = { enabled ->
                                scope.launch { repository.updateTemplate(template.copy(enabled = enabled)) }
                            },
                            onEdit = { editingTemplate = template },
                            onDelete = { deletingTemplate = template }
                        )
                    }
                }
            }
        }

        // Add Template FAB
        FloatingActionButton(
            onClick = { showAddDialog = true },
            containerColor = fabBg,
            contentColor = Color.White,
            shape = CircleShape,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(bottom = 16.dp, end = 16.dp)
                .size(58.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add Template",
                modifier = Modifier.size(28.dp)
            )
        }
    }

    // Add / Edit Template Dialog
    if (showAddDialog || editingTemplate != null) {
        val templateToEdit = editingTemplate
        AddOrEditTemplateDialog(
            template = templateToEdit,
            textPrimary = textPrimary,
            goldAccent = goldAccent,
            onDismiss = {
                showAddDialog = false
                editingTemplate = null
            },
            onSave = { titleText, greetingText, messageText, isEnabled ->
                scope.launch {
                    if (templateToEdit != null) {
                        repository.updateTemplate(
                            templateToEdit.copy(
                                title = titleText,
                                greeting = greetingText,
                                message = messageText,
                                enabled = isEnabled
                            )
                        )
                    } else {
                        val nextOrder = repository.getNextTemplateOrder()
                        val newTemplate = MessageTemplate(
                            id = UUID.randomUUID().toString(),
                            title = titleText.ifBlank { "Template #$nextOrder" },
                            greeting = greetingText,
                            message = messageText,
                            order = nextOrder,
                            enabled = isEnabled
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
        DeleteTemplateConfirmationDialog(
            template = template,
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
    cardBg: Color,
    textPrimary: Color,
    goldAccent: Color,
    onToggleEnabled: (Boolean) -> Unit,
    onEdit: () -> Unit,
    onDelete: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = cardBg)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Header Row: Icon, Title & Greeting, Status Pill + Turn ON/OFF Switch
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
                            .size(44.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF3E3218)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.List,
                            contentDescription = null,
                            tint = goldAccent,
                            modifier = Modifier.size(22.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {
                        Text(
                            text = template.title.ifBlank { "Template #${template.order}" },
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = textPrimary,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        if (template.greeting.isNotBlank()) {
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "Greeting: ${template.greeting}",
                                fontSize = 12.sp,
                                color = goldAccent,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                // Right Side: Turn ON/OFF Switch with Active/Inactive badge
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    // Status Badge
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = if (template.enabled) Color(0xFF1E3A28) else Color(0xFF333842),
                        border = BorderStroke(
                            width = 1.dp,
                            color = if (template.enabled) Color(0xFF4CAF50).copy(alpha = 0.5f) else Color(0xFF666D7C)
                        )
                    ) {
                        Text(
                            text = if (template.enabled) "ACTIVE" else "OFF",
                            color = if (template.enabled) Color(0xFF81C784) else Color(0xFFA0A5B5),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }

                    // Turn ON/OFF Switch (kept feature)
                    Switch(
                        checked = template.enabled,
                        onCheckedChange = onToggleEnabled,
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            checkedTrackColor = goldAccent,
                            uncheckedThumbColor = Color(0xFF888888),
                            uncheckedTrackColor = Color(0xFF424242)
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Template Message Content Box with highlighted placeholders
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .background(Color(0xFF1E2330))
                    .border(1.dp, Color(0xFF333846), RoundedCornerShape(14.dp))
                    .padding(14.dp)
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
                                    color = goldAccent,
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
                    fontSize = 14.sp,
                    color = Color(0xFFE0E0E0),
                    lineHeight = 20.sp
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            HorizontalDivider(color = Color(0xFF383D4A), thickness = 1.dp)

            Spacer(modifier = Modifier.height(10.dp))

            // Redesigned Edit and Delete Option Buttons UI
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Edit Option Button
                Surface(
                    onClick = onEdit,
                    shape = RoundedCornerShape(16.dp),
                    color = Color(0xFF1E2C4A),
                    border = BorderStroke(1.dp, Color(0xFF3A5285))
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "Edit Template",
                            tint = Color(0xFF9CB7F5),
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Edit",
                            color = Color(0xFF9CB7F5),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

                Spacer(modifier = Modifier.width(10.dp))

                // Delete Option Button
                Surface(
                    onClick = onDelete,
                    shape = RoundedCornerShape(16.dp),
                    color = Color(0xFF3B1E22),
                    border = BorderStroke(1.dp, Color(0xFF752B33))
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Delete Template",
                            tint = Color(0xFFFF6B6B),
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Delete",
                            color = Color(0xFFFF6B6B),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun AddOrEditTemplateDialog(
    template: MessageTemplate?,
    textPrimary: Color,
    goldAccent: Color,
    onDismiss: () -> Unit,
    onSave: (titleText: String, greetingText: String, messageText: String, isEnabled: Boolean) -> Unit
) {
    var titleText by remember { mutableStateOf(template?.title ?: "") }
    var greetingText by remember { mutableStateOf(template?.greeting ?: "") }
    var messageText by remember { mutableStateOf(template?.message ?: "") }
    var isEnabled by remember { mutableStateOf(template?.enabled ?: true) }
    var isSaving by remember { mutableStateOf(false) }

    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = Color(0xFF282C35),
        shape = RoundedCornerShape(26.dp),
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(if (template != null) Color(0xFF1E2C4A) else Color(0xFF3E3218)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = if (template != null) Icons.Default.Edit else Icons.Default.Add,
                        contentDescription = null,
                        tint = if (template != null) Color(0xFF9CB7F5) else goldAccent,
                        modifier = Modifier.size(20.dp)
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = if (template != null) "Edit Template" else "Add Template",
                    color = textPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(14.dp)) {
                // Title Field
                OutlinedTextField(
                    value = titleText,
                    onValueChange = { titleText = it },
                    label = { Text("Template Title", color = Color(0xFFA0A5B5)) },
                    placeholder = { Text("e.g., Follow Up Offer", color = Color(0xFF6C7280)) },
                    singleLine = true,
                    shape = RoundedCornerShape(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = textPrimary,
                        unfocusedTextColor = textPrimary,
                        focusedBorderColor = Color(0xFF9CB7F5),
                        unfocusedBorderColor = Color(0xFF424855)
                    ),
                    modifier = Modifier.fillMaxWidth()
                )

                // Greeting Field
                OutlinedTextField(
                    value = greetingText,
                    onValueChange = { greetingText = it },
                    label = { Text("Greeting (e.g. Hello, Hi)", color = Color(0xFFA0A5B5)) },
                    placeholder = { Text("e.g., Hello", color = Color(0xFF6C7280)) },
                    singleLine = true,
                    shape = RoundedCornerShape(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = textPrimary,
                        unfocusedTextColor = textPrimary,
                        focusedBorderColor = Color(0xFF9CB7F5),
                        unfocusedBorderColor = Color(0xFF424855)
                    ),
                    modifier = Modifier.fillMaxWidth()
                )

                // Message Body Label
                Text(
                    text = "Message Body",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFFA0A5B5)
                )

                // Message Field
                OutlinedTextField(
                    value = messageText,
                    onValueChange = { messageText = it },
                    placeholder = { Text("Type your message here...", color = Color(0xFF6C7280)) },
                    minLines = 3,
                    shape = RoundedCornerShape(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = textPrimary,
                        unfocusedTextColor = textPrimary,
                        focusedBorderColor = Color(0xFF9CB7F5),
                        unfocusedBorderColor = Color(0xFF424855)
                    ),
                    modifier = Modifier.fillMaxWidth()
                )

                // Instruction Note for {name} tag
                val tagInstruction = remember {
                    buildAnnotatedString {
                        append("Note: Use ")
                        withStyle(SpanStyle(color = goldAccent, fontWeight = FontWeight.Bold)) {
                            append("{name}")
                        }
                        append(" tag to automatically insert client's name in SMS.")
                    }
                }
                Text(
                    text = tagInstruction,
                    fontSize = 12.sp,
                    color = Color(0xFF8E95A5),
                    lineHeight = 16.sp
                )

                // Live Preview Card
                if (messageText.isNotBlank() || greetingText.isNotBlank()) {
                    val previewText = remember(greetingText, messageText) {
                        if (greetingText.isNotBlank()) "$greetingText $messageText" else messageText
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(14.dp))
                            .background(Color(0xFF1E2330))
                            .padding(12.dp)
                    ) {
                        Text(
                            text = "PREVIEW",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = goldAccent
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = previewText,
                            fontSize = 13.sp,
                            color = Color(0xFFD0D4E0),
                            lineHeight = 18.sp
                        )
                    }
                }

                // Enable Switch Row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(Color(0xFF1E2330))
                        .padding(horizontal = 12.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Enabled for Automation",
                        color = textPrimary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Switch(
                        checked = isEnabled,
                        onCheckedChange = { isEnabled = it },
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
                    if (messageText.isNotBlank() && !isSaving) {
                        isSaving = true
                        onSave(titleText, greetingText, messageText, isEnabled)
                    }
                },
                enabled = messageText.isNotBlank() && !isSaving,
                shape = RoundedCornerShape(16.dp),
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
    textPrimary: Color,
    onDismiss: () -> Unit,
    onConfirmDelete: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = Color(0xFF282C35),
        shape = RoundedCornerShape(26.dp),
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF3B1E22)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Warning,
                        contentDescription = null,
                        tint = Color(0xFFFF6B6B),
                        modifier = Modifier.size(22.dp)
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "Delete Template",
                    color = textPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text(
                    text = "Are you sure you want to delete this template?",
                    color = Color(0xFFD0D4E0),
                    fontSize = 14.sp
                )

                // Highlighted Template Info Box
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(Color(0xFF1E2330))
                        .border(1.dp, Color(0xFF3B1E22), RoundedCornerShape(14.dp))
                        .padding(12.dp)
                ) {
                    Column {
                        Text(
                            text = template.title.ifBlank { "Template #${template.order}" },
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFF6B6B),
                            fontSize = 15.sp
                        )
                        if (template.message.isNotBlank()) {
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = template.message,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis,
                                fontSize = 12.sp,
                                color = Color(0xFFA0A5B5)
                            )
                        }
                    }
                }

                Text(
                    text = "This action cannot be undone.",
                    color = Color(0xFF8E95A5),
                    fontSize = 12.sp
                )
            }
        },
        confirmButton = {
            Button(
                onClick = onConfirmDelete,
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE54B4B),
                    contentColor = Color.White
                )
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("Delete Template", fontWeight = FontWeight.Bold)
                }
            }
        },
        dismissButton = {
            OutlinedButton(
                onClick = onDismiss,
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(1.dp, Color(0xFF424855))
            ) {
                Text("Cancel", color = Color.White)
            }
        }
    )
}
