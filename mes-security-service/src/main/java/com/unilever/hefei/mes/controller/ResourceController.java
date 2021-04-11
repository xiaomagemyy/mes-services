package com.unilever.hefei.mes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ResourceController
 * @Description 用于不同权限页面访问测试
 * @Author XiaoMaGe
 * @Date 2021/3/9 22:27
 * @Version 1.0
 **/
@RestController
public class ResourceController {
    @GetMapping("/publicResource")
    public String toPublicResource() {
        return "resource/public";
    }

    @GetMapping("/vipResource")
    public String toVipResource() {
        return "resource/vip";
    }
}
