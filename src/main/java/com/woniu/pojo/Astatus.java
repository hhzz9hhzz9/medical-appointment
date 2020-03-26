package com.woniu.pojo;

public class Astatus {
    private Integer astatusId;

    private String astatusName;

    public Integer getAstatusId() {
        return astatusId;
    }

    public void setAstatusId(Integer astatusId) {
        this.astatusId = astatusId;
    }

    public String getAstatusName() {
        return astatusName;
    }

    public void setAstatusName(String astatusName) {
        this.astatusName = astatusName == null ? null : astatusName.trim();
    }
}