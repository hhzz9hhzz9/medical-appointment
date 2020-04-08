package com.woniu.mapper;


import java.util.List;

import com.woniu.pojo.Paidui;
import com.woniu.pojo.PaiduiExample;
import org.apache.ibatis.annotations.Param;

public interface PaiduiMapper {
    long countByExample(PaiduiExample example);

    int deleteByExample(PaiduiExample example);

    int deleteByPrimaryKey(Integer pdId);

    int insert(Paidui record);

    int insertSelective(Paidui record);

    List<Paidui> selectByExample(PaiduiExample example);

    Paidui selectByPrimaryKey(Integer pdId);

    int updateByExampleSelective(@Param("record") Paidui record, @Param("example") PaiduiExample example);

    int updateByExample(@Param("record") Paidui record, @Param("example") PaiduiExample example);

    int updateByPrimaryKeySelective(Paidui record);

    int updateByPrimaryKey(Paidui record);
}