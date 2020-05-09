package com.keith.project.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.keith.common.statuscode.ServerResponse;
import com.keith.project.entity.Payment;
import com.keith.project.handler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-08
 **/
@RestController
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public ServerResponse byResource(@RequestParam(value = "p1", required = false) String p1) {
        return ServerResponse.createBySuccess("按资源名称限流测试OK", new Payment(2020L, "serial001"));
    }

    public ServerResponse handleException(String p1, BlockException exception) {
        return ServerResponse.createByErrorCodeMessage(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public ServerResponse byUrl() {
        return ServerResponse.createBySuccess("按url限流测试OK", new Payment(2020L, "serial001"));
    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handler2")
    public ServerResponse customerBlockHandler() {
        return ServerResponse.createBySuccess("按客户自定义", new Payment(2020L, "serial001"));
    }
}