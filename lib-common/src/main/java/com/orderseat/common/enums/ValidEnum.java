package com.orderseat.common.enums;

public enum ValidEnum {
    /**
     * 有效
     */
    TRUE("1", "有效"),

    /**
     * 无效
     */
    FALSE("0", "无效")
    ;

    private String code;

    private String desc;

    ValidEnum(String code, String desc) {
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
}
