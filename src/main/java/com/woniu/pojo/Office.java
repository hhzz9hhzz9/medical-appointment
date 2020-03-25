package com.woniu.pojo;

import java.io.Serializable;

public class Office implements Serializable {
    private Integer officeId;

    private String officeName;

    private static final long serialVersionUID = 1L;

    public Office(Integer officeId, String officeName) {
        this.officeId = officeId;
        this.officeName = officeName;
    }

    public Office() {
        super();
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName == null ? null : officeName.trim();
    }
}