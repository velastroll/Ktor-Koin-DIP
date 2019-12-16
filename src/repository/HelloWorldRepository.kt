package backend.repository

import backend.model.HWMessage

/**
 * This class represents a simple DB access.
 */
class HelloWorldRepository {
    fun get() : HWMessage = HWMessage(content = "Hello world!")
}
