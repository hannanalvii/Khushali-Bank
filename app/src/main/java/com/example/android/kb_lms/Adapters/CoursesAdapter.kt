package com.example.android.kb_lms.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.android.kb_lms.R

public class CoursesAdapter(val mContext:Context, val ItemData:ArrayList<CoursesDataModel>) : RecyclerView.Adapter<CoursesAdapter.Vuholder>() {




    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Vuholder {
        val mView =    LayoutInflater.from(mContext).inflate(R.layout.courses_design,p0,false)
        return Vuholder(mView)
    }

    override fun getItemCount(): Int {
        return ItemData.size
    }

    override fun onBindViewHolder(thisVuholder: Vuholder, position: Int) {
        val courseTitle = ItemData[position].courseTitle
        val courseImg = ItemData[position].courseImg
        val courseDetail = ItemData[position].courseDetail

        thisVuholder.courseImg.setImageDrawable(mContext.resources.getDrawable(courseImg))
        thisVuholder.courseTitle.text = courseTitle
        thisVuholder.courseDetail.text = courseDetail



    }


    class Vuholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val courseTitle: TextView = itemView.findViewById(R.id.titleTextVu)
        val courseImg: ImageView = itemView.findViewById(R.id.courseImg)
        val courseDetail: TextView = itemView.findViewById(R.id.courseDetailTxtvu)
        var btn: Button= itemView.findViewById(R.id.ReadMoreBtn)
    }

}

class CoursesDataModel(val courseTitle:String, val courseImg: Int, val courseDetail: String)
