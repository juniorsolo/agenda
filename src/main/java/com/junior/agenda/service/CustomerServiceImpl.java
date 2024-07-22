package com.junior.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junior.agenda.collections.Customer;
import com.junior.agenda.repository.CustomerRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Override
	public Flux<Customer> findAll() {
		return customerRepo.findAll();
	}

	@Override
	public Mono<Customer> findById(String id) {
		return customerRepo.findById(id);
	}

	@Override
	public Mono<Customer> save(Customer customer) {
		return customerRepo.save(customer);
	}
	
	
}
