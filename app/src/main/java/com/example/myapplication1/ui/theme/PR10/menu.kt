package com.example.myapplication1.ui.theme.PR10

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.myapplication1.R
import com.example.myapplication1.ui.theme.MyCustomTheme
import com.example.myapplication1.ui.theme.MyCustomTheme.colors
import com.example.myapplication1.ui.theme.colorBlue
import com.example.myapplication1.ui.theme.notextPR10
import com.example.myapplication1.ui.theme.textPR10
import com.example.myapplication1.ui.theme.text_col

data class TabBarItem(
    val index: Int,
    val icon: Int,
    val title: String
)
@Composable
fun Menu(modifier: Modifier = Modifier) {
    var selItem by remember { mutableIntStateOf(value = -1) }
    var item = listOf(
        TabBarItem(0, R.drawable.analiz,"Анализы" ),
        TabBarItem(1,R.drawable.result,"Результаты" ),
        TabBarItem(2,R.drawable.podderzhka,"Поддержка" ),
        TabBarItem(3,R.drawable.user,"Профиль" ),
    )
    NavigationBar(
        containerColor = colors.white
    ) {
        for (itemNavBar in item) {
            NavigationBarItem(
                selected = itemNavBar.index == selItem,
                onClick = {selItem = itemNavBar.index},
                icon = {
                    Image(
                        modifier=modifier
                            .size(24.dp,24.dp),
                        painter = painterResource(id = itemNavBar.icon),
                        contentDescription = null
                    )
                },
                label = {
                    Text(
                        text = itemNavBar.title,
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    unselectedIconColor = textPR10,
                    unselectedTextColor = notextPR10,
                    selectedIconColor = textPR10,
                    selectedTextColor = notextPR10,
                    indicatorColor = Color.Transparent
                )
            )
        }
    }
}

@Preview
@Composable
private fun MenuPrev() {
    Menu()
}