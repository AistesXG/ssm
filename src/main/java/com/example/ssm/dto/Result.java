package com.example.ssm.dto;

/**
 * @author furg@senthink.com
 * @date 2019/6/20
 */
public class Result<T> {

    private boolean success;
    private T data;
    private String error;

    public Result() {
    }

    public Result(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public Result(boolean success, String error) {
        this.success = success;
        this.error = error;
    }
}
