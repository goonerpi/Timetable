package com.coolapps.goonerpi.timetable.utils

import com.coolapps.goonerpi.timetable.db.TimetableDatabase
import com.coolapps.goonerpi.timetable.model.Lesson

class DbDataManager {

    companion object {

        fun getData(db: TimetableDatabase): Array<List<Lesson>?> {

            val result: Array<List<Lesson>?> = arrayOfNulls(20)

            val lessons = db.nameDao().getAll()
            val spots = db.spotDao().getAll()
            val teachers = db.teacherDao().getAll()
            val times = db.timeDao().getAll()
            val types = db.typeDao().getAll()

            result[0] = listOf(
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "МПЗРС" }!!,
                            timeStart = times.find { it -> it.time == "11:30" }!!,
                            timeEnd = times.find { it -> it.time == "13:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Петряшин Антон Вениаминович" }!!,
                            type = types.find { it -> it.type == "Практика" }!!,
                            spot = spots.find { it -> it.spotName == "102а-3" }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "МПЗРС" }!!,
                            timeStart = times.find { it -> it.time == "13:30" }!!,
                            timeEnd = times.find { it -> it.time == "15:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Петряшин Антон Вениаминович" }!!,
                            type = types.find { it -> it.type == "Практика" }!!,
                            spot = spots.find { it -> it.spotName == "102а-3" }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ТПЗРП" }!!,
                            timeStart = times.find { it -> it.time == "15:15" }!!,
                            timeEnd = times.find { it -> it.time == "16:50" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Кузнецов Андрей Владимирович" }!!,
                            type = types.find { it -> it.type == "Практика" }!!,
                            spot = spots.find { it -> it.spotName == "610-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ТПЗРП" }!!,
                            timeStart = times.find { it -> it.time == "17:00" }!!,
                            timeEnd = times.find { it -> it.time == "18:35" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Кузнецов Андрей Владимирович" }!!,
                            type = types.find { it -> it.type == "Практика" }!!,
                            spot = spots.find { it -> it.spotName == "610-н.к." }!!)
            )

            result[1] = listOf(
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ПАСОИБ" }!!,
                            timeStart = times.find { it -> it.time == "8:00" }!!,
                            timeEnd = times.find { it -> it.time == "9:35" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Жмуров Денис Борисович" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "608-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "МПЗРС" }!!,
                            timeStart = times.find { it -> it.time == "9:45" }!!,
                            timeEnd = times.find { it -> it.time == "11:20" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Петряшин Антон Вениаминович" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "608-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "МРО" }!!,
                            timeStart = times.find { it -> it.time == "11:30" }!!,
                            timeEnd = times.find { it -> it.time == "13:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Мясников Владислав Валерьевич" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "608-н.к." }!!)
            )

            result[2] = listOf(
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "Стеганография" }!!,
                            timeStart = times.find { it -> it.time == "8:00" }!!,
                            timeEnd = times.find { it -> it.time == "9:35" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Федосеев Виктор Андреевич" }!!,
                            type = types.find { it -> it.type == "Лабораторная работа" }!!,
                            spot = spots.find { it -> it.spotName == "611-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "Стеганография" }!!,
                            timeStart = times.find { it -> it.time == "9:45" }!!,
                            timeEnd = times.find { it -> it.time == "11:20" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Федосеев Виктор Андреевич" }!!,
                            type = types.find { it -> it.type == "Лабораторная работа" }!!,
                            spot = spots.find { it -> it.spotName == "611-н.к." }!!)
            )

            result[3] = listOf(
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "МРО" }!!,
                            timeStart = times.find { it -> it.time == "11:30" }!!,
                            timeEnd = times.find { it -> it.time == "13:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Мясников Владислав Валерьевич" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "608-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ОПОИБ" }!!,
                            timeStart = times.find { it -> it.time == "13:30" }!!,
                            timeEnd = times.find { it -> it.time == "15:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Инюшкин Андрей Алексеевич" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "502-14" }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ОПОИБ" }!!,
                            timeStart = times.find { it -> it.time == "15:15" }!!,
                            timeEnd = times.find { it -> it.time == "16:50" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Инюшкин Андрей Алексеевич" }!!,
                            type = types.find { it -> it.type == "Практика" }!!,
                            spot = spots.find { it -> it.spotName == "502-14" }!!)
            )

