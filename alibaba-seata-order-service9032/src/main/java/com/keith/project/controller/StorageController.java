package com.keith.project.controller;

import com.keith.common.statuscode.ServerResponse;
import com.keith.project.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;


    /**
     * 扣减库存信息
     * @param productId 产品id
     * @param count  扣减数量
     */
    @RequestMapping("/storage/decrease")
    public ServerResponse decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return ServerResponse.createBySuccessMessage("扣减库存成功！");
    }
}
