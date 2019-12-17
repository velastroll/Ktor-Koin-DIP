package backend

import backend.domain.HelloWorldUC
import backend.repository.HWRepository
import backend.repository.HelloWorldRepositoryFake
import backend.service.HelloWorldService
import backend.service.HelloWorldServiceImpl
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import kotlin.test.assertTrue

class ApplicationTest {

    @Before
    fun before() {
        // Restarting Koin with test modules
        stopKoin()
        startKoin {
            modules(testModule1)
        }
    }

    @After
    fun after(){
        stopKoin()
    }

    @Test
    fun test(){
        // declares use case
        val useCase = HelloWorldUC()
        println(useCase.saySomething())
        assertTrue { useCase.saySomething().contains("fake") }
    }

}

val testModule1 = module {
    single { HelloWorldRepositoryFake() as HWRepository }
    single { HelloWorldServiceImpl(get()) as HelloWorldService }
}
