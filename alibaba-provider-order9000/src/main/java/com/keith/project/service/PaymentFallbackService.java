package com.keith.project.service;

import org.springframework.stereotype.Component;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-09
 **/
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public String getPayment(Long id) {
        return "服务降级返回,---PaymentFallbackService";
    }

}
