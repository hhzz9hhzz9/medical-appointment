package com.woniu.service;

import com.woniu.pojo.Office;

import java.util.List;

/**
 * @author jad
 * @creat 2020/03/2020/3/26 17:44:24
 */
public interface IOfficeService {
    void deleteByPrimaryKey(Integer officeId);

    void insert(Office record);

    void updateByPrimaryKey(Office record);

    List<Office> findAll();

    Office findOneByPrimaryKey(Integer officeId);
}
