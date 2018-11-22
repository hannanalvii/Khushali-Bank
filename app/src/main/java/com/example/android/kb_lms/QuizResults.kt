package com.example.android.kb_lms

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.android.kb_lms.Adapters.QuizzesResultAdapter
import com.example.android.kb_lms.Adapters.QuizzesResultDataModel
import kotlinx.android.synthetic.main.activity_quiz_results.*


class QuizResults : AppCompatActivity() {


    private lateinit var mRecyclerView: RecyclerView
    private val QuizzesResultData = ArrayList<QuizzesResultDataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_results)


        fillTheItemsinArrayList()
        mRecyclerView = RecyclerView(this)
        QuizzesResultRecyclerView.layoutManager = LinearLayoutManager(this)
        QuizzesResultRecyclerView.adapter = QuizzesResultAdapter(this, QuizzesResultData)


    }

    private fun fillTheItemsinArrayList() {
        QuizzesResultData.add(QuizzesResultDataModel("1", "my Course", "100%"))
        QuizzesResultData.add(QuizzesResultDataModel("2", "How to crack a software", "75%"))
        QuizzesResultData.add(QuizzesResultDataModel("3", "How to uninstall a software", "50%"))
    }
}
