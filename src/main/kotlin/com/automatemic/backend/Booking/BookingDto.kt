package com.automatemic.backend.Booking

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
data class BookingDto(
    val venueId: Long,
    val customerId: Long,
    val status: Boolean? = false
)