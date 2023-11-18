package com.example.kotlinstudy.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinstudy.R
import com.example.kotlinstudy.model.Product
import com.example.kotlinstudy.ui.recyclerview.adapter.ProductsListAdapter
import java.math.BigDecimal

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.productsList)
        recyclerView.adapter = ProductsListAdapter(
            this, listOf(
                Product("Product1", "Description1", BigDecimal("19.99")),
                Product("Product2", "Description2", BigDecimal("19.99"))
            )
        )
    }
}