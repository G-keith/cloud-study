package com.keith.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-11
 **/
@Configuration
@MapperScan({"com.keith.project.dao"})
public class MyBatisConfig {
}
