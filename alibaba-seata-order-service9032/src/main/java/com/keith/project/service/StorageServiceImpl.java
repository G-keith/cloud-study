package com.keith.project.service;

import com.keith.project.dao.StorageDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@Slf4j
@Service
public class StorageServiceImpl implements StorageService {


    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId, count);
        log.info("------->storage-service中扣减库存结束");
    }
}

