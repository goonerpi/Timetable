package com.coolapps.goonerpi.timetable.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.coolapps.goonerpi.timetable.model.entities.TeacherEntity

@Dao
interface TeacherDao: BaseDao<TeacherEntity> {

    @Query("SELECT * from teacherEntity")
    fun getAll(): List<TeacherEntity>

    @Query("DELETE from teacherEntity")
    fun deleteAll()

    @Query("SELECT * from teacherEntity WHERE teacherName LIKE :name LIMIT 1")
    fun findTeacherByName(name: String): TeacherEntity



}