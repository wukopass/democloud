package com.example.mqtest;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class MqSenderTest {

    @Autowired
    private AmqpTemplate amqpTemplate;


    @Test
    public void send() {
        amqpTemplate.convertAndSend("myQueue", "nowTime" + new Date());
    }
}
