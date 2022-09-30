package com.automatemic.backend.Booking

import com.automatemic.backend.Common.Models.Booking
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookingRepository : JpaRepository<Booking, Long>