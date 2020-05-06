package com.keith.project.controller;

import com.keith.common.statuscode.ServerResponse;
import com.keith.project.service.PaymentService;
import com.keith.project.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-27
 **/
@Slf4j
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public ServerResponse<String> create(@RequestBody Payment payment) {
        return paymentService.insertPayment(payment);
    }

    @GetMapping(value = "/get/{id}")
    public ServerResponse<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentService.getPaymentById(id);
    }

    @GetMapping(value = "/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "8001";
    }

    @GetMapping("/zipkin")
    public String paymentZipkin()
    {
        return "hi ,i'am payment zipkin server fall back，welcome to atguigu，O(∩_∩)O哈哈~";
    }

}
