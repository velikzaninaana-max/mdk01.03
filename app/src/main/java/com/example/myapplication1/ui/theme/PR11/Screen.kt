package com.example.myapplication1.ui.theme.PR11

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication1.ui.theme.PR10.Menu
import com.example.myapplication1.ui.theme.ScreenListViewModel

@Composable
fun ScreenList(
    modifier: Modifier = Modifier,
    onBack: () -> Unit = {}
) {
    BackHandler {
        onBack()
    }

    var showAnalizi by remember { mutableStateOf(false) }
    val viewModel: ScreenListViewModel = viewModel()
    val categories by viewModel.categories.collectAsState()
    val product by viewModel.product.collectAsState()


    Scaffold(
        bottomBar = {
            Menu(
                onMenuClick = { menuTitle ->
                    if (menuTitle == "Анализы") {
                        showAnalizi = true
                    }
                    else{
                        onBack()
                    }
                },
            )
        }
    ) { contentPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(contentPadding)
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(68.dp))
            Row {
                CategoryList(categories = categories)
            }
            Spacer(modifier = Modifier.height(24.dp))
            Column {
                ListCard(listCard = product)
            }
        }
    }
    //}
}

@Preview
@Composable
private fun ScreenListPrev() {
    ScreenList()
}