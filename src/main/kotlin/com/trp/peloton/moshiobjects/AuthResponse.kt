package com.trp.peloton.moshiobjects


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuthResponse(
    @field:Json(name = "session_id")
    var sessionId: String,
    @field:Json(name = "user_data")
    var userData: UserData,
    @field:Json(name = "user_id")
    var userId: String
)