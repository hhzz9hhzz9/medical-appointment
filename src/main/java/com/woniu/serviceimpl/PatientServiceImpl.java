package com.woniu.serviceimpl;

import com.woniu.mapper.PatientMapper;
import com.woniu.pojo.Patient;
import com.woniu.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author llf
 * @date 2020/3/24 19:39*/


@Service
@Transactional
public class PatientServiceImpl implements IPatientService {
    @Autowired
    private PatientMapper patientMapper;
    @Override
    public Patient loginTest(Patient patient) {

        return patientMapper.loginTest(patient);
    }
    @Override
    public void register(Patient patient) {
        patientMapper.insertSelective(patient);
    }

    @Override
    public List<Patient> findAll() {
        return patientMapper.findAll();
    }

    @Override
    public void delete(Integer patientId) {
        patientMapper.deleteByPrimaryKey(patientId);
    }

    @Override
    public void update(Patient patient) {
        patientMapper.updateByPrimaryKeySelective(patient);
    }
}
