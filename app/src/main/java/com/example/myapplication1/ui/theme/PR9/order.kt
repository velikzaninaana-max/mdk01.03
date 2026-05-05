package com.example.myapplication1.ui.theme.PR9

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication1.R
import com.example.myapplication1.ui.theme.borderColor
import com.example.myapplication1.ui.theme.colorBlue
import com.example.myapplication1.ui.theme.colorText
import com.example.myapplication1.ui.theme.color_Text
import com.example.myapplication1.ui.theme.inactiveButton
import com.example.myapplication1.ui.theme.inputBgColor
import com.example.myapplication1.ui.theme.text_col

@Composable
fun Order(modifier: Modifier = Modifier, back: () -> Unit, navigateToOrder: () -> Unit) {
    var address by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var comment by remember { mutableStateOf("") }
    val enabledText = address.isNotEmpty() && phone.isNotEmpty() && comment.isNotEmpty()
    Column(
        modifier=modifier
            .background(color = Color.White)
            .fillMaxSize()
            .padding(top = 60.dp)
            .padding(bottom = 20.dp)
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.Start,
        ) {
        Image(
            modifier=modifier
                .size(32.dp,32.dp)
                .clickable{back()},
            painter = painterResource(id = R.drawable.back),
            contentDescription = "back"
        )
        Spacer(modifier=modifier.height(24.dp))
        Text(
            text = "Оформление заказа",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 28.sp
        )
        Spacer(modifier=modifier.height(32.dp))

        Image(
            modifier=modifier
                .size(51.dp,20.dp),
            painter = painterResource(id = R.drawable.tittle),
            contentDescription = "address"
        )
        Spacer(modifier=modifier.height(4.dp))
        OutlinedTextField(
            value = address,
            onValueChange = {address=it},
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = inputBgColor,
                unfocusedContainerColor = inputBgColor,
                unfocusedBorderColor = borderColor,
                focusedBorderColor = borderColor
            ),
            placeholder = {
                Text(
                    text = "Введите ваш адрес",
                    color = Color.Gray,
                    fontSize = 15.sp
                )
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier=modifier.height(12.dp))
        Image(
            modifier=modifier
                .size(68.dp,20.dp),
            painter = painterResource(id = R.drawable.tittle1),
            contentDescription = "phone"
        )
        Spacer(modifier=modifier.height(4.dp))
        OutlinedTextField(
            value = phone,
            onValueChange = {phone=it},
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = inputBgColor,
                unfocusedContainerColor = inputBgColor,
                unfocusedBorderColor = borderColor,
                focusedBorderColor = borderColor
            ),
            placeholder = {
                Text(
                    text = "Введите ваш номер телефона",
                    color = Color.Gray,
                    fontSize = 15.sp
                )
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier=modifier.height(12.dp))
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
        )
        {
            Text(
                text = "Комментарий",
                fontSize = 14.sp,
                color = colorText,
                lineHeight = 20.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(
                modifier=modifier
                    .size(24.dp,20.dp),
                painter = painterResource(id = R.drawable.microfon),
                contentDescription = "microfon"
            )
        }
        Spacer(modifier=modifier.height(4.dp))
        OutlinedTextField(
            value = comment,
            onValueChange = {comment=it},
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = inputBgColor,
                unfocusedContainerColor = inputBgColor,
                unfocusedBorderColor = borderColor,
                focusedBorderColor = borderColor
            ),
            placeholder = {
                Text(
                    text = "Можете оставить свои пожелания",
                    color = text_col,
                    fontSize = 15.sp
                )
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .size(335.dp,128.dp)
        )
        Spacer(modifier=modifier.height(200.dp))
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
        ) {
            Text(
                text = "Промокод",
                fontSize = 15.sp,
                color = text_col,
                modifier = Modifier,
                lineHeight = 20.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(
                modifier=modifier
                    .size(20.dp,20.dp),
                painter = painterResource(id = R.drawable.icons),
                contentDescription = "icons"
            )
        }
        Spacer(modifier=modifier.height(15.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            onClick = { Log.d("MyLog", "Ваш email: $address")
                navigateToOrder()},
            enabled = enabledText,
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorBlue,
                disabledContainerColor = inactiveButton
            ),
        ) {
            Text(
                text = "Заказать",
                color = color_Text,
                fontSize = 17.sp,
                lineHeight = 24.sp
            )
        }
    }
}

@Preview
@Composable
private fun OrderPrev() {
    Order(back ={},navigateToOrder={})
}