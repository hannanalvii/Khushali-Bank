package com.example.android.kb_lms

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.android.kb_lms.Adapters.CoursesAdapter
import com.example.android.kb_lms.Adapters.CoursesDataModel
import kotlinx.android.synthetic.main.activity_my_courses.*

class MyCourses : AppCompatActivity() {




    lateinit var mRecyclerView: RecyclerView
    val CoursesData = ArrayList<CoursesDataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_courses)

        mRecyclerView = RecyclerView(this)
        coursesRecyclerView.layoutManager = LinearLayoutManager(this)
        coursesRecyclerView.adapter = CoursesAdapter(this, CoursesData)
        fillTheItemsinArrayList();



    }

    private fun fillTheItemsinArrayList() {
        CoursesData.add(
            CoursesDataModel(
                "First Course",
                R.drawable.logo,
                "This is the first course"
            )
        )
        CoursesData.add(CoursesDataModel("Second", R.drawable.logo, "This is the second course"))
    }


}
