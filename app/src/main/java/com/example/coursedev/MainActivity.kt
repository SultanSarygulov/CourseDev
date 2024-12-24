package com.example.coursedev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val button = findViewById<Button>(R.id.testButton)
        val text = findViewById<TextView>(R.id.testText)

        button.setOnClickListener {
            Log.d("Hello", "Pressed ")
            text.text = "Pressed"
        }
 
    }
}