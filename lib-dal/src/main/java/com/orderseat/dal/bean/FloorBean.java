package com.orderseat.dal.bean;

import com.orderseat.common.dal.BaseBean;

import java.util.Date;

/**
 * @author: zkw
 * @date: 2019-11-17
 * @description: 楼层类
 * @version: v1.0
 */
public class FloorBean extends BaseBean {
    private String id;

    private String name;

    private Date gmtCreateTime;

    private Date gmtModifiedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
