package com.keith.project.controller;

import com.keith.project.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-08
 **/
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/nacos/{id}")
    public String getPayment(@PathVariable("id") Long id) {
        return "nacos registry, serverPort: " + serverPort + "\t id" + paymentService.getPaymentById(id).getData().getSerial();
    }
}
