package micronaut.mock

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("micronaut.mock")
                .mainClass(Application.javaClass)
                .start()
    }
}