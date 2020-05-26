package com.trp.peloton.moshiobjects


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WorkoutData(
    @field:Json(name = "achievement_templates")
    var achievementTemplates: List<AchievementTemplate>?,
    @field:Json(name = "created")
    var created: Int?,
    @field:Json(name = "created_at")
    var createdAt: Int?,
    @field:Json(name = "device_time_created_at")
    var deviceTimeCreatedAt: Int?,
    @field:Json(name = "device_type")
    var deviceType: String?,
    @field:Json(name = "device_type_display_name")
    var deviceTypeDisplayName: String?,
    @field:Json(name = "end_time")
    var endTime: Int?,
    @field:Json(name = "fitbit_id")
    var fitbitId: Any?,
    @field:Json(name = "fitness_discipline")
    var fitnessDiscipline: String?,
    @field:Json(name = "ftp_info")
    var ftpInfo: FtpInfo?,
    @field:Json(name = "has_leaderboard_metrics")
    var hasLeaderboardMetrics: Boolean?,
    @field:Json(name = "has_pedaling_metrics")
    var hasPedalingMetrics: Boolean?,
    @field:Json(name = "id")
    var id: String?,
    @field:Json(name = "is_total_work_personal_record")
    var isTotalWorkPersonalRecord: Boolean?,
    @field:Json(name = "leaderboard_rank")
    var leaderboardRank: Int?,
    @field:Json(name = "metrics_type")
    var metricsType: String?,
    @field:Json(name = "name")
    var name: String?,
    @field:Json(name = "peloton_id")
    var pelotonId: String?,
    @field:Json(name = "platform")
    var platform: String?,
    @field:Json(name = "ride")
    var ride: Ride?,
    @field:Json(name = "start_time")
    var startTime: Int?,
    @field:Json(name = "status")
    var status: String?,
    @field:Json(name = "strava_id")
    var stravaId: Any?,
    @field:Json(name = "timezone")
    var timezone: String?,
    @field:Json(name = "title")
    var title: Any?,
    @field:Json(name = "total_leaderboard_users")
    var totalLeaderboardUsers: Int?,
    @field:Json(name = "total_work")
    var totalWork: Double?,
    @field:Json(name = "user_id")
    var userId: String?,
    @field:Json(name = "workout_type")
    var workoutType: String?
)