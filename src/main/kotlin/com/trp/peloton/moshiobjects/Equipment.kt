package com.trp.peloton.moshiobjects


//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Equipment(
    @field:Json(name = "icon_url")
    var iconUrl: String?,
    @field:Json(name = "id")
    var id: String?,
    @field:Json(name = "name")
    var name: String?,
    @field:Json(name = "slug")
    var slug: String?
)