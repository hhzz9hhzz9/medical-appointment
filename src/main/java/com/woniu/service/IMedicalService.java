package com.woniu.service;

import com.woniu.pojo.Medical;
import com.woniu.pojo.PageBean;

import java.util.List;

public interface IMedicalService {


    /*增加病例信息*/
    void save(Medical medical);

    /*删除病例信息*/
    void delete(Integer id);

    /*批量删除病例信息*/
    void deletes(Integer[] ids);

    /*修改病例信息*/
    void update(Medical medical);

    /*查询所有病例信息*/
    List<Medical> findAll();

    /*查询单个病例信息*/
    Medical findOne(Integer id);

    /*根据患者姓名查询该患者一段时间的所有病例信息*/
    List<Medical> findAllByPatientName(String patientName);

    /*当天所有病例信息，分页，模糊查询处理*/
    List<Medical> findAllTheDay();

    /*查全部病例信息，分页模糊查询处理*/
    List<Medical> findAllBypage(PageBean<Medical> pageBean);

    /*查分页模糊查询处理后全部病例信息条目数*/
    int countByPageBean(PageBean<Medical> pageBean);


    /*查询本周所有病例信息，分页，模糊查询处理*/

    /*查询本月所有病例信息，分页，模糊查询处理*/


}
