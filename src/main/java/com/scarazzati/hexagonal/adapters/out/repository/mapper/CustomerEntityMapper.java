package com.scarazzati.hexagonal.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import com.scarazzati.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.scarazzati.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
