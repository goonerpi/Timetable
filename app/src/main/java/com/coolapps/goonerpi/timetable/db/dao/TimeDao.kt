package com.coolapps.goonerpi.timetable.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.coolapps.goonerpi.timetable.model.entities.TimeEntity

@Dao
interface TimeDao: BaseDao<TimeEntity> {

    @Query("SELECT * from timeEntity")
    fun getAll(): List<TimeEntity>

    @Query("DELETE from timeEntity")
    fun deleteAll()

    @Query("SELECT * from timeEntity WHERE time LIKE :name LIMIT 1")
    fun findTimeByName(name: String): TimeEntity

}