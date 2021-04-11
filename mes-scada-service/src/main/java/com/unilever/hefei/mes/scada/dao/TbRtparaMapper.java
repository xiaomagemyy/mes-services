package com.unilever.hefei.mes.scada.dao;

import java.util.List;

import com.unilever.hefei.mes.scada.model.TbRtpara;
import com.unilever.hefei.mes.scada.model.TbRtparaExample;
import org.apache.ibatis.annotations.Param;

public interface TbRtparaMapper {
    long countByExample(TbRtparaExample example);

    int deleteByExample(TbRtparaExample example);

    int insert(TbRtpara record);

    int insertSelective(TbRtpara record);

    List<TbRtpara> selectByExample(TbRtparaExample example);

    int updateByExampleSelective(@Param("record") TbRtpara record, @Param("example") TbRtparaExample example);

    int updateByExample(@Param("record") TbRtpara record, @Param("example") TbRtparaExample example);
}