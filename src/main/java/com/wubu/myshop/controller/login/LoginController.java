/**
 * 
 */
package com.wubu.myshop.controller.login;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.alibaba.fastjson.JSON;
import com.wubu.myshop.domain.LoginReq;
import com.wubu.myshop.domain.UserInfo;
import com.wubu.myshop.domain.UserRegistReq;
import com.wubu.myshop.service.IUserService;
import com.wubu.share.controller.BaseController;
import com.wubu.share.domain.base.BaseResBean;
import com.wubu.share.enums.ErrorCode;
import com.wubu.share.exception.json.JsonParamException;
import com.wubu.share.exception.json.JsonRetException;
import com.wubu.share.exception.page.PageParamsException;
import com.wubu.share.exception.page.PageRetException;
import com.wubu.share.util.FuncUtils;


/** <p>Title: LoginController </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年5月3日 下午4:04:55
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{

	@Resource
	private IUserService userService;
	
	@RequestMapping("/index")
	public String index(){
		String correlationID=session.getId();
		log.info(tag+"进入主页","tologin",correlationID,null);
		
		return "index";
	}
	
	/**
	 * <p>Function: 用户注册</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月4日 上午11:35:29
	 */
	@RequestMapping("/regist")
	@ResponseBody
	public BaseResBean regist(@RequestBody @Valid UserRegistReq userRegistReq,BindingResult result){
		String correlationID=session.getId();
		log.info(tag+"进入用户注册处理方法，请求参数：{}","regist",correlationID,null,JSON.toJSONString(userRegistReq));
		
		//参数校验
		if (result.hasErrors()){
            List<ObjectError> errorList = result.getAllErrors();
            for(ObjectError error : errorList){
            	log.info(tag + "用户注册接口，请求参数校验失败："+error.getDefaultMessage(),"regist",correlationID,null);
                throw new JsonParamException(ErrorCode.SYS_CHECK_PARAM_ERROR.code,error.getDefaultMessage());
            }
        }
		//验证码校验
		
		//用户信息校验
		existCheck(userRegistReq);
		//用户注册
		UserInfo userInfo=userService.userRegist(JSON.parseObject(JSON.toJSONString(userRegistReq), UserInfo.class));
		if(null==userInfo){
			throw new JsonRetException(ErrorCode.USER_REGISTER_FAIL,null);
		}
		log.info(tag + "用户注册成功，用户号：{}","regist",correlationID,null,userInfo.getOidUserno());
		
		return buildSuccRes();
	}
	
	/**
	 * <p>Function: userid/mob_user是否已经被占用</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月11日 下午12:32:18
	 */
	@RequestMapping("/exist")
	@ResponseBody
	public BaseResBean existCheck(String user_id,String mob_user){
		String correlationID=session.getId();
		log.info(tag+"进入用户[{}]信息存在性校验处理方法","existCheck",correlationID,mob_user,user_id);
		
		if(FuncUtils.isNull(user_id)&&FuncUtils.isNull(mob_user)){
			throw new JsonParamException(ErrorCode.VALIDATE_PARAM_ERROR);
		}
		UserInfo user=new UserInfo();
		if(!FuncUtils.isNull(user_id)){
			user.setCorrelationID(correlationID);
			user.setUserId(user_id);
			user=userService.singleQuery(user);
			if(null!=user){
				log.info(tag+"用户[{}]信息存在性校验处理方法，user_id已被占用--{}","existCheck",correlationID,null,user_id,JSON.toJSONString(user));
				throw new JsonRetException(ErrorCode.USER_ID_HAS_BEEN,null);
			}
		}
		
		if(!FuncUtils.isNull(mob_user)){
			user=new UserInfo();
			user.setCorrelationID(correlationID);
			user.setUserId(mob_user);
			user=userService.singleQuery(user);
			if(null!=user){
				log.info(tag+"用户[{}]信息存在性校验处理方法，mob_user已被占用--{}","existCheck",correlationID,mob_user,mob_user,JSON.toJSONString(user));
				throw new JsonRetException(ErrorCode.USER_MOB_HAS_BEEN,null);
			}
		}
		
		return buildSuccRes();
	}
	/**
	 * <p>Function: 登陆</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月18日 上午11:46:58
	 */
	@RequestMapping("login")
	public BaseResBean login(@RequestBody LoginReq loginReq){
		log.info(tag+"进入用户登陆处理方法，请求参数：{}","login",session.getId(),null,JSON.toJSONString(loginReq));
		
		
		return null;
	}
	private void existCheck(UserRegistReq req){
		
		UserInfo user=new UserInfo();
		user.setCorrelationID(session.getId());
		user.setUserId(req.getUser_id());
		user=userService.singleQuery(user);
		if(null!=user){
			log.info(tag+"用户[{}]信息存在性校验处理方法，user_id已被占用--{}","existCheck",session.getId(),null,req.getUser_id(),JSON.toJSONString(user));
			throw new JsonRetException(ErrorCode.USER_ID_HAS_BEEN,null);
		}
		user=new UserInfo();
		user.setCorrelationID(session.getId());
		user.setMobUser(req.getMob_user());
		user=userService.singleQuery(user);
		if(null!=user){
			log.info(tag+"用户[{}]信息存在性校验处理方法，mob_user已被占用--{}","existCheck",session.getId(),req.getMob_user(),req.getMob_user(),JSON.toJSONString(user));
			throw new JsonRetException(ErrorCode.USER_MOB_HAS_BEEN,null);
		}
	}
}
