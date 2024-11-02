package com.scarazzati.hexagonal.adapters.out;

import org.springframework.stereotype.Component;

import com.scarazzati.hexagonal.adapters.out.repository.CustomerRepository;
import com.scarazzati.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort{

    private final CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }

}
