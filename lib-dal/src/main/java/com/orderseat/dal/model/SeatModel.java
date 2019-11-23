package com.orderseat.dal.model;

import com.orderseat.common.dal.BaseModel;
import com.orderseat.common.enums.SeatTypeEnum;

import java.util.Date;

public class SeatModel extends BaseModel {
    private String id;

    private String buildingId;

    private String floorId;

    private SeatTypeEnum seatTypeEnum;

    private String desc;

    private Date gmtCreateTime;

    private Date gmtModifiedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    public SeatTypeEnum getSeatTypeEnum() {
        return seatTypeEnum;
    }

    public void setSeatTypeEnum(SeatTypeEnum seatTypeEnum) {
        this.seatTypeEnum = seatTypeEnum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getGmtCreateTime() {
        return gmtCreateTime;
    }

    public void setGmtCreateTime(Date gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
    }

    public Date getGmtModifiedTime() {
        return gmtModifiedTime;
    }

    public void setGmtModifiedTime(Date gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
    }
}
