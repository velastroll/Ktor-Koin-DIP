package backend.di

import backend.repository.HelloWorldRepository
import backend.service.HelloWorldService
import backend.service.HelloWorldServiceImpl
import org.koin.dsl.module

/**
 * This module has got the Koin configuration with the declarations of the needed instances.
 * This instances could be injected now, applying the dependency inversion principle.
 */
val myModule = module {
    // Creates a singleton instance of HelloWorldServiceImpl as a HelloWorldService,  auto-injecting it the HelloWorldRepository instance
    single { HelloWorldServiceImpl(get()) as HelloWorldService}
    // Declares a singleton of repository instance
    single { HelloWorldRepository() }
}
