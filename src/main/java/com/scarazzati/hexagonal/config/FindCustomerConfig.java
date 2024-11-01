package com.scarazzati.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scarazzati.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.scarazzati.hexagonal.application.core.usercase.FindCustomerByIdUseCase;

@Configuration
public class FindCustomerConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
