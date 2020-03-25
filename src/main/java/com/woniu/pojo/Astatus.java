package com.woniu.pojo;

import java.io.Serializable;

public class Astatus implements Serializable {
    private Integer astatusId;

    private String astatusName;

    private static final long serialVersionUID = 1L;

    public Astatus(Integer astatusId, String astatusName) {
        this.astatusId = astatusId;
        this.astatusName = astatusName;
    }

    public Astatus() {
        super();
    }

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