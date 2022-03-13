package com.cooffee.catalog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CooffeeCatalogApplication

fun main(args: Array<String>) {
    runApplication<CooffeeCatalogApplication>(*args)
}
