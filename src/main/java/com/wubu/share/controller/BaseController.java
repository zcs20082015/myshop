/**
 * 
 */
package com.wubu.share.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import com.wubu.share.domain.base.BaseResBean;
import com.wubu.share.enums.ErrorCode;
import com.wubu.share.util.FuncUtils;
import com.wubu.share.util.UuidUtil;

/** <p>Title: BaseController </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年5月3日 下午4:05:27
 */
@Controller
public class BaseController {

	protected Logger log = LoggerFactory.getLogger(BaseController.class);
	protected String tag="Method[{}],correlationID[{}],mob_user[{}]--";
	
	protected String correlationID=UuidUtil.getUuid();
	
	/**
	 * <p>Function: 构建成功返回对象</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月12日 上午9:43:43
	 */
	protected BaseResBean buildSuccRes(){
		BaseResBean res=new BaseResBean();
		res.setRet_code(ErrorCode.SUCCESS.code);
		res.setRet_msg(ErrorCode.SUCCESS.msg);
		return res;
	}

	public String getCorrelationID() {
		return correlationID;
	}

	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}
	
}
