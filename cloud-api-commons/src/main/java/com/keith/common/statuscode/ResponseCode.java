package com.keith.common.statuscode;

/**
 * @author keith
 * @version 1.0
 * @date 2020-04-13
 **/
public enum ResponseCode {

    /**
     * 执行失败
     */
    ERROR(0, "ERROR"),
    /**
     * 执行成功
     */
    SUCCESS(1, "SUCCESS");

    private final int code;
    private final String desc;


    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
