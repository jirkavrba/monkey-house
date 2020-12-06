package dev.vrba.monkeyhouse

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MonkeyHouseApplication

fun main(args: Array<String>) {
    runApplication<MonkeyHouseApplication>(*args)
}
