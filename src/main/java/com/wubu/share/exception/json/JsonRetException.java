package com.wubu.share.exception.json;

import com.wubu.share.domain.base.BaseResBean;
import com.wubu.share.enums.ErrorCode;
import com.wubu.share.exception.BaseException;

/**
* @Title: JsonRetException.java
* @Package com.uubee.consumer.exception
* @Description: TODO(用一句话描述该文件做什么)
* @author xiangf@uubee.com
* @date 2016年10月24日
* @version V1.0
*/



/**
* @ClassName: JsonRetException
* @Description: 抛出错误并返回JSON或其他形式的字符串返回值
* @author xiangf@uubee.com
* @date 2016年10月24日
*
*/
public class JsonRetException extends BaseException {

	protected BaseResBean res = new BaseResBean();

	private String transcode = "";
	
	public JsonRetException(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
	}
	public JsonRetException(ErrorCode code, BaseResBean res) {
		super(code.code, code.msg);
		setRes(res);
	}
	public JsonRetException(String code, String msg, BaseResBean res) {
		super(code, msg);
		setRes(res);
	}

	public BaseResBean getRes() {
		return res;
	}

	public void setRes(BaseResBean res) {
		this.res = res;
	}
	public JsonRetException(BaseException baseException, String transcode) {
		super();
		this.errorCode = baseException.getErrorCode();
		this.errorMsg = baseException.getErrorMsg();
		this.transcode = transcode;
	}
	
	
	
	
	
}
