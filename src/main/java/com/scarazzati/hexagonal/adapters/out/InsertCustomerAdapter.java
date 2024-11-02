package com.scarazzati.hexagonal.adapters.out;

import org.springframework.stereotype.Component;

import com.scarazzati.hexagonal.adapters.out.repository.CustomerRepository;
import com.scarazzati.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.scarazzati.hexagonal.application.core.domain.Customer;
import com.scarazzati.hexagonal.application.ports.out.InsertCustomerOutputPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    private final CustomerRepository customerRepository;
    
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
