package com.coolapps.goonerpi.timetable.utils

import android.widget.ImageView
import com.coolapps.goonerpi.timetable.R
import com.coolapps.goonerpi.timetable.model.Lesson
import com.squareup.picasso.Picasso

class TeacherImageManager {
    companion object {
        fun setImage(lesson: Lesson, imageView: ImageView) {
            when (lesson.teacher.photo) {
                "" -> Picasso.get()
                        .load(R.drawable.ic_picasso_on_error)
                        .error(R.drawable.ic_picasso_on_error)
                        .into(imageView)

                else -> Picasso.get()
                        .load(lesson.teacher.photo)
                        .fit()
                        .centerCrop()
                        .error(R.drawable.ic_picasso_on_error)
                        .into(imageView)
            }
        }
    }

}