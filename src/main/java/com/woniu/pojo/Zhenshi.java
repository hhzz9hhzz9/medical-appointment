package com.woniu.pojo;

public class Zhenshi {
    private Integer zhenshiId;

    private Integer officeId;

    private String zhenshiName;

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

    public String getZhenshiName() {
        return zhenshiName;
    }

    public void setZhenshiName(String zhenshiName) {
        this.zhenshiName = zhenshiName == null ? null : zhenshiName.trim();
    }
}