package com.orderseat.common.utils.system;

public class Random {

    private static java.util.Random random = new java.util.Random();

    public static int getRandomNum(int scope) {
        return random.nextInt(scope);
    }
}
