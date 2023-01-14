package com.automatemic.demo2.Slot

import com.automatemic.demo2.Booking.BookingRepository
import com.automatemic.demo2.Venue.VenueRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Service
class SlotService(
    @Autowired
    val slotRepository: SlotRepository,
    @Autowired
    val venueRepository: VenueRepository,
    @Autowired
    val bookingRepository: BookingRepository
) {
    fun save(slotDto: SlotDto) {
        val venue = venueRepository.findById(slotDto.venueId).get()
        val bookings = bookingRepository.findAllById(slotDto.bookingIds).toList()
        val entity = Slot(
            venue = venue,
            endTime = LocalDateTime.parse(slotDto.endTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME),
            startTime = LocalDateTime.parse(slotDto.startTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME),
            capacity = slotDto.capacity,
            status = slotDto.status,
            date = LocalDate.parse(slotDto.date, DateTimeFormatter.ISO_DATE),
            booking = bookings
        )
        slotRepository.save(entity);
    }

    fun findAll() = slotRepository.findAll()

    fun findById(id: Long) = slotRepository.findById(id)
}