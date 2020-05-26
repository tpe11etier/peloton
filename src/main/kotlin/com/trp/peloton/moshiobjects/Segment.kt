package com.trp.peloton.moshiobjects
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Segment(
    @field:Json(name = "icon_name")
    var iconName: String?,
    @field:Json(name = "icon_slug")
    var iconSlug: String?,
    @field:Json(name = "icon_url")
    var iconUrl: String?,
    @field:Json(name = "id")
    var id: String?,
    @field:Json(name = "intensity_in_mets")
    var intensityInMets: Double?,
    @field:Json(name = "length")
    var length: Int?,
    @field:Json(name = "metrics_type")
    var metricsType: String?,
    @field:Json(name = "name")
    var name: String?,
    @field:Json(name = "start_time_offset")
    var startTimeOffset: Int?
)