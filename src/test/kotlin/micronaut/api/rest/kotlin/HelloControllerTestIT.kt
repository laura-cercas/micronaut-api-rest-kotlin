package micronaut.api.rest.kotlin

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


@MicronautTest
class HelloControllerTestIT {

    @Inject
    @field:Client("/")
    lateinit var client : HttpClient

    @Test
    fun `should return welcome object equals Hello World`(){
        val request: HttpRequest<Any> = HttpRequest.GET("/hello")
        val result = client.toBlocking().retrieve(request, Welcome::class.java)

        assertEquals(Welcome(), result)
    }
}