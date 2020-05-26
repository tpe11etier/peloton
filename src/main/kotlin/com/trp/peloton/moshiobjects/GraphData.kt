package com.trp.peloton.moshiobjects
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GraphData(
    @field:Json(name = "average")
    var average: List<Int>?,
    @field:Json(name = "lower")
    var lower: List<Int>?,
    @field:Json(name = "upper")
    var upper: List<Int>?
)