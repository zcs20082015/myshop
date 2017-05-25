/**
 * 
 */
package com.wubu.share.domain.base;

import com.wubu.share.pojo.BasePageQuery;

/** <p>Title: BaseBean </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年5月4日 下午3:13:07
 */
public class BaseBean extends BasePageQuery{

	private static final long serialVersionUID = 1L;

	private String correlationID;
	/**
	 * 返回码   0000:交易成功
	 */
	private String ret_code;
	/**
	 * 返回信息
	 */
	private String ret_msg;
	
	
	public String getCorrelationID() {
		return correlationID;
	}
	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}
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
