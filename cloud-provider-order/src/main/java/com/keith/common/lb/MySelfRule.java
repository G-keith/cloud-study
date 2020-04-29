package com.keith.common.lb;

import com.keith.common.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 自定义Rule规则
 * @author keith
 * @version 1.0
 * @date 2020-04-29
 **/
@Component
public class MySelfRule implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 服务器坐标
     * @return 坐标
     */
    private int getAndIncrement(){
        //第一个参数是期望值，第二个参数是修改值是
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*******第几次访问，次数next: "+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
