package com.woniu.mapper;

import com.woniu.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PatientMapper {
    void deleteByPrimaryKey(Integer patientId);

    void insertSelective(Patient record);

    void updateByPrimaryKeySelective(Patient record);

    Patient loginTest(Patient patient);

    List<Patient> findAll();
}
