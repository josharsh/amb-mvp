package com.automatemic.backend.Venue

import com.automatemic.backend.Common.Mappers.VenueDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/venue"])
class VenueController(
    @Autowired
    val venueService: VenueService
) {
    @GetMapping
    fun findAll() = venueService.findAll()

    @PostMapping
    fun save(@RequestBody venueDto: VenueDto) = venueService.save(venueDto)

    @GetMapping("/{id}")
    fun findById(@PathVariable(value = "id") id: Long) = venueService.findById(id)
}