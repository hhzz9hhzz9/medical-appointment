package com.woniu.mapper;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.Paidui;
import com.woniu.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface PaiduiMapper {
    void deleteByPrimaryKey(Integer pdId);

    void insert(Paidui record);

    void updateByPrimaryKey(Paidui record);

    List<Paidui> findAll();

    Paidui findOneByPrimaryKey(Integer paiduiId);

    List<Paidui> selectbypage(PageBean<Paidui> pageBean);

    int countAll(PageBean<Paidui> pageBean);

    List<Paidui> selectbyzhenshi(Integer zhenshiId);

    int countAllbyid(Integer zhenshiId);

    Paidui logpaidui(Integer zhenshiId);

    void deleteByAllKey(Integer[] checked);





}