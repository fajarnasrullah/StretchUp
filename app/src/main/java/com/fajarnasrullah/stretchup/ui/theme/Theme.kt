package com.fajarnasrullah.stretchup.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

private val AppColorScheme = darkColorScheme(

    primary = Primary,
    onPrimary = White,

    secondary = Secondary,
    onSecondary = White,

    tertiary = Tertiary,
    onTertiary = White,

    background = Background,
    onBackground = TextPrimary,

    surface = Surface,
    onSurface = TextPrimary,

    surfaceVariant = SurfaceVariant,
    onSurfaceVariant = TextSecondary,

    outline = Outline,

    error = Error,
    onError = White
)


val AppShapes = Shapes(

    extraSmall = RoundedCornerShape(4.dp),

    small = RoundedCornerShape(8.dp),

    medium = RoundedCornerShape(12.dp),

    large = RoundedCornerShape(15.dp),

    extraLarge = RoundedCornerShape(24.dp)
)
val PillShape = RoundedCornerShape(100)

@Immutable
data class AppSpacing(

    val xxxs: Dp = 2.dp,

    val xxs: Dp = 4.dp,

    val xs: Dp = 8.dp,

    val sm: Dp = 12.dp,

    val md: Dp = 16.dp,

    val lg: Dp = 24.dp,

    val xl: Dp = 32.dp,

    val xxl: Dp = 40.dp,

    val xxxl: Dp = 48.dp,

    val screenHorizontal: Dp = 24.dp,

    val screenVertical: Dp = 24.dp,

    val section: Dp = 32.dp
)

@Immutable
data class AppSize(

    val iconSmall: Dp = 16.dp,

    val icon: Dp = 24.dp,

    val iconLarge: Dp = 32.dp,

    val avatar: Dp = 40.dp,

    val avatarLarge: Dp = 64.dp,

    val buttonHeight: Dp = 56.dp,

    val textFieldHeight: Dp = 56.dp,

    val topBarHeight: Dp = 64.dp,

    val bottomBarHeight: Dp = 72.dp,

    val bannerHeight: Dp = 180.dp,

    val cardImageHeight: Dp = 170.dp
)

@Immutable
data class AppElevation(

    val none: Dp = 0.dp,

    val card: Dp = 2.dp,

    val fab: Dp = 6.dp,

    val dialog: Dp = 8.dp
)

@Immutable
data class AppBorder(

    val thin: Dp = 0.5.dp,

    val normal: Dp = 1.dp,

    val thick: Dp = 2.dp
)

@Composable
fun StretchUpTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}