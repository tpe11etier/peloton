package com.trp.peloton.moshiobjects
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties
//import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
    @field:Json(name = "birthday")
    val birthday: Int?,
    @field:Json(name = "block_explicit")
    val blockExplicit: Boolean?,
    @field:Json(name = "can_charge")
    val canCharge: Boolean?,
    @field:Json(name = "card_expires_at")
    val cardExpiresAt: Any?,
    @field:Json(name = "contract_agreements")
    val contractAgreements: List<ContractAgreement>?,
    @field:Json(name = "created_at")
    val createdAt: Int?,
    @field:Json(name = "created_country")
    val createdCountry: String?,
    @field:Json(name = "customized_heart_rate_zones")
    val customizedHeartRateZones: List<Any>?,
    @field:Json(name = "customized_max_heart_rate")
    val customizedMaxHeartRate: Int?,
    @field:Json(name = "cycling_ftp")
    val cyclingFtp: Int?,
    @field:Json(name = "cycling_ftp_source")
    val cyclingFtpSource: Any?,
    @field:Json(name = "cycling_ftp_workout_id")
    val cyclingFtpWorkoutId: Any?,
    @field:Json(name = "cycling_workout_ftp")
    val cyclingWorkoutFtp: Int?,
    @field:Json(name = "default_heart_rate_zones")
    val defaultHeartRateZones: List<Int>?,
    @field:Json(name = "default_max_heart_rate")
    val defaultMaxHeartRate: Int?,
    @field:Json(name = "email")
    val email: String?,
    @field:Json(name = "estimated_cycling_ftp")
    val estimatedCyclingFtp: Int?,
    @field:Json(name = "external_music_auth_list")
    val externalMusicAuthList: List<ExternalMusicAuth>?,
    @field:Json(name = "facebook_access_token")
    val facebookAccessToken: String?,
    @field:Json(name = "facebook_id")
    val facebookId: String?,
    @field:Json(name = "first_name")
    val firstName: String?,
    @field:Json(name = "gender")
    val gender: String?,
    @field:Json(name = "has_active_device_subscription")
    val hasActiveDeviceSubscription: Boolean?,
    @field:Json(name = "has_active_digital_subscription")
    val hasActiveDigitalSubscription: Boolean?,
    @field:Json(name = "has_signed_waiver")
    val hasSignedWaiver: Boolean?,
    @field:Json(name = "height")
    val height: Int?,
    @field:Json(name = "id")
    val id: String?,
    @field:Json(name = "image_url")
    val imageUrl: String?,
    @field:Json(name = "instructor_id")
    val instructorId: Any?,
    @field:Json(name = "is_complete_profile")
    val isCompleteProfile: Boolean?,
    @field:Json(name = "is_demo")
    val isDemo: Boolean??,
    @field:Json(name = "is_external_beta_tester")
    val isExternalBetaTester: Boolean?,
    @field:Json(name = "is_fitbit_authenticated")
    val isFitbitAuthenticated: Boolean?,
    @field:Json(name = "is_internal_beta_tester")
    val isInternalBetaTester: Boolean?,
    @field:Json(name = "is_profile_private")
    val isProfilePrivate: Boolean?,
    @field:Json(name = "is_provisional")
    val isProvisional: Boolean?,
    @field:Json(name = "is_strava_authenticated")
    val isStravaAuthenticated: Boolean?,
    @field:Json(name = "last_name")
    val lastName: String?,
    @field:Json(name = "last_workout_at")
    val lastWorkoutAt: Int?,
    @field:Json(name = "location")
    val location: String?,
    @field:Json(name = "member_groups")
    val memberGroups: List<Any>?,
    @field:Json(name = "middle_initial")
    val middleInitial: String?,
    @field:Json(name = "name")
    val name: String?,
    @field:Json(name = "obfuscated_email")
    val obfuscatedEmail: String?,
    @field:Json(name = "paired_devices")
    val pairedDevices: List<Any>?,
    @field:Json(name = "phone_number")
    val phoneNumber: String?,
    @field:Json(name = "quick_hits")
    val quickHits: QuickHits?,
    @field:Json(name = "referral_code")
    val referralCode: Any?,
    @field:Json(name = "referrals_made")
    val referralsMade: Int?,
    @field:Json(name = "relationship")
    val relationship: Relationship?,
    @field:Json(name = "streaks")
    val streaks: Streaks?,
    @field:Json(name = "subscription_credits")
    val subscriptionCredits: Int?,
    @field:Json(name = "subscription_credits_used")
    val subscriptionCreditsUsed: Int?,
    @field:Json(name = "total_followers")
    val totalFollowers: Int?,
    @field:Json(name = "total_following")
    val totalFollowing: Int?,
    @field:Json(name = "total_non_pedaling_metric_workouts")
    val totalNonPedalingMetricWorkouts: Int?,
    @field:Json(name = "total_pedaling_metric_workouts")
    val totalPedalingMetricWorkouts: Int?,
    @field:Json(name = "total_pending_followers")
    val totalPendingFollowers: Int?,
    @field:Json(name = "total_workouts")
    val totalWorkouts: Int?,
    @field:Json(name = "username")
    val username: String?,
    @field:Json(name = "v1_referrals_made")
    val v1ReferralsMade: Int?,
    @field:Json(name = "weight")
    val weight: Int?,
    @field:Json(name = "workout_counts")
    val workoutCounts: List<WorkoutCount>?
)