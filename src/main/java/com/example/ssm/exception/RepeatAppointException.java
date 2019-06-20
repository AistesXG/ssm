package com.example.ssm.exception;

/**
 * @author furg@senthink.com
 * @date 2019/6/20
 */
public class RepeatAppointException extends RuntimeException {


    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
