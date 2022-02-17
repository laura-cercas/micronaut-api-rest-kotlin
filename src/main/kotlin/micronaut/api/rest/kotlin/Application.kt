package micronaut.api.rest.kotlin

import io.micronaut.runtime.Micronaut

fun main(args: Array<String>) {
	Micronaut.build()
		.args(*args)
		.packages("micronaut.api.rest.kotlin")
		.start()
}

