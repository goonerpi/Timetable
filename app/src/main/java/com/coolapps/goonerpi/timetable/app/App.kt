package com.coolapps.goonerpi.timetable.app

import android.app.Application
import android.content.Context
import com.coolapps.goonerpi.timetable.db.DbWriter
import com.coolapps.goonerpi.timetable.db.TimetableDatabase


class App : Application() {


    companion object {
        private var instance: App? = null

        lateinit var database: TimetableDatabase

        fun getInstance(): App? {
            return instance
        }

        fun applicationContext(): Context {
            return instance!!.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        DbWriter.writeDataToDatabase()

    }

}