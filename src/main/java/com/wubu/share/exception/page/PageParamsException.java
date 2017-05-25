/**
* @Title: PageParamsException.java
* @Package com.uubee.consumer.exception.page
* @Description: TODO(用一句话描述该文件做什么)
* @author xiangf@uubee.com
* @date 2016年10月31日
* @version V1.0
*/
package com.wubu.share.exception.page;

import java.util.Map;

import com.wubu.share.enums.ErrorCode;
import com.wubu.share.exception.BaseException;



/**
* @ClassName: PageParamsException
* @Description: 页面参数校验错误
* @author xiangf@uubee.com
* @date 2016年10月31日
*
*/
public class PageParamsException extends PageRetException {

	public PageParamsException(BaseException baseException) {
		super(baseException.getErrorCode(),baseException.getErrorMsg());
	}

	public PageParamsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PageParamsException(ErrorCode errorCode, String page, Map errorAttr) {
		super(errorCode, page, errorAttr);
		// TODO Auto-generated constructor stub
	}

	public PageParamsException(ErrorCode errorCode, String page) {
		super(errorCode, page);
		// TODO Auto-generated constructor stub
	}

	public PageParamsException(ErrorCode errorCode) {
		super(errorCode);
		// TODO Auto-generated constructor stub
	}

	public PageParamsException(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
		// TODO Auto-generated constructor stub
	}

	public PageParamsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PageParamsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PageParamsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PageParamsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
