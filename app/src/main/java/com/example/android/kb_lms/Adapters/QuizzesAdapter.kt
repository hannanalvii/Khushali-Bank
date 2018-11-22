package com.example.android.kb_lms.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.android.kb_lms.R

public class QuizzesAdapter(val mContext: Context, val ItemData: ArrayList<quizzesDataModel>) :
    RecyclerView.Adapter<QuizzesAdapter.Vuholder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Vuholder {
        val mView = LayoutInflater.from(mContext).inflate(R.layout.quizzes_design, p0, false)
        return Vuholder(mView)
    }

    override fun getItemCount(): Int {
        return ItemData.size
    }

    override fun onBindViewHolder(thisVuholder: Vuholder, position: Int) {


        val courseTitle = ItemData[position].quizzesCourseTitle
        thisVuholder.courseTitle.text = courseTitle


    }


    class Vuholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val courseTitle: TextView = itemView.findViewById(R.id.quizzesCourseTitle)
    }

}

class quizzesDataModel(val quizzesCourseTitle: String)