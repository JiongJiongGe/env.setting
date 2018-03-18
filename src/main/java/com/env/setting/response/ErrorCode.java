package com.env.setting.response;

/**
 * @Intro:  状态错误码
 * @Author: WangJiongDa(yunkai)
 * @Date: 2018/3/9
 * @Time: 下午7:51
 */
public enum ErrorCode {

    BIZ_ERROR("%s错误", 100001);

    private String msg;

    private Integer code;

    ErrorCode(String msg, Integer code){
        this.msg = msg;
        this.code = code;
    }

    public String getMsg(Object... param) {
        return String.format(msg, param);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
