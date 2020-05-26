package com.trp.peloton.moshiobjects


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Calendar(
    @Json(name = "months")
    var months: List<Month>
)