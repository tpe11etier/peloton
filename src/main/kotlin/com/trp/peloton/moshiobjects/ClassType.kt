package com.trp.peloton.moshiobjects


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ClassType(
    @field:Json(name = "display_name")
    var displayName: String?,
    @field:Json(name = "fitness_discipline")
    var fitnessDiscipline: String?,
    @field:Json(name = "id")
    var id: String?,
    @field:Json(name = "is_active")
    var isActive: Boolean?,
    @field:Json(name = "list_order")
    var listOrder: Int?,
    @field:Json(name = "name")
    var name: String?
)