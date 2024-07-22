package com.junior.agenda.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.junior.agenda.collections.Customer;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String>{

}
