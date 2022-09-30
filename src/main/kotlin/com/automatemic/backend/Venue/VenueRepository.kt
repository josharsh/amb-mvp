package com.automatemic.backend.Venue

import com.automatemic.backend.Common.Models.Venue
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VenueRepository : JpaRepository<Venue, Long>