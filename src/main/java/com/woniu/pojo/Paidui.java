package com.woniu.pojo;

import java.util.Date;

public class Paidui {
    private Integer pdId;

    private Integer zhenshiId;

    private Integer officeId;

    private Integer pdNo;

    private Date pdTime;

    public Integer getPdId() {
        return pdId;
    }

    public void setPdId(Integer pdId) {
        this.pdId = pdId;
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

    public Integer getPdNo() {
        return pdNo;
    }

    public void setPdNo(Integer pdNo) {
        this.pdNo = pdNo;
    }

    public Date getPdTime() {
        return pdTime;
    }

    public void setPdTime(Date pdTime) {
        this.pdTime = pdTime;
    }
}