            result[4] = listOf(
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "РЭЗАС" }!!,
                            timeStart = times.find { it -> it.time == "8:00" }!!,
                            timeEnd = times.find { it -> it.time == "9:35" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Петряшин Антон Вениаминович" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "201-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ТПЗРП" }!!,
                            timeStart = times.find { it -> it.time == "9:45" }!!,
                            timeEnd = times.find { it -> it.time == "11:20" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Кузнецов Андрей Владимирович" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "201-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "Стеганография" }!!,
                            timeStart = times.find { it -> it.time == "11:30" }!!,
                            timeEnd = times.find { it -> it.time == "13:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Федосеев Виктор Андреевич" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "201-н.к." }!!)
            )

            result[5] = listOf(
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ОПОИБ" }!!,
                            timeStart = times.find { it -> it.time == "13:30" }!!,
                            timeEnd = times.find { it -> it.time == "15:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Инюшкин Андрей Алексеевич" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "502-14" }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "МПЗРС" }!!,
                            timeStart = times.find { it -> it.time == "15:15" }!!,
                            timeEnd = times.find { it -> it.time == "16:50" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Петряшин Антон Вениаминович" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "608-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ПАСОИБ" }!!,
                            timeStart = times.find { it -> it.time == "17:00" }!!,
                            timeEnd = times.find { it -> it.time == "18:35" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Жмуров Денис Борисович" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "608-н.к." }!!)
            )

            result[6] = listOf(
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "РЭЗАС" }!!,
                            timeStart = times.find { it -> it.time == "11:30" }!!,
                            timeEnd = times.find { it -> it.time == "13:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Петряшин Антон Вениаминович" }!!,
                            type = types.find { it -> it.type == "Лабораторная работа" }!!,
                            spot = spots.find { it -> it.spotName == "102а-3" }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ОПОИБ" }!!,
                            timeStart = times.find { it -> it.time == "13:30" }!!,
                            timeEnd = times.find { it -> it.time == "15:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Петряшин Антон Вениаминович" }!!,
                            type = types.find { it -> it.type == "Лабораторная работа" }!!,
                            spot = spots.find { it -> it.spotName == "102а-3" }!!)
            )

            result[7] = listOf(
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ПАСОИБ" }!!,
                            timeStart = times.find { it -> it.time == "11:30" }!!,
                            timeEnd = times.find { it -> it.time == "13:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Жмуров Денис Борисович" }!!,
                            type = types.find { it -> it.type == "Лабораторная работа" }!!,
                            spot = spots.find { it -> it.spotName == "102-3" }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ПАСОИБ" }!!,
                            timeStart = times.find { it -> it.time == "13:30" }!!,
                            timeEnd = times.find { it -> it.time == "15:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Жмуров Денис Борисович" }!!,
                            type = types.find { it -> it.type == "Лабораторная работа" }!!,
                            spot = spots.find { it -> it.spotName == "102-3" }!!)
            )

            result[8] = listOf(
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "МРО" }!!,
                            timeStart = times.find { it -> it.time == "8:00" }!!,
                            timeEnd = times.find { it -> it.time == "9:35" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Денисова Анна Юрьевна" }!!,
                            type = types.find { it -> it.type == "Лабораторная работа" }!!,
                            spot = spots.find { it -> it.spotName == "611-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "МРО" }!!,
                            timeStart = times.find { it -> it.time == "9:45" }!!,
                            timeEnd = times.find { it -> it.time == "11:20" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Денисова Анна Юрьевна" }!!,
                            type = types.find { it -> it.type == "Лабораторная работа" }!!,
                            spot = spots.find { it -> it.spotName == "611-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ТПЗРП" }!!,
                            timeStart = times.find { it -> it.time == "11:30" }!!,
                            timeEnd = times.find { it -> it.time == "13:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Кузнецов Андрей Владимирович" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "608-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "ПАСОИБ" }!!,
                            timeStart = times.find { it -> it.time == "13:30" }!!,
                            timeEnd = times.find { it -> it.time == "15:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Жмуров Денис Борисович" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "608-н.к." }!!)
            )

            result[9] = listOf(
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "Стеганография" }!!,
                            timeStart = times.find { it -> it.time == "8:00" }!!,
                            timeEnd = times.find { it -> it.time == "9:35" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Федосеев Виктор Андреевич" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "608-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "РЭЗАС" }!!,
                            timeStart = times.find { it -> it.time == "9:45" }!!,
                            timeEnd = times.find { it -> it.time == "11:20" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Петряшин Антон Вениаминович" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "608-н.к." }!!),
                    Lesson(
                            name = lessons.find { it -> it.lessonNameShort == "РЭЗАС" }!!,
                            timeStart = times.find { it -> it.time == "11:30" }!!,
                            timeEnd = times.find { it -> it.time == "13:05" }!!,
                            teacher = teachers.find { it -> it.teacherName == "Петряшин Антон Вениаминович" }!!,
                            type = types.find { it -> it.type == "Лекция" }!!,
                            spot = spots.find { it -> it.spotName == "608-н.к." }!!)
            )

            result[10] = result[0]

            result[11] = result[1]

            result[12] = result[2]

            result[13] = result[3]

            result[14] = result[4]

            result[15] = result[5]

            result[16] = result[6]

            result[17] = result[7]

            result[18] = result[8]

            result[19] = result[9]

            return result
        }
    }
}