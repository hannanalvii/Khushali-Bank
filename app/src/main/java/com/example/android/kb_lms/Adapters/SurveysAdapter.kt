package com.example.android.kb_lms.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.android.kb_lms.R

public class SurveysAdapter(val mContext: Context, val SurveysItemData:ArrayList<SurveysDataModel>) : RecyclerView.Adapter<SurveysAdapter.Vuholder>() {




    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Vuholder {
        val mView =    LayoutInflater.from(mContext).inflate(R.layout.surveys_design,p0,false)
        return Vuholder(mView)
    }

    override fun getItemCount(): Int {
        return SurveysItemData.size
    }

    override fun onBindViewHolder(thisVuholder: Vuholder, position: Int) {


	val SurveysCourseTitle = SurveysItemData[position].SurveysCourseTitle
	thisVuholder.SurveysCourseTitle.text = SurveysCourseTitle



    }


    class Vuholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

       val SurveysCourseTitle: TextView = itemView.findViewById(R.id.SurveysCourseTitle)
    }

}

class SurveysDataModel(val SurveysCourseTitle:String)