package com.unilever.hefei.mes.order.api;

import com.unilever.hefei.mes.common.entity.Result;
import com.unilever.hefei.mes.order.model.MspDailyPlan;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @ClassName MspDailyPlanService
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/19 11:11
 * @Version 1.0
 **/
@RestController
@RequestMapping("/dailyPlan")
@Api(tags = "订单管理")
@FeignClient(name = "mes-order-service")
public interface MspDailyPlanService {


    @ApiOperation(value = "",notes = "获取日计划订单")
    @GetMapping("/getById/{id}")
    Result<MspDailyPlan> getDailyPlanById(@PathVariable(value = "id") String id);

    @ApiOperation(value = "",notes = "新增日计划订单")
    @PostMapping
    Result<Void> save(@RequestBody MspDailyPlan dailyPlan);

    @ApiOperation(value = "",notes = "删除指定生产订单")
    @DeleteMapping("/{id}")
    Result<Void> delete(@PathVariable(value = "id")Integer id );
}
