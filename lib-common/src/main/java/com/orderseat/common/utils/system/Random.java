package com.orderseat.common.utils.system;

/**
 * @author: tyoukai
 * @date: 2019-11-29 21:08
 * @description: 随机类
 * @version: v1.0
 */
public class Random {

    private static java.util.Random random = new java.util.Random();

    public static int getRandomNum(int scope) {
        return random.nextInt(scope);
    }
}
