package com.example.myapplication1.ui.theme.Components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication1.ui.theme.AccentColor4
import androidx.compose.material3.OutlinedButton

@Composable
fun SecondaryButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(1.dp, AccentColor4)
    ) {
        Text(
            text = text,
            color = AccentColor4,
            modifier = modifier
        )
    }
}

@Preview
@Composable
private fun PreviewSecondaryButton() {
    SecondaryButton(text = "Еще одна кнопка", onClick = {})
}
