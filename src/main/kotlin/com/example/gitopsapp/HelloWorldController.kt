package com.example.gitopsapp

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(
    @Value("\${foo.bar}") private val str: String
) {

    @GetMapping
    fun helloWorld(): String {
        return str
    }
}
