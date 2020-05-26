package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Streaks(
    @field:Json( name = "best_weekly")
    val bestWeekly: Int?,
    @field:Json( name = "current_weekly")
    val currentWeekly: Int?,
    @field:Json( name = "start_date_of_current_weekly")
    val startDateOfCurrentWeekly: Int?
)