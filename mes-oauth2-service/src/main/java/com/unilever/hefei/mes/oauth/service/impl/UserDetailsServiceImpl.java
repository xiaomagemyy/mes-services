package com.unilever.hefei.mes.oauth.service.impl;

import com.unilever.hefei.mes.oauth.model.User;
import com.unilever.hefei.mes.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @ClassName UserDetailsServiceImpl
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/4/6 11:11
 * @Version 1.0
 **/
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userService.getByName(userName);

        if(!Objects.isNull(user)){
            //返回oauth2的用户
            return new org.springframework.security.core.userdetails.User(
                    user.getUserName(),
                    user.getPassWord(),
                    AuthorityUtils.createAuthorityList(user.getRole())) ;
        }else{
            throw  new UsernameNotFoundException("用户["+userName+"]不存在");
        }
    }


}
