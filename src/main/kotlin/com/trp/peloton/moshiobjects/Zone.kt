package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Zone(
    @field:Json(name = "display_name")
    var displayName: String?,
    @field:Json(name = "duration")
    var duration: Int?,
    @field:Json(name = "max_value")
    var maxValue: Int?,
    @field:Json(name = "min_value")
    var minValue: Int?,
    @field:Json(name = "range")
    var range: String?,
    @field:Json(name = "slug")
    var slug: String?
)