package com.example.android.kb_lms

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AppCompatViewInflater
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



fun firstbutton(view: View){
     var intent = Intent(this, Main2Activity::class.java)
             startActivity(intent)

}
}
