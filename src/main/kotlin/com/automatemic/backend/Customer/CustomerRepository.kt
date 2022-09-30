package com.automatemic.backend.Customer

import com.automatemic.backend.Common.Models.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<Customer, Long>