package com.example.gradecalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log.d
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        startbutton.setOnClickListener {
            d("hello", "pressed test")
            startActivity(Intent( this, Course::class.java))
        }

        changebutton.setOnClickListener {
            d("change", "Hello ${editText.text}!")
            msg.text = "Hello ${editText.text}!"
        }
    }

}
