/*
package com.coolapps.goonerpi.timetable.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.coolapps.goonerpi.timetable.model.Lesson

@Dao
interface LessonDao {
    @Query("SELECT lessonNameShort, spotName, teacherName, time AS timeStart, time AS timeEnd, type from nameentity, spotentity, teacherentity, timeentity, typeentity WHERE lessonNameShort = :name AND spotName = :spot AND teacherName = :teacher AND time = :timeStart AND  time = :timeEnd AND type = :type")
    fun getLesson(name: String, spot: String, teacher: String, timeStart: String, timeEnd: String, type: String): List<Lesson>
}*/
