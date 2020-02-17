package com.jose.springbootrest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringbootrestApplication {

    static void main(String[] args) {
        SpringApplication.run(SpringbootrestApplication, args)
        println("Server Started ...")
    }

}
