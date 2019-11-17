package com.orderseat.dal.bean;

import com.orderseat.common.dal.BaseBean;

import java.util.Date;

/**
 * @author: zkw
 * @date: 2019-11-17
 * @description: 座位类
 * @version: v1.0
 */
public class SeatBean extends BaseBean {
    private String id;

    private String buildingId;

    private String floorId;

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
