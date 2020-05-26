package com.trp.peloton.utils

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


fun getDateTimeFromTimestamp(timestamp: Int?): String {
    return try {
        val format = DateFormat.getDateInstance(DateFormat.LONG)

        val date = timestamp?.times(1000)?.let { Date(it.toString()) }
        format.format(date)

    } catch (ex: Exception) {
        ""
    }
}


fun convertDateToEpoch(date: String?): Long {
    val date = SimpleDateFormat("MM-dd-yyyy").parse(date)
    return date.time
}


class BackendDateAdapter {
    @ToJson
    fun toJson(value: Date): String = FORMATTER.format(value)

    @FromJson
    fun fromJson(value: String): Date = FORMATTER.parse(value)

    companion object {
        private val FORMATTER =
            SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)
    }
}