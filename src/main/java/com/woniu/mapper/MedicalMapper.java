package com.woniu.mapper;

import java.util.List;

import com.woniu.pojo.Medical;
import com.woniu.pojo.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MedicalMapper {

    /**
     * 自定义方法
     *
     * */

    /*查全部病例信息*/
    List<Medical> findAll();

    /*查询单个病例信息根据id*/
    Medical findOne(Integer id);

    /*根据患者姓名查询其所有病例信息*/
    List<Medical> findAllByPatientName(String patientName);

    /*查模糊查询处理后全部病例信息条目数*/
    int countByPageBean(PageBean<Medical> pageBean);

    /*查周模糊查询处理后全部病例信息条目数*/
    int countByTheWeek(PageBean<Medical> pageBean);

    /*查分页模糊查询处理后病例信息*/
    List<Medical> findAllByPageBean(PageBean<Medical> pageBean);

    /*周分页模糊查询处理后病例信息*/
    List<Medical> findAllByTheWeek(PageBean<Medical> pageBean);

    /*批量删除病例信息*/
    void deletes(Integer[] ids);

    /*查询模糊处理后的月病例总条目数*/
    int countByTheMonth(PageBean<Medical> pageBean);

    /*查询模糊处理后的月病例*/
    List<Medical> findAllByTheMonth(PageBean<Medical> pageBean);

    /*根据医生姓名，科室查询处理后的病例总条目数*/
    int countByDoctorName(PageBean<Medical> pageBean);

    /*根据医生姓名科室查询模糊，分页处理后的病例*/
    List<Medical> listByDoctorName(PageBean<Medical> pageBean);

    /**
     * 逆向方法
     *
     * */
    /*增加病例信息*/
    int insertSelective(Medical record);

    /*删除病例信息*/
    int deleteByPrimaryKey(Integer medicalId);

    /*修改病例信息*/
    int updateByPrimaryKeySelective(Medical record);

    int insert(Medical record);





    Medical selectByPrimaryKey(Integer medicalId);

    int updateByPrimaryKeyWithBLOBs(Medical record);

    int updateByPrimaryKey(Medical record);



}