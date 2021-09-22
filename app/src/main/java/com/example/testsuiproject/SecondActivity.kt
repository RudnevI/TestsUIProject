package com.example.testsuiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.result_view)
        val data = intent.extras
        textView.text = data?.toString()
    }
}