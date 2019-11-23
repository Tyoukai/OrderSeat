package com.orderseat.common.enums;


public enum SeatTypeEnum {
    /**
     * 普通座位
     */
    COMMON(1, "普通"),

    /**
     * 雅座
     */
    ELEGANT(2, "雅座");

    private int code;

    private String desc;

    SeatTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static SeatTypeEnum getEnumByCode(int code) {
        for (SeatTypeEnum seatTypeEnum : values()) {
            if (code == seatTypeEnum.getCode()) {
                return seatTypeEnum;
            }
        }
        return null;
    }
}
