package com.unilever.hefei.mes.basic.bo;

import com.baomidou.mybatisplus.extension.service.IService;
import com.unilever.hefei.mes.basic.model.LineInfo;
import com.unilever.hefei.mes.common.entity.Result;
import org.springframework.web.bind.annotation.RequestBody;

public interface LineManageBo extends IService<LineInfo> {
    /**
     * @description: 新增产线
     * @params: [lineInfo]
     * @return: com.unilever.hefei.mes.common.entity.Result<com.unilever.hefei.mes.basic.model.model.LineInfo>
     */

}
