package com.orderseat.starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: tyoukai
 * @date: 2019-12-03 20:33
 * @description: 启动类
 * @version: v1.0
 */
public class Starter {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("orderseat-starter.xml");
    }
}
