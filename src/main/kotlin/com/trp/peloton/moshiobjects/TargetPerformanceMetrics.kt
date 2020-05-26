package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetPerformanceMetrics(
    @field:Json(name = "cadence_time_in_range")
    var cadenceTimeInRange: Int?,
    @field:Json(name = "resistance_time_in_range")
    var resistanceTimeInRange: Int?,
    @field:Json(name = "target_graph_metrics")
    var targetGraphMetrics: List<TargetGraphMetric>?
)