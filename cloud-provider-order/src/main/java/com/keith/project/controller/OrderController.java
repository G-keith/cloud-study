package com.keith.project.controller;

import com.keith.common.statuscode.ServerResponse;
import com.keith.project.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-27
 **/
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping(value = "/create")
    public ServerResponse create(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,ServerResponse.class);
    }

    @GetMapping(value = "/get/{id}")
    public ServerResponse getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,ServerResponse.class);
    }
}
