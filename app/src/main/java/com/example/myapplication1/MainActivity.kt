package com.example.myapplication1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication1.ui.theme.MyApplication1Theme
import com.example.myapplication1.ui.theme.MyCustomTheme
import com.example.myapplication1.ui.theme.PR10.Menu
import com.example.myapplication1.ui.theme.PR9.Pay
import com.example.myapplication1.ui.theme.PR9.Order
import com.example.myapplication1.ui.theme.PR9.ScreenCenter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplication1Theme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = ScreenCenter) {
                    composable<ScreenCenter> {
                        ScreenCenter(
                            navigateToScreen = {
                                navController.navigate(route = Order)
                                {
                                    popUpTo<ScreenCenter> { inclusive = false }
                                }
                            }
                        )
                    }
                    composable<Order> {
                        Order(
                            back = { navController.popBackStack() },
                            navigateToOrder = {
                                navController.navigate(route = Pay)
                                {
                                    popUpTo<Order> { inclusive = false }
                                }
                            }
                        )
                    }
                    composable<Pay>
                    {
                        Pay(back = { navController.popBackStack() })
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCustomTheme {
        Greeting("Android")
    }
}


