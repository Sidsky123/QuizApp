package com.example.quizapp


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.os.Environment
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.result.*
import kotlinx.android.synthetic.main.second_page.*
import java.io.File

class SecondPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_page)
        val buttonClick = findViewById<Button>(R.id.button6)
        buttonClick.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val buttonClick2 = findViewById<Button>(R.id.button)
        buttonClick2.setOnClickListener{
                val intent2 = Intent(this, Quiz::class.java)
                startActivity(intent2)
        }

        val prevscorebtn=findViewById<Button>(R.id.button5)
        prevscorebtn.setOnClickListener{
            var displayText: TextView= findViewById(R.id.textView)
            val sdCardDir= File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS),"User")
            var File_name ="user_score.txt"
            val myFile=File(sdCardDir,File_name)
            if(myFile.exists())
            {
                val prevScore = myFile.readText()
                displayText.setText(prevScore.toString())
            }
            else
            {
                displayText.setText("No Previous Score found")
            }

        }

//        fun ScoreClicked(view:View)
//        {
//
//
//
//        }

//        val intent = intent
//
//        val c = intent.getStringExtra("correctAnswers")
//
//        button5.text = "Previous Score: $c"


    }}