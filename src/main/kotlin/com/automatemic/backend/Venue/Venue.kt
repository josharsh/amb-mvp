package com.automatemic.backend.Venue

import lombok.NoArgsConstructor
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "venue")
@NoArgsConstructor
data class Venue(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String? = null,

    val email: String? = null,

    val status: Boolean? = true
)