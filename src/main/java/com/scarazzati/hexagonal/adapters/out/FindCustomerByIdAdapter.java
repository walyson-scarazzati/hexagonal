package com.scarazzati.hexagonal.adapters.out;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.scarazzati.hexagonal.adapters.out.repository.CustomerRepository;
import com.scarazzati.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.scarazzati.hexagonal.application.core.domain.Customer;
import com.scarazzati.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort{

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

}
