/**
 * 
 */
package com.wubu.myshop.domain;

import com.wubu.myshop.dao.domain.UserInfoBean;

/** <p>Title: UserInfo </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年6月14日 上午11:16:57
 */
public class UserInfo extends UserInfoBean{

	private String userLogin;
	
	public String getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
}
