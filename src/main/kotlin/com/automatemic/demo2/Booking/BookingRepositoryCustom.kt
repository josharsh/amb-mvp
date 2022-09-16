package com.automatemic.demo2.Booking

interface BookingRepositoryCustom {
    fun findByVenueId(id: Long): List<Booking>
    fun findByCustomerId(id: Long): List<Booking>
}