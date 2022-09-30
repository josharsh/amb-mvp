package com.automatemic.backend.Common.Models

import lombok.NoArgsConstructor
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "customer")
@NoArgsConstructor
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "name")
    val name: String? = null,

    @Column(name = "status")
    val status: Boolean? = true,

    @Column(name = "email")
    val email: String? = null
    )