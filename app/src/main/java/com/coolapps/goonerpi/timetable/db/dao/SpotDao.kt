package com.coolapps.goonerpi.timetable.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.coolapps.goonerpi.timetable.model.entities.SpotEntity

@Dao
interface SpotDao: BaseDao<SpotEntity> {

    @Query("SELECT * from spotEntity")
    fun getAll(): List<SpotEntity>

    @Query("DELETE from spotEntity")
    fun deleteAll()

    @Query("SELECT * from spotEntity WHERE spotName LIKE :name LIMIT 1")
    fun findSpotByName(name: String): SpotEntity

}