package com.trp.peloton

import com.squareup.moshi.Moshi
import com.trp.peloton.moshiobjects.*
import moshiobjects.*
import okhttp3.Cookie
import okhttp3.CookieJar
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.List


var cookieJar1: CookieJar = object: CookieJar {
    private val cookieStore = HashMap<String, List<Cookie>>()

  override fun saveFromResponse(url: HttpUrl, cookies:List<Cookie>) {
    cookieStore.put(url.host, cookies)
  }
  override fun loadForRequest(url:HttpUrl):List<Cookie> {
    val cookies = cookieStore.get(url.host)
    return if (cookies != null) cookies else ArrayList<Cookie>()
  }
}

open class ApiFactory {
    val okhttp = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .cookieJar(cookieJar1)
        .build()

    val moshi = Moshi.Builder()
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.onepeloton.com")
        .client(okhttp)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val service = retrofit.create(PelotonApiService::class.java)

    fun getUserId(email: String, password: String): String? {
        val authData = HashMap<String, String>()
        authData.put("username_or_email", email)
        authData.put("password", password)
        val response = ApiFactory().service.authenticate(authData).execute()
        return response.body()?.userId

    }

    fun getWorkouts(userId: String): Response<Workouts> {
        val response = ApiFactory().service.getWorkouts(userId).execute()
        return response

    }

    fun getWorkoutsById(workoutId: String): Response<WorkoutData> {
        val response = ApiFactory().service.getWorkoutsById(workoutId).execute()
        return response
    }

    fun getPerformanceGraph(workoutId: String): Response<PerformanceGraph> {
        val response = ApiFactory().service.getPerformanceGraph(workoutId).execute()
        return response
    }

    fun showCalendar(userId: String): Response<Calendar> {
        return ApiFactory().service.showCalendar(userId).execute()
    }

    fun showSchedule(): Response<Schedule> {
        return ApiFactory().service.showSchedule().execute()
    }

}
