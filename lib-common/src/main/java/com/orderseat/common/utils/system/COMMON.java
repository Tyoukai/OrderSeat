package com.orderseat.common.utils.system;

/**
 * @author: tyoukai
 * @date: 2019-11-26 8:47
 * @description: 常量类
 * @version: v1.0
 */
public class COMMON {
    public static String REDIS_LIST_NAME_PREFIX = "ORDER_SEAT_LIST";

    public static String REDIS_SEAT_NAME_PREFIX = "SEAT_IN_DB";

    public static String REDIS_SEPARATOR = "@_@!!";

    public static String ORDER_SEAT_RESPONSE_STATUS_SUCCESS = "0";

    public static String ORDER_SEAT_RESPONSE_STATUS_FAIL = "1";

    public static String ORDER_SEAT_RESPONSE_STATUS_WAIT = "2";

    public static String ORDER_HOUR_FORMATE = "HH:00";

    public static int REDIS_SCOPE = 20;
}
