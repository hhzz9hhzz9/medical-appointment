package com.woniu.mapper;


import java.util.List;

import com.woniu.pojo.Sourcepoolinfo;
import com.woniu.pojo.SourcepoolinfoExample;
import org.apache.ibatis.annotations.Param;

public interface SourcepoolinfoMapper {
    long countByExample(SourcepoolinfoExample example);

    int deleteByExample(SourcepoolinfoExample example);

    int deleteByPrimaryKey(Integer spiId);

    int insert(Sourcepoolinfo record);

    int insertSelective(Sourcepoolinfo record);

    List<Sourcepoolinfo> selectByExample(SourcepoolinfoExample example);

    Sourcepoolinfo selectByPrimaryKey(Integer spiId);

    int updateByExampleSelective(@Param("record") Sourcepoolinfo record, @Param("example") SourcepoolinfoExample example);

    int updateByExample(@Param("record") Sourcepoolinfo record, @Param("example") SourcepoolinfoExample example);

    int updateByPrimaryKeySelective(Sourcepoolinfo record);

    int updateByPrimaryKey(Sourcepoolinfo record);
}