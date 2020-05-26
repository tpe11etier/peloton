package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContractAgreement(
    @field:Json(name = "agreed_at")
    val agreedAt: Any?,
    @field:Json(name = "bike_contract_url")
    val bikeContractUrl: String?,
    @field:Json(name = "contract_created_at")
    val contractCreatedAt: Int?,
    @field:Json(name = "contract_id")
    val contractId: String?,
    @field:Json(name = "contract_display_name")
    val contractDisplayName: String?,
    @field:Json(name = "contract_type")
    val contractType: String?,
    @field:Json(name = "tread_contract_url")
    val treadContractUrl: String?
)