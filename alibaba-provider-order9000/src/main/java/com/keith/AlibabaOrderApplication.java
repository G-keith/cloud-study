package com.keith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-08
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AlibabaOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaOrderApplication.class, args);
    }
}
