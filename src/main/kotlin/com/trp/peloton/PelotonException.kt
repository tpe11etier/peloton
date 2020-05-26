package com.trp.peloton

import java.lang.Exception
import okhttp3.Response

open class PelotonException(message: String): Exception(message)

class PelotonClientError(message: String, response: Response) : PelotonException(message) {
    init {
        println(response.toString())
    }
}

class PelotonRedirectError(message: String, response: Response) : PelotonException(message) {
}

class PelotonServerError(message: String, response: Response) : PelotonException(message) {
}
