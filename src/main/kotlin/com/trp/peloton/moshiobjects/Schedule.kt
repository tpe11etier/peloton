package com.trp.peloton.moshiobjects


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Schedule(
    @field:Json(name = "browse_categories")
    var browseCategories: List<BrowseCategory>?,
    @field:Json(name = "class_types")
    var classTypes: List<ClassType>?,
    @field:Json(name = "count")
    var count: Int?,
    @field:Json(name = "data")
    var `data`: List<Data>?,
    @field:Json(name = "equipment")
    var equipment: List<Equipment>?,
    @field:Json(name = "fitness_disciplines")
    var fitnessDisciplines: List<FitnessDiscipline>?,
    @field:Json(name = "instructors")
    var instructors: List<Instructor>?,
    @field:Json(name = "limit")
    var limit: Any?,
    @field:Json(name = "ride_types")
    var rideTypes: List<RideType>?,
    @field:Json(name = "rides")
    var rides: List<Ride>?,
    @field:Json(name = "sort_by")
    var sortBy: String?,
    @field:Json(name = "total")
    var total: Int?
)