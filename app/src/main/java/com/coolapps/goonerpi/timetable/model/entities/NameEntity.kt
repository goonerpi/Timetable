package com.coolapps.goonerpi.timetable.model.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
data class NameEntity(
        @PrimaryKey
        val id: String,
        val lessonNameShort: String,
        val lessonNameFull: String
)