package com.trp.peloton.moshiobjects


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Month(
    @field:Json(name = "active_days")
    var activeDays: List<Int>,
    @field:Json(name = "month")
    var month: Int,
    @field:Json(name = "year")
    var year: Int
)