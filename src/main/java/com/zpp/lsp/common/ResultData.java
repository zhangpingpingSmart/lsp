package com.zpp.lsp.common;

import lombok.Data;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 11:53
 */
public class ResultData {
    private int status;
    private String message;
    private Object data;

    public static int succesStatus = 0;
    public static int failStatus = 1;

    public ResultData(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static  ResultData success(Object data) {
        return new ResultData(succesStatus, "success", data);
    }

    public static  ResultData success(String message) {
        return new ResultData(succesStatus, message, null);
    }

    public static  ResultData success(String message, Object data) {
        return new ResultData(succesStatus, message, data);
    }

    public static  ResultData failure() {
        return new ResultData(failStatus, "failure", null);
    }

    public static  ResultData failure(String message, Object data) {
        return new ResultData(failStatus, message, data);
    }

    public static  ResultData failure(String message) {
        return new ResultData(failStatus, message, null);
    }

    public static  ResultData message(boolean isSuccess, String message) {
        return new ResultData(isSuccess ? succesStatus : failStatus, message, null);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return  data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
