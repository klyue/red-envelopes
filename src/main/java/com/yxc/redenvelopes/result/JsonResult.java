package com.yxc.redenvelopes.result;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Yang Xichun
 * @date 2022/10/9 17:27
 */
@Getter
@Setter
public class JsonResult<T> {

    private T data;

    private String code;

    private String msg;

    public JsonResult() {
        this.code = "0";
        this.msg = "操作成功！";
    }

    public JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(T data) {
        this.data = data;
        this.code = "0";
        this.msg = "操作成功!";
    }

    public JsonResult(T data, String msg) {
        this.data = data;
        this.code = "0";
        this.msg = msg;
    }

}
