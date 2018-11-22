package com.example.android.kb_lms

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View



class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }



    fun MyCoursesBtn(view: View){
             var intent = Intent(this, MyCourses::class.java)
                     startActivity(intent)
    }


    fun MyQuizzesBtn(view: View){
         var intent = Intent(this, TakeAQuiz::class.java)
                 startActivity(intent)
    }

}
