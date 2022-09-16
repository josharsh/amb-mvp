package com.automatemic.demo2.Customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/customer"])
class CustomerController(
    @Autowired
    val customerService: CustomerService
) {
    @GetMapping
    fun findAll() = customerService.findAll()

    @PostMapping
    fun save(@RequestBody customerDto: CustomerDto) = customerService.save(customerDto)

    @GetMapping("/{id}")
    fun findById(@PathVariable(value = "id") id: Long) = customerService.findById(id)
}