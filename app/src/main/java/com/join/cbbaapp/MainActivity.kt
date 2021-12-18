package com.join.cbbaapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_start.setOnClickListener {

            if (name.text.toString().isEmpty()) {

                Toast.makeText(this, "なまえをいれてね", Toast.LENGTH_SHORT)
                    .show()

            } else {
                val intent = Intent(this, AllListActivity::class.java)
                startActivity(intent)
                finish()
            }

        }


    }
}