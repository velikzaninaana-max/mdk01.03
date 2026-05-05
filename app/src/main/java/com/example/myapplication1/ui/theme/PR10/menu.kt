package com.example.myapplication1.ui.theme.PR10

import androidx.compose.foundation.background
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import kotlin.collections.mutableSetOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.myapplication1.R
import com.example.myapplication1.ui.theme.MyCustomTheme
import com.example.myapplication1.ui.theme.text_col

@Composable
fun Menu(modifier: Modifier = Modifier) {
    var selItem by remember { mutableStateOf(-1) }
    var itemList = listOf(
        BarItem(0, R.drawable.analiz,"Анализы" ),
        BarItem(1,R.drawable.result,"Результаты" ),
        BarItem(2,R.drawable.podderzhka,"Поддержка" ),
        BarItem(3,R.drawable.user,"Профиль" ),
    )
    NavigationBar(
        modifier = modifier
            .background(MyCustomTheme.colors.white)
    ) {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                //Image(
                    //imageVector = ImageVector.vectorResource(R.drawable.tests),
                    //contentDescription = null,
                //)
            },
            label = {
                Text(
                    text = "Анализы",
                )
            },
            colors = NavigationBarItemDefaults.colors(
                unselectedIconColor = text_col,
                unselectedTextColor = text_col,
                selectedIconColor = text_col,
                selectedTextColor = text_col,
                indicatorColor = text_col
            )
        )
    }
}

@Composable
fun BarItem(x0: Int, x1: Int, x2: String) {
    TODO("Not yet implemented")
}

@Preview
@Composable
private fun MenuPrev() {
    Menu()
}