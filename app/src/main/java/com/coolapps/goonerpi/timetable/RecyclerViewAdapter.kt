package com.coolapps.goonerpi.timetable

import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.coolapps.goonerpi.timetable.model.Lesson
import kotlinx.android.synthetic.main.new_list_item.view.*

class RecyclerViewAdapter(private val lessons: List<Lesson>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int = lessons.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        Log.d("Adapter", "onCreateViewHolder")
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.new_list_item, parent, false)
        return LessonHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("Adapter", "onBindViewHolder pos: $position")
        (holder as LessonHolder).bind(lessons[position])
    }



    class LessonHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(lesson: Lesson) {
            itemView.name.text = lesson.name.lessonNameShort
            itemView.spot.text = lesson.spot.spotName
            itemView.time_start.text = lesson.timeStart.time
            itemView.time_end.text = lesson.timeEnd.time
            itemView.type.background = when (lesson.type.type) {
                "Лекция" -> ContextCompat.getDrawable(itemView.context, R.color.colorLecture)
                "Практика" -> ContextCompat.getDrawable(itemView.context, R.color.colorPractice)
                "Лабораторная работа" -> ContextCompat.getDrawable(itemView.context, R.color.colorLab)
                else -> ContextCompat.getDrawable(itemView.context, R.color.colorPrimary)
            }

        }
    }
}