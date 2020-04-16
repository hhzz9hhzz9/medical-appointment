package com.woniu.mapper;

import com.woniu.pojo.Appointment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface AppointmentMapper {
 List<Appointment> findAllAppointment();
 void insertSelective(Appointment appointment);

 List<Appointment> findOneByPatient(Integer patientId);
}