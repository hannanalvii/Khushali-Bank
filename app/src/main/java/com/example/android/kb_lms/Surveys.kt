package com.example.android.kb_lms

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.android.kb_lms.Adapters.SurveysAdapter
import com.example.android.kb_lms.Adapters.SurveysDataModel
import kotlinx.android.synthetic.main.activity_surveys.*


class Surveys : AppCompatActivity() {



    lateinit var mRecyclerView: RecyclerView
    val SurveysData = ArrayList<SurveysDataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surveys)
        mRecyclerView = RecyclerView(this)
        SurveysrecyclerView.layoutManager = LinearLayoutManager(this)
        SurveysrecyclerView.adapter = SurveysAdapter(this,SurveysData)
        fillTheItemsinArrayList();


    }

    private fun fillTheItemsinArrayList() {
        SurveysData.add(SurveysDataModel("New Testing Survey"))
        SurveysData.add(SurveysDataModel("Survey Test For Testing"))
    }
}
