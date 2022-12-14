package com.automatemic.backend.Booking

import com.automatemic.backend.Common.Mappers.BookingDto
import com.automatemic.backend.Common.Models.Booking
import com.automatemic.backend.Customer.CustomerRepository
import com.automatemic.backend.Venue.VenueRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookingService(
    @Autowired
    val bookingRepository: BookingRepository,
    @Autowired
    val venueRepository: VenueRepository,
    @Autowired
    val customerRepository: CustomerRepository,
    @Autowired
    val bookingRepositoryCustom: BookingRepositoryCustom
) {
    fun findById(id: Long) = bookingRepository.findById(id)

    fun save(bookingDto: BookingDto) {
        val venue = venueRepository.findById(bookingDto.venueId).get()
        val customer = customerRepository.findById(bookingDto.customerId).get()
        val entity = Booking(
            venue = venue,
            customer = customer,
            status = true
        )
        bookingRepository.save(entity);
    }

    fun findAll() = bookingRepository.findAll()

    fun findByVenueId(id: Long) = bookingRepositoryCustom.findByVenueId(id)

    fun findByCustomerId(id: Long) = bookingRepositoryCustom.findByCustomerId(id)
}
