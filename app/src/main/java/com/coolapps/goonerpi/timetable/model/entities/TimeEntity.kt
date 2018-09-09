package com.coolapps.goonerpi.timetable.model.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class TimeEntity (
        @PrimaryKey
        val id: String,
        val time: String
)