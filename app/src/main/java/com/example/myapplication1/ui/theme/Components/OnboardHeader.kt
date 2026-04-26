package com.example.myapplication1.ui.theme.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication1.ui.theme.AccentColor

@Composable
fun OnboardHeader(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = AccentColor,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}

@Preview
@Composable
private fun OnboardHeaderPreview() {
    OnboardHeader(text = "Заголовок")
}

