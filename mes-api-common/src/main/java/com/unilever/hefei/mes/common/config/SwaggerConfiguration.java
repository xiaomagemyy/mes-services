package com.unilever.hefei.mes.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @ClassName SwaggerConfiguration
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/31 15:03
 * @Version 1.0
 **/
//@Configuration
//@EnableSwagger2WebMvc
//@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfiguration {
    @Value("${swagger.base.package}")
    private String basePackage;

    @Value("${swagger.title}")
    private String title;

    @Value("${swagger.description}")
    private String description;

    @Bean(value = "userApi")
    @Order(value = 1)
    public Docket groupRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(groupApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(this.basePackage))
                .paths(PathSelectors.any())

                .build();
    }

    private ApiInfo groupApiInfo(){
        return new ApiInfoBuilder()
                .title(this.title)
//                .description("<div style='font-size:14px;color:red;'>swagger-bootstrap-ui-demo RESTful APIs</div>")
                .description(this.description)
                .termsOfServiceUrl("http://www.group.com/")
                .contact("group@qq.com")
                .version("1.0")
                .build();
    }
}
