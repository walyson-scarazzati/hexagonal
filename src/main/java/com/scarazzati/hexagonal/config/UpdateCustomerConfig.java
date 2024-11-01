package com.scarazzati.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scarazzati.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.scarazzati.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.scarazzati.hexagonal.application.core.usercase.FindCustomerByIdUseCase;
import com.scarazzati.hexagonal.application.core.usercase.UpdateCustomerUseCase;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressByZipCodeAdapter findAddressByZipCodeAdapter, UpdateCustomerAdapter updateCustomerAdapter) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter,updateCustomerAdapter);
    }
}
