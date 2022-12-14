package com.automatemic.backend.Customer

import com.automatemic.backend.Common.Mappers.CustomerDto
import com.automatemic.backend.Common.Mappers.toCustomerEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService(
    @Autowired
    val customerRepository: CustomerRepository
) {
    fun findById(id: Long) = customerRepository.findById(id)

    fun save(userDto: CustomerDto) {
        println("I am here")
        val userEntity = userDto.toCustomerEntity()
        println(userEntity)
        customerRepository.save(userEntity);
    }

    fun findAll() = customerRepository.findAll()
}
