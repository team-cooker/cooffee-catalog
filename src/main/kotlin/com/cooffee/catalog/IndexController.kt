package com.cooffee.catalog

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.RequestMethod.HEAD
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @RequestMapping(
        value = ["/healthcheck"],
        method = [GET, HEAD],
    )
    fun healthcheck() = Unit
}
