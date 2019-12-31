package com.example.gradecalculator

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_course.*
import kotlin.text.*;

//new screen (activity)
class Course : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        calcButton.setOnClickListener {
            var sum = firstGradeText.text.toString().toInt() +
                    secondGradeText.text.toString().toInt()
            resultTextView.text = sum.toString()
        }
    }


}