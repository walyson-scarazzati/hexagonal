package com.scarazzati.hexagonal.application.ports.out;

import com.scarazzati.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
