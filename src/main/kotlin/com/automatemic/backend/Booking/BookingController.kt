package com.automatemic.backend.Booking

import com.automatemic.backend.Common.Mappers.BookingDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/booking"])
class BookingController(
    @Autowired
    val bookingService: BookingService
) {
    @GetMapping
    fun findAll() = bookingService.findAll()

    @PostMapping
    fun save(@RequestBody bookingDto: BookingDto) = bookingService.save(bookingDto)

    @GetMapping("/{id}")
    fun findById(@PathVariable(value = "id") id: Long) = bookingService.findById(id)

    @GetMapping("/venue")
    fun findByVenueId(@RequestParam id: Long) = bookingService.findByVenueId(id)

    @GetMapping("/customer")
    fun findByCustomerId(@RequestParam id: Long) = bookingService.findByCustomerId(id)
}