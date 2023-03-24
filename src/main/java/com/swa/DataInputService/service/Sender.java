package com.swa.DataInputService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Sender {
    @Autowired
    KafkaTemplate<String, Long> kafkaTemplate;
    @Autowired
    DataInputService service;

    public void send(String topic, Long number) {
        kafkaTemplate.send(topic, number);
        System.out.println("Sending Topic:  " + topic + ", Value: " + number);
        service.addMessage("Sending Topic:  " + topic + ", Value: " + number + ", Date Time: " + LocalDateTime.now());
    }
}