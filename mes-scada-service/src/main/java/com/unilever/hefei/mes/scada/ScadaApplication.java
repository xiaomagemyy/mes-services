package com.unilever.hefei.mes.scada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ScadaApplication
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/2/25 10:49
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(value = {"com.unilever.hefei.mes.order.api","com.unilever.hefei.mes.basic.api"})
@ComponentScan("com.unilever.hefei.mes")
public class ScadaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScadaApplication.class,args);
    }
}
