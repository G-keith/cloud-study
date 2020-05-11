package com.keith.project.service;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
public interface StorageService {

    /**
     * 扣减库存信息
     * @param productId 产品id
     * @param count  扣减数量
     */
    void decrease(Long productId, Integer count);
}
