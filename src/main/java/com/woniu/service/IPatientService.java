package com.woniu.service;

import com.woniu.pojo.Patient;

import java.util.List;

/**
 * @author llf
 * @date 2020/3/24 19:38
 */

public interface IPatientService {
    Patient loginTest(Patient patient);
    void register(Patient patient);

    List<Patient> findAll();
}
