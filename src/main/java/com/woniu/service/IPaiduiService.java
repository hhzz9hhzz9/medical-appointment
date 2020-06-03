package com.woniu.service;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.Paidui;

import java.util.List;

/**
 * @author jad
 * @creat 2020/03/2020/3/26 17:45:19
 */
public interface IPaiduiService {
    void deleteByPrimaryKey(Integer pdId);

    void insert(Paidui record);

    void updateByPrimaryKey(Paidui record);

    List<Paidui> findAll();

    Paidui findOneByPrimaryKey(Integer paiduiId);

    List<Paidui> selectbypage(PageBean<Paidui>pageBean);

    int countAll(PageBean<Paidui> pageBean);

    List<Paidui> selectbyzhenshi(Integer zhenshiId);

    int countAllbyid(Integer zhenshiId);

    Paidui logpaidui(Integer zhenshiId);

    void deleteByAllKey(Integer[] checked);
}
