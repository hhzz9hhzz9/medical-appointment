package com.woniu.mapper;

import com.woniu.pojo.Zhenshi;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ZhenshiMapper {
    void deleteByPrimaryKey(Integer zhenshiId);

    void insert(Zhenshi record);

    void updateByPrimaryKey(Zhenshi record);

    List<Zhenshi> findAll();

    Zhenshi findOneByPrimaryKey(Integer officeId);

    List<Zhenshi> findOneByOfficeId(Integer officeId);

}