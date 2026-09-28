package com.example.bulksmsscheduler.ui

import androidx.compose.runtime.Composable
import com.example.bulksmsscheduler.SmsApplication

/**
 * MainScreen entry composable delegating to [AppContainer].
 */
@Composable
fun MainScreen(application: SmsApplication) {
    AppContainer(application = application)
}
