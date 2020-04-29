package com.keith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-29
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplicationZk {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationZk.class);
    }
}
