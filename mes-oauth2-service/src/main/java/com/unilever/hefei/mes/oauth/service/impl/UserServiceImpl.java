package com.unilever.hefei.mes.oauth.service.impl;

import com.alibaba.nacos.common.utils.CollectionUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.unilever.hefei.mes.oauth.dao.UserMapper;
import com.unilever.hefei.mes.oauth.model.User;
import com.unilever.hefei.mes.oauth.model.UserExample;
import com.unilever.hefei.mes.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/4/6 16:19
 * @Version 1.0
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByName(String name) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(name);
        List<User> users = userMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(users)){
            return users.get(0);
        }
        return null;

    }

    @Override
    public List<GrantedAuthority> getAuthority(User user) {
        List<GrantedAuthority> list = new ArrayList<>();
        list.add(new SimpleGrantedAuthority("ROLE_USER"));
        return list;
    }


}
