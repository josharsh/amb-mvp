package com.automatemic.backend.Customer

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
data class CustomerDto(
    val name: String?,
    val email: String?
)

public fun CustomerDto.toCustomerEntity(): Customer {
    println("to userEntity")
    val entity = Customer(
        id = 0L,
        name = name,
        email = email
    )
    return entity
}
