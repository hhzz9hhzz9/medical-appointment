package com.woniu.pojo;

import java.io.Serializable;

public class Sourcepool implements Serializable {
    private Integer sourcePoolId;

    private Integer doctorId;

    private String sourceName;

    private Integer maxCount;

    private static final long serialVersionUID = 1L;

    public Sourcepool(Integer sourcePoolId, Integer doctorId, String sourceName, Integer maxCount) {
        this.sourcePoolId = sourcePoolId;
        this.doctorId = doctorId;
        this.sourceName = sourceName;
        this.maxCount = maxCount;
    }

    public Sourcepool() {
        super();
    }

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