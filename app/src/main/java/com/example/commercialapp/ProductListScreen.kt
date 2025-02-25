package com.example.commercialapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.commercialapp.data.Product
import com.example.commercialapp.data.productList

@Composable
fun ProductListHeader() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /* TODO */ }) {
            Icon(Icons.Default.Menu, contentDescription = "Menu")
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .height(40.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Color.White)
                .padding(horizontal = 8.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Row (verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search Icon",
                    tint = Color.LightGray
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(text = "Tìm kiếm", color = Color.LightGray)
            }
        }
    }
    Row (
        modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.padding(8.dp)) {
            Column {
                Text(
                    text = "Giày thể thao",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "8 kết quả tìm thấy", color = Color.Gray, fontSize = 14.sp)
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Box {
            Row (
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(onClick = { /* TODO */ },
                    modifier = Modifier.width(30.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.icons_sort),
                        contentDescription = "Sắp xếp",
                        tint = Color.Black,
                        modifier = Modifier.size(23.dp)
                    )
                }
                IconButton(onClick = { /* TODO */ },
                    modifier = Modifier.width(30.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.icons_filter),
                        contentDescription = "Lọc",
                        tint = Color.Black,
                        modifier = Modifier.size(23.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ProductItem(product: Product, onClick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .clickable { onClick() }
            .padding(10.dp)
            .width(170.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = product.imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(text = product.name, fontSize = 16.sp, maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                color = Color.Black,
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(7.dp))

            Row (verticalAlignment = Alignment.CenterVertically) {
                Text(text = product.type, fontSize = 14.sp)
                Spacer(modifier = Modifier.weight(1f))
                Text("${product.rating}", fontSize = 14.sp)
                Spacer(modifier = Modifier.width(3.dp))
                Icon(
                    painter = painterResource(R.drawable.icons_star),
                    contentDescription = "Star",
                    tint = Color(0xFFFA9A00),
                    modifier = Modifier.size(14.dp)
                )
            }

            Spacer(modifier = Modifier.height(7.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = product.price,
                    fontSize = 15.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.weight(1f))

                IconButton(onClick = { /* TODO */ },
                    modifier = Modifier.width(30.dp)) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "Yêu thích",
                        tint = Color.Gray,
                        modifier = Modifier.size(17.dp)
                    )
                }
                Spacer(modifier = Modifier.width(5.dp),)
                IconButton(onClick = { /* TODO */ },
                    modifier = Modifier.width(30.dp)) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Thêm vào giỏ hàng",
                        tint = Color.Gray,
                        modifier = Modifier.size(17.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun NavBar() {
    Row (modifier = Modifier
        .fillMaxWidth()
        .background(Color.Black)
        .padding(bottom = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        IconButton(onClick = { /* TODO */ },
            modifier = Modifier.width(30.dp)
        ) {
            Icon(painter = painterResource(
                id = R.drawable.icons_home),
                contentDescription = "home",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
        IconButton(onClick = { /* TODO */ },
            modifier = Modifier.width(30.dp)
        ) {
            Icon(painter = painterResource(
                id = R.drawable.icons_cart),
                contentDescription = "cart",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
        IconButton(onClick = { /* TODO */ },
            modifier = Modifier.width(30.dp)
        ) {
            Icon(painter = painterResource(
                id = R.drawable.icons_chat),
                contentDescription = "chat",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
        IconButton(onClick = { /* TODO */ },
            modifier = Modifier.width(30.dp)
        ) {
            Icon(painter = painterResource(
                id = R.drawable.icons_bell),
                contentDescription = "notify",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
        IconButton(onClick = { /* TODO */ },
            modifier = Modifier.width(30.dp)
        ) {
            Icon(painter = painterResource(
                id = R.drawable.icons_person),
                contentDescription = "my",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun ProductListScreen(products: List<Product>, onProductClick: (Product) -> Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(top = 24.dp)) {
        ProductListHeader()

        Box (modifier = Modifier.weight(1f)) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(productList) { product ->
                    ProductItem (
                        product = product,
                        onClick = { onProductClick(product) })
                }
            }
        }

        NavBar()
    }
}