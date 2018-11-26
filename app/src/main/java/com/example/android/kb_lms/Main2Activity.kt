package com.example.android.kb_lms

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AppCompatViewInflater
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Pattern

class Main2Activity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }


    fun secondbtn(view: View){

        var email = findViewById<View>(R.id.emailEditText) as EditText
        var emailText = email.text.toString()





        if(android.util.Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
            var intent = Intent(this, NavDrawer::class.java)
            startActivity(intent)
        }
        else Toast.makeText(this, "enter a valid email", Toast.LENGTH_SHORT).show()
    }



    }


    fun isValid(emailText: String): Boolean {
        val validEmailAddressRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)
        val matcher = validEmailAddressRegex.matcher(emailText)
        return matcher.find()
    }



    fun isEmailValid(email: String): Boolean {
        return Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE
        ).matcher(email).matches()
    }


