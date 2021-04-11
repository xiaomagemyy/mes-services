package com.unilever.hefei.mes.oauth.controller;

import com.unilever.hefei.mes.oauth.dao.UserMapper;
import com.unilever.hefei.mes.oauth.model.User;
import com.unilever.hefei.mes.oauth.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/4/2 15:47
 * @Version 1.0
 **/
@RestController
@RequestMapping("/oauth")
@Slf4j
public class UserController {
    @Autowired
    private UserService  userService;

    @GetMapping("/getByName")
    public User getByName(){
        log.info("获取成功------------data{}");
        return userService.getByName("xiaomage");
    }

    /**
     * 获取授权的用户信息
     * @param principal 当前用户
     * @return 授权信息
     */
    @GetMapping("/current/get")
    public Principal user(Principal principal){
        log.info("--------------获取授权-------------------");
        return principal;
    }


}
