package com.orderseat.dal.bean;

import com.orderseat.common.dal.BaseBean;

import java.util.Date;

/**
 * @author: zkw
 * @date: 2019-11-17
 * @description: 占座记录类
 * @version: v1.0
 */
public class SeatOccupyTimeBean extends BaseBean {
    private String id;

    private String seatId;

    private Date startTime;

    private Date endTime;

    private String valid;

    private String userId;

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

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
