package com.example.assignment3
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById(R.id.button) as Button
        val resultText=findViewById(R.id.textView3) as TextView
        val changerText=findViewById(R.id.textView4)as TextView
        val check_to_initialize=findViewById(R.id.checkBox)as CheckBox
        var clicked=0  //when you click the button your text will be change
         btn.setOnClickListener {
            clicked = clicked + 1 //when you push to the button it increases +1
            resultText.text=clicked.toString() //I GAVE TO THE BUTTON listener when you push it it reacts with this method set on clicklistener metho
            changerText.text="Button Clicked" //button clicked
        }

check_to_initialize.setOnClickListener {
    if(check_to_initialize.isChecked){
        Toast.makeText(applicationContext,"Pushed to the Button",Toast.LENGTH_LONG).show()
    }
}
    }



}