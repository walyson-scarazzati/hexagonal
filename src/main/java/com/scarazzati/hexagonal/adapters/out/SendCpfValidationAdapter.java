package com.scarazzati.hexagonal.adapters.out;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.scarazzati.hexagonal.application.ports.out.SendCpfForValidationOutputPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SendCpfValidationAdapter implements SendCpfForValidationOutputPort{

    private KafkaTemplate kafkaTemplate;

    @Override
    public void send(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }

}
