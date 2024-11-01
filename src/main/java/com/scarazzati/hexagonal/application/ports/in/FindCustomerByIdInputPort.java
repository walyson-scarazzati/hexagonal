package com.scarazzati.hexagonal.application.ports.in;

import com.scarazzati.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
