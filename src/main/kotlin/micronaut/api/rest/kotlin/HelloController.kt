package micronaut.api.rest.kotlin

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/hello")
class HelloController {

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    fun index(): Welcome {
        return Welcome()
    }
}