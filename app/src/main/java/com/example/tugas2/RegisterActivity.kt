package com.example.tugas2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val username = findViewById<View>(R.id.username) as EditText

        val signupbtn = findViewById<View>(R.id.signupbtn) as Button

        signupbtn.setOnClickListener {
            val username1 = username.text.toString()
            Toast.makeText(
                this@RegisterActivity,
                "Username is$username1",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
