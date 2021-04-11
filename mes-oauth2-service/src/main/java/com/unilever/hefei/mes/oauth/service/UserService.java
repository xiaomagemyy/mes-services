package com.unilever.hefei.mes.oauth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.unilever.hefei.mes.oauth.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService extends IService<User> {
    User getByName(String name);

    List<GrantedAuthority> getAuthority(User user);
}
