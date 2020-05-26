package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PerformanceGraph(
    @field:Json(name ="average_summaries")
    var averageSummaries: List<AverageSummary>?,
    @field:Json(name ="duration")
    var duration: Float?,
    @field:Json(name ="has_apple_watch_metrics")
    var hasAppleWatchMetrics: Boolean?,
    @field:Json(name ="is_class_plan_shown")
    var isClassPlanShown: Boolean?,
    @field:Json(name ="is_location_data_accurate")
    var isLocationDataAccurate: Any?,
    @field:Json(name ="location_data")
    var locationData: List<Any>?,
    @field:Json(name ="metrics")
    var metrics: List<Metric>?,
    @field:Json(name ="seconds_since_pedaling_start")
    var secondsSincePedalingStart: List<Int>?,
    @field:Json(name ="segment_list")
    var segmentList: List<Segment>?,
    @field:Json(name ="splits_data")
    var splitsData: List<Any>?,
    @field:Json(name ="summaries")
    var summaries: List<Summary>?,
    @field:Json(name ="target_performance_metrics")
    var targetPerformanceMetrics: TargetPerformanceMetrics?
)