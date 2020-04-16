package com.woniu.service;

import com.woniu.pojo.Appointment;

import java.util.List;

/**
 * @author llf
 * @date 2020/4/14 22:57
 */
public interface IAppointmentService {
    List<Appointment> findAllAppointment();
    void insertSelective(Appointment appointment);

    List<Appointment> findOneByPatient(Integer patientId);
}
