package com.example.bulksmsscheduler.ui

import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.bulksmsscheduler.model.Client
import com.example.bulksmsscheduler.model.ScheduleStatus
import com.example.bulksmsscheduler.model.ScheduleWithClient
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
fun ClientSmsDialog(
    client: Client,
    items: List<ScheduleWithClient>,
    textPrimary: Color,
    onDismiss: () -> Unit
) {
    val cardBg = Color(0xFF282C35)
    val dialogBg = Color(0xFF1E2330)
    val textSecondary = Color(0xFF9E9E9E)

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
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = onDismiss) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = textPrimary
                        )
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = client.name,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = textPrimary,
                            maxLines = 1
                        )
                        if (client.phone.isNotBlank()) {
                            Text(
                                text = client.phone,
                                fontSize = 12.sp,
                                color = textSecondary
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                if (items.isEmpty()) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 40.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "No scheduled SMS found for this client.",
                            color = textSecondary,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                } else {
                    Text(
                        text = "Planned & Sent SMS History (${items.size}):",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF9CB7F5)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        items.forEach { item ->
                            val status = item.schedule.status
                            val (statusBg, statusTint) = when (status) {
                                ScheduleStatus.PENDING -> Color(0xFF3E3B2E) to Color(0xFFFFD54F)
                                ScheduleStatus.SENT -> Color(0xFF283C32) to Color(0xFF81C784)
                                ScheduleStatus.FAILED -> Color(0xFF402A2C) to Color(0xFFE57373)
                            }

                            val formattedDateTime = try {
                                val date = LocalDate.parse(item.schedule.scheduledDate)
                                val dateStr = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US))
                                val timeStr = RecoveredStrings.formatTimeToAmPm(item.schedule.scheduledTime)
                                "$dateStr, $timeStr"
                            } catch (_: Exception) {
                                "${item.schedule.scheduledDate}, ${RecoveredStrings.formatTimeToAmPm(item.schedule.scheduledTime)}"
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
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .clip(RoundedCornerShape(6.dp))
                                                .background(statusBg)
                                                .padding(horizontal = 8.dp, vertical = 3.dp)
                                        ) {
                                            Text(
                                                text = status.name,
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

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(10.dp))
                                            .background(Color(0xFF1E2330))
                                            .padding(10.dp)
                                    ) {
                                        Text(
                                            text = item.schedule.message,
                                            fontSize = 13.sp,
                                            color = Color(0xFFE0E0E0),
                                            lineHeight = 18.sp
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
