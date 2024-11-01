package com.scarazzati.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scarazzati.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.scarazzati.hexagonal.adapters.out.InsertCustomerAdapter;
import com.scarazzati.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.scarazzati.hexagonal.application.core.usercase.InsertCustomerUseCase;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter, InsertCustomerAdapter insertCustomerAdapter, SendCpfValidationAdapter sendCpfValidationAdapter) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
