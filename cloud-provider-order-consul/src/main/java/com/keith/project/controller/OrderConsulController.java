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
public class OrderConsulController {

    public static final String PAYMENT_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consul")
    public String payment (){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/consul",String.class);
    }


}
