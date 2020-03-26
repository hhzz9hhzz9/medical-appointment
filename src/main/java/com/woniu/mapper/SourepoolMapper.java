package com.woniu.mapper;

import java.util.List;

import com.woniu.pojo.Sourepool;
import com.woniu.pojo.SourepoolExample;
import org.apache.ibatis.annotations.Param;

public interface SourepoolMapper {
    long countByExample(SourepoolExample example);

    int deleteByExample(SourepoolExample example);

    int deleteByPrimaryKey(Integer sourcePoolId);

    int insert(Sourepool record);

    int insertSelective(Sourepool record);

    List<Sourepool> selectByExample(SourepoolExample example);

    Sourepool selectByPrimaryKey(Integer sourcePoolId);

    int updateByExampleSelective(@Param("record") Sourepool record, @Param("example") SourepoolExample example);

    int updateByExample(@Param("record") Sourepool record, @Param("example") SourepoolExample example);

    int updateByPrimaryKeySelective(Sourepool record);

    int updateByPrimaryKey(Sourepool record);
}