package com.jose.springbootrest.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @RequestMapping
    String index() {
        "Welcome to the Spring Demo App!"
    }

}
