package com.chinenye.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val validusername = "admin"
    val validpassword = "admin"

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var  summitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.UserNameInput)
        passwordInput = findViewById(R.id.PasswordInput)
        summitButton = findViewById(R.id.SummitButton)

        summitButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            login(username, password)
        }
    }
    private fun login(username: String, password:String){
     if(isValidCreditials(username, password))  {
         val intent =Intent(this, HomeActivity::class.java)
         intent.putExtra("name", username)
         startActivity(intent)

     } else{
         Toast.makeText(applicationContext,"keep trying",Toast.LENGTH_SHORT).show()
     }
    }

    private fun isValidCreditials(username: String, password: String):Boolean{

        if(username == validusername && password == validpassword)return true
        return false
    }
}