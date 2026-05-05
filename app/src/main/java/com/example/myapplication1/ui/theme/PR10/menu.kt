package com.example.myapplication1.ui.theme.PR10

import androidx.compose.foundation.background
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication1.ui.theme.MyTheme

data class  Item(
    private val Index: Int,
    private val Icon: Int,
    private val title: String
)
@Composable
fun Menu(modifier: Modifier = Modifier) {
    //var itemList = listOf(
        //Item(0,R.drawable.tests,"Анализы" ),
        //Item(1,R.drawable.doc,"Результаты" ),
        //Item(2,R.drawable.massage,"Поддержка" ),
        //Item(3,R.drawable.user,"Профиль" ),
    //)
    NavigationBar(
        modifier = modifier
            .background(MyTheme.colors.white)
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
                //unselectedIconColor =
                //unselectedTextColor =
                //selectedIconColor =
                //selectedTextColor =
                //indicatorColor =
            )
        )
    }
}

@Preview
@Composable
private fun MenuPrev() {
    Menu()
}