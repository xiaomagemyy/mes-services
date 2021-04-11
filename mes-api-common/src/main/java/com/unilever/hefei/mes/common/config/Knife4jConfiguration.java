package com.unilever.hefei.mes.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @ClassName Knife4jConfiguration
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/31 14:27
 * @Version 1.0
 **/
@Configuration
@EnableSwagger2WebMvc
@Profile({"dev", "test"})
public class Knife4jConfiguration {
    @Value("${swagger.base.package}")
    private String basePackage;

    @Value("${swagger.title}")
    private String title;

    @Value("${swagger.description}")
    private String description;

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title(this.title)
                        .description(this.description)
                        .termsOfServiceUrl("http://www.unilever.com/")
                        .contact("949284627@qq.com")
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("2.X版本")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage(this.basePackage))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
