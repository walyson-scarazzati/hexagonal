package com.scarazzati.hexagonal.adapters.out;

import org.springframework.stereotype.Component;

import com.scarazzati.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.scarazzati.hexagonal.adapters.out.client.mapper.AddressReponseMapper;
import com.scarazzati.hexagonal.application.core.domain.Address;
import com.scarazzati.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort{

    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    private AddressReponseMapper addressReponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressReponseMapper.toAdress(addressResponse);
    }

}
