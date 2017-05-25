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
	
	private String verify;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}
}
