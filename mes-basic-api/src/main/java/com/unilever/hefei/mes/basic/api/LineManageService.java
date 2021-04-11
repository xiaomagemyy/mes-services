package com.unilever.hefei.mes.basic.api;

import com.unilever.hefei.mes.basic.model.LineInfo;
import com.unilever.hefei.mes.common.ErrorCode;
import com.unilever.hefei.mes.common.entity.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName LineManageService
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/27 11:11
 * @Version 1.0
 **/
@RestController
@RequestMapping("/basic/line")
@FeignClient(value = "mes-basic-service")
@Api(tags = "产线管理")
public interface LineManageService {

    @ApiOperation(value = "",notes = "新增产线")
    @PutMapping("/addLine")
    Result<LineInfo> add(@RequestBody LineInfo lineInfo);

    @ApiOperation(value = "",notes = "获取所有产线")
    @GetMapping("/getAllLine")
    Result<List<LineInfo>> getAllLine();

    @ApiOperation(value = "",notes = "删除指定产线")
    @DeleteMapping("/{id}")
    Result<Void> delete(@PathVariable(value = "id") Integer id);

    @ApiOperation(value = "",notes = "basic测试全局事务")
    @GetMapping("/test")
    Result<Void> testTran();

    @ApiOperation(value = "",notes = "测试token跨服务")
    @GetMapping("/{id}")
    Result<Void> getOrder(@PathVariable(value = "id")Integer id);

}
