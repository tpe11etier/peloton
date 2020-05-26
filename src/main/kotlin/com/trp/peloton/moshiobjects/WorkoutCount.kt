package com.trp.peloton.moshiobjects

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WorkoutCount(
    @field:Json(name = "count")
    val count: Int?,
    @field:Json(name = "icon_url")
    val iconUrl: String?,
    @field:Json(name = "name")
    val name: String?,
    @field:Json(name = "slug")
    val slug: String?
)