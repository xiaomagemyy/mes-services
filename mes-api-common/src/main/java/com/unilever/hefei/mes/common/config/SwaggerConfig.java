package com.unilever.hefei.mes.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @ClassName swaggerConfig
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/31 16:15
 * @Version 1.0
 **/
//@Configuration
//@EnableSwagger2WebMvc
//@Profile({"dev", "test"})
public class SwaggerConfig {

    @Value("${swagger.base.package}")
    private String basePackage;

    @Value("${swagger.title}")
    private String title;

    @Value("${swagger.description}")
    private String description;

    @Bean
    public Docket buildDocket()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInf())
                .select()
                .apis(RequestHandlerSelectors.basePackage(this.basePackage))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder()
                .title(this.title)
                .description(this.description)
                .build();
    }
}
