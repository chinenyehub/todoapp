package com.chinenye.todoapp

import android.icu.number.NumberFormatter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        usernameDisplay.text = intent.getStringExtra("username")
        profileButton.setOnClickListener {

        }

        usernameDisplay = findViewById(R.id.username)
        usernameDisplay.text = "welcome, ${intent.getStringExtra("name")}"

     }


}
