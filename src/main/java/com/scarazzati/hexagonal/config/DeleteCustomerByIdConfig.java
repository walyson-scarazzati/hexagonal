package com.scarazzati.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scarazzati.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.scarazzati.hexagonal.application.core.usercase.DeleteCustomerByIdUseCase;
import com.scarazzati.hexagonal.application.core.usercase.FindCustomerByIdUseCase;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerByIdAdapter deleteCustomerByIdAdapter) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
