package com.keith.project.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-29
 **/
@Slf4j
@RestController
@RequestMapping(value = "/order")
public class OrderZkController {

    public static final String PAYMENT_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/zk")
    public String payment (){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/zk",String.class);
    }


}
