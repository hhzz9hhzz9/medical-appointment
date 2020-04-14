package com.woniu.serviceimpl;

import com.woniu.mapper.DoctorMapper;
import com.woniu.pojo.Doctor;
import com.woniu.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DoctorServiceImpl implements IDoctorService {
    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<Doctor> findAll() {
        return doctorMapper.findAll();
    }
}
