package com.trp.peloton.moshiobjects


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PairedDevice(
    @field:Json(name = "name")
    var name: String,
    @field:Json(name = "paired_device_type")
    var pairedDeviceType: String,
    @field:Json(name = "serial_number")
    var serialNumber: String
)