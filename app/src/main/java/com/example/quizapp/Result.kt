package com.example.quizapp

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.os.Environment
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.result.*
import java.io.File
import java.util.*

class Result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)


        val totalQuestions = intent.getIntExtra(Generate.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Generate.CORRECT_ANSWERS, 0)
        val myIntent = Intent(this, SecondPage::class.java)
        myIntent.putExtra("score", "correctAnswers")
        val correct = correctAnswers
        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions."
        val currentDate= Calendar.getInstance().time
        val savedScore=correct.toString()
        val sdCardDir= File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS),"User")

        val myfile=File(sdCardDir,"user_score.txt")

        Log.d("Result","Reached the end of file creation")
        myfile.writeText(savedScore)
        btn_finish.setOnClickListener {
            startActivity(Intent(this@Result, SecondPage::class.java))
        }
        // END
    }
}