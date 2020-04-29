package com.keith.common.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-29
 **/
public interface LoadBalancer {

    /**
     * 收集多少台集群服务器
     * @param instances instances
     * @return ServiceInstance
     */
     ServiceInstance instances(List<ServiceInstance> instances);
}
