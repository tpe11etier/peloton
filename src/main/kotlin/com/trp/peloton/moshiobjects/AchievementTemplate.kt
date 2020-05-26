package com.trp.peloton.moshiobjects


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AchievementTemplate(
    @field:Json(name = "description")
    var description: String,
    @field:Json(name = "id")
    var id: String,
    @field:Json(name = "image_url")
    var imageUrl: String,
    @field:Json(name = "name")
    var name: String,
    @field:Json(name = "slug")
    var slug: String
)