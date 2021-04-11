package com.unilever.hefei.mes.basic.bo.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.unilever.hefei.mes.basic.bo.LineManageBo;
import com.unilever.hefei.mes.basic.dao.LineInfoMapper;
import com.unilever.hefei.mes.basic.model.LineInfo;
import com.unilever.hefei.mes.common.entity.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * @ClassName LineManagesBoImpl
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/26 13:51
 * @Version 1.0
 **/
@Service
@Transactional
public class LineManagesBoImpl extends ServiceImpl<LineInfoMapper, LineInfo> implements LineManageBo {

}
