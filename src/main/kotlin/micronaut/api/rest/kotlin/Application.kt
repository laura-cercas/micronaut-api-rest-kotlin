package micronaut.api.rest.kotlin


import io.micronaut.runtime.Micronaut

/*object Application {

	@JvmStatic
	fun main(args: Array<String>) {
		Micronaut.run(Application.javaClass)
	}
}*/

fun main(args: Array<String>) {
	Micronaut.build()
		.args(*args)
		.packages("micronaut.api.rest.kotlin")
		.start()
}

