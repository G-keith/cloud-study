package com.keith.project.service;

import cn.hutool.core.lang.UUID;
import com.keith.project.mq.OrderProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * EnableBinding(Source.class) 定义消息的推送管道
 * @author keith
 * @version 1.0
 * @date 2020-05-06
 **/
@EnableBinding(OrderProcessor.class)
public class MessageProviderImpl implements IMessageProvider {

    /**
     * 消息发送管道
     */
    @Resource
    private OrderProcessor orderProcessor;


    @Override
    public void send() {
        String serial = UUID.randomUUID().toString();
        MessageChannel messageChannel=orderProcessor.outputOrder();
        messageChannel.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: "+serial);
    }
}
