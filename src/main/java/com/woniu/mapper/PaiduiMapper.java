package com.woniu.mapper;

import com.woniu.pojo.Paidui;
import com.woniu.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface PaiduiMapper {
    void deleteByPrimaryKey(Integer paiduiId);

    void insert(Paidui record);

    void updateByPrimaryKey(Paidui record);

    List<Paidui> findAll();

    Paidui findOneByPrimaryKey(Integer paiduiId);




}