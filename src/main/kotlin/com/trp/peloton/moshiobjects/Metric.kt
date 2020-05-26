package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Metric(
    @field:Json(name = "average_value")
    var averageValue: Double?,
    @field:Json(name = "display_name")
    var displayName: String?,
    @field:Json(name = "display_unit")
    var displayUnit: String?,
    @field:Json(name = "max_value")
    var maxValue: Double?,
    @field:Json(name = "missing_data_duration")
    var missingDataDuration: Int?,
    @field:Json(name = "slug")
    var slug: String?,
    @field:Json(name = "values")
    var values: List<Double>?
)