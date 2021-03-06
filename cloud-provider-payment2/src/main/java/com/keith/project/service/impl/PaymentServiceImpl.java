package com.keith.project.service.impl;

import com.keith.common.statuscode.ServerResponse;
import com.keith.project.dao.PaymentMapper;
import com.keith.project.service.PaymentService;
import com.keith.project.entity.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-27
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Value("${server.port}")
    private String port;

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public ServerResponse<Payment> getPaymentById(Long id) {
        return ServerResponse.createBySuccess("port："+port,paymentMapper.getPaymentById(id));
    }

    @Override
    public ServerResponse<String> insertPayment(Payment payment) {
        int result=paymentMapper.insertPayment(payment);
        if(result>0){
            return ServerResponse.createBySuccess("port："+port);
        }else{
            return ServerResponse.createByErrorMessage("port："+port);
        }
    }
}
