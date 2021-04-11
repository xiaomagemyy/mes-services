package com.unilever.hefei.mes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/9 22:25
 * @Version 1.0
 **/
@RestController
public class LoginController {

    @GetMapping("/login")
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
                              @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView mav = new ModelAndView();
        if (error != null) {
            mav.addObject("error", "用户名或者密码不正确");
        }
        if (logout != null) {
            mav.addObject("msg", "退出成功");
        }
        mav.setViewName("login");
        return mav;
    }
}
