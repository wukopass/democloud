package com.example.servicefeign.message;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MqReceive {
    //2.自動创建队列
   // @RabbitListener(queues = "myQueue")
    //2.自動创建队列
    /*@RabbitListener(queuesToDeclare = @Queue("helloQueue"))
    public void process(String message) {
        System.err.println("MQReceive :{}"+message);
    }*/

}
