package com.woniu.mapper;

import com.woniu.pojo.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DoctorMapper {

    List<Doctor> findAll();

}