package com.woniu.mapper;

import com.woniu.pojo.Office;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface OfficeMapper {
    void deleteByPrimaryKey(Integer officeId);

    void insert(Office record);

    void updateByPrimaryKey(Office record);

    List<Office> findAll();

    Office findOneByPrimaryKey(Integer officeId);

}