package backend.repository

import backend.model.HWMessage


interface HWRepository {
    fun get() : HWMessage
}

/**
 * This class represents a simple DB access.
 */
class HelloWorldRepository : HWRepository {
    override fun get() : HWMessage = HWMessage(content = "Hello world!")
}
