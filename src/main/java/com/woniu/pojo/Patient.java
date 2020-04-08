package com.woniu.pojo;

public class Patient {
    private Integer patientId;

    private String patientName;

    private Integer patientAge;

    private String patientAccount;

    private String patientPwd;

    private Integer patientGender;

    private Integer patientStatus;

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientAccount() {
        return patientAccount;
    }

    public void setPatientAccount(String patientAccount) {
        this.patientAccount = patientAccount == null ? null : patientAccount.trim();
    }

    public String getPatientPwd() {
        return patientPwd;
    }

    public void setPatientPwd(String patientPwd) {
        this.patientPwd = patientPwd == null ? null : patientPwd.trim();
    }

    public Integer getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(Integer patientGender) {
        this.patientGender = patientGender;
    }

    public Integer getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(Integer patientStatus) {
        this.patientStatus = patientStatus;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", patientAge=" + patientAge +
                ", patientAccount='" + patientAccount + '\'' +
                ", patientPwd='" + patientPwd + '\'' +
                ", patientGender=" + patientGender +
                ", patientStatus=" + patientStatus +
                '}';
    }
}