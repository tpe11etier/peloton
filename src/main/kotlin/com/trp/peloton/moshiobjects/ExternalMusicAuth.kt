package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ExternalMusicAuth(
    @field:Json(name = "email")
    val email: Any?,
    @field:Json(name = "provider")
    val provider: String?,
    @field:Json(name = "status")
    val status: String?
)