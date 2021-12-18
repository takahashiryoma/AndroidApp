package com.join.cbbaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val totalQuestions = intent.getIntExtra(tangoConstants1.TOTLE_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(tangoConstants1.CORRECT_ANSWERS,0)

        tv_score.text = "あなたの点数は　$correctAnswers / $totalQuestions です"

        btn_finish.setOnClickListener {
            startActivity(Intent(this, AllListActivity::class.java))

        }
    }
}