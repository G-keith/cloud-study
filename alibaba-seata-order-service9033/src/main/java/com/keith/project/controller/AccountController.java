package com.keith.project.controller;

import com.keith.common.statuscode.ServerResponse;
import com.keith.project.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     * @return 执行结果
     */
    @RequestMapping("/account/decrease")
    public ServerResponse decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId,money);
        return ServerResponse.createBySuccessMessage("扣减账户余额成功！");
    }
}
