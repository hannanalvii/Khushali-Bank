package com.example.android.kb_lms

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.android.kb_lms.Adapters.QuizzesAdapter
import com.example.android.kb_lms.Adapters.quizzesDataModel
import kotlinx.android.synthetic.main.activity_take_a_quiz.*

class TakeAQuiz : AppCompatActivity() {



    lateinit var mRecyclerView: RecyclerView
    val QuizzesData = ArrayList<quizzesDataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_a_quiz)




        mRecyclerView = RecyclerView(this)
        quizzesRecyclerView.layoutManager = LinearLayoutManager(this)
        quizzesRecyclerView.adapter = QuizzesAdapter(this, QuizzesData)
        fillTheItemsinArrayList();
    }

    private fun fillTheItemsinArrayList() {

        QuizzesData.add(quizzesDataModel("first quiz"))
        QuizzesData.add(quizzesDataModel("second quiz"))
        QuizzesData.add(quizzesDataModel("third quiz"))
    }
}
