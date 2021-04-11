package com.unilever.hefei.mes.basic.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

import com.unilever.hefei.mes.basic.model.EquipmentInfo;
import com.unilever.hefei.mes.basic.model.EquipmentInfoExample;
import org.apache.ibatis.annotations.Param;

public interface EquipmentInfoMapper extends BaseMapper<EquipmentInfo> {
    long countByExample(EquipmentInfoExample example);

    int deleteByExample(EquipmentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EquipmentInfo record);

    int insertSelective(EquipmentInfo record);

    List<EquipmentInfo> selectByExample(EquipmentInfoExample example);

    EquipmentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EquipmentInfo record, @Param("example") EquipmentInfoExample example);

    int updateByExample(@Param("record") EquipmentInfo record, @Param("example") EquipmentInfoExample example);

    int updateByPrimaryKeySelective(EquipmentInfo record);

    int updateByPrimaryKey(EquipmentInfo record);
}