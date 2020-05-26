package com.trp.peloton.moshiobjects

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Workouts(
    @field:Json(name = "aggregate_stats")
    var aggregateStats: List<Any>?,
    @field:Json(name = "created_at")
    var createdAt: Int?,
    @field:Json(name = "count")
    var count: Int?,
    @field:Json(name = "data")
    var data: List<WorkoutData>?,
    @field:Json(name = "limit")
    var limit: Int?,
    @field:Json(name = "next")
    var next: Next?,
    @field:Json(name = "page")
    var page: Int?,
    @field:Json(name = "page_count")
    var pageCount: Int?,
    @field:Json(name = "show_next")
    var showNext: Boolean?,
    @field:Json(name = "show_previous")
    var showPrevious: Boolean?,
    @field:Json(name = "sort_by")
    var sortBy: String?,
    @field:Json(name = "summary")
    var summary: Summary?,
    @field:Json(name = "total")
    var total: Int?
)