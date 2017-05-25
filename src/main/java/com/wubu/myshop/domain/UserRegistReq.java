/**
 * 
 */
package com.wubu.myshop.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;

import com.wubu.share.domain.base.BaseReqBean;

/** <p>Title: UserRegistReq </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年5月10日 下午10:48:55
 */
public class UserRegistReq extends BaseReqBean{

	private static final long serialVersionUID = 1L;
	
	@NotNull(message="user_id not null")
	private String user_id;
	@NotNull(message="mob_user not null")
	@Pattern(regexp = "^1[3-8]\\d{9}$", message = "请输入正确的手机号")
	private String mob_user;

	private String name_user;
	
	private String sex_user;
	//@Email(message="it is not a right email address")
	private String email;
	@NotNull(message="password not null")
	private String password;
	//@NotNull(message="verify_code not null")
	private String verify_code;
	
	private String date_birthday;
	

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getMob_user() {
		return mob_user;
	}

	public void setMob_user(String mob_user) {
		this.mob_user = mob_user;
	}

	public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public String getSex_user() {
		return sex_user;
	}

	public void setSex_user(String sex_user) {
		this.sex_user = sex_user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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


	public String getDate_birthday() {
		return date_birthday;
	}

	public void setDate_birthday(String date_birthday) {
		this.date_birthday = date_birthday;
	}
	
}
