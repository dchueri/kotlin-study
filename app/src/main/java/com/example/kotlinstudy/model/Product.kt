package com.example.kotlinstudy.model

import java.math.BigDecimal

data class Product (
    val title: String,
    val description: String,
    val price: BigDecimal
)
