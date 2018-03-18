package com.env.setting.response;

import java.io.Serializable;

/**
 * @Intro: 对返回数据封装
 *
 * @Author: WangJiongDa(yunkai)
 * @Date: 2018/3/9
 * @Time: 下午7:52
 */
public class RpcResult<T> implements Serializable{

    private Boolean success;

    private Integer errorCode;

    private String errorMsg;

    private T value;

    private RpcResult(){

    }

    public static <T> RpcResult<T> ofSuccess(T value){
        RpcResult rpcResult = new RpcResult();
        rpcResult.setErrorCode(200);
        rpcResult.setSuccess(true);
        rpcResult.setErrorMsg("");
        rpcResult.setValue(value);
        return rpcResult;
    }

    public static <T> RpcResult<T> ofError(Integer errorCode, String errorMsg){
        RpcResult rpcResult = new RpcResult();
        rpcResult.setValue(false);
        rpcResult.setErrorCode(errorCode);
        rpcResult.setErrorMsg(errorMsg);
        rpcResult.setValue("");
        return  rpcResult;
    }



    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "RpcResult{" +
                "success=" + success +
                ", errorCode=" + errorCode +
                ", errorMsg=" + errorMsg +
                ", value=" + value +
                '}';
    }

}
