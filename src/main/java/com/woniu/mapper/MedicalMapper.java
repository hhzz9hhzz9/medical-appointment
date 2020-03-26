package com.woniu.mapper;

import com.web.pojo.Medical;
import com.web.pojo.MedicalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicalMapper {
    long countByExample(MedicalExample example);

    int deleteByExample(MedicalExample example);

    int deleteByPrimaryKey(Integer medicalId);

    int insert(Medical record);

    int insertSelective(Medical record);

    List<Medical> selectByExampleWithBLOBs(MedicalExample example);

    List<Medical> selectByExample(MedicalExample example);

    Medical selectByPrimaryKey(Integer medicalId);

    int updateByExampleSelective(@Param("record") Medical record, @Param("example") MedicalExample example);

    int updateByExampleWithBLOBs(@Param("record") Medical record, @Param("example") MedicalExample example);

    int updateByExample(@Param("record") Medical record, @Param("example") MedicalExample example);

    int updateByPrimaryKeySelective(Medical record);

    int updateByPrimaryKeyWithBLOBs(Medical record);

    int updateByPrimaryKey(Medical record);
}