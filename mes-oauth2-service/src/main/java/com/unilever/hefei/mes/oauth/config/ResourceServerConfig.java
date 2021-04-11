package com.unilever.hefei.mes.oauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @ClassName ResourceServerConfig
 * @Description 配置资源服务器
 * @Author XiaoMaGe
 * @Date 2021/4/6 16:05
 * @Version 1.0
 **/
@EnableResourceServer
@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    public static final String RESOURCE_NAME = "my-resource";

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        //只有基于token的认证才可以访问这些资源
        resources.resourceId(RESOURCE_NAME).stateless(true);
    }
}
