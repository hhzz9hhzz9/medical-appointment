package com.woniu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Scheduling implements Serializable {
    private Integer schedulingId;

    private Date startTime;

    private Date endTime;

    private Integer duration;

    private static final long serialVersionUID = 1L;

    public Scheduling(Integer schedulingId, Date startTime, Date endTime, Integer duration) {
        this.schedulingId = schedulingId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
    }

    public Scheduling() {
        super();
    }

    public Integer getSchedulingId() {
        return schedulingId;
    }

    public void setSchedulingId(Integer schedulingId) {
        this.schedulingId = schedulingId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}