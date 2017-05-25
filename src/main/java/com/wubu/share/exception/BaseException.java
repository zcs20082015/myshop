package com.wubu.share.exception;

/**
 * 基础异常类
 * Created by king on 9/21/16.
 */
public class BaseException extends RuntimeException {

    protected String errorCode;
    protected String errorMsg;

    public BaseException() {
        super();
    }

    public BaseException(String errorCode,String errorMsg) {
        super();
        setErrorCode(errorCode);
        setErrorMsg(errorMsg);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    protected BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
