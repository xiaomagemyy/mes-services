package com.unilever.hefei.mes.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HttptestController
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/9 22:28
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/test")
public class HttptestController {

    @PostMapping("/public")
    public JSONObject doPublicHandler(Long id) {
        JSONObject json = new JSONObject();
        json.put("code", 200);
        json.put("msg", "请求成功" + id);
        return json;
    }

    @PostMapping("/vip")
    public JSONObject doVipHandler(Long id) {
        JSONObject json = new JSONObject();
        json.put("code", 200);
        json.put("msg", "请求成功" + id);
        return json;
    }
}
