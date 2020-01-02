package com.example.gradecalculator

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_course.*
import kotlin.text.*;

//new screen (activity)
class Course : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        calcButton.setOnClickListener {

            var p1 = if(firstWeightText.text.toString()=="" || firstGradeText.text.toString()=="")
                    0.0
                    else firstGradeText.text.toString().toDouble() *
                    firstWeightText.text.toString().toDouble()/100

            var p2 = if(secondWeightText.text.toString()=="" || secondGradeText.text.toString()=="")
                    0.0
                    else secondGradeText.text.toString().toDouble() *
                    secondWeightText.text.toString().toDouble()/100

            var p3= if(thirdWeightText.text.toString()=="" || thirdGradeText.text.toString()=="")
                    0.0
                    else thirdGradeText.text.toString().toDouble() *
                    thirdWeightText.text.toString().toDouble()/100

            var p4 = if(forthWeightText.text.toString()=="" || forthGradeText.text.toString()=="")
                    0.0
                    else forthGradeText.text.toString().toDouble() *
                    forthWeightText.text.toString().toDouble()/100

            var p5 = if(fifthWeightText.text.toString()=="" || fifthGradeText.text.toString()=="")
                    0.0
                    else fifthGradeText.text.toString().toDouble() *
                    fifthWeightText.text.toString().toDouble()/100

            resultTextView.text =  String.format("%.3f", p1 + p2 + p3 + p4 + p5)

            Log.d("print", resultTextView.text.toString())
        }

        addEntryButton.setOnClickListener {

        }

    }


}