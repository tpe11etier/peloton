package com.trp.peloton.moshiobjects

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class FtpInfo(
    @field:Json(name = "ftp")
    var ftp: Int,
    @field:Json(name = "ftp_source")
    var ftpSource: Any?,
    @field:Json(name = "ftp_workout_id")
    var ftpWorkoutId: Any?
)