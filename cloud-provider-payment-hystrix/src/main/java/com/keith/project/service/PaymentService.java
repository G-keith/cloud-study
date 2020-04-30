package com.keith.project.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-30
 **/
@Service
public class PaymentService {

    /**
     * 成功接口
     * @param id id
     * @return 线程信息
     */
    public String paymentInfoOk(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK,id：  "+id+"\t"+"哈哈哈"  ;
    }

    /**
     * 超时接口
     * @param id id
     * @return 线程信息
     */
    public String paymentInfoTimeOut(Integer id){
        int timeNumber = 3;
        try { TimeUnit.SECONDS.sleep(timeNumber); }catch (Exception e) {e.printStackTrace();}
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：  "+id+"\t"+"呜呜呜"+" 耗时(秒)"+timeNumber;
    }

}
