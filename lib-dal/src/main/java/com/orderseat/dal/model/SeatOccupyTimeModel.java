package com.orderseat.dal.model;

import com.orderseat.common.enums.ValidEnum;

import java.util.Date;

/**
 * @author: zkw
 * @date: 2019-11-17
 * @description: 占座记录模型类
 * @version: v1.0
 */
public class SeatOccupyTimeModel {
    private String id;

    private String seatId;

    private Date startTime;

    private Date endTime;

    private ValidEnum valid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
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

    public ValidEnum getValid() {
        return valid;
    }

    public void setValid(ValidEnum valid) {
        this.valid = valid;
    }
}
