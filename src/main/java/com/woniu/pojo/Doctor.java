package com.woniu.pojo;

import java.io.Serializable;

public class Doctor implements Serializable {
    private Integer doctorId;

    private Integer zhenshiId;

    private Integer officeId;

    private String doctorName;

    private static final long serialVersionUID = 1L;

    public Doctor(Integer doctorId, Integer zhenshiId, Integer officeId, String doctorName) {
        this.doctorId = doctorId;
        this.zhenshiId = zhenshiId;
        this.officeId = officeId;
        this.doctorName = doctorName;
    }

    public Doctor() {
        super();
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getZhenshiId() {
        return zhenshiId;
    }

    public void setZhenshiId(Integer zhenshiId) {
        this.zhenshiId = zhenshiId;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }
}