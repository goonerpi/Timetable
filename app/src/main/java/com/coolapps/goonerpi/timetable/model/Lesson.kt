package com.coolapps.goonerpi.timetable.model


import com.coolapps.goonerpi.timetable.model.entities.*


data class Lesson(val name: NameEntity,
                  val timeStart: TimeEntity,
                  val timeEnd: TimeEntity,
                  val teacher: TeacherEntity,
                  val type: TypeEntity,
                  val spot: SpotEntity)