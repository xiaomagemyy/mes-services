package com.unilever.hefei.mes.oauth.config;

import com.unilever.hefei.mes.oauth.service.UserService;
import com.unilever.hefei.mes.oauth.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @ClassName Oauth2WebSecurityConfigurer
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/4/2 11:24
 * @Version 1.0
 **/
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    PasswordEncoder passwordEncoder;


    /**
     * 认证管理
     * @return 认证管理对象
     * @throws Exception 认证异常信息
     */
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /**
     * 用户认证规则，即用户传递何种信息才可以登录
     *  UserService.loadUserByUsername 通过传入username，返回我们的user数据，
     *  passwordEncoder 会对user数据中的password进行BCrypt算法加密。
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
//        auth.inMemoryAuthentication()
//                .withUser("admin_1").password(passwordEncoder.encode("123456")).roles("ADMIN")
//                .and()
//                .withUser("user_1").password(passwordEncoder.encode("123456")).roles("USER");

    }

    /**
     * http请求权限
     * @param http http安全对象
     * @throws Exception http安全异常信息
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and().httpBasic()
                .and().cors()
                .and().csrf().disable();
//        http.authorizeRequests()
//                .antMatchers("/user/**").permitAll()
//                .antMatchers("/oauth/**").permitAll()
//                .antMatchers("/api/**").authenticated();
    }

    /**
     * HTTP请求权限
     * @param
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
                "/error",
                "/static/**",
                "/v2/api-docs/**",
                "/swagger-resources/**",
                "/webjars/**",
                "/favicon.ico"
        );
    }
}
