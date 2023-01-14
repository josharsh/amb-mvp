package com.automatemic.demo2.Slot

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
data class SlotDto(
    val venueId: Long,
    val startTime: String,
    val endTime: String,
    val capacity: Int,
    val bookingIds: List<Long> = listOf(),
    val date: String,
    val status: Boolean
)