package com.woniu.pojo;

import java.io.Serializable;

public class Zhenshi implements Serializable {
    private Integer zhenshiId;

    private Integer officeId;

    private String zhenshiName;

    private static final long serialVersionUID = 1L;

    public Zhenshi(Integer zhenshiId, Integer officeId, String zhenshiName) {
        this.zhenshiId = zhenshiId;
        this.officeId = officeId;
        this.zhenshiName = zhenshiName;
    }

    public Zhenshi() {
        super();
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

    public String getZhenshiName() {
        return zhenshiName;
    }

    public void setZhenshiName(String zhenshiName) {
        this.zhenshiName = zhenshiName == null ? null : zhenshiName.trim();
    }
}