package com.example.ssm.exception;

/**
 * @author furg@senthink.com
 * @date 2019/6/20
 */
public class AppointException extends RuntimeException{

    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message ,cause);
    }
}
