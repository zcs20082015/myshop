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
public class BusiException extends BaseException{

	public BusiException(){
		super(ErrorCode.SYS_FAIL);
	}
	
	public BusiException(ErrorCode errorCode){
		super(errorCode);
	}
	
	public BusiException(String code,String msg){
		super(code,msg);
	}
	public BusiException(String msg){
		super(ErrorCode.SYS_FAIL.code,msg);
	}
	
	public BusiException(String message, Throwable cause) {
        super(message, cause);
    }
}
