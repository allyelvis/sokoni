package com.sokoni

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SokoniApplication

fun main(args: Array<String>) {
    runApplication<SokoniApplication>(*args)
}
