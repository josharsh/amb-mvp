package com.automatemic.backend.Booking

interface BookingRepositoryCustom {
    fun findByVenueId(id: Long): List<Booking>
    fun findByCustomerId(id: Long): List<Booking>
}