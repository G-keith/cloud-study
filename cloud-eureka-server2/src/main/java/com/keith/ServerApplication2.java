package com.keith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-28
 **/
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication2.class);
    }
}
