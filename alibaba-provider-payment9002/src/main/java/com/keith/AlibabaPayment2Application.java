package com.keith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-08
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPayment2Application {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaPayment2Application.class, args);
    }
}
