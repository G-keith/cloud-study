package com.keith.project.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.keith.common.statuscode.ServerResponse;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-09
 **/
public class CustomerBlockHandler {

    public static ServerResponse handler(BlockException exception) {
        return ServerResponse.createByErrorCodeMessage(444, " 自定义异常，服务不可用");
    }

    public static ServerResponse handler2(BlockException exception) {
        return ServerResponse.createByErrorCodeMessage(444, " 自定义异常，服务不可用2");
    }
}
