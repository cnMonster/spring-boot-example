package com.example.exception;

import java.text.MessageFormat;

/**
 * 基础异常
 *
 * @author mengqiang
 */
public class BaseException extends RuntimeException {

    protected String msg;

    protected BaseException(String message) {
        super(message);
    }

    protected BaseException(String msgFormat, Object... args) {
        super(MessageFormat.format(msgFormat, args));
        this.msg = MessageFormat.format(msgFormat, args);
    }

    public String getMsg() {
        return this.msg;
    }

}