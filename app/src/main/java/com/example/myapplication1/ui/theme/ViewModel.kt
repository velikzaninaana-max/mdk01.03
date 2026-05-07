package com.example.myapplication1.ui.theme

import androidx.lifecycle.ViewModel
import com.example.myapplication1.ui.theme.PR11.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class ScreenListViewModel : ViewModel(){
    private  val _categories = MutableStateFlow<List<String>>(listOf("Популярные", "Covid", "Комплексные", "Избранные"))
    val categories: StateFlow<List<String>> = _categories.asStateFlow()

    private  val _product = MutableStateFlow<List<Product>>(listOf(
        Product("ПЦР-тест на определение РНК коронавируса стандартный", 2, 1800),
        Product("Клинический анализ крови с лейкоцитарной формулой", 1, 690),
        Product("Биохимический анализ крови, базовый", 1, 2440),
        Product("СОЭ (венозная кровь)", 1, 240),
        Product("ПЦР-тест на определение РНК коронавируса стандартный", 2, 1800),
        Product("Клинический анализ крови с лейкоцитарной формулой", 1, 690),
        Product("Биохимический анализ крови, базовый", 1, 2440),
        Product("СОЭ (венозная кровь)", 1, 240)))
    val product: StateFlow<List<Product>> = _product.asStateFlow()
}