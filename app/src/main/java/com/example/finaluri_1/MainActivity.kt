package com.example.finaluri_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var login:Button
    lateinit var signup:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login=findViewById(R.id.login)
        signup=findViewById(R.id.signup)

        signup.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        login.setOnClickListener{
            Toast.makeText(this,"Register", Toast.LENGTH_LONG).show()
        }
    }
}

