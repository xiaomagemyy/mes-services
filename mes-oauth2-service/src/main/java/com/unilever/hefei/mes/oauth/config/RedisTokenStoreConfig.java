package com.unilever.hefei.mes.oauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

/**
 * @ClassName RedisTokenStoreConfig
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/4/6 13:44
 * @Version 1.0
 **/
@Configuration
public class RedisTokenStoreConfig {
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Bean
    public TokenStore redisTokenStore (){
        return new RedisTokenStore(redisConnectionFactory);
    }
}
