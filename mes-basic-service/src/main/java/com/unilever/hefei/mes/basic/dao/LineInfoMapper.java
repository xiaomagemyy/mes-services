package com.unilever.hefei.mes.basic.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

import com.unilever.hefei.mes.basic.model.LineInfo;
import com.unilever.hefei.mes.basic.model.LineInfoExample;
import org.apache.ibatis.annotations.Param;

public interface LineInfoMapper extends BaseMapper<LineInfo> {
    long countByExample(LineInfoExample example);

    int deleteByExample(LineInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LineInfo record);

    int insertSelective(LineInfo record);

    List<LineInfo> selectByExample(LineInfoExample example);

    LineInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LineInfo record, @Param("example") LineInfoExample example);

    int updateByExample(@Param("record") LineInfo record, @Param("example") LineInfoExample example);

    int updateByPrimaryKeySelective(LineInfo record);

    int updateByPrimaryKey(LineInfo record);
}