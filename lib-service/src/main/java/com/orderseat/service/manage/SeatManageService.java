package com.orderseat.service.manage;

import java.util.List;

/**
 * @author: tyoukai
 * @date: 2019-11-27 21:08
 * @description: 座位管理接口
 * @version: v1.0
 */
public interface SeatManageService {

    /**
     * 从指定的队列中获取座位信息
     *
     * @return
     */
    void getSeatFromRedis();

    /**
     * 持久化
     */
    void persistence(String seatInfo);

}
