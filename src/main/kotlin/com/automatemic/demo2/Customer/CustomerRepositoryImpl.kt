package com.automatemic.demo2.Customer

import org.springframework.stereotype.Repository
import javax.persistence.EntityManager

//@Repository
//class CustomerRepositoryImpl(
//    val entityManager: EntityManager
//) : CustomerRepository {
//    override fun save(customer: Customer) {
//        val query = "select id, name, email, status from Customer";
//        var result = entityManager.createQuery(query, Customer::class.java).resultList as List<Customer>
//        println(result)
//    }
//}