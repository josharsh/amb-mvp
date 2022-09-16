package com.automatemic.demo2.Venue

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
data class VenueDto(
    val name: String?,
    val email: String?
)

fun VenueDto.toVenueEntity() =
     Venue(
         id = 0L,
         name = name,
         email = email
    )

