package com.wubu.share.wrapper;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.wubu.share.util.FuncUtils;


/**
 * 服务化接口的处理结果<br>
 * 1.成功不需要设置, 处理失败时调用setErrorMessage方法设置错误信息 <br>
 * 2.客户端使用isSuccess()判断是否处理成功<br>
 * 3.当isSuccess()返回false时,客户端getCode()处理约定的错误码,getErrorMessage()获取详细的错误信息.
 * 
 * @author wangxf@yintong.com.cn
 * @date 2015年5月25日 下午3:06:40
 * 
 */
public class ResultSet implements Serializable {

	private static final long serialVersionUID = 2351993132790383939L;

	/**
	 * 返回的信息
	 */
	private Map<String, String> infos = new HashMap<String, String>();
	/**
	 * 错误日志
	 */
	private String errorMessage;
	/**
	 * 结果码标志, 结果码存放在infos中
	 */
	private static final String CODE = "code";
	private static final String SUCCESS = "success";

	/**
	 * 处理结果 1.true 表示成功 2.false表示失败
	 * 
	 * @return
	 */
	public boolean isSuccess() {
		return SUCCESS.equals(getCode());
	}

	public Map<String, String> getInfos() {
		return infos;
	}

	public void setInfos(Map<String, String> infos) {
		this.infos = infos;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * 设置错误信息
	 * 
	 * @param code
	 * @param errorMessage
	 */
	public void setErrorMessage(String code, String errorMessage) {
		infos.put(CODE, code);
		this.errorMessage = errorMessage;
	}

	/**
	 * 获取结果码, SUCCESS为成功 默认空时返回SUCCESS
	 * 
	 * @return
	 */
	public String getCode() {
		String code = infos.get(CODE);
		return FuncUtils.isNull(code) ? SUCCESS : code;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
