package com.example.commercialapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview

import com.example.commercialapp.ui.theme.CommercialAppTheme
import com.example.commercialapp.data.Product
import com.example.commercialapp.data.productList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CommercialAppTheme {
                AppContent()
            }
        }
    }
}

@Composable
fun AppContent() {
    val selectedProduct = remember { mutableStateOf<Product?>(null) }

    if (selectedProduct.value == null) {
        ProductListScreen(
            products = productList,
            onProductClick = { product ->
                selectedProduct.value = product
            }
        )
        } else {
            ProductDetailScreen(
                product = selectedProduct.value!!,
                onBack = { selectedProduct.value = null }
            )
        }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
}