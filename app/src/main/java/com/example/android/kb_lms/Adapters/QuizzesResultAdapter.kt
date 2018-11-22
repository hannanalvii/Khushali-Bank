package com.example.android.kb_lms.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.android.kb_lms.R


public class QuizzesResultAdapter(val mContext: Context, val QuizzesResultData: ArrayList<QuizzesResultDataModel>) :
    RecyclerView.Adapter<QuizzesResultAdapter.Vuholder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Vuholder {
        val mView = LayoutInflater.from(mContext).inflate(R.layout.quizzes_result_deisgn, p0, false)
        return Vuholder(mView)
    }

    override fun getItemCount(): Int {
        return QuizzesResultData.size
    }

    override fun onBindViewHolder(thisVuholder: Vuholder, position: Int) {


        val QuizResultID = QuizzesResultData[position].QuizResultID
        val QuizName = QuizzesResultData[position].QuizName
        val QuizResult = QuizzesResultData[position].QuizResult
        thisVuholder.QuizResultID.text = QuizResultID
        thisVuholder.QuizName.text = QuizName
        thisVuholder.QuizResult.text = QuizResult


    }


    class Vuholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

       val QuizResultID: TextView = itemView.findViewById(R.id.QuizResultID)
        val QuizName: TextView = itemView.findViewById(R.id.QuizName)
        val QuizResult: TextView = itemView.findViewById(R.id.QuizResult)
    }

}

class QuizzesResultDataModel(val QuizResultID: String, val QuizName: String, val QuizResult: String)
