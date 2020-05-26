package com.trp.peloton


import com.trp.peloton.moshiobjects.*
import moshiobjects.*
import retrofit2.Call
import retrofit2.http.*


interface PelotonApiService {
    @Headers("Content-Type: application/json")
    @POST("auth/login")
    fun authenticate(@Body authData: Map<String, String>): Call<AuthResponse>

    @Headers("Content-Type: application/json")
    @GET("api/user/{userId}/workouts")
    fun getWorkouts(@Path ("userId") userId: String): Call<Workouts>

    @Headers("Content-Type: application/json")
    @GET("api/workout/{workoutId}")
    fun getWorkoutsById(@Path("workoutId") workoutId: String): Call<WorkoutData>

    @Headers("Content-Type: application/json")
    @GET("api/workout/{workoutId}/performance_graph")
    fun getPerformanceGraph(@Path("workoutId") workoutId: String): Call<PerformanceGraph>

    @Headers("Content-Type: application/json")
    @GET("api/user/{userId}/calendar")
    fun showCalendar(@Path("userId") userId: String): Call<Calendar>

    @Headers("Content-Type: application/json")
    @GET("api/v3/ride/live?exclude_complete=true&content_provider=studio&exclude_live_in_studio_only=true&browse_category=cycling&start=1588910400&end=1589169599")
    fun showSchedule(): Call<Schedule>
}

