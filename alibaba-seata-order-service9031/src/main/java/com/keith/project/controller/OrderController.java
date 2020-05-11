package com.keith.project.controller;

import com.keith.common.statuscode.ServerResponse;
import com.keith.project.entity.Order;
import com.keith.project.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public ServerResponse create(Order order) {
        orderService.create(order);
        return ServerResponse.createBySuccessMessage("订单创建成功");
    }
}

