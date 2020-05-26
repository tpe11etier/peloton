package com.trp.peloton


import com.trp.peloton.moshiobjects.*
import retrofit2.Response
import java.io.FileInputStream
import java.io.IOException
import java.nio.file.Paths
import java.util.Properties

open class PelotonAPI {

    private fun getProperty(prop: String): String?{
        val mainProperties = Properties()
        val file: FileInputStream
        val dir = Paths.get("").toAbsolutePath().toString()

        val path = "$dir/src/main/kotlin/com/trp/peloton/pelotonapi.properties"

        //load the file handle for main.properties
        file = FileInputStream(path)

        //load all the properties from this file
        mainProperties.load(file)

        return mainProperties.getProperty(prop)
    }


    var pelotonUsername = (System.getenv("PELOTON_USERNAME") ?: getProperty("config.username")) as String
    var pelotonPassword = (System.getenv("PELOTON_PASSWORD") ?: getProperty("config.password")) as String

    // Hold our user ID (pulled when we authenticate to the API)
    val userId: String?
        get() = ApiFactory().getUserId(pelotonUsername, pelotonPassword)

}



class PelotonWorkout : PelotonAPI() {

    @Throws(IOException::class)
    fun list(): Response<Workouts>? {
        return PelotonAPI().userId?.let { ApiFactory().getWorkouts(it) }
    }

    fun get(workoutId: String): Response<WorkoutData> {
        return ApiFactory().getWorkoutsById(workoutId)
    }

    fun getPerformanceGraph(workoutId: String): Response<PerformanceGraph> {
        return ApiFactory().getPerformanceGraph(workoutId)
    }
}

class PelotonCalendar : PelotonAPI() {
    fun show(): Response<Calendar>? {
        return PelotonAPI().userId?.let { ApiFactory().showCalendar(it) }
    }

}

class PelotonSchedule : PelotonAPI() {
    fun show(): Response<Schedule>? {
        return PelotonAPI().userId?.let { ApiFactory().showSchedule() }
    }
}




