package com.trp.peloton.moshiobjects


//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FitnessDiscipline(
    @field:Json(name = "id")
    var id: String?,
    @field:Json(name = "name")
    var name: String?
)