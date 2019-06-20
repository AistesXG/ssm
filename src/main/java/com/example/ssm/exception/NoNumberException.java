package com.example.ssm.exception;

/**
 * @author furg@senthink.com
 * @date 2019/6/20
 */
public class NoNumberException extends RuntimeException {


    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
