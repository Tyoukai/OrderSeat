package com.orderseat.service.manage.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.orderseat.common.enums.ValidEnum;
import com.orderseat.common.utils.system.COMMON;
import com.orderseat.common.utils.system.Random;
import com.orderseat.dal.model.SeatOccupyTimeModel;
import com.orderseat.redis.service.RedisService;
import com.orderseat.service.manage.SeatManageService;
import com.orderseat.service.repository.OrderSeatRepository;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author: tyoukai
 * @date: 2019-11-27 21:08
 * @description: 座位管理实现类
 * @version: v1.0
 */
@Component
public class SeatManageServiceImpl implements SeatManageService {

    @Autowired
    private RedisService redisService;

    @Resource(name="redisExecutor")
    private ThreadPoolTaskExecutor redisExecutorPool;

    @Resource(name = "OrderSeatRepositoryImpl")
    private OrderSeatRepository orderSeatRepository;

    @Value("${redis.timeScope}")
    private int timeScope;

    private static Set<String> keys = new CopyOnWriteArraySet<>();

    @Override
    public void getSeatFromRedis() {
        // ORDER_SEAT_LIST@_@!!*
        String redisListPattern = COMMON.REDIS_LIST_NAME_PREFIX + COMMON.REDIS_SEPARATOR + COMMON.REDIS_WILDCARD;
        Set<String> currentKeys = redisService.keys(redisListPattern);
        for (String key : currentKeys) {
            if (! keys.contains(key)) {
                keys.add(key);
                redisExecutorPool.submit(() -> realGetSeatFromRedisAndPersistence(key));
            }
        }
    }

    @Override
    public void persistence(String seatInfo) {
        if (StringUtils.isBlank(seatInfo)) {
            return;
        }
        JSONObject jsonObject = JSON.parseObject(seatInfo);
        String seatKey = COMMON.REDIS_SEAT_NAME_PREFIX + COMMON.REDIS_SEPARATOR + jsonObject.getString("startTime") +
                COMMON.REDIS_SEPARATOR + jsonObject.getString("endTime") + COMMON.REDIS_SEPARATOR + jsonObject.getString("id");
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


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 从redis的具体队列中获取数据，目前的获取逻辑是：
     *
     * 从队列的前20个值中随机选择一个：防止靠前的请求是某些同学通过程序抢的
     *
     * 暂时不考虑：若队列长度不到20，等到1s，然后从中随机挑选一个， 存在一个问题：如果所有队列的list长度都不到20
     *
     * 那线程池处理就会很慢
     *
     * @param key
     */
    private void realGetSeatFromRedisAndPersistence(String key) {
        String luckyGuy = "";
        long sTime = System.currentTimeMillis();
        // 当取出的数据不为空，并且时间小于1s时
        while (StringUtils.isBlank(luckyGuy)) {
            if ((System.currentTimeMillis() - sTime) < timeScope ) {
                continue;
            }
            // 队列长度 > 20 从队列的前20个元素取数，不然从队列长度中取数
            int size = redisService.lGetListSize(key) > COMMON.REDIS_SCOPE ? COMMON.REDIS_SCOPE : (int) redisService.lGetListSize(key);
            int index = Random.getRandomNum(size);
            luckyGuy = (String) redisService.lIndex(key, index);

            JSONObject jsonObject = JSON.parseObject(luckyGuy);
            String startTime = jsonObject.getString("startTime");
            String endTime = jsonObject.getString("endTime");
            // redis中存放的key
            String seatKey = COMMON.REDIS_SEAT_NAME_PREFIX + COMMON.REDIS_SEPARATOR + startTime +
                    COMMON.REDIS_SEPARATOR + endTime + COMMON.REDIS_SEPARATOR + jsonObject.getString("id");
            try {
                Date endDate = DateUtils.parseDate(endTime, "yyyyMMddHHmm");
                long seconds = (endDate.getTime() - System.currentTimeMillis()) / 1000;
                redisService.set(seatKey, luckyGuy, seconds);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            redisService.del(key);
        }
        persistence(luckyGuy);
        keys.remove(key);
    }
}
