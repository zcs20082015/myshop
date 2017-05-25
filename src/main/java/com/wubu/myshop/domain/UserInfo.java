/**
 * 
 */
package com.wubu.myshop.domain;

import com.wubu.share.domain.base.BaseReqBean;

/** <p>Title: UserInfo </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年5月4日 上午11:32:20
 */
public class UserInfo extends com.wubu.myshop.dao.domain.UserInfo{

	
	private static final long serialVersionUID = 1L;

	public String userLogin;

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	
	
}
