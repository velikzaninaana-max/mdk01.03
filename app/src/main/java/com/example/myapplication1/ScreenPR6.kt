package com.example.myapplication1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication1.ui.theme.textPR6
import com.example.myapplication1.ui.theme.text2PR6
import com.example.myapplication1.ui.theme.text3PR6
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Screen(text: String, text1: String, text2: String, modifier: Modifier = Modifier, painter: Painter, painter1: Painter) {
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
            .padding(top = 49.dp)
            .padding(bottom = 80.dp)
    ){
            Text(
                text = text,
                fontSize = 20.sp,
                color = textPR6,
                modifier = Modifier
                    .padding(start = 30.dp)
            )
            Image(
            painter = painterResource(R.drawable.shape),
            contentDescription = "Top image",
            modifier = Modifier
                .padding(
                    start = 208.dp)
        )

        Spacer(modifier = Modifier.height(80.dp))
        Text(
            text = text1,
            fontSize = 20.sp,
            color = text2PR6,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = text2,
            fontSize = 14.sp,
            color = text3PR6,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(60.dp))

        Image(
            painter = painter1,
            contentDescription = "Circle image",
            modifier = Modifier
                .padding(start = 164.dp)
                .size(55.dp, 14.dp)

        )

        Spacer(modifier = Modifier.height(100.dp))
        Image(
            painter = painter,
            contentDescription = "Image bottom",
            modifier = Modifier
                .size(400.dp, 240.dp)

        )
    }
}

@Preview
@Composable
private fun ScreenPrev() {
    Screen(text = "Далее", text1 = "Анализы", text2 = "Экспресс сбор и получение проб", painter = painterResource(R.drawable.illustration), painter1 = painterResource(R.drawable.group1))
}

@Preview
@Composable
private fun ScreenPrev2() {
    Screen(text = "Далее", text1 = "Уведомления", text2 = "Вы быстро узнаете о результатах", painter = painterResource(R.drawable.image3), painter1 = painterResource(R.drawable.group2))
}

@Preview
@Composable
private fun ScreenPrev3() {
    Screen(text = "Далее", text1 = "Мониторинг", text2 = "Наши врачи всегда наблюдают \n" + "за вашими показателями здоровья", painter = painterResource(R.drawable.image2), painter1 = painterResource(R.drawable.group3))
}