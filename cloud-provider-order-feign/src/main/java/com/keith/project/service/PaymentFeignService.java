package com.keith.project.service;

import com.keith.common.statuscode.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-29
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    /**
     * 获取用户信息
     * @param id 主键id
     * @return 用户信息
     */
    @GetMapping(value = "/payment/get/{id}")
    public ServerResponse getPaymentById(@PathVariable("id") Long id);

    /**
     * 超时接口
     * @return 端口号
     */
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}

