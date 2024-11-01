package com.scarazzati.hexagonal.adapters.out.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.scarazzati.hexagonal.adapters.out.repository.entity.CustomerEntity;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String>{

}
