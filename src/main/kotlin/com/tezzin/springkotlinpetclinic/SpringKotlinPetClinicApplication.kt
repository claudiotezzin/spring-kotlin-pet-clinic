package com.tezzin.springkotlinpetclinic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinPetClinicApplication

fun main(args: Array<String>) {
    runApplication<SpringKotlinPetClinicApplication>(*args)
}
