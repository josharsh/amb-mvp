package com.automatemic.demo2.Booking

import com.automatemic.demo2.Customer.Customer
import com.automatemic.demo2.Venue.Venue
import liquibase.pro.packaged.A
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

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