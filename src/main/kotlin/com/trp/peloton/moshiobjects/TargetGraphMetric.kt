package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetGraphMetric(
    @field:Json(name = "average")
    var average: Int?,
    @field:Json(name = "graph_data")
    var graphData: GraphData?,
    @field:Json(name = "max")
    var max: Int?,
    @field:Json(name = "min")
    var min: Int?,
    @field:Json(name = "type")
    var type: String?
)