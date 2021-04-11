package com.unilever.hefei.mes.scada.controller;

import com.unilever.hefei.mes.basic.api.LineManageService;
import com.unilever.hefei.mes.common.ResultUtils;
import com.unilever.hefei.mes.common.entity.Result;
import com.unilever.hefei.mes.order.api.MspDailyPlanService;
import com.unilever.hefei.mes.order.model.MspDailyPlan;
import com.unilever.hefei.mes.scada.api.ScadaService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName ScadaController
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/19 13:59
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/scada")
@Slf4j
public class ScadaController implements ScadaService {

    @Autowired
    private MspDailyPlanService mspDailyPlanService;

    @Autowired
    private LineManageService lineManageService;

    @Override
    @GlobalTransactional
    public Result<Void> testTra(String id) {
        log.info("----------开始测试1--------");
        mspDailyPlanService.delete(1419);

        return null;
    }

    @GetMapping(value = "/get/{id}")
    public Result<MspDailyPlan> testFeign(@PathVariable(value = "id")String id){
        return mspDailyPlanService.getDailyPlanById(id);
    }
}
