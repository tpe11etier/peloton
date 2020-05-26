package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Summary(
    @field:Json(name = "display_name")
    var displayName: String?,
    @field:Json(name = "display_unit")
    var displayUnit: String?,
    @field:Json(name = "slug")
    var slug: String?,
    @field:Json(name = "value")
    var value: Double?
)
