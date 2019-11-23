package com.orderseat.common.enums;


import org.apache.commons.lang3.StringUtils;

public enum SeatTypeEnum {
    /**
     * 普通座位
     */
    COMMON("1", "普通"),

    /**
     * 雅座
     */
    ELEGANT("2", "雅座");

    private String code;

    private String desc;

    SeatTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static SeatTypeEnum getEnumByCode(String code) {
        for (SeatTypeEnum seatTypeEnum : values()) {
            if (StringUtils.equals(seatTypeEnum.getCode(), code)) {
                return seatTypeEnum;
            }
        }
        return null;
    }
}
