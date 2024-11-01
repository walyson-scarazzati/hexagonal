package com.scarazzati.hexagonal.application.ports.in;

import com.scarazzati.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
