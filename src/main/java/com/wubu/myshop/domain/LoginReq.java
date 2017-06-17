/**
 * 
 */
package com.wubu.myshop.domain;

import com.wubu.share.domain.base.BaseReqBean;

/** <p>Title: LoginReq </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年5月18日 下午1:58:49
 */
public class LoginReq extends BaseReqBean{

	private static final long serialVersionUID = 1L;

	private String password;
	
	private String verify_code;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerify_code() {
		return verify_code;
	}

	public void setVerify_code(String verify_code) {
		this.verify_code = verify_code;
	}
}
