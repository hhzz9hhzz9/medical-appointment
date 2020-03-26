package com.woniu.mapper;

import com.web.pojo.Astatus;
import com.web.pojo.AstatusExample;
import java.util.List;
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