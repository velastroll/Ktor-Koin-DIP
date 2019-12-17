package backend.repository

import backend.model.HWMessage

/**
 * This class represents a simple DB access.
 */
class HelloWorldRepositoryFake : HWRepository {
    override fun get() : HWMessage = HWMessage(content = "Hello fake world!")
}
