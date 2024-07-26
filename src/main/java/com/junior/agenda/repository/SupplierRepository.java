package com.junior.agenda.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.junior.agenda.collections.Supplier;

public interface SupplierRepository extends ReactiveMongoRepository<Supplier, String> {

}
