package com.scarazzati.hexagonal.adapters.in.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.scarazzati.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.scarazzati.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.scarazzati.hexagonal.application.ports.in.UpdateCustomerInputPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ReceiveValidateCpfConsumer {

    private final UpdateCustomerInputPort updateCustomerInputPort;

    private final CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics ="tp-cpf-validated", groupId="arantes")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
