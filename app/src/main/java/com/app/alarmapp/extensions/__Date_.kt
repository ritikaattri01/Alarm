package com.app.alarmapp.extensions

import java.text.SimpleDateFormat
import java.util.*

fun String.to12HFormattedTime(from: String = "H:mm", to: String = "hh:mm a"): String? {
    return try {
        val sdf = SimpleDateFormat(from, Locale.ENGLISH)
        val dateObj = sdf.parse(this)!!
        SimpleDateFormat(to, Locale.ENGLISH).format(dateObj)
    } catch (exception: Exception) {
        ""
    }
}

fun formattedDate(date: Date): String? {
    return try {
        val formatter = SimpleDateFormat("hh:mm a")
        val formattedDate = formatter.format(date)
        formattedDate
    } catch (exception: Exception) {
        ""
    }
}