package com.keith.project.entity;

import lombok.Data;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;

}