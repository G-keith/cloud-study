package com.keith;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-30
 **/

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixApplication.class, args);
    }

    /**
     * 为了服务监控而配置，cloud升级后的的坑，ServletRegistrationBean因为springboot默认前缀不是/hystrix.stream，需要自己配置路径
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
