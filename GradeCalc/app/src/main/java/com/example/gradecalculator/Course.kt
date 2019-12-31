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
            var p1 = firstGradeText.text.toString().toInt() *
                    firstWeightText.text.toString().toInt()
            var p2 = secondGradeText.text.toString().toInt() *
                    secondWeightText.text.toString().toInt()
            var p3 = thirdGradeText.text.toString().toInt() *
                    thirdWeightText.text.toString().toInt()
            var p4 = forthGradeText.text.toString().toInt() *
                    forthWeightText.text.toString().toInt()
            var p5 = fifthGradeText.text.toString().toInt() *
                    fifthWeightText.text.toString().toInt()
            resultTextView.text = (p1 + p2 + p3 + p4 + p5).toString()

        }
    }


}