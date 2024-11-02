package com.scarazzati.hexagonal.adapters.out;

import org.springframework.stereotype.Component;

import com.scarazzati.hexagonal.adapters.out.repository.CustomerRepository;
import com.scarazzati.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.scarazzati.hexagonal.application.core.domain.Customer;
import com.scarazzati.hexagonal.application.ports.out.UpdateCustomerOutputPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort{

    private final CustomerRepository customerRepository;

    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
