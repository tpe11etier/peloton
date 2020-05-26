package com.trp.peloton.moshiobjects

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BrowseCategory(
    @field:Json(name ="icon_url")
    var iconUrl: String?,
    @field:Json(name ="id")
    var id: String?,
    @field:Json(name ="list_order")
    var listOrder: Int?,
    @field:Json(name ="name")
    var name: String?,
    @field:Json(name ="portal_image_url")
    var portalImageUrl: String?,
    @field:Json(name ="slug")
    var slug: String?
)