package com.woniu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Medical implements Serializable {
    private Integer medicalId;

    private Integer patientId;

    private Integer doctorId;

    private Date medicalTime;

    private String medicalInfo;

    public Integer getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Integer medicalId) {
        this.medicalId = medicalId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
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
}