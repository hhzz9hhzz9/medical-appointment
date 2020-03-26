package com.woniu.pojo;

public class Doctor {
    private Integer doctorId;

    private Integer zhenshiId;

    private Integer officeId;

    private String doctorName;

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