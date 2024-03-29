package com.example.locFinder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class LocFinderApplication

	fun main(args: Array<String>) {
		runApplication<LocFinderApplication>(*args)
	}

	@RestController
	class MessageResource {
		@GetMapping
		fun index(): List<Message> = listOf(
			Message("1", "hello!"),
			Message("2", "hola!"),
		)

	}


data class Message(val id:String, val text: String)
