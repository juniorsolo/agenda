package com.junior.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.junior.agenda.collections.Customer;
import com.junior.agenda.service.CustomerService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping(value = "/customer")
	public Flux<Customer> getCustomer(){
		return customerService.findAll();
	}
	
	@GetMapping(value = "/customer/{id}")
	public Mono<Customer> getById(@PathVariable String id) {
		return customerService.findById(id);
	}
	
	@PostMapping(value = "/customer")
	public Mono<Customer> save(@RequestBody Customer customer){
		return customerService.save(customer);
	}
}
