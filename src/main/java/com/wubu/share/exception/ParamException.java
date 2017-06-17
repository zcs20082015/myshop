/**
 * 
 */
package com.wubu.share.exception;

import com.wubu.share.enums.ErrorCode;

/** <p>Title: ParamException </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年6月5日 下午10:00:06
 */
public class ParamException extends BaseException{

	public ParamException(){
		super(ErrorCode.SYS_CHECK_PARAM_ERROR);
	}
	
	public ParamException(String param){
		super(ErrorCode.SYS_CHECK_PARAM_ERROR.code,"请求参数["+param+"]校验失败");
	}
}
