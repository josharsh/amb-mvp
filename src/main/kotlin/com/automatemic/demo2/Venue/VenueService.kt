package com.automatemic.demo2.Venue

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VenueService(
    @Autowired
    val venueRepository: VenueRepository
) {
    fun findById(id: Long) = venueRepository.findById(id)

    fun save(venueDto: VenueDto) {
        println("I am here")
        val userEntity = venueDto.toVenueEntity()
        println(userEntity)
        venueRepository.save(userEntity);
    }

    fun findAll() = venueRepository.findAll()
}
