package com.orderseat.service.facade;

import com.orderseat.facade.OrderSeatService;
import com.orderseat.facade.dto.OrderSeatDto;
import com.orderseat.facade.request.OrderSeatRequest;
import com.orderseat.facade.response.OrderSeatResponse;
import org.apache.thrift.TException;

import java.util.List;

/**
 * @author: tyoukai
 * @date: 2019-11-21 08:37
 * @description: 占座实现类
 * @version: v1.0
 */
public class OrderSeatServiceImpl implements OrderSeatService.Iface {

    @Override
    public OrderSeatResponse orderSeat(OrderSeatRequest request) throws TException {
        List<OrderSeatDto> list = request.getOrderSeatDtoList();
        // TODO 占座的具体实现，涉及到redis等相关操作
        return null;
    }


}
