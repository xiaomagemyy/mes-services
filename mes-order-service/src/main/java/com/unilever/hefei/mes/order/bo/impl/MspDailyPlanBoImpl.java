package com.unilever.hefei.mes.order.bo.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.unilever.hefei.mes.order.dao.MspDailyPlanMapper;
import com.unilever.hefei.mes.order.bo.MspDailyPlanBo;
import com.unilever.hefei.mes.order.model.MspDailyPlan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName MspDailyPlanServiceImpl
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/18 21:54
 * @Version 1.0
 **/
@Service
@Transactional
public class MspDailyPlanBoImpl extends ServiceImpl<MspDailyPlanMapper, MspDailyPlan> implements MspDailyPlanBo {
}
