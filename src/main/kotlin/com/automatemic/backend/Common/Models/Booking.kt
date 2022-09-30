package com.automatemic.backend.Common.Models

import lombok.NoArgsConstructor
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity(name = "booking")
@NoArgsConstructor
data class Booking(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne
    @JoinColumn(name = "venueId", referencedColumnName = "id")
    val venue: Venue? = null,
    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    val customer: Customer? = null,

    val status: Boolean? = true
)