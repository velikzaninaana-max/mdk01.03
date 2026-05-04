package com.example.myapplication1

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication1.ui.theme.colorBlue
import com.example.myapplication1.ui.theme.text_col
import androidx.compose.material3.OutlinedButton
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import com.example.myapplication1.ui.theme.borderColor
import com.example.myapplication1.ui.theme.colorText
import com.example.myapplication1.ui.theme.color_Text
import com.example.myapplication1.ui.theme.inactiveButton
import com.example.myapplication1.ui.theme.inputBgColor
import com.example.myapplication1.ui.theme.textColor

@Composable
fun ScreenCenter(modifier: Modifier = Modifier) {
    var emailText by remember { mutableStateOf("") }
    var isButtonEnabled = emailText.isNotEmpty()

    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Добро пожаловать!",
            color = textColor,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Войдите, чтобы пользоваться функциями приложения",
            fontSize = 15.sp,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(90.dp))

        Text(
            text = "Вход по E-mail",
            color = colorText,
            fontSize = 14.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp)
        )
        Spacer(modifier = Modifier.height(1.dp))
        OutlinedTextField(
            value = emailText,
            onValueChange = { emailText = it },
            label = { Text("example@mail.ru", fontSize = 15.sp, color = Color.Gray)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(10.dp),
            enabled = true,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = inputBgColor,
                unfocusedContainerColor = inputBgColor,
                focusedIndicatorColor = borderColor,
                unfocusedIndicatorColor = borderColor
            )
        )

        Spacer(modifier = Modifier.height(35.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            onClick = { Log.d("MyLog", "Введенный email: $emailText") },
            shape = RoundedCornerShape(10.dp),
            enabled = isButtonEnabled,
            colors = ButtonDefaults.buttonColors(
                containerColor = colorBlue,
                disabledContainerColor = inactiveButton
            )
        ) {
            Text(
                text = "Далее",
                fontSize = 17.sp,
                color = color_Text,
                modifier = Modifier
                    .padding(vertical = 12.dp, horizontal = 24.dp)
            )
        }
        Spacer(modifier = Modifier.height(250.dp))
        Text(
            text = "Или войдите с помощью",
            fontSize = 15.sp,
            color = text_col
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = color_Text,
                contentColor = colorBlue
            ),
            border = BorderStroke(1.dp, colorBlue)
        ) {
            Text(
                text = "Войти с Яндекс",
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .padding(vertical = 12.dp, horizontal = 24.dp)
            )
        }
    }
}

@Preview
@Composable
private fun ScreenPrev() {
    ScreenCenter()
}