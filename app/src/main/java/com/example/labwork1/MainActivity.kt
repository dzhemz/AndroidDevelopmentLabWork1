package com.example.labwork1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.action).setOnClickListener {
            findViewById<TextView>(R.id.ResultRepresent).text = Logic.action(findViewById<EditText>(R.id.textField).text.toString());
        }
    }
}