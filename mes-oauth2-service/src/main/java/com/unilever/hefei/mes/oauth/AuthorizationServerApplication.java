package com.unilever.hefei.mes.oauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @ClassName AuthorizationServerApplication
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/4/2 11:21
 * @Version 1.0
 **/
@MapperScan("com.unilever.hefei.mes.oauth.dao")
@SpringBootApplication
@EnableResourceServer
@EnableDiscoveryClient
public class AuthorizationServerApplication {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    public static void main(String[] args) {
        SpringApplication.run(AuthorizationServerApplication.class,args);
    }
}
