package com.woniu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Appointment implements Serializable {
    private Integer appointmentId;

    private Integer astatusId;

    private Integer doctorId;

    private Integer patientId;

    private String aname;

    private Date atime;

    private static final long serialVersionUID = 1L;

    public Appointment(Integer appointmentId, Integer astatusId, Integer doctorId, Integer patientId, String aname, Date atime) {
        this.appointmentId = appointmentId;
        this.astatusId = astatusId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.aname = aname;
        this.atime = atime;
    }

    public Appointment() {
        super();
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Integer getAstatusId() {
        return astatusId;
    }

    public void setAstatusId(Integer astatusId) {
        this.astatusId = astatusId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }
}