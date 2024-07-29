package com.junior.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junior.agenda.collections.Supplier;
import com.junior.agenda.repository.SupplierRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierRepository repo;
	
	@Override
	public Flux<Supplier> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Supplier> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<Supplier> save(Supplier supplier) {
		return  repo.save(supplier);
	}

}
