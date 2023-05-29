package com.prilepskiy.SpringTestApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringTestAppApplication

fun main(args: Array<String>) {
	runApplication<SpringTestAppApplication>(*args)
}
