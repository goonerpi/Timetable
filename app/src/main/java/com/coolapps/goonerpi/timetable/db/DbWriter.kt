package com.coolapps.goonerpi.timetable.db

import com.coolapps.goonerpi.timetable.app.App
import com.coolapps.goonerpi.timetable.model.entities.*
import org.jetbrains.anko.doAsync
import java.util.UUID.randomUUID


object DbWriter {

    fun writeDataToDatabase() {
        doAsync {
            App.database = TimetableDatabase.getDatabase(App.applicationContext())!!
            App.database.clearAllTables()

            if (App.database.nameDao().getAll().isEmpty()) {
                val list = listOf(
                        NameEntity(randomUUID().toString(), "ПАСОИБ", "Программно-аппаратные средства обеспечения информационной безопасности"),
                        NameEntity(randomUUID().toString(), "МПЗРС", "Методы проектирования защищённых распределённых систем"),
                        NameEntity(randomUUID().toString(), "МРО", "Методы распознавания образов"),
                        NameEntity(randomUUID().toString(), "ТПЗРП", "Технология построения защищённых распределённых приложений"),
                        NameEntity(randomUUID().toString(), "ОПОИБ", "Организационное и правовое обеспечение информационной безопасности"),
                        NameEntity(randomUUID().toString(), "РЭЗАС", "Разработка и эксплуатация защищённых автоматизированных систем"),
                        NameEntity(randomUUID().toString(), "Стеганография", "Компьютерная стеганография")
                )
                App.database.nameDao().insertList(list)

            }
            if (App.database.timeDao().getAll().isEmpty()) {
                val list = listOf(
                        TimeEntity(randomUUID().toString(), "8:00"),
                        TimeEntity(randomUUID().toString(), "9:35"),
                        TimeEntity(randomUUID().toString(), "9:45"),
                        TimeEntity(randomUUID().toString(), "11:20"),
                        TimeEntity(randomUUID().toString(), "11:30"),
                        TimeEntity(randomUUID().toString(), "13:05"),
                        TimeEntity(randomUUID().toString(), "13:30"),
                        TimeEntity(randomUUID().toString(), "15:05"),
                        TimeEntity(randomUUID().toString(), "15:15"),
                        TimeEntity(randomUUID().toString(), "16:50"),
                        TimeEntity(randomUUID().toString(), "17:00"),
                        TimeEntity(randomUUID().toString(), "18:35")
                )
                App.database.timeDao().insertList(list)


            }
            if (App.database.teacherDao().getAll().isEmpty()) {
                val list = listOf(
                        TeacherEntity(randomUUID().toString(), "Жмуров Денис Борисович"),
                        TeacherEntity(randomUUID().toString(), "Петряшин Антон Вениаминович"),
                        TeacherEntity(randomUUID().toString(), "Федосеев Виктор Андреевич"),
                        TeacherEntity(randomUUID().toString(), "Денисова Анна Юрьевна"),
                        TeacherEntity(randomUUID().toString(), "Инюшкин Андрей Алексеевич"),
                        TeacherEntity(randomUUID().toString(), "Кузнецов Андрей Владимирович"),
                        TeacherEntity(randomUUID().toString(), "Мясников Владислав Валерьевич"),
                        TeacherEntity(randomUUID().toString(), "Терентьев Валентин Андреевич")
                )
                App.database.teacherDao().insertList(list)

            }
            if (App.database.typeDao().getAll().isEmpty()) {
                val list = listOf(
                        TypeEntity(randomUUID().toString(), "Лекция"),
                        TypeEntity(randomUUID().toString(), "Практика"),
                        TypeEntity(randomUUID().toString(), "Лабораторная работа")
                )
                App.database.typeDao().insertList(list)

            }
            if (App.database.spotDao().getAll().isEmpty()) {
                val list = listOf(
                        SpotEntity(randomUUID().toString(), "608-н.к."),
                        SpotEntity(randomUUID().toString(), "102а-3"),
                        SpotEntity(randomUUID().toString(), "610-н.к."),
                        SpotEntity(randomUUID().toString(), "611-н.к."),
                        SpotEntity(randomUUID().toString(), "502-14"),
                        SpotEntity(randomUUID().toString(), "201-н.к."),
                        SpotEntity(randomUUID().toString(), "102-3")
                )
                App.database.spotDao().insertList(list)
            }


        }
    }
}