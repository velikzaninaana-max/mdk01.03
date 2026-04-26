package com.example.myapplication1.ui.theme.Components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import com.example.myapplication1.ui.theme.inputBgColor
import com.example.myapplication1.ui.theme.borderColor

@Composable
fun TextInput(label: String, value: String, onValueChange: (String) -> Unit, modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        singleLine = true,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = inputBgColor,
            unfocusedContainerColor = inputBgColor,
            focusedIndicatorColor = borderColor,
            unfocusedIndicatorColor = borderColor
        )
    )
}

@Preview
@Composable
private fun PreviewTextInput() {
    TextInput(
        value = "",
        onValueChange = {},
        label = "Поле для ввода с подсказкой"
    )
}