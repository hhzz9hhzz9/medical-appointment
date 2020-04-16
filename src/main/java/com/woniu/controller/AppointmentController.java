package com.woniu.controller;

import com.woniu.pojo.Appointment;
import com.woniu.pojo.ResultVO;
import com.woniu.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author llf
 * @date 2020/4/14 9:24
 */
@RestController
@RequestMapping("appointment")
public class AppointmentController {
    @Autowired
    private IAppointmentService appointmentService;

    @GetMapping("findAll")
    public ResultVO findAllAppointment(){
        List<Appointment> list = appointmentService.findAllAppointment();

        ResultVO resultVO = null;
        if(list != null && list.size() > 0) {
            resultVO = new ResultVO(200,"查询成功", list);
        } else {
            resultVO = new ResultVO(500, "查询失败");
        }
        return resultVO;
    }
    @PostMapping("addAppointment")
    public ResultVO addAppointment(@RequestBody Appointment appointment){
        ResultVO resultVO = null;
        appointment.setAstatusId(1);
        appointment.setAtime(new Date());
        appointment.setAname(UUID.randomUUID().toString());
        try {
            appointmentService.insertSelective(appointment);
            resultVO = new ResultVO(200,"预约成功");
        } catch (Exception e) {
            resultVO = new ResultVO(500,"预约失败");
        }
        return resultVO;
    }
    @GetMapping("findOneByPatient/{patientId}")
    public ResultVO findOneByPatient(@PathVariable Integer patientId){
        ResultVO resultVO;
        try {
            List<Appointment> list = appointmentService.findOneByPatient(patientId);
            resultVO = new ResultVO(200, "查询个人预约成功", list);
        } catch (Exception e) {
            resultVO = new ResultVO(500, "查询个人数据失败");        }
        return resultVO;
    }

}
