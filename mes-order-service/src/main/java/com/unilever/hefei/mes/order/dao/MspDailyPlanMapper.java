package com.unilever.hefei.mes.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

import com.unilever.hefei.mes.order.model.MspDailyPlan;
import com.unilever.hefei.mes.order.model.MspDailyPlanExample;
import org.apache.ibatis.annotations.Param;

public interface MspDailyPlanMapper extends BaseMapper<MspDailyPlan> {
    long countByExample(MspDailyPlanExample example);

    int deleteByExample(MspDailyPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MspDailyPlan record);

    int insertSelective(MspDailyPlan record);

    List<MspDailyPlan> selectByExample(MspDailyPlanExample example);

    MspDailyPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MspDailyPlan record, @Param("example") MspDailyPlanExample example);

    int updateByExample(@Param("record") MspDailyPlan record, @Param("example") MspDailyPlanExample example);

    int updateByPrimaryKeySelective(MspDailyPlan record);

    int updateByPrimaryKey(MspDailyPlan record);
}