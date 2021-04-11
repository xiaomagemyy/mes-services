package com.unilever.hefei.mes.scada.dao;

import java.util.List;

import com.unilever.hefei.mes.scada.model.TbAlarm;
import com.unilever.hefei.mes.scada.model.TbAlarmExample;
import org.apache.ibatis.annotations.Param;

public interface TbAlarmMapper {
    long countByExample(TbAlarmExample example);

    int deleteByExample(TbAlarmExample example);

    int insert(TbAlarm record);

    int insertSelective(TbAlarm record);

    List<TbAlarm> selectByExample(TbAlarmExample example);

    int updateByExampleSelective(@Param("record") TbAlarm record, @Param("example") TbAlarmExample example);

    int updateByExample(@Param("record") TbAlarm record, @Param("example") TbAlarmExample example);
}