package com.automatemic.demo2.Slot

import com.automatemic.demo2.Booking.Booking
import com.automatemic.demo2.Venue.Venue
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Date
import javax.persistence.*

@Entity(name = "slot")
@AllArgsConstructor
class Slot (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne
    @JoinColumn(name = "venueId", referencedColumnName = "id")
    val venue: Venue,

    @Column(name = "startTime")
    val startTime: LocalDateTime,

    @Column(name = "endTime")
    val endTime: LocalDateTime,

    @Column(name="date")
    val date: LocalDate,

    @Column(name = "capacity")
    val capacity: Int,

    @OneToMany(targetEntity=Booking::class, fetch=FetchType.EAGER)
    val booking: List<Booking> = listOf(),

    @Column(name = "status")
    val status: Boolean = true
    )