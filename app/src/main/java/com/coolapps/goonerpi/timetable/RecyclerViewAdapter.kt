package com.coolapps.goonerpi.timetable

import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.coolapps.goonerpi.timetable.model.Lesson
import com.coolapps.goonerpi.timetable.utils.TeacherImageManager
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

        fun bind(lesson: Lesson) = with(lesson) {
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
            itemView.setOnClickListener {

                val snackbar = Snackbar.make(it, "", 4000)

                val layout = snackbar.view as Snackbar.SnackbarLayout

                val textView = layout.findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
                textView.visibility = View.INVISIBLE


                val mInflater = LayoutInflater.from(itemView.context)
                val snackView = mInflater.inflate(R.layout.popup_window, null)

                val imageView = snackView.findViewById(R.id.teacher_photo) as ImageView
                val teacherName = snackView.findViewById(R.id.teacher_name) as TextView
                val lessonName = snackView.findViewById(R.id.lesson_fullname) as TextView
                val lessonType = snackView.findViewById(R.id.lesson_type) as TextView


                snackbar.addCallback(object : Snackbar.Callback() {
                    override fun onDismissed(snackbar: Snackbar?, event: Int) {
                        super.onDismissed(snackbar, event)
                        it.name.setTextColor(ContextCompat.getColor(it.context, R.color.colorPrimaryDark))
                    }
                })

                layout.setOnClickListener { snackbar.dismiss() }

                teacherName.text = lesson.teacher.teacherName
                it.name.setTextColor(ContextCompat.getColor(it.context, R.color.colorAccent))
                lessonName.text = lesson.name.lessonNameFull
                lessonType.text = lesson.type.type

                TeacherImageManager.setImage(lesson, imageView)


                layout.setPadding(0, 0, 0, 0)
                layout.addView(snackView, 0)

                snackbar.show()


            }

        }
    }
}