package dev.trindadedev.exp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun ExpTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    highContrastDarkTheme: Boolean = false,
    content: @Composable () -> Unit,
) {
    val colorScheme =
        when {
            darkTheme && highContrastDarkTheme ->
                DarkColorScheme.copy(background = Color.Black, surface = Color.Black)
            darkTheme -> DarkColorScheme
            else -> LightColorScheme
        }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}