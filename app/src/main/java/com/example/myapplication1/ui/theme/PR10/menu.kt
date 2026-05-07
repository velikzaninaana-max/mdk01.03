package com.example.myapplication1.ui.theme.PR10

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
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.myapplication1.R
import com.example.myapplication1.ui.theme.MyCustomTheme.colors
import com.example.myapplication1.ui.theme.notextPR10
import com.example.myapplication1.ui.theme.textPR10

data class TabBarItem(
    val index: Int,
    val icon: Int,
    val title: String
)
@Composable
fun Menu(modifier: Modifier = Modifier, onMenuClick: (String) -> Unit = {}) {
    var selItem by remember { mutableIntStateOf(-1) }
    var item = listOf(
        TabBarItem(0, R.drawable.analizz,"Анализы" ),
        TabBarItem(1,R.drawable.resultt,"Результаты" ),
        TabBarItem(2,R.drawable.podderzhkaa,"Поддержка" ),
        TabBarItem(3,R.drawable.userr,"Профиль" ),
    )
    NavigationBar(
        containerColor = colors.white
    ) {
        for (itemNavBar in item) {
            NavigationBarItem(
                selected = itemNavBar.index == selItem,
                onClick = {
                    selItem = itemNavBar.index
                    onMenuClick(itemNavBar.title)
                },
                icon = {
                    Image(
                        imageVector = ImageVector.vectorResource(itemNavBar.icon),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(
                            if (itemNavBar.index == selItem)
                                textPR10
                            else notextPR10
                    )
                    )
                },
                label = {
                    Text(
                        text = itemNavBar.title,
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    unselectedTextColor = notextPR10,
                    selectedTextColor = textPR10,
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