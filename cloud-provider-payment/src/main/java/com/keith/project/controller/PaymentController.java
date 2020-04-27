package com.keith.project.controller;

import com.keith.common.statuscode.ServerResponse;
import com.keith.project.entity.Payment;
import com.keith.project.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
    public ServerResponse<Integer> create(@RequestBody Payment payment) {
        return paymentService.insertPayment(payment);
    }

    @GetMapping(value = "/get/{id}")
    public ServerResponse<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentService.getPaymentById(id);
    }
}
