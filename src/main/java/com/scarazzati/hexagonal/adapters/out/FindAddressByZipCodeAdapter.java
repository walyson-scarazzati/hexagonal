package com.scarazzati.hexagonal.adapters.out;

import org.springframework.stereotype.Component;

import com.scarazzati.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.scarazzati.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.scarazzati.hexagonal.application.core.domain.Address;
import com.scarazzati.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort{

    private final FindAddressByZipCodeClient findAddressByZipCodeClient;

    private final AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
