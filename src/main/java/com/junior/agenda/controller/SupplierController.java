package com.junior.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.junior.agenda.collections.Supplier;
import com.junior.agenda.service.SupplierService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class SupplierController {
	
	@Autowired
	SupplierService service;
	
	@GetMapping(value = "/supplier")
	public Flux<Supplier> getSuppliers(){
		return service.findAll();
	}
	
	@GetMapping(value = "/supplier/{id}")
	public Mono<Supplier> getSupplierById(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping(value = "/supplier")
	public Mono<Supplier> save(@RequestBody Supplier suplier){
		return service.save(suplier);
	}
}
