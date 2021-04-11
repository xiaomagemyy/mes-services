package com.unilever.hefei.mes.common.entity;

import java.io.Serializable;

/**
 * 返回结果实体类
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private String msg;
    private T data;

    public Result()
    {
    }

    public Result(String code, String msg, T data)
    {
        assert (code != null);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Result(String code,String msg){
        assert (code != null);
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return this.code.endsWith("0000");
    }
}
