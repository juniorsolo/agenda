package com.junior.agenda.service;

import com.junior.agenda.collections.Supplier;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SupplierService {
	Flux<Supplier> findAll();
	Mono<Supplier> findById(String id);
	Mono<Supplier> save(Supplier supplier);
}
