package com.keith.project.dao;

import com.keith.project.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-27
 **/
@Mapper
public interface PaymentMapper {

    /**
     * 获取支付信息
     * @param id 主键id
     * @return 支付信息
     */
    Payment getPaymentById(Long id);

    /**
     * 插入支付信息
     * @param payment 支付信息
     * @return 0失败，1成功
     */
    int insertPayment(Payment payment);
}
