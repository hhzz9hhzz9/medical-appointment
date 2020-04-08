package com.woniu.mapper;


import java.util.List;

import com.woniu.pojo.Astatus;
import com.woniu.pojo.AstatusExample;
import org.apache.ibatis.annotations.Param;

public interface AstatusMapper {
    long countByExample(AstatusExample example);

    int deleteByExample(AstatusExample example);

    int deleteByPrimaryKey(Integer astatusId);

    int insert(Astatus record);

    int insertSelective(Astatus record);

    List<Astatus> selectByExample(AstatusExample example);

    Astatus selectByPrimaryKey(Integer astatusId);

    int updateByExampleSelective(@Param("record") Astatus record, @Param("example") AstatusExample example);

    int updateByExample(@Param("record") Astatus record, @Param("example") AstatusExample example);

    int updateByPrimaryKeySelective(Astatus record);

    int updateByPrimaryKey(Astatus record);
}