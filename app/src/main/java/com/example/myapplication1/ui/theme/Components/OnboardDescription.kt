package com.example.myapplication1.ui.theme.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication1.ui.theme.AccentColor2

@Composable
fun OnboardDescription(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = AccentColor2,
        fontSize = 14.sp,
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}

@Preview
@Composable
private fun OnboardDescriptionPreview() {
    OnboardDescription(text = "Описание")
}