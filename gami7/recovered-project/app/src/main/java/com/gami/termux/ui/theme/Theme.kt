package com.gami.termux.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF3B4358),
    onPrimary = Color.White,
    secondary = Color(0xFF5C6bc0),
    onSecondary = Color.White,
    background = Color(0xFF181C24),
    onBackground = Color.White,
    surface = Color(0xFF242A38),
    onSurface = Color.White,
    surfaceVariant = Color(0xFF2E3748),
    onSurfaceVariant = Color(0xFF9E9E9E)
)

@Composable
fun TermuxTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}
