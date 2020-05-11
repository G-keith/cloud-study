package com.keith.project.service;

import com.keith.project.dao.AccountDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@Slf4j
@Service
public class AccountServiceImpl implements AccountService{


    @Resource
    AccountDao accountDao;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {

        log.info("------->account-service中扣减账户余额开始");
        try { TimeUnit.SECONDS.sleep(20); } catch (InterruptedException e) { e.printStackTrace(); }
        accountDao.decrease(userId,money);
        log.info("------->account-service中扣减账户余额结束");
    }
}
