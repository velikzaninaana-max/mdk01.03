package com.example.myapplication1.ui.theme.Components

import android.R.id.primary
import androidx.compose.material3.Text
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication1.ui.theme.AccentColor4
import com.example.myapplication1.ui.theme.AccentColor5
import com.example.myapplication1.ui.theme.MyCustomTheme

@Composable
fun PrimaryButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(containerColor = MyCustomTheme.colors.primary)
    ) {
        Text(
            text = text,
            color = AccentColor5,
            modifier = modifier
        )
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    MyCustomTheme {
        PrimaryButton(text = "Кнопка", onClick = {})
    }
}