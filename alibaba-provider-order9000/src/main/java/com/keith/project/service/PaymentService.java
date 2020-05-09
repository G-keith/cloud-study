package com.keith.project.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-09
 **/
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Long id);
}
