package com.orderseat.service.facade;

import com.alibaba.fastjson.JSONObject;
import com.orderseat.common.utils.system.COMMON;
import com.orderseat.facade.OrderSeatService;
import com.orderseat.facade.dto.OrderSeatDto;
import com.orderseat.facade.request.OrderSeatRequest;
import com.orderseat.facade.response.OrderSeatResponse;
import com.orderseat.facade.response.Result;
import com.orderseat.redis.service.RedisService;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.orderseat.common.utils.system.COMMON.ORDER_SEAT_RESPONSE_STATUS_WAIT;

/**
 * @author: tyoukai
 * @date: 2019-11-21 08:37
 * @description: 占座实现类
 * @version: v1.0
 */
public class OrderSeatServiceImpl implements OrderSeatService.Iface {

    @Autowired
    private RedisService redisService;

    @Override
    public OrderSeatResponse orderSeat(OrderSeatRequest request) throws TException {
        List<OrderSeatDto> orderSeatDtoList = request.getOrderSeatDtoList();
        List<JSONObject> requestList = orderSeatDtoList.stream().map(this::covert2Json).collect(Collectors.toList());

        // 将请求数据放入redis的list中
        // list的命名方式为 固定前缀 + 座位的唯一id
        for (JSONObject jsonObject : requestList) {
            String startTime = jsonObject.getString("startTime");
            String endTime = jsonObject.getString("endTime");

            // ORDER_SEAT_LIST@_@!!201911270800@_@!!201911271000@_@!!1
            // 规则  固定值@_@!!开始时间@_@!!结束时间@_@!!座位id
            String redisListName = COMMON.REDIS_LIST_NAME_PREFIX + COMMON.REDIS_SEPARATOR + startTime +
                    COMMON.REDIS_SEPARATOR + endTime + COMMON.REDIS_SEPARATOR + jsonObject.getString("id");
            redisService.rPush(redisListName, jsonObject.toString());
        }

        OrderSeatResponse orderSeatResponse = new OrderSeatResponse();
        List<Result> resultList = new ArrayList<>();
        for (OrderSeatDto orderSeatDto : orderSeatDtoList) {
            resultList.add(covert2Result(orderSeatDto, ORDER_SEAT_RESPONSE_STATUS_WAIT));
        }
        orderSeatResponse.setSeatResult(resultList);
        return orderSeatResponse;
    }

    private JSONObject covert2Json(OrderSeatDto orderSeatDto) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", orderSeatDto.getId());
        jsonObject.put("startTime", orderSeatDto.getStartTime());
        jsonObject.put("endTime", orderSeatDto.getEndTime());
        jsonObject.put("userId", orderSeatDto.getUserId());
        return jsonObject;
    }

    private Result covert2Result(OrderSeatDto orderSeatDto, String status) {
        Result result = new Result();
        result.setOrderSeatDto(orderSeatDto);
        result.setStatus(status);
        return result;
    }


}
