package com.woniu.service;

import com.woniu.pojo.Zhenshi;

import java.util.List;

/**
 * @author jad
 * @creat 2020/03/2020/3/26 17:44:51
 */
public interface IZhenshiService {
    void deleteByPrimaryKey(Integer zhenshiId);

    void insert(Zhenshi record);

    void updateByPrimaryKey(Zhenshi record);

    List<Zhenshi> findAll();

    Zhenshi findOneByPrimaryKey(Integer officeId);
}
