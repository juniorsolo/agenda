package com.junior.agenda.service;

import com.junior.agenda.collections.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
	Flux<Customer> findAll();
	Mono<Customer> findById(String id);
	Mono<Customer> save(Customer customer);
}
