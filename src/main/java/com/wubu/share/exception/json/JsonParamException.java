package com.wubu.share.exception.json;

import java.util.Map;

import com.wubu.share.enums.ErrorCode;



/**
 * 请求参数异常类
 * Created by king on 9/21/16.
 */
public class JsonParamException extends JsonRetException {



	public JsonParamException(ErrorCode errorCode) {
		super(errorCode, null);
	}
	
	public JsonParamException(String errorCode,String errorMsg) {
		super(errorCode,errorMsg, null);
	}

	
}
