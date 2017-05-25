package com.wubu.share.domain.base;

import java.io.Serializable;

/**
 * <p>Title: BaseReqBean </p>
 * <p>Description: 请求参数基础Bean类</p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author liuzhy@uubee.com
 * @date 2015-9-17 下午8:24:41
 */
public class BaseReqBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String correlationID;

	private String user_id;
	
	private String user_login;
	
	private String mob_user;
	
	
	public String getCorrelationID() {
		return correlationID;
	}

	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_login() {
		return user_login;
	}

	public void setUser_login(String user_login) {
		this.user_login = user_login;
	}

	public String getMob_user() {
		return mob_user;
	}

	public void setMob_user(String mob_user) {
		this.mob_user = mob_user;
	}
}
