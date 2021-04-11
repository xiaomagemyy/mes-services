package com.unilever.hefei.mes.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName OrderApplication
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/2/23 16:00
 * @Version 1.0
 **/
@MapperScan("com.unilever.hefei.mes.order.dao")
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.unilever.hefei.mes")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
