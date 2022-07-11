package com.bersk.manga_cart

import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@Validated

class Controller (
    val repository: Repository
        ){
    @GetMapping("/kk")
    fun findById(): Flux<kk> = repository.findAll()


}