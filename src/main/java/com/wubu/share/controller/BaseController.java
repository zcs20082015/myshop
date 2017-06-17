/**
 * 
 */
package com.wubu.share.controller;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.aliyun.openservices.shade.com.alibaba.rocketmq.shade.io.netty.channel.unix.Errors;
import com.wubu.myshop.domain.UserInfo;
import com.wubu.myshop.service.IUserService;
import com.wubu.share.domain.base.BaseResBean;
import com.wubu.share.enums.ErrorCode;
import com.wubu.share.exception.ParamException;
import com.wubu.share.exception.PasswordErrorException;
import com.wubu.share.exception.UserNoneException;
import com.wubu.share.util.FuncUtils;
import com.wubu.share.util.MD5Utils;
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
	protected String tag="Method[{}],correlationID[{}],user_login[{}]--";
    protected static String SESSION_KEY="myshop";
	
    @Autowired
    protected IUserService userService;
    
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
	
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

	/**
	 * <p>Function: 查询用户信息</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月27日 上午9:28:36
	 */
	protected UserInfo singleQueryUserInfo(String user_id,String mob_user,String correlationID){
		UserInfo user=(UserInfo) session.getAttribute(SESSION_KEY+"user");
		if(null==user){
			user=new UserInfo();
			user.setCorrelationID(correlationID);
			user.setUserId(user_id);
			user.setMobUser(mob_user);
			user=userService.singleQuery(user);
		}else{
			if(!FuncUtils.isNull(user_id)&&!user_id.equals(user.getUserId())){
				throw new UserNoneException();
			}
			if(!FuncUtils.isNull(mob_user)&&!mob_user.equals(user.getMobUser())){
				throw new UserNoneException();
			}
		}
		session.setAttribute(SESSION_KEY+"user", user);
		return user;
	}
	
	/**
	 * <p>Function: 请求参数校验</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年6月5日 下午10:36:09
	 */
	protected void paramValidate(BindingResult result,String method,String user_login,String correlationID){
		if (result.hasErrors()){
            List<ObjectError> errorList = result.getAllErrors();
            for(ObjectError error : errorList){
            	log.info(tag + "请求参数["+error.getObjectName()+"]校验失败："+error.getDefaultMessage(),method,correlationID,user_login);
                throw new ParamException(error.getDefaultMessage());
            }
        }
	}
	/**
	 * <p>Function: 密码校验</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年6月14日 上午10:28:19
	 */
	protected void passwordCheck(String pass1,String pass2,String user_id,String correlationID){
		pass1=MD5Utils.MD5Encrpytion(pass1);
		pass1=MD5Utils.MD5Encrpytion(pass1);
		if(!pass1.equals(pass2)){
			log.info(tag + "登陆密码错误","passwordCheck",correlationID,user_id);
			throw new PasswordErrorException();
		}
	}
}
