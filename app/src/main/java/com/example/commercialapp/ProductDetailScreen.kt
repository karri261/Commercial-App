package com.example.commercialapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.commercialapp.data.Product
import com.example.commercialapp.data.productList

@Composable
fun ProductDetailHeader(onBack: ()-> Unit) {
    Row (
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        IconButton(onClick = onBack ) {
            Icon(
                painter = painterResource(id = R.drawable.icons_back),
                contentDescription = "back",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.weight(1f))

        IconButton(onClick = { /* TODO */ },
            modifier = Modifier.width(30.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.icons_share),
                contentDescription = "share",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
        }

        Spacer(modifier = Modifier.width(7.dp))

        IconButton(onClick = { /* TODO */ },
            modifier = Modifier.width(40.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.icons_morevert),
                contentDescription = "more",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun ProductDetail(product: Product) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(320.dp)
            .background(Color(0xFFCCCCCC))
    ) {
        Image(
            painter = painterResource(id = product.imageUrl),
            contentDescription = "Product Image",
            modifier = Modifier.fillMaxWidth().height(250.dp),
            contentScale = ContentScale.Crop
        )
    }

    Box (modifier = Modifier.background(Color.White)) {
        Column (modifier = Modifier.padding(16.dp)){
            Row (verticalAlignment = Alignment.CenterVertically) {
                Text(product.price, fontWeight = FontWeight.Bold, fontSize = 22.sp, color = Color(0xFFC5111E))
                Spacer(modifier = Modifier.width(7.dp))

                Icon(
                    painter = painterResource(id = R.drawable.icons_voucher),
                    contentDescription = "",
                    tint = Color(0xFFC5111E),
                    modifier = Modifier.size(17.dp)
                )
                Spacer(modifier = Modifier.weight(1f))

                Text("Đã bán "+ product.soldQuantity +"k", fontSize = 16.sp)
                Spacer(modifier = Modifier.width(7.dp))

                IconButton(onClick = { /* TODO */ },
                    modifier = Modifier.width(22.dp)) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "Yêu thích",
                        tint = Color.Gray,
                        modifier = Modifier.size(17.dp)
                    )
                }
            }

            Text(product.name, fontWeight = FontWeight.Bold, fontSize = 22.sp)
            Spacer(modifier = Modifier.height(5.dp))

            Text(product.type, fontSize = 16.sp, color = Color.Gray)
            Spacer(modifier = Modifier.height(10.dp))

            HorizontalDivider (
                color = Color.Gray,
                thickness = 0.3.dp,
                modifier = Modifier.fillMaxWidth()
            )

            Row (modifier = Modifier.padding(vertical = 10.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.icons_shipment),
                    contentDescription = "",
                    tint = Color(0xFF357A32),
                    modifier = Modifier.size(17.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Giao hàng từ 01/3 - 05/3, Miễn phí vận chuyển", fontSize = 16.sp, color = Color.Gray)
            }

            HorizontalDivider (
                color = Color.Gray,
                thickness = 0.3.dp,
                modifier = Modifier.fillMaxWidth()
            )

            Row (modifier = Modifier.padding(vertical = 10.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.icons_protect),
                    contentDescription = "",
                    tint = Color(0xFFC5111E),
                    modifier = Modifier.size(17.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Trả hàng miễn phí 15 ngày", fontSize = 16.sp, color = Color.Gray)
            }

            HorizontalDivider (
                color = Color.Gray,
                thickness = 0.3.dp,
                modifier = Modifier.fillMaxWidth()
            )

            Row (modifier = Modifier.padding(vertical = 10.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.icons_champion),
                    contentDescription = "",
                    tint = Color(0xFFC5111E),
                    modifier = Modifier.size(17.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))

                Text("Top bán chạy của Air Jordan", fontSize = 16.sp, color = Color.Gray)
            }
        }
    }
    Spacer(modifier = Modifier.height(10.dp))

    Box (modifier = Modifier.background(Color.White)) {
        Column (modifier = Modifier.padding(16.dp)){

            Text("Giới thiệu", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(5.dp))

            HorizontalDivider (
                color = Color.Gray,
                thickness = 0.3.dp,
                modifier = Modifier.fillMaxWidth()
            )

            Text(product.description,
                fontSize = 16.sp,
                color = Color.Gray,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(vertical = 7.dp)
                )
            Spacer(modifier = Modifier.height(10.dp))
        }
    }

    Spacer(modifier = Modifier.height(10.dp))

    Box (modifier = Modifier.background(Color.White)) {
        Column (modifier = Modifier.padding(16.dp)){

            Text("Đánh giá sản phẩm", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(5.dp))

            Row (modifier = Modifier.padding(bottom = 7.dp),
                verticalAlignment = Alignment.CenterVertically){
                repeat(5) {
                    Icon(
                        painter = painterResource(R.drawable.icons_star),
                        contentDescription = "Star",
                        tint = Color(0xFFFA9A00),
                        modifier = Modifier.size(18.dp)
                    )
                }
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "${product.rating} (${product.soldQuantity}k)", fontSize = 14.sp)

                Spacer(modifier = Modifier.weight(1f))

                Text("Tất cả", fontSize = 14.sp)
                IconButton(onClick = { /* TODO */ },
                    modifier = Modifier.width(22.dp).height(22.dp)) {
                    Icon(
                        painter = painterResource(R.drawable.icons_next),
                        contentDescription = "next",
                        tint = Color.Gray,
                        modifier = Modifier.size(17.dp)
                    )
                }

            }

            HorizontalDivider (
                color = Color.Gray,
                thickness = 0.3.dp,
                modifier = Modifier.fillMaxWidth()
            )

            product.reviews.forEach { review ->
                Card(
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
                    modifier = Modifier.fillMaxWidth().padding(8.dp)
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    painter = painterResource(R.drawable.icons_user),
                                    contentDescription = "User Avatar",
                                    tint = Color.Gray,
                                    modifier = Modifier.size(32.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = review.reviewerName,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp
                                )
                            }
                            Text(text = review.date, color = Color.Gray, fontSize = 14.sp)
                        }

                        Spacer(modifier = Modifier.height(4.dp))

                        Row {
                            repeat(5) {
                                Icon(
                                    painter = painterResource(R.drawable.icons_star),
                                    contentDescription = "Star",
                                    tint = Color(0xFFFA9A00),
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(7.dp))

                        Text(
                            text = review.comment,
                            fontSize = 16.sp,
                            color = Color.Gray
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ProductAction() {
    Text("Size", fontWeight = FontWeight.Bold, fontSize = 18.sp,
        modifier = Modifier.padding(start = 12.dp, top = 15.dp))
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp),
        contentPadding = PaddingValues(horizontal = 8.dp)
    ) {

        items(listOf("36", "37", "38", "39", "40", "41", "42", "43", "44")) { size ->
            Box(
                modifier = Modifier
                    .padding(horizontal = 7.dp, vertical = 5.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                    .clickable { }
                    .padding(horizontal = 15.dp, vertical = 7.dp)
            ) {
                Text(size, fontSize = 14.sp)
            }
        }
    }

    Spacer(modifier = Modifier.height(12.dp))

    Row (
        modifier = Modifier.padding(horizontal = 8.dp).padding(bottom = 20.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Button(
            onClick = { /* TODO */ },
            modifier = Modifier.height(50.dp).weight(1f),
            colors = ButtonDefaults.buttonColors(Color.White),
            border = BorderStroke(2.dp, Color.Black)
        ) {
            Text("Thêm vào giỏ", color = Color.Black)
        }
        Spacer(modifier = Modifier.width(16.dp))

        Button(
            onClick = { /* TODO */ },
            modifier = Modifier.height(50.dp).weight(1f),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text("Mua ngay", color = Color.White)
        }
    }

}

@Composable
fun ProductDetailScreen(product: Product, onBack: () -> Unit) {
    Column (modifier = Modifier.fillMaxSize().padding(top = 24.dp)) {
        ProductDetailHeader(onBack = onBack)

        Box(modifier = Modifier.weight(1f)) {
            LazyColumn (modifier = Modifier.fillMaxSize()) {
                item {
                    ProductDetail(product)
                }
            }
        }
        ProductAction()
    }
}