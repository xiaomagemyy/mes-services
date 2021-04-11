package com.unilever.hefei.mes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName SecurityApplication
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/1 16:05
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("com.unilever.hefei.mes.dao")
public class SecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class,args);
    }
}
