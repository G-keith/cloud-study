package com.keith.project.service;

import com.keith.project.entity.Order;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
public interface OrderService {

    /**
     * 创建订单
     * @param order 订单信息
     */
    void create(Order order);

}
