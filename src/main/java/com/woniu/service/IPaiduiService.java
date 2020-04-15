package com.woniu.service;

import com.woniu.pojo.Paidui;

import java.util.List;

/**
 * @author jad
 * @creat 2020/03/2020/3/26 17:45:19
 */
public interface IPaiduiService {
    void deleteByPrimaryKey(Integer paiduiId);

    void insert(Paidui record);

    void updateByPrimaryKey(Paidui record);

    List<Paidui> findAll();

    Paidui findOneByPrimaryKey(Integer paiduiId) ;
}
