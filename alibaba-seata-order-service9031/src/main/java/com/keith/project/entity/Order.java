package com.keith.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;

    /**
     *用户id
     */
    private Long userId;

    /**
     *产品id
     */
    private Long productId;

    /**
     *数量
     */
    private Integer count;

    /**
     *账号余额
     */
    private BigDecimal money;

    /**
     *订单状态：0：创建中；1：已完结
     */
    private Integer status;
}