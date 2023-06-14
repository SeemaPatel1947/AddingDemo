package com.seema.addingdemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Text1=findViewById<EditText>(R.id.editText1)
        val Text2=findViewById<EditText>(R.id.editText2)
        val Button=findViewById<Button>(R.id.button1)
        val Text3=findViewById<EditText>(R.id.editText3)
        Button.setOnClickListener {
            val num1=Text1.text.toString().toInt()
            val num2=Text2.text.toString().toInt()
            val result=num1+num2
            Text3.setText( "Answer is =  "+result.toString())


        }



    }
}