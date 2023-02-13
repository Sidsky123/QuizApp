package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.result.*

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
        btn_finish.setOnClickListener {
            startActivity(Intent(this@Result, SecondPage::class.java))
        }
        // END
    }
}