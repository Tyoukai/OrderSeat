package com.orderseat.service.manage.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.orderseat.common.enums.ValidEnum;
import com.orderseat.common.utils.system.COMMON;
import com.orderseat.dal.model.SeatModel;
import com.orderseat.dal.model.SeatOccupyTimeModel;
import com.orderseat.redis.service.RedisService;
import com.orderseat.service.manage.SeatManageService;
import com.orderseat.service.repository.OrderSeatRepository;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author: tyoukai
 * @date: 2019-11-27 21:08
 * @description: 座位管理实现类
 * @version: v1.0
 */
public class SeatManageServiceImpl implements SeatManageService {

    @Autowired
    private RedisService redisService;

    @Resource(name="redisExecutor")
    private ThreadPoolTaskExecutor redisExecutorPool;

    @Autowired
    private OrderSeatRepository orderSeatRepository;


    @Override
    public List<String> getSeatFromRedis() {
        String redisListPattern = COMMON.REDIS_LIST_NAME_PREFIX + COMMON.REDIS_SEPARATOR;
        Set<String> keys = redisService.keys(redisListPattern);
        List<String> seatList = new ArrayList<>();
        // TODO 具体采用什么策略从redis的不同队列中拿数据
        return null;
    }

    @Override
    public void persistence(List<String> list) {
        for (String seatInfo : list) {
            JSONObject jsonObject = JSON.parseObject(seatInfo);
            String seatKey = COMMON.REDIS_SEAT_NAME_PREFIX + COMMON.REDIS_SEPARATOR + jsonObject.getString("id");
            if (StringUtils.isNotBlank((String) redisService.get(seatKey))) {
                return;
            }

            try {
                SeatOccupyTimeModel seatOccupyTimeModel = new SeatOccupyTimeModel();
                seatOccupyTimeModel.setSeatId(jsonObject.getString("id"));
                seatOccupyTimeModel.setStartTime(DateUtils.parseDate(jsonObject.getString("startTime"), "yyyyMMdd:HHmmss"));
                seatOccupyTimeModel.setStartTime(DateUtils.parseDate(jsonObject.getString("endTime"), "yyyyMMdd:HHmmss"));
                seatOccupyTimeModel.setUserId(jsonObject.getString("userId"));
                seatOccupyTimeModel.setValid(ValidEnum.TRUE);
                orderSeatRepository.add(seatOccupyTimeModel);

                redisService.set(seatKey, seatInfo, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
