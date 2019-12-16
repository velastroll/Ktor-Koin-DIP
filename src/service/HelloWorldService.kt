package backend.service

import backend.repository.HelloWorldRepository

/**
 * This interface is the requested interface by the domain layer.
 * The service which want to be used in the domain layer should implement this interface.
 */
interface HelloWorldService {
    fun getHelloWorld() : String
}

/**
 * This class is the implementation of the requested interface.
 * This class is the [KoinComponent] child, so it could be injected.
 */
class HelloWorldServiceImpl(private val repository: HelloWorldRepository) : HelloWorldService{
    override fun getHelloWorld(): String {
        return "> ${repository.get().content}"
    }
}
