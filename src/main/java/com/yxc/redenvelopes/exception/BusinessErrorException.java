package com.yxc.redenvelopes.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Yang Xichun
 * @date 2022/10/9 20:32
 */
@Getter
@Setter
public class BusinessErrorException extends RuntimeException {

    private static final long serialVersionUID = -7480022450501770631L;

    private String code;

    private String msg;

    public BusinessErrorException(BusinessExceptionMsgEnum businessExceptionMsgEnum) {
        this.code = businessExceptionMsgEnum.getCode();
        this.msg = businessExceptionMsgEnum.getMsg();
    }

}
