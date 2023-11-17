package com.example.kotlinstudy

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val view = TextView(this)
        view.text = "Hello world"
        setContentView(view)
    }
}