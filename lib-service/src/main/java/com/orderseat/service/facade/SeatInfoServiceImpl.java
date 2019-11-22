package com.orderseat.service.facade;

import com.orderseat.facade.SeatInfoService;
import com.orderseat.facade.request.SeatInfoRequest;
import com.orderseat.facade.response.SeatInfoResponse;
import org.apache.thrift.TException;

/**
 * @author: tyoukai
 * @date: 2019-11-22 12:37
 * @description: 座位查询实现类
 * @version: v1.0
 */
public class SeatInfoServiceImpl implements SeatInfoService.Iface {
    @Override
    public SeatInfoResponse search(SeatInfoRequest request) throws TException {
        return null;
    }

    @Override
    public SeatInfoResponse add(SeatInfoRequest request) throws TException {
        return null;
    }

    @Override
    public SeatInfoResponse deleteSeat(SeatInfoRequest request) throws TException {
        return null;
    }
}
