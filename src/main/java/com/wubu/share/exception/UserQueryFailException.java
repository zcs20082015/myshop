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
public class UserQueryFailException extends BaseException{

	public UserQueryFailException(){
		super(ErrorCode.USER_INFO_QUERY_FAIL);
	}
	
	public UserQueryFailException(String reason){
		super(ErrorCode.USER_INFO_QUERY_FAIL.code,reason);
	}
}
