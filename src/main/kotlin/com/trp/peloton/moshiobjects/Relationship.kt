package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Relationship(
    @field:Json(name = "me_to_user")
    val meToUser: String?,
    @field:Json(name = "user_to_me")
    val userToMe: String?
)