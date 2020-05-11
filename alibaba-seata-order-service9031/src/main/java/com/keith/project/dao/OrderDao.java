package com.keith.project.dao;

import com.keith.project.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@Mapper
public interface OrderDao {
    /**
     * /新建订单
     *
     * @param order 订单信息
     */
    void create(Order order);

    /**
     * 修改订单状态，从零改为1
     *
     * @param userId 用户id
     * @param status 订单状态
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}

