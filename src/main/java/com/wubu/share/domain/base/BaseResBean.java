package com.wubu.share.domain.base;

import java.io.Serializable;

/**
 * <p>Title: BaseResBean </p>
 * <p>Description: 响应参数基础Bean类</p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author liuzhy@uubee.com
 * @date 2015-9-17 下午8:46:03
 */
public class BaseResBean implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 返回码   0000:交易成功
	 */
	private String ret_code;
	/**
	 * 返回信息
	 */
	private String ret_msg;

	public String getRet_code() {
		return ret_code;
	}
	public void setRet_code(String ret_code) {
		this.ret_code = ret_code;
	}
	public String getRet_msg() {
		return ret_msg;
	}
	public void setRet_msg(String ret_msg) {
		this.ret_msg = ret_msg;
	}


}
