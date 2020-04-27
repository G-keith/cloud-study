package com.keith.project.service;

import com.keith.common.statuscode.ServerResponse;
import com.keith.project.entity.Payment;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-27
 **/
public interface PaymentService {

    /**
     * 获取支付信息
     * @param id 主键id
     * @return 支付信息
     */
    ServerResponse<Payment>  getPaymentById(Long id);

    /**
     * 插入支付信息
     * @param payment 支付信息
     * @return 0失败，1成功
     */
    ServerResponse<Integer>  insertPayment(Payment payment);
}
