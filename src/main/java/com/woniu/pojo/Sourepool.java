package com.woniu.pojo;

public class Sourepool {
    private Integer sourcePoolId;

    private Integer doctorId;

    private String sourceName;

    private Integer maxCount;

    public Integer getSourcePoolId() {
        return sourcePoolId;
    }

    public void setSourcePoolId(Integer sourcePoolId) {
        this.sourcePoolId = sourcePoolId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }
}