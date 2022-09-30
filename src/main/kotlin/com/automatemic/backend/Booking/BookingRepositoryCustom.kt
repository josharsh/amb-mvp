package com.automatemic.backend.Booking

import com.automatemic.backend.Common.Models.Booking

interface BookingRepositoryCustom {
    fun findByVenueId(id: Long): List<Booking>
    fun findByCustomerId(id: Long): List<Booking>
}