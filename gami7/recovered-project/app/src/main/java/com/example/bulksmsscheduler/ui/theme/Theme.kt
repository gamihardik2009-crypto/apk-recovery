package com.example.bulksmsscheduler.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

/**
 * Recovered theme.
 *
 * RECOVERED facts: the original APK declared NO custom colors, dimensions or
 * night-mode resources (its `res/values/` holds only library attrs/bools/ids/
 * strings/styles).  Every colour was inlined in the Compose code and the app
 * theme followed the system DayNight setting.  We therefore apply the stock
 * Material3 light/dark schemes (the closest faithful match to an un-theme'd
 * Compose app), toggled by the system night mode.
 */
private val LightColors = lightColorScheme()
private val DarkColors = darkColorScheme()

@Composable
fun BulkSmsSchedulerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content,
    )
}