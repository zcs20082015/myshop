/**
* @Title: PageRetException.java
* @Package com.uubee.consumer.exception
* @Description: TODO(用一句话描述该文件做什么)
* @author xiangf@uubee.com
* @date 2016年10月24日
* @version V1.0
*/
package com.wubu.share.exception.page;

import java.util.Map;

import com.wubu.share.enums.ErrorCode;
import com.wubu.share.exception.BaseException;



/**
* @ClassName: PageRetException
* @Description: 抛出错误并跳转到指定页面
* @author xiangf@uubee.com
* @date 2016年10月24日
*
*/
public class PageRetException extends BaseException {
	
	protected String page = "error";
	
	protected String title = "借款失败";
	
	protected Map errorAttr;

	public PageRetException() {
		super();
	}

	public PageRetException(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
	}

	public PageRetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PageRetException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public PageRetException(BaseException baseException) {
		super(baseException.getErrorMsg(), baseException);
		this.errorCode = baseException.getErrorCode();
		this.errorMsg = baseException.getErrorMsg();
		
	}

	public PageRetException(String message) {
		super(message);
	}



	public PageRetException(Throwable cause) {
		super(cause);
	}

	public PageRetException(ErrorCode errorCode) {
		this(errorCode.code, errorCode.msg);
	}

	public PageRetException(ErrorCode errorCode, String page ) {
		this(errorCode, page, null);
	}
	
	public PageRetException(ErrorCode errorCode, String page, Map errorAttr) {
		super(errorCode.code, errorCode.msg);
		setPage(page);
		setErrorAttr(errorAttr);
	}
	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public Map getErrorAttr() {
		return errorAttr;
	}

	public void setErrorAttr(Map errorAttr) {
		this.errorAttr = errorAttr;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
	
	

}
