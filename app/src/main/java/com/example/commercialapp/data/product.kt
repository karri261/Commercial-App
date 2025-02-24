package com.example.commercialapp.data

import com.example.commercialapp.R

data class Review(
    val date: String,
    val reviewerName: String,
    val comment: String
)

data class Product(
    val imageUrl: Int,
    val name: String,
    val type: String,
    val price: String,
    val soldQuantity: Float,
    val description: String,
    val rating: Float,
    val reviewCount: Int,
    val reviews: List<Review>
)

val productList = listOf(
    Product(
        R.drawable.product_1_airjordan1,
        "Air Jordan 1 Low",
        "Giày Nam",
        "₫2.450.398",
        1.5f,
        "Lấy cảm hứng từ bản gốc ra mắt vào năm 1985, Air Jordan 1 Low mang đến một cái nhìn cổ điển, sạch sẽ, quen thuộc nhưng luôn luôn tươi mới. " +
                "Với một thiết kế mang tính biểu tượng kết hợp hoàn hảo với bất kỳ 'sự phù hợp nào, những cú đá này đảm bảo bạn sẽ luôn luôn đúng.",
        4.8f,
        320,
        listOf(
            Review("2024-01-15", "Test User 1", "Giày đẹp, chất lượng tốt."),
            Review("2024-01-20", "Test User 2", "Hàng đúng mô tả, đi rất êm.")
        )
    ),
    Product(
        R.drawable.product_2_jordan3retro,
        "Jordan 3 Retro",
        "Giày Nam",
        "₫5.104.997",
        1.5f,
        "Lấy cảm hứng từ bản gốc ra mắt vào năm 1985, Air Jordan 1 Low mang đến một cái nhìn cổ điển, sạch sẽ, quen thuộc nhưng luôn luôn tươi mới. " +
                "Với một thiết kế mang tính biểu tượng kết hợp hoàn hảo với bất kỳ 'sự phù hợp nào, những cú đá này đảm bảo bạn sẽ luôn luôn đúng.",
        4.8f,
        320,
        listOf(
            Review("2024-01-15", "Test User 1", "Giày đẹp, chất lượng tốt."),
            Review("2024-01-20", "Test User 2", "Hàng đúng mô tả, đi rất êm.")
        )
    ),
    Product(
        R.drawable.product_3_airjordan1highg,
        "Air Jordan 1 high G",
        "Giày Golf Nam",
        "₫3.062.998",
        1.2f,
        "Lấy cảm hứng từ bản gốc ra mắt vào năm 1985, Air Jordan 1 Low mang đến một cái nhìn cổ điển, sạch sẽ, quen thuộc nhưng luôn luôn tươi mới. " +
                "Với một thiết kế mang tính biểu tượng kết hợp hoàn hảo với bất kỳ 'sự phù hợp nào, những cú đá này đảm bảo bạn sẽ luôn luôn đúng.",
        4.8f,
        320,
        listOf(
            Review("2024-01-15", "Test User 1", "Giày đẹp, chất lượng tốt."),
            Review("2024-01-20", "Test User 2", "Hàng đúng mô tả, đi rất êm.")
        )
    ),
    Product(
        R.drawable.product_4_jordanpost,
        "Jordan 4 Post",
        "Dép Nam",
        "₫842.324",
        980f,
        "Lấy cảm hứng từ bản gốc ra mắt vào năm 1985, Air Jordan 1 Low mang đến một cái nhìn cổ điển, sạch sẽ, quen thuộc nhưng luôn luôn tươi mới. " +
                "Với một thiết kế mang tính biểu tượng kết hợp hoàn hảo với bất kỳ 'sự phù hợp nào, những cú đá này đảm bảo bạn sẽ luôn luôn đúng.",
        4.8f,
        320,
        listOf(
            Review("2024-01-15", "Test User 1", "Giày đẹp, chất lượng tốt."),
            Review("2024-01-20", "Test User 2", "Hàng đúng mô tả, đi rất êm.")
        )
    ),
    Product(
        R.drawable.product_5_jordanjumpman,
        "Jordan Jumpman",
        "Dép Nam",
        "₫1.148.369",
        1.8f,
        "Lấy cảm hứng từ bản gốc ra mắt vào năm 1985, Air Jordan 1 Low mang đến một cái nhìn cổ điển, sạch sẽ, quen thuộc nhưng luôn luôn tươi mới. " +
                "Với một thiết kế mang tính biểu tượng kết hợp hoàn hảo với bất kỳ 'sự phù hợp nào, những cú đá này đảm bảo bạn sẽ luôn luôn đúng.",
        4.8f,
        320,
        listOf(
            Review("2024-01-15", "Test User 1", "Giày đẹp, chất lượng tốt."),
            Review("2024-01-20", "Test User 2", "Hàng đúng mô tả, đi rất êm.")
        )
    ),
    Product(
        R.drawable.product_6_airjordanmidse,
        "Air Jordan Mid SE",
        "Giày Nam",
        "₫23.828.747",
        1.3f,
        "Lấy cảm hứng từ bản gốc ra mắt vào năm 1985, Air Jordan 1 Low mang đến một cái nhìn cổ điển, sạch sẽ, quen thuộc nhưng luôn luôn tươi mới. " +
                "Với một thiết kế mang tính biểu tượng kết hợp hoàn hảo với bất kỳ 'sự phù hợp nào, những cú đá này đảm bảo bạn sẽ luôn luôn đúng.",
        4.8f,
        320,
        listOf(
            Review("2024-01-15", "Test User 1", "Giày đẹp, chất lượng tốt."),
            Review("2024-01-20", "Test User 2", "Hàng đúng mô tả, đi rất êm.")
        )
    ),
    Product(
        R.drawable.product_7_airjordan1mid,
        "Air Jordan 1 Mid",
        "Giày Nam",
        "₫3.573.747",
        770f,
        "Lấy cảm hứng từ bản gốc ra mắt vào năm 1985, Air Jordan 1 Low mang đến một cái nhìn cổ điển, sạch sẽ, quen thuộc nhưng luôn luôn tươi mới. " +
                "Với một thiết kế mang tính biểu tượng kết hợp hoàn hảo với bất kỳ 'sự phù hợp nào, những cú đá này đảm bảo bạn sẽ luôn luôn đúng.",
        4.8f,
        320,
        listOf(
            Review("2024-01-15", "Test User 1", "Giày đẹp, chất lượng tốt."),
            Review("2024-01-20", "Test User 2", "Hàng đúng mô tả, đi rất êm.")
        )
    ),
    Product(
        R.drawable.product_8_jordanpost,
        "Jordan Post",
        "Dép Nam",
        "₫842.069",
        1.1f,
        "Lấy cảm hứng từ bản gốc ra mắt vào năm 1985, Air Jordan 1 Low mang đến một cái nhìn cổ điển, sạch sẽ, quen thuộc nhưng luôn luôn tươi mới. " +
                "Với một thiết kế mang tính biểu tượng kết hợp hoàn hảo với bất kỳ 'sự phù hợp nào, những cú đá này đảm bảo bạn sẽ luôn luôn đúng.",
        4.8f,
        320,
        listOf(
            Review("2024-01-15", "Test User 1", "Giày đẹp, chất lượng tốt."),
            Review("2024-01-20", "Test User 2", "Hàng đúng mô tả, đi rất êm.")
        )
    ),
)
