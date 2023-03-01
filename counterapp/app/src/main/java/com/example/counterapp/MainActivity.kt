package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var counter=0
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.button)
        val button2=findViewById<Button>(R.id.button2)
        val textView=findViewById<TextView>(R.id.textView)
        var increment=1
        button.setOnClickListener{
            counter+=increment
            textView.text=counter.toString()
            if(counter==5){
                button2.visibility=View.VISIBLE
                button2.setOnClickListener{
                    button.text="add2"
                    increment=2
                    counter+=increment
                    textView.text=counter.toString()
                    button2.visibility=View.INVISIBLE
                }

            }

        }
    }
}