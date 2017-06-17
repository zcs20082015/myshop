/**
 * 
 */
package com.wubu.myshop.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.wubu.myshop.domain.UserInfo;
import com.wubu.share.controller.BaseController;
import com.wubu.share.domain.base.BaseResBean;

/** <p>Title: CommonController </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年5月3日 下午4:06:07
 */
@Controller
public class CommonController extends BaseController{

	public BaseResBean com(){
		UserInfo user=new UserInfo();
		return null;
	}
}
