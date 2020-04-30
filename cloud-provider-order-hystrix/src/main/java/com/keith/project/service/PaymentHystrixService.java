package com.keith.project.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-30
 **/
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT-HYSTRIX")
public interface PaymentHystrixService {

    /**
     * 成功接口
     * @param id id
     * @return 线程信息
     */
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id);

    /**
     * 超时接口
     * @param id id
     * @return 线程信息
     */
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id);
}
