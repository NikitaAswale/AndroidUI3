package com.example.androidui3.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryGradientStart,
    secondary = AccentBlue,
    tertiary = AccentPink,
    background = SurfaceDark,
    surface = CardBackgroundDark,
    surfaceVariant = SurfaceDarkGlass,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = TextPrimaryDark,
    onSurface = TextPrimaryDark,
    onSurfaceVariant = TextSecondaryDark,
    primaryContainer = SurfaceDarkGlass,
    secondaryContainer = SurfaceDarkGlass,
    tertiaryContainer = SurfaceDarkGlass,
    error = ErrorDark,
    onError = Color.White,
    errorContainer = ErrorDark.copy(alpha = 0.2f),
    outline = TextSecondaryDark,
    outlineVariant = TextSecondaryDark.copy(alpha = 0.5f),
)

private val LightColorScheme = lightColorScheme(
    primary = PrimaryGradientStart,
    secondary = AccentBlue,
    tertiary = AccentPink,
    background = SurfaceLight,
    surface = CardBackground,
    surfaceVariant = SurfaceLightGlass,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = TextPrimary,
    onSurface = TextPrimary,
    onSurfaceVariant = TextSecondary,
    primaryContainer = SurfaceLightGlass,
    secondaryContainer = SurfaceLightGlass,
    tertiaryContainer = SurfaceLightGlass,
    error = ErrorColor,
    onError = Color.White,
    errorContainer = ErrorColor.copy(alpha = 0.1f),
    outline = TextSecondary,
    outlineVariant = TextSecondary.copy(alpha = 0.5f),
)

@Composable
fun AndroidUI3Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}