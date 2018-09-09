package com.coolapps.goonerpi.timetable.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.coolapps.goonerpi.timetable.model.entities.NameEntity

@Dao
interface NameDao : BaseDao<NameEntity> {

    @Query("SELECT * from nameEntity")
    fun getAll(): List<NameEntity>

    @Query("DELETE from nameEntity")
    fun deleteAll()

    @Query("SELECT * from nameEntity WHERE lessonNameShort LIKE :nameShort LIMIT 1")
    fun findLessonByShortName(nameShort: String): NameEntity


}