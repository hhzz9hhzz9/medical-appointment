package com.woniu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Medical implements Serializable {
    private Integer medicalId;

    private Patient patient;

    private Doctor doctor;

    /*时间格式处理*/
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date medicalTime;

    private String medicalInfo;

    public Integer getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Integer medicalId) {
        this.medicalId = medicalId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getMedicalTime() {
        return medicalTime;
    }

    public void setMedicalTime(Date medicalTime) {
        this.medicalTime = medicalTime;
    }

    public String getMedicalInfo() {
        return medicalInfo;
    }

    public void setMedicalInfo(String medicalInfo) {
        this.medicalInfo = medicalInfo == null ? null : medicalInfo.trim();
    }

    @Override
    public String toString() {
        return "Medical{" +
                "medicalId=" + medicalId +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", medicalTime=" + medicalTime +
                ", medicalInfo='" + medicalInfo + '\'' +
                '}';
    }
}