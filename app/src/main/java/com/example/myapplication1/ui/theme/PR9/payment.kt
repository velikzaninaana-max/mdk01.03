package com.example.myapplication1.ui.theme.PR9

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication1.R
import com.example.myapplication1.ui.theme.inactiveButton
import com.example.myapplication1.ui.theme.colorBlue
import com.example.myapplication1.ui.theme.color_Text
import com.example.myapplication1.ui.theme.text2PR6
import com.example.myapplication1.ui.theme.text3PR6

@Composable
fun Pay(modifier: Modifier = Modifier, back:() -> Unit) {
    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(top = 60.dp)
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Оплата",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 28.sp
        )
        Spacer(modifier=modifier .height(64.dp))
        Image(
            painter = painterResource(id = R.drawable.illustration),
            contentDescription = "illustration",
            modifier = Modifier
                .size(204.dp, 200.dp)
        )
        Spacer(modifier=modifier .height(31.dp))
        Text(
            text = "Ваш заказ успешно оплачен!",
            color = text2PR6,
            fontSize = 20.sp,
            lineHeight = 28.sp
        )
        Spacer(modifier=modifier .height(10.dp))
        Text(
            modifier = Modifier
                .padding(start = 30.dp)
                .padding(end = 30.dp),
            text = "Вам осталось дождаться приезда медсестры и сдать анализы. \n" +
                    "До скорой встречи!",
            color = text3PR6,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier=modifier .height(200.dp))
        OutlinedButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = color_Text,
                contentColor = colorBlue
            ),
            border = BorderStroke(1.dp, colorBlue)
        ) {
            Text(
                text = "Чек покупки",
                fontSize = 17.sp,
                modifier = Modifier
                    .padding(vertical = 10.dp)
            )
        }
        Spacer(modifier=modifier .height(20.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            onClick = {  back()},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorBlue,
                disabledContainerColor = inactiveButton
            ),
        ) {
            Text(
                text = "На главную",
                color = color_Text,
                fontSize = 17.sp,
                lineHeight = 24.sp
            )
        }
    }
}

@Preview
@Composable
private fun PayPrev() {
    Pay(back = {})
}