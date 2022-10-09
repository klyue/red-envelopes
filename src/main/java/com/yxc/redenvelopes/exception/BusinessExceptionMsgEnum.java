package com.yxc.redenvelopes.exception;

import lombok.Getter;

/**
 * @author Yang Xichun
 * @date 2022/10/9 20:33
 */
@Getter
public enum BusinessExceptionMsgEnum {

    /**
     * 参数值或者格式错误
     */
    PARAMETER_EXCEPTION("102", "参数异常"),

    /**
     * 调用下游服务超时
     */
    SERVICE_TIME_OUT("103", "服务调用超时"),


    /**
     * 其他系统内部异常
     */
    UNEXPECTED_EXCEPTION("500", "系统发生异常，请联系管理员");

    private String code;

    private String msg;

    BusinessExceptionMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
