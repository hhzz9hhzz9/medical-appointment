package com.woniu.serviceimpl;

import com.woniu.mapper.AppointmentMapper;
import com.woniu.pojo.Appointment;
import com.woniu.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author llf
 * @date 2020/4/14 22:59
 */
@Service
@Transactional
public class AppointmentServiceImpl implements IAppointmentService {
    @Autowired
    private AppointmentMapper appointmentMapper;

    @Override
    public List<Appointment> findAllAppointment() {
        return appointmentMapper.findAllAppointment();
    }

    @Override
    public void insertSelective(Appointment appointment) {
        appointmentMapper.insertSelective(appointment);
    }

    @Override
    public List<Appointment> findOneByPatient(Integer patientId) {
        return appointmentMapper.findOneByPatient(patientId);
    }
}
