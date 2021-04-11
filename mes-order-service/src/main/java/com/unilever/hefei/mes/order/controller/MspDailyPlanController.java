package com.unilever.hefei.mes.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.unilever.hefei.mes.common.ErrorCode;
import com.unilever.hefei.mes.common.ResultUtils;
import com.unilever.hefei.mes.common.entity.Result;
import com.unilever.hefei.mes.order.api.MspDailyPlanService;
import com.unilever.hefei.mes.order.bo.MspDailyPlanBo;
import com.unilever.hefei.mes.order.model.MspDailyPlan;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName MspDailyPlanController
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/18 21:59
 * @Version 1.0
 **/
@RestController
@Slf4j
public class MspDailyPlanController implements MspDailyPlanService {

    @Autowired
    private MspDailyPlanBo mspDailyPlanBo;

    @Override
    public Result<Void> save(MspDailyPlan dailyPlan) {
        mspDailyPlanBo.save(dailyPlan);
        return ResultUtils.getSuccessResult(null);
    }

    @Override
    public Result<Void> delete(Integer id) {
        mspDailyPlanBo.removeById(id);
        return ResultUtils.getSuccessResult(null);
    }

    @SentinelResource(value = "getByid")
    public Result<MspDailyPlan> getDailyPlanById(@PathVariable(value = "id") String id){

        MspDailyPlan dailyPlan = mspDailyPlanBo.getById(id);
//        throw new RuntimeException("error");
        return new Result<MspDailyPlan>(ErrorCode.CODE_SUCCESS_NULL,"执行成功",dailyPlan);
    }

//    public Result<MspDailyPlan> handleException(String id, BlockException exception){
//        log.info("flow exception{}",exception.getClass().getCanonicalName());
//        return new Result<MspDailyPlan>(ErrorCode.CODE_EXCEPTION_OCCURED,"请求频繁，请稍后再试",null);
//    }

//        public Result<MspDailyPlan> fallBack(String id){
//        return new Result<MspDailyPlan>(ErrorCode.CODE_EXCEPTION_OCCURED,"服务熔断了，不要再试了",null);
//    }
}
