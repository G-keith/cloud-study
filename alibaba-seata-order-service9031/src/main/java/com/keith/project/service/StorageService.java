package com.keith.project.service;

import com.keith.common.statuscode.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@FeignClient(value = "seata-storage-service")
public interface StorageService{

    /**
     * 扣减库存信息
     * @param productId 产品id
     * @param count  扣减数量
     */
    @PostMapping(value = "/storage/decrease")
    ServerResponse decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
