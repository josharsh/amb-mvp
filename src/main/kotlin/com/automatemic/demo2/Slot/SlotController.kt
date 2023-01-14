package com.automatemic.demo2.Slot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@RestController
@RequestMapping(path = ["/slot"])
class SlotController(
    @Autowired
    val slotService: SlotService
    ){
    @GetMapping
    fun findAll() = slotService.findAll()

    @PostMapping
    fun save(@RequestBody slotDto: SlotDto)  = slotService.save(slotDto)

    @GetMapping("/{id}")
    fun findById(@PathVariable(value = "id") id: Long) = slotService.findById(id)
}