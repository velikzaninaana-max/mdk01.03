package com.example.myapplication1.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val AccentColor = Color(0xFF00B712)
val AccentColor2 = Color(0xFF939396)
val AccentColor3 = Color(0xFF57A9FF)
val AccentColor4 = Color(0xFF1A6FEE)
val AccentColor5 = Color(0xFFFFFFFF)

val inputBgColor = Color(0xFFF5F5F9)
val borderColor = Color(0xFFEBEBEB)
val textColor = Color(0xFF000000)
val colorBlue = Color(0xFF1A6FEE)
val text_col = Color(0xFF939396)
val colorText = Color(0xFF7E7E9A)
val color_Text = Color(0xFFFFFFFF)
val textPR6 = Color(0xFF57A9FF)
val text2PR6 = Color(0xFF00B712)
val text3PR6 = Color(0xFF939396)
val inactiveButton = Color(0xFFC9D4FB)


data class AppColors(
    val primary: Color,
    val secondary: Color,
    val success: Color,
    val warning: Color,
    val info: Color,
    val error: Color,
    val blacktext1: Color,
    val blacktext2: Color,
    val gray1: Color,
    val gray2: Color,
    val white: Color
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        primary = Color.Unspecified,
        secondary = Color.Unspecified,
        success = Color.Unspecified,
        warning = Color.Unspecified,
        info = Color.Unspecified,
        error = Color.Unspecified,
        blacktext1 = Color.Unspecified,
        blacktext2 = Color.Unspecified,
        gray1 = Color.Unspecified,
        gray2 = Color.Unspecified,
        white = Color.Unspecified
    )
}
