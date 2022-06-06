package com.example.gitopsapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitOpsAppApplication

fun main(args: Array<String>) {
    runApplication<GitOpsAppApplication>(*args)
}
