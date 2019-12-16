package backend

import backend.controller.helloWorld
import backend.di.myModule
import io.ktor.application.*
import io.ktor.routing.*
import io.ktor.gson.*
import io.ktor.features.*
import io.ktor.server.engine.commandLineEnvironment
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.koin.ktor.ext.Koin

fun main(args: Array<String>) {
    // start embedded server
    embeddedServer(Netty, commandLineEnvironment(args)).start()
}

/**
 * Main module for install dependencies.
 */
fun Application.main(){
    install(ContentNegotiation){
        gson{}
    }
    // Declare Koin
    install(Koin) {
        modules(myModule)
    }

    routing {
        helloWorld()
    }
}
