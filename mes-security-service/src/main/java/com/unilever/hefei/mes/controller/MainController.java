package com.unilever.hefei.mes.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName MainController
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/9 22:26
 * @Version 1.0
 **/
@RestController
public class MainController {
    @GetMapping("/main")
    public ModelAndView toMainPage() {
        //获取登录的用户名
        Object principal= SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username=null;
        if(principal instanceof UserDetails) {
            username=((UserDetails)principal).getUsername();
        }else {
            username=principal.toString();
        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        mav.addObject("username", username);
        return mav;
    }
}
