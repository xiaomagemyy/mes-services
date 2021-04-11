package com.unilever.hefei.mes.basic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @ClassName BasicApplication
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/26 13:30
 * @Version 1.0
 **/
@MapperScan("com.unilever.hefei.mes.basic.dao")
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.unilever.hefei.mes")
@EnableFeignClients(value = "com.unilever.hefei.mes.order.api")
public class BasicApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class,args);
    }
}
