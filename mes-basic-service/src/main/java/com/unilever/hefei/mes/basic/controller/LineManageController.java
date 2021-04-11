package com.unilever.hefei.mes.basic.controller;

import com.unilever.hefei.mes.basic.api.LineManageService;
import com.unilever.hefei.mes.basic.bo.LineManageBo;
import com.unilever.hefei.mes.basic.model.LineInfo;
import com.unilever.hefei.mes.common.ErrorCode;
import com.unilever.hefei.mes.common.ResultUtils;
import com.unilever.hefei.mes.common.ResultVo;
import com.unilever.hefei.mes.common.entity.Result;
import com.unilever.hefei.mes.order.api.MspDailyPlanService;
import com.unilever.hefei.mes.order.model.MspDailyPlan;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName LineManageController
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/26 14:20
 * @Version 1.0
 **/
@RestController
@Slf4j
public class LineManageController implements LineManageService {

    @Autowired
    private LineManageBo lineManageBo;

    @Autowired
    private MspDailyPlanService mspDailyPlanService;
    /**
     * @description: 新增产线
     * @params: [lineInfo]
     * @return: com.unilever.hefei.mes.common.entity.Result<com.unilever.hefei.mes.basic.model.model.LineInfo>
     */
    @Override
    public Result<LineInfo> add(LineInfo lineInfo) {
        lineManageBo.save(lineInfo);
        return new Result<LineInfo>(ErrorCode.CODE_SUCCESS,"新增成功",null);
    }

    @Override
    public Result<List<LineInfo>> getAllLine() {
        List<LineInfo> lineInfos = lineManageBo.list();
        return new Result<List<LineInfo>>(ErrorCode.CODE_SUCCESS,"查询成功",lineInfos);
    }

    @Override
    public Result<Void> delete(Integer id) {
        lineManageBo.removeById(id);
        return ResultUtils.getSuccessResult(null);
    }

    @Override
    @GlobalTransactional
    public Result<Void> testTran() {
        boolean b = lineManageBo.removeById(113);
        mspDailyPlanService.delete(1419);
        if (b){
            log.info("XID is:{}", RootContext.getXID());
            throw new RuntimeException();
        }
        return ResultUtils.getSuccessResult(null);
    }

    @Override
    public Result<Void> getOrder(Integer id) {
        Result<MspDailyPlan> dailyPlanById = mspDailyPlanService.getDailyPlanById(String.valueOf(id));
        log.info("------结果----，da{}",dailyPlanById);
        return ResultUtils.getNullResult(ResultVo.SUCCESS_NULL);
    }


}
