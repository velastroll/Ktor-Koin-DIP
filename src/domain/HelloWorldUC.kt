package backend.domain

import backend.service.HelloWorldService
import org.koin.core.KoinComponent
import org.koin.core.inject

/**
 * This class represents the logic layer of the system.
 * This class has an usage of services which should be injected if implements the required interface.
 */
class HelloWorldUC : KoinComponent{

    // injects service
    val hwService : HelloWorldService by inject()

    fun saySomething() : String = "UC: ${hwService.getHelloWorld()}"

}
