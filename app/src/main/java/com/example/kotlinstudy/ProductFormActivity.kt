package com.example.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.kotlinstudy.model.Product
import java.math.BigDecimal

class ProductFormActivity : AppCompatActivity(R.layout.activity_product_form) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val saveButton = findViewById<Button>(R.id.save_button)
        saveButton.setOnClickListener {
            val titleField = findViewById<EditText>(R.id.title)
            val title = titleField.text.toString()
            val descritionField = findViewById<EditText>(R.id.description)
            val description = descritionField.text.toString()
            val priceField = findViewById<EditText>(R.id.price)
            val price = priceField.text.toString()
            val handledPrice = if (price.isBlank()) {
                BigDecimal.ZERO
            } else {
                BigDecimal(price)
            }

            val newProduct = Product(
                title,
                description,
                handledPrice
            )

            Log.i("New prod", newProduct.toString())
        }
    }
}