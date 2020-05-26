package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class QuickHits(
    @field:Json(name = "incline_shortcuts")
    val inclineShortcuts: Any?,
    @field:Json(name = "quick_hits_enabled")
    val quickHitsEnabled: Boolean?,
    @field:Json(name = "speed_shortcuts")
    val speedShortcuts: Any?
)