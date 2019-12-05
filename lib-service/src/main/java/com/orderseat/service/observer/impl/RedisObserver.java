package com.orderseat.service.observer.impl;

import com.orderseat.service.facade.OrderSeatServiceImpl;
import com.orderseat.service.manage.SeatManageService;
import com.orderseat.service.observer.Observer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author: tyoukai
 * @date: 2019-12-03 08:08
 * @description: redis观察者实现类
 * @version: v1.0
 */
@Service
public class RedisObserver implements Observer {

    @Autowired
    private SeatManageService seatManageService;

    @PostConstruct
    public void init() {
        OrderSeatServiceImpl.observers.add(this);
    }

    @Override
    public void process() {
        seatManageService.getSeatFromRedis();
    }
}
