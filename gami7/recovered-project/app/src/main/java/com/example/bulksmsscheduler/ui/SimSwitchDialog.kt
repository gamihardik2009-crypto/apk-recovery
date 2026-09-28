package com.example.bulksmsscheduler.ui

import android.annotation.SuppressLint
import android.content.Context
import android.telephony.SubscriptionManager
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.SimCard
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@SuppressLint("MissingPermission")
@Composable
fun SimSwitchDialog(
    currentSubId: Int,
    textPrimary: Color,
    onDismiss: () -> Unit,
    onSelectSim: (subId: Int, simName: String) -> Unit
) {
    val context = LocalContext.current
    val dialogBg = Color(0xFF1E2330)
    val textSecondary = Color(0xFF9E9E9E)

    val subs = remember {
        runCatching {
            val subManager = context.getSystemService(Context.TELEPHONY_SUBSCRIPTION_SERVICE) as? SubscriptionManager
            subManager?.activeSubscriptionInfoList ?: emptyList()
        }.getOrDefault(emptyList())
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .padding(vertical = 16.dp),
            shape = RoundedCornerShape(24.dp),
            color = dialogBg
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
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
                    Text(
                        text = "Switch SIM Card",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = textPrimary
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Select which SIM card / phone number to use for sending automated SMS messages:",
                    fontSize = 13.sp,
                    color = textSecondary
                )

                Spacer(modifier = Modifier.height(16.dp))

                if (subs.isEmpty()) {
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        SimCardOption(
                            title = "Default SIM (Primary)",
                            subtitle = "System default slot",
                            isSelected = currentSubId == -1,
                            onClick = { onSelectSim(-1, "Default SIM") }
                        )
                    }
                } else {
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        SimCardOption(
                            title = "Default SIM",
                            subtitle = "System default slot",
                            isSelected = currentSubId == -1,
                            onClick = { onSelectSim(-1, "Default SIM") }
                        )

                        subs.forEach { sub ->
                            val subId = sub.subscriptionId
                            val carrierName = sub.carrierName?.toString() ?: "SIM ${sub.simSlotIndex + 1}"
                            val displayName = sub.displayName?.toString() ?: carrierName
                            val phoneNumber = sub.number?.takeIf { it.isNotBlank() } ?: "Slot ${sub.simSlotIndex + 1}"

                            SimCardOption(
                                title = displayName,
                                subtitle = "Number: $phoneNumber (Slot ${sub.simSlotIndex + 1})",
                                isSelected = currentSubId == subId,
                                onClick = { onSelectSim(subId, displayName) }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun SimCardOption(
    title: String,
    subtitle: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val cardBg = Color(0xFF282C35)
    val textPrimary = Color.White
    val textSecondary = Color(0xFF9E9E9E)
    val accentBlue = Color(0xFF9CB7F5)

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
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(if (isSelected) Color(0xFF283C32) else Color(0xFF2E3D52)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.SimCard,
                        contentDescription = "SIM Card",
                        tint = if (isSelected) Color(0xFF81C784) else accentBlue,
                        modifier = Modifier.size(20.dp)
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        text = title,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = textPrimary
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = subtitle,
                        fontSize = 12.sp,
                        color = textSecondary
                    )
                }
            }

            if (isSelected) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Selected",
                    tint = Color(0xFF81C784)
                )
            }
        }
    }
}
