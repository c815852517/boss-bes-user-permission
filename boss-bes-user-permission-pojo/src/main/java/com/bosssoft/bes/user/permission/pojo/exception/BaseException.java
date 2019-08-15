package com.bosssoft.bes.user.permission.pojo.exception;

public class BaseException extends  RuntimeException {
    private String code;

    public BaseException(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }
}
