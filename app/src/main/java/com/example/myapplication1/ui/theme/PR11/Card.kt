package com.example.myapplication1.ui.theme.PR11

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication1.ui.theme.AccentColor
import com.example.myapplication1.ui.theme.AccentColor2
import com.example.myapplication1.ui.theme.AccentColor3
import com.example.myapplication1.ui.theme.AccentColor4
import com.example.myapplication1.ui.theme.AccentColor5
import com.example.myapplication1.ui.theme.ColorCard
import com.example.myapplication1.ui.theme.ColorCardFon
import com.example.myapplication1.ui.theme.Components.PrimaryButton
import com.example.myapplication1.ui.theme.MyCustomTheme
import com.example.myapplication1.ui.theme.inactiveButton

@Composable
fun Card(modifier: Modifier = Modifier,
         Title: String, Day: Int,
         Summa: Int,
         buttonWidth: Dp = 96.dp) {

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .border(
                width = 2.dp,
                color = ColorCard,
                shape = RoundedCornerShape(12.dp)
            ),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = ColorCardFon
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = Title,
                fontSize =  16.sp,
                lineHeight = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()

            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column() {
                    Text(
                        text = "$Day день",
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "$Summa ₽",
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                    )

                }
                Spacer(modifier = Modifier.weight(1f))
                PrimaryButton(
                    modifier = Modifier
                        .width(buttonWidth)
                        .height(40.dp),
                    butttonText = "Добавить",
                    onClick = {},
                    enabled = true,
                    textSize = 10,
                    textlineHeight = 20,
                    containerColor = AccentColor4,
                    contentColor = AccentColor5,
                    discontainerColor = inactiveButton,
                    discontentColor = inactiveButton,
                    colorText = MyCustomTheme.colors.white
                )
            }
        }

    }
}

@Preview
@Composable
private fun CardPrev() {
    Card(Title="Title",Day=2, Summa = 1600,buttonWidth=96.dp)
}