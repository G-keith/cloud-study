package com.keith.project.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.keith.common.statuscode.ServerResponse;
import com.keith.project.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-09
 **/
@RestController
@Slf4j
public class CircleBreakerController {

    public static final String SERVICE_URL = "http://nacos-payment-provider";
    @Resource
    private RestTemplate restTemplate;



    @RequestMapping("/consumer/fallback/{id}")
    //@SentinelResource(value = "fallback") //没有配置
    //@SentinelResource(value = "fallback",fallback = "handlerFallback") //fallback只负责业务异常
    //@SentinelResource(value = "fallback",blockHandler = "blockHandler") //blockHandler只负责sentinel控制台配置违规
    @SentinelResource(value = "fallback",fallback = "handlerFallback",blockHandler = "blockHandler",
            exceptionsToIgnore = {NullPointerException.class})//异常忽略，不熔断当前异常
    public String fallback(@PathVariable Long id) {
        String result = restTemplate.getForObject(SERVICE_URL + "/payment/nacos/"+id, String.class,id);

        if (id == 4) {
            throw new IllegalArgumentException ("IllegalArgumentException,非法参数异常....");
        }else {
            if (result == null) {
                throw new NullPointerException ("NullPointerException,该ID没有对应记录,空指针异常");
            }
        }

        return result;
    }

    /**
     * fallback异常
     * @param id id
     * @param e Throwable异常
     * @return 异常返回值
     */
    public String handlerFallback(@PathVariable Long id, Throwable e) {
        Payment payment = new Payment(id,"null");
        return  "兜底异常handlerFallback,exception内容  "+e.getMessage();
    }

    /**
     * blockHandler异常
     * @param id id
     * @param blockException blockHandler异常
     * @return  异常返回值
     */
    public String blockHandler(@PathVariable  Long id, BlockException blockException) {
        return "blockHandler-sentinel限流,无此流水: blockException  "+blockException.getMessage();
    }


}



