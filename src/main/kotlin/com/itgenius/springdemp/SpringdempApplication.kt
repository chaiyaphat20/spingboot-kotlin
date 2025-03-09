package com.itgenius.springdemp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringdempApplication

@RestController
class HelloController {
	@GetMapping("/")
	fun hello() = "Hello Spring Demo2343"
}


fun main(args: Array<String>) {
	runApplication<SpringdempApplication>(*args)
}
