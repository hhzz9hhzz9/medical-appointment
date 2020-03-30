package com.woniu.serviceimpl;

import com.woniu.mapper.MedicalMapper;
import com.woniu.pojo.Medical;
import com.woniu.pojo.PageBean;
import com.woniu.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MedicalServiceImpl implements IMedicalService {
    @Autowired
    private MedicalMapper medicalMapper;

    /*增加病例信息*/
    @Override
    public void save(Medical medical) {
        medicalMapper.insertSelective(medical);
    }

    /*删除病例信息*/
    @Override
    public void delete(Integer id) {
        medicalMapper.deleteByPrimaryKey(id);
    }

    /*批量删除病例信息*/
    @Override
    public void deletes(Integer[] ids) {
        medicalMapper.deletes(ids);
    }

    /*修改病例信息*/
    @Override
    public void update(Medical medical) {
        medicalMapper.updateByPrimaryKeySelective(medical);
    }

    /*查询全部的病例信息*/
    @Override
    public List<Medical> findAll() {
        return medicalMapper.findAll();
    }

    /*查询单个病例信息根据id*/
    @Override
    public Medical findOne(Integer id) {
        return medicalMapper.findOne(id);
    }

    /*根据患者姓名查询其所有病例信息*/
    @Override
    public List<Medical> findAllByPatientName(String patientName) {
        return medicalMapper.findAllByPatientName(patientName);
    }
    /*当天所有病例信息，分页，模糊查询处理*/
    @Override
    public List<Medical> findAllTheDay() {
        return null;
    }

    @Override
    public List<Medical> findAllBypage(PageBean<Medical> pageBean) {
        return null;
    }

    /*查分页模糊查询处理后全部病例信息条目数*/
    @Override
    public int countByPageBean(PageBean<Medical> pageBean) {
        return medicalMapper.countByPageBean(pageBean);
    }
}
