package com.automatemic.demo2.Booking

import com.automatemic.demo2.Customer.Customer
import com.automatemic.demo2.Venue.Venue
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.util.*

@Data
@AllArgsConstructor
@NoArgsConstructor
data class BookingDto(
    val venueId: Long,
    val customerId: Long,
    val status: Boolean? = false
)