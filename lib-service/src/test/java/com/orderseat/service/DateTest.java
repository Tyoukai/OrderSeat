package com.orderseat.service;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date endDate = DateUtils.parseDate("201912241000", "yyyyMMddHHmm");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
//        Date date = simpleDateFormat.parse("201912241000");
        System.out.println(endDate.toString());

    }
}
