package com.scarazzati.hexagonal.application.ports.out;

import com.scarazzati.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
