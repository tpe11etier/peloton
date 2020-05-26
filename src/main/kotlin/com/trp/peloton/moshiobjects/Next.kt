package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Next(
    @field:Json(name = "created_at")
    var createdAt: Int?,
    @field:Json(name = "workout_id")
    var workoutId: String?
)