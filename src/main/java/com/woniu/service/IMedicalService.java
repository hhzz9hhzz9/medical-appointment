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
    List<Medical> findAllByPageBean(PageBean<Medical> pageBean);

    /*查分页模糊查询处理后全部病例信息条目数*/
    int countByPageBean(PageBean<Medical> pageBean);

    /*查询模糊处理后的周病例总条目数*/
    int countByTheWeek(PageBean<Medical> pageBean);

    /*查询模糊处理后的月病例总条目数*/
    int countByTheMonth(PageBean<Medical> pageBean);

    /*查询模糊处理后的周病例*/
    List<Medical> findAllByTheWeek(PageBean<Medical> pageBean);

    /*查询模糊处理后的月病例*/
    List<Medical> findAllByTheMonth(PageBean<Medical> pageBean);

    /*根据医生姓名，科室查询处理后的病例总条目数*/
    int countByDoctorName(PageBean<Medical> pageBean);

    /*根据医生姓名科室查询模糊，分页处理后的病例*/
    List<Medical> listByDoctorName(PageBean<Medical> pageBean);
}
