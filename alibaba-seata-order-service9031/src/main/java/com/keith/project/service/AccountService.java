package com.keith.project.service;

import com.keith.common.statuscode.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@FeignClient(value = "seata-account-service")
public interface AccountService{

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     * @return 执行结果
     */
    @PostMapping(value = "/account/decrease")
    ServerResponse decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
