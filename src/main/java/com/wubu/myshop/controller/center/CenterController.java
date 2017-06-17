/**
 * 
 */
package com.wubu.myshop.controller.center;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.wubu.myshop.dao.domain.UserInfoBean;
import com.wubu.myshop.domain.UserInfo;
import com.wubu.myshop.service.IUserService;
import com.wubu.share.controller.BaseController;
import com.wubu.share.domain.base.BaseResBean;
import com.wubu.share.enums.ErrorCode;
import com.wubu.share.exception.ParamException;
import com.wubu.share.exception.SessionTimeOutException;
import com.wubu.share.util.FuncUtils;

/** <p>Title: CenterController </p>
 * <p>Description: 个人中心</p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年5月27日 上午10:18:36
 */
public class CenterController extends BaseController{

	@Resource
	private IUserService userService;
	
	public BaseResBean resetPassword(String old_pass,String new_pass){
		 
		String correlationID=session.getId();
		String user_id=(String) session.getAttribute("user_id");
		log.info(tag+"进入用户密码修改处理方法","resetPassword",correlationID,user_id);
		
		//session校验
		if(null==user_id){
			throw new SessionTimeOutException();
		}
		
		//请求参数校验
		if(FuncUtils.isNull(old_pass)||FuncUtils.isNull(new_pass)){
			throw new ParamException();
		}
		
		//查询用户信息
		UserInfoBean user=singleQueryUserInfo(user_id, null, correlationID);
		
		//老密码校验
		passwordCheck(old_pass, user.getPassword(), user_id, correlationID);
		
		//更新新密码
		updatePassword(user.getOidUserno(),new_pass,correlationID);
		
		//返回成功
		return buildSuccRes();
	}
	/**
	 * <p>Function: 更新用户密码</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年6月14日 上午10:46:58
	 */
	private void updatePassword(String oid_userno,String new_pass,String correlationID){
		UserInfo user=new UserInfo();
		user.setCorrelationID(correlationID);
		user.setOidUserno(oid_userno);
		user.setPassword(new_pass);
		userService.updateUserInfo(user);
	}
}
