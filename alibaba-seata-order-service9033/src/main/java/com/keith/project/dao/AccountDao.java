package com.keith.project.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
