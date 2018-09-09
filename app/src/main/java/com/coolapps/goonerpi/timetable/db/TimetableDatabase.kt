package com.coolapps.goonerpi.timetable.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.coolapps.goonerpi.timetable.db.dao.*
import com.coolapps.goonerpi.timetable.model.entities.*

@Database(
        entities = [NameEntity::class, SpotEntity::class, TeacherEntity::class, TimeEntity::class, TypeEntity::class],
        version = 1)
abstract class TimetableDatabase : RoomDatabase() {

    companion object {
        private var INSTANCE: TimetableDatabase? = null

        @JvmStatic
        fun getDatabase(context: Context): TimetableDatabase? {
            if (INSTANCE == null) {
                synchronized(TimetableDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                            TimetableDatabase::class.java, "timetable")
                            .allowMainThreadQueries()
                            .build()
                }
            }
            return INSTANCE
        }


        @JvmStatic
        fun destoyInstance() {
            INSTANCE = null
        }


    }

    abstract fun nameDao(): NameDao
    abstract fun spotDao(): SpotDao
    abstract fun teacherDao(): TeacherDao
    abstract fun timeDao(): TimeDao
    abstract fun typeDao(): TypeDao


}