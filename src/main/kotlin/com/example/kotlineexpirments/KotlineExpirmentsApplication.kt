package com.example.kotlineexpirments

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@SpringBootApplication
class KotlineExpirmentsApplication

 fun helloWorld(request: ServerRequest): Mono<ServerResponse> {
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
			.body(BodyInserters.fromObject("Hello World!"));
	}

fun main(args: Array<String>) {
	runApplication<KotlineExpirmentsApplication>(*args)
}
