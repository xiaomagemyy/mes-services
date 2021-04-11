package com.unilever.hefei.mes.oauth.config;

import com.unilever.hefei.mes.oauth.service.UserService;
import com.unilever.hefei.mes.oauth.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import javax.sql.DataSource;


/**
 * @ClassName Oauth2AuthorizationServerConfigurer
 * @Description 授权/认证服务器配置
 * @Author XiaoMaGe
 * @Date 2021/4/2 11:22
 * @Version 1.0
 **/
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfigurer extends AuthorizationServerConfigurerAdapter {

    private static final String JWT_SINGING_KEY = "my-sign-key-xxxxxx";

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    //认证管理器
    @Autowired
    private AuthenticationManager authentionManager;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    /**
     * access_token存储器
     * 这里存储在数据库，大家可以结合自己的业务场景考虑将access_token存入数据库还是redis
     */
    @Bean
    public TokenStore tokenStore() {
        return new RedisTokenStore(redisConnectionFactory);
    }

    /**
     * 从数据库读取clientDetails相关配置
     * 有InMemoryClientDetailsService 和 JdbcClientDetailsService 两种方式选择
     */
    @Bean
    public ClientDetailsService clientDetails() {
        return new JdbcClientDetailsService(dataSource);
    }


    /**
     * @description: 限制客户端访问认证接口的权限
     * @params: [security]
     * @return: void
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.allowFormAuthenticationForClients() //支持请求数据通过表单的形式发送
                .tokenKeyAccess("permitAll()")
                .checkTokenAccess("permitAll()");
//        security.allowFormAuthenticationForClients();
//        security.checkTokenAccess("isAuthenticated()");
//        security.tokenKeyAccess("isAuthenticated()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(clientDetailsService());
    }

    /**
     * @description: redis token方式
     * @params: [endpoints]
     * @return: void
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(new RedisTokenStore(redisConnectionFactory)) //配置token存储信息
                .accessTokenConverter(jwtAccessTokenConverter()) //配置jwt
                .authenticationManager(authentionManager) //配置认证
                .userDetailsService(userDetailsService) //配置用户信息
                .allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST); //支持OAUTH相关接口以GET和POST方法请求
    }

    /**
     * 数据库读取client的相关数据
     * 主要表：oauth_client_details
     *
     * 注意：这里需要重命名bean name，否则会提示 clientDetailsService 无法被override
     * @return
     */
    @Bean(name = "oauthClientDetailsService")
    public JdbcClientDetailsService clientDetailsService() {
        return new JdbcClientDetailsService(dataSource);
    }

    /**
     * 生成JWT
     *
     * @return
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey(JWT_SINGING_KEY);
        return converter;
    }
}
