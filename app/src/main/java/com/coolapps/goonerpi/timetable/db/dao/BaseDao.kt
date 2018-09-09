package com.coolapps.goonerpi.timetable.db.dao

import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Update

interface BaseDao<in T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(arg: T)

    @Insert
    fun insertList(args: List<T>)

    @Update
    fun update(arg: T)

    @Delete
    fun delete(arg: T)


}