package micronaut.api.rest.kotlin

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloController {

    @Get
    fun index(): Welcome {
        return Welcome()
    }
}