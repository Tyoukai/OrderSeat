package com.orderseat.service.observer.impl;

import com.orderseat.service.manage.SeatManageService;
import com.orderseat.service.observer.Observer;
import org.springframework.beans.factory.annotation.Autowired;

public class RedisObserver implements Observer {

    @Autowired
    private SeatManageService seatManageService;

    @Override
    public void process() {

    }
}
