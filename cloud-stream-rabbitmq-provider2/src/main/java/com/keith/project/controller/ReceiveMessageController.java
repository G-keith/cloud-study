package com.keith.project.controller;

import com.keith.project.mq.OrderProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-06
 **/
@EnableBinding(OrderProcessor.class)
public class ReceiveMessageController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(OrderProcessor.INPUT_ORDER)
    public void input(Message<String> message){
        System.out.println(serverPort+":"+message.getPayload());

    }
}
