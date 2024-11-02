package com.scarazzati.hexagonal.application.core.usecase;

import com.scarazzati.hexagonal.application.core.domain.Customer;
import com.scarazzati.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.scarazzati.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort{
    
    private FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id).orElseThrow(()-> new RuntimeException("Customer not found"));
    }

}
