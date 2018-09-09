package com.coolapps.goonerpi.timetable.utils

import java.util.*

class StartItemManager {
    companion object {
        val calendar = Calendar.getInstance()!!
        val day = calendar.get(Calendar.DAY_OF_WEEK)
        val week = calendar.get(Calendar.WEEK_OF_YEAR)

        fun resolveStartingItem(): Int {
            val d = when (day) {
                Calendar.MONDAY -> 0
                Calendar.TUESDAY -> 1
                Calendar.WEDNESDAY -> 2
                Calendar.THURSDAY -> 3
                Calendar.FRIDAY -> 4
                else -> 0
            }
            return when(week.rem(2)){
                0 -> d
                else -> d + 5
            }
        }
    }
}