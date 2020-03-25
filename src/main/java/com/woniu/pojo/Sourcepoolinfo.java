package com.woniu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Sourcepoolinfo implements Serializable {
    private Integer spiId;

    private Integer sourcePoolId;

    private Date spTime;

    private Integer spStock;

    private static final long serialVersionUID = 1L;

    public Sourcepoolinfo(Integer spiId, Integer sourcePoolId, Date spTime, Integer spStock) {
        this.spiId = spiId;
        this.sourcePoolId = sourcePoolId;
        this.spTime = spTime;
        this.spStock = spStock;
    }

    public Sourcepoolinfo() {
        super();
    }

    public Integer getSpiId() {
        return spiId;
    }

    public void setSpiId(Integer spiId) {
        this.spiId = spiId;
    }

    public Integer getSourcePoolId() {
        return sourcePoolId;
    }

    public void setSourcePoolId(Integer sourcePoolId) {
        this.sourcePoolId = sourcePoolId;
    }

    public Date getSpTime() {
        return spTime;
    }

    public void setSpTime(Date spTime) {
        this.spTime = spTime;
    }

    public Integer getSpStock() {
        return spStock;
    }

    public void setSpStock(Integer spStock) {
        this.spStock = spStock;
    }
}