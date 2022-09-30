package com.automatemic.backend.Booking

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager

@Repository
class BookingRepositoryCustomImpl(
    @Autowired
    val entityManager: EntityManager
) : BookingRepositoryCustom{
    override fun findByVenueId(id: Long): List<Booking> {
        val query = "select * from booking b where b.venue_id=:venueId"
        val nativeQuery = entityManager.createNativeQuery(query, Booking::class.java)
        nativeQuery.setParameter("venueId", id)
        return nativeQuery.resultList as List<Booking>
    }

    override fun findByCustomerId(id: Long): List<Booking> {
        val query = "select * from booking b where b.customer_id=:customerId"
        val nativeQuery = entityManager.createNativeQuery(query, Booking::class.java)
        nativeQuery.setParameter("customerId", id)
        return nativeQuery.resultList as List<Booking>
    }
}