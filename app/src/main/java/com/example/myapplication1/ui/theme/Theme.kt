package com.example.myapplication1.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun MyApplication1Theme(
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

@Composable
fun MyCustomTheme(content: @Composable () -> Unit) {
    val colors = AppColors(
        primary = Color(0xFF0560FA),
        secondary = Color(0xFFEC8000),
        success = Color(0xFF35B369),
        warning = Color(0xFFEBBC2E),
        info = Color(0xFF2F80ED),
        error = Color(0xFFED3A3A),
        blacktext1 = Color(0xFF3A3A3A),
        blacktext2 = Color(0xFF141414),
        gray1 = Color(0xFFCFCFCF),
        gray2 = Color(0xFFA7A7A7),
        white = Color(0xFFFFFFFF)
    )
    val typography = AppTypography(
        headingBlack128 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Black,
            fontSize = 128.sp
        ),
        headingBlack96 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Black,
            fontSize = 96.sp
        ),
        headingBold36 = TextStyle(fontFamily = RobotoFamily, fontWeight = FontWeight.Bold, fontSize = 36.sp),
        headingBold24 = TextStyle(fontFamily = RobotoFamily, fontWeight = FontWeight.Bold, fontSize = 24.sp),
        headingMedium20 = TextStyle(fontFamily = RobotoFamily, fontWeight = FontWeight.Medium, fontSize = 20.sp),
        subtitleMedium18 = TextStyle(fontFamily = RobotoFamily, fontWeight = FontWeight.Medium, fontSize = 18.sp),
        subtitleBold16 = TextStyle(fontFamily = RobotoFamily, fontWeight = FontWeight.Bold, fontSize = 16.sp),
        subtitleMedium16 = TextStyle(fontFamily = RobotoFamily, fontWeight = FontWeight.Medium, fontSize = 16.sp),
        subtitleRegular16 = TextStyle(fontFamily = RobotoFamily, fontWeight = FontWeight.Normal, fontSize = 16.sp)
    )
    CompositionLocalProvider(
        LocalAppColors provides colors,
        LocalAppTypography provides typography
    ) {
        content()
    }
}
object MyTheme {
    val colors: AppColors
        @Composable
        get() = LocalAppColors.current

    val typography: AppTypography
        @Composable
        get() = LocalAppTypography.current
}