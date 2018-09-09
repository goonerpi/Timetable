package com.coolapps.goonerpi.timetable.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.coolapps.goonerpi.timetable.model.entities.TypeEntity

@Dao
interface TypeDao: BaseDao<TypeEntity> {

    @Query("SELECT * from typeEntity")
    fun getAll(): List<TypeEntity>

    @Query("DELETE from typeEntity")
    fun deleteAll()

    @Query("SELECT * from typeEntity WHERE type LIKE :name LIMIT 1")
    fun findTypeByName(name: String): TypeEntity




}