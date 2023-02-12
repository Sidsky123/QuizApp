package com.example.quizapp


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_page)
        val buttonClick = findViewById<Button>(R.id.button6)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}
        val buttonClick2 = findViewById<Button>(R.id.button)
        buttonClick2.setOnClickListener {
                val intent2 = Intent(this, Quiz::class.java)
                startActivity(intent2)


    }
}}