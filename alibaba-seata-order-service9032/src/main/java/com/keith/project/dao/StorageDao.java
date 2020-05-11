package com.keith.project.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@Mapper
public interface StorageDao {

    /**
     * 扣减库存信息
     * @param productId 产品id
     * @param count  扣减数量
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}