package com.scarazzati.hexagonal.adapters.out.client.mapper;

import org.mapstruct.Mapper;

import com.scarazzati.hexagonal.adapters.out.client.response.AddressResponse;
import com.scarazzati.hexagonal.application.core.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressReponseMapper {

    Address toAdress(AddressResponse addressResponse);
}
