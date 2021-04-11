package com.unilever.hefei.mes.scada.api;

import com.unilever.hefei.mes.common.entity.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "数采模块数据")
@RequestMapping("/scada")
public interface ScadaService {

    @GetMapping("/test")
    @ApiOperation(value = "",notes = "测试全局事务控制")
    Result<Void> testTra(@PathVariable(value = "id")String id);
}
