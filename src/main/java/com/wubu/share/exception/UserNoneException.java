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
public class UserNoneException extends BaseException{

	public UserNoneException(){
		super(ErrorCode.USER_NOT_EXIST);
	}
}
