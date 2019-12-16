package backend.controller

import backend.domain.HelloWorldUC
import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.application
import io.ktor.routing.get

fun Route.helloWorld(){

    // declares use case
    val useCase = HelloWorldUC()

    get("/hello"){
        call.respond(HttpStatusCode.OK, useCase.saySomething())
    }
}
