package com.example.testsuiproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {


    private lateinit var editText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.input_field)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.change_text -> editText.setText("Lalala")
            R.id.switch_text -> {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("input", editText.text.toString())
                startActivity(intent)
            }
        }
    }
}