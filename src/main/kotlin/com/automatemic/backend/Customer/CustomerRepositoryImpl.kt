package com.automatemic.backend.Customer

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