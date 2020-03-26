package com.woniu.pojo;

import java.util.Date;

public class Sourcepoolinfo {
    private Integer spiId;

    private Integer sourcePoolId;

    private Date spTime;

    private Integer spStock;

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