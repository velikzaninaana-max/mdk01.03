package com.example.myapplication1.ui.theme.Components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.PinnableContainer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication1.ui.theme.ColorLazyRowButton
import com.example.myapplication1.ui.theme.ColorLazyRowButtonText
import com.example.myapplication1.ui.theme.ColorLazyRowButton
import com.example.myapplication1.ui.theme.ColorLazyRowButtonText


@Composable
fun PrimaryButton(
    butttonText: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    modifier: Modifier = Modifier,
    textSize: Int ,
    textlineHeight: Int,
    containerColor: Color,
    contentColor: Color,
    discontainerColor: Color,
    discontentColor: Color,
    colorText: Color

) {
    Button(
        onClick = {onClick()},
        enabled = enabled,
        shape = RoundedCornerShape(10.dp),
        colors = ButtonColors(
//            AccentColorPrimaryButton,
//            AccentColorDisabledButtonText,
//            AccentColorDisabledButton,
//            AccentColorDisabledButton
            containerColor,
            contentColor,
            discontainerColor,
            discontentColor
        ),
        modifier = modifier

            .width(335.dp)
            .height(56.dp)
    ) {
        Text(
            text = butttonText,
            color = colorText,
            fontSize = textSize.sp,
            lineHeight = textlineHeight.sp
        )
    }
}

@Preview
@Composable
private fun DisabledButtonPrev() {
    PrimaryButton("Кнопка", onClick ={},textSize = 16,textlineHeight = 20,
        containerColor = ColorLazyRowButton,
        contentColor = ColorLazyRowButtonText,
        discontainerColor = ColorLazyRowButton,
        discontentColor =ColorLazyRowButton ,
        colorText = ColorLazyRowButtonText)
}