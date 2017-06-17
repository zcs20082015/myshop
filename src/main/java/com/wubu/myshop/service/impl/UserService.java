/**
 * 
 */
package com.wubu.myshop.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.wubu.myshop.dao.domain.UserInfoExample;
import com.wubu.myshop.dao.domain.UserInfoExample.Criteria;
import com.wubu.myshop.dao.mapper.UserInfoMapper;
import com.wubu.myshop.domain.UserInfo;
import com.wubu.myshop.service.IUserService;
import com.wubu.share.enums.ErrorCode;
import com.wubu.share.exception.BusiException;
import com.wubu.share.exception.ParamException;
import com.wubu.share.exception.UserNoneException;
import com.wubu.share.exception.UserQueryFailException;
import com.wubu.share.service.BaseService;
import com.wubu.share.util.DateUtil;
import com.wubu.share.util.FuncUtils;
import com.wubu.share.util.MD5Utils;
import com.wubu.share.wrapper.ModelListResult;

/** <p>Title: UserService </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年5月10日 下午9:13:00
 */
@Service
public class UserService extends BaseService implements IUserService{

	@Resource
	private UserInfoMapper userInfoMapper;
	
	@Override
	public UserInfo userRegist(UserInfo user) {
		log.info(tag+"进入用户注册方法，请求参数:{}","UserService","userRegist",user.getCorrelationID(),JSON.toJSONString(user));
		//参数校验
		if(FuncUtils.isNull(user.getMobUser())||FuncUtils.isNull(user.getUserId())||FuncUtils.isNull(user.getPassword())){
			throw new ParamException();
		}
		//生成用户号
		String oid_userno=FuncUtils.genOidUserno();
		
		com.wubu.myshop.dao.domain.UserInfoBean userInfo=JSON.parseObject(JSON.toJSONString(user),com.wubu.myshop.dao.domain.UserInfoBean.class);
		userInfo.setStatUser("0");
		userInfo.setPassword(MD5Utils.MD5Encrpytion(MD5Utils.MD5Encrpytion(user.getPassword())));
		userInfo.setOidUserno(oid_userno);
		userInfo.setDtReg(DateUtil.getCurrentDateTime19());
		userInfo.setDtLastupdate(DateUtil.getCurrentDateTime19());
		
		try {
			userInfoMapper.insertSelective(userInfo);
		} catch (Exception e) {
			log.error(tag+"用户注册异常","UserService","userRegist",user.getCorrelationID(),e);
			throw new BusiException(ErrorCode.USER_REGISTER_FAIL);
		}
		log.info(tag+"用户注册成功，用户号：{}","UserService","userRegist",user.getCorrelationID(),oid_userno);
		return JSON.parseObject(JSON.toJSONString(userInfo),UserInfo.class);
	}

	@Override
	public UserInfo updateUserInfo(UserInfo user) {
		log.info(tag+"进入用户信息更新方法，请求参数:{}","UserService","updateUserInfo",user.getCorrelationID(),JSON.toJSONString(user));
		//参数校验
		if(FuncUtils.isNull(user.getOidUserno())){
			throw new ParamException("oid_userno");
		}
		
		com.wubu.myshop.dao.domain.UserInfoBean userInfo=JSON.parseObject(JSON.toJSONString(user),com.wubu.myshop.dao.domain.UserInfoBean.class);
		
		userInfo.setDtLastupdate(DateUtil.getCurrentDateTime19());
		
		try {
			userInfoMapper.updateByPrimaryKeySelective(userInfo);
		} catch (Exception e) {
			log.error(tag+"用户信息更新异常","UserService","updateUserInfo",user.getCorrelationID(),e);
			throw new BusiException(ErrorCode.USER_INFO_UPDATE_FAIL);
		}
		log.info(tag+"用户信息更新成功，用户号：{}","UserService","updateUserInfo",user.getCorrelationID());
		return JSON.parseObject(JSON.toJSONString(userInfo),UserInfo.class);
	}

	@Override
	public UserInfo singleQuery(UserInfo user) {
		log.info(tag+"进入用户信息单条查询方法，请求参数:{}","UserService","singleQuery",user.getCorrelationID(),JSON.toJSONString(user));
		//参数校验
		if(FuncUtils.isNull(user.getOidUserno())&&FuncUtils.isNull(user.getMobUser())&&FuncUtils.isNull(user.getUserId())){
			throw new ParamException();
		}
		
		com.wubu.myshop.dao.domain.UserInfoBean userInfo=new com.wubu.myshop.dao.domain.UserInfoBean();
		UserInfoExample example=new UserInfoExample();
		Criteria criteria=example.createCriteria();
		if(!FuncUtils.isNull(user.getOidUserno())){
			criteria.andOidUsernoEqualTo(user.getOidUserno());
		}else if(!FuncUtils.isNull(user.getUserId())){
			criteria.andUserIdEqualTo(user.getUserId());
		}else{
			criteria.andMobUserEqualTo(user.getMobUser());
		}
		List<com.wubu.myshop.dao.domain.UserInfoBean> list=null;
		try {
			list=userInfoMapper.selectByExample(example);
		} catch (Exception e) {
			log.error(tag+"用户信息查询异常","UserService","singleQuery",user.getCorrelationID(),e);
			throw new UserQueryFailException();
		}
		if(list.size()==0){
			log.info(tag+"用户信息查询不存在","UserService","singleQuery",user.getCorrelationID());
			throw new UserNoneException();
		}
		userInfo=list.get(0);
		log.info(tag+"用户信息查询成功{}","UserService","singleQuery",user.getCorrelationID(),JSON.toJSONString(userInfo));
		return JSON.parseObject(JSON.toJSONString(userInfo),UserInfo.class);
	}

	@Override
	public ModelListResult<UserInfo> queryList(UserInfo user) {
		log.info(tag+"进入用户信息查询方法，请求参数:{}","UserService","queryList",user.getCorrelationID(),JSON.toJSONString(user));
		
		UserInfoExample example=new UserInfoExample();
		Criteria criteria=example.createCriteria();
		if(!FuncUtils.isNull(user.getOidUserno())){
			criteria.andOidUsernoEqualTo(user.getOidUserno());
		}
        if(!FuncUtils.isNull(user.getUserId())){
			criteria.andUserIdEqualTo(user.getUserId());
		}
        if(!FuncUtils.isNull(user.getMobUser())){
			criteria.andMobUserEqualTo(user.getMobUser());
		}
        if(!FuncUtils.isNull(user.getOpenid())){
			criteria.andOpenidEqualTo(user.getOpenid());
		}
        if(!FuncUtils.isNull(user.getStatUser())){
			criteria.andStatUserEqualTo(user.getStatUser());
		}
        if(!FuncUtils.isNull(user.getNameUser())){
			criteria.andNameUserLike(user.getNameUser());
		}
        if(!FuncUtils.isNull(user.getNoIdcard())){
			criteria.andNoIdcardEqualTo(user.getNoIdcard());
		}
        example.setPage(user.getPage());
        example.setPageSize(user.getPageSize());
		List<com.wubu.myshop.dao.domain.UserInfoBean> list=null;
		long count=0;
		try {
			count=userInfoMapper.countByExample(example);
			list=userInfoMapper.selectByExample(example);
		} catch (Exception e) {
			log.error(tag+"用户信息查询异常","UserService","queryList",user.getCorrelationID(),e);
			throw new UserQueryFailException();
		}
		List<UserInfo> list2=new ArrayList<>();
		for(com.wubu.myshop.dao.domain.UserInfoBean userInfo:list){
			list2.add(JSON.parseObject(JSON.toJSONString(userInfo), UserInfo.class));
		}
		ModelListResult<UserInfo> res=new ModelListResult<>();
		res.setModel(list2);
		res.setCount((int)count);
		log.info(tag+"用户信息查询成功","UserService","queryList",user.getCorrelationID());
		return res;
	}

	@Override
	public UserInfo queryUserByOpenID(String openid, String correlationID) {
		log.info(tag+"进入根据openid查询用户信息方法，请求参数:openid{}","UserService","singleQuery",correlationID,openid);
		//参数校验
		if(FuncUtils.isNull(openid)){
			throw new ParamException();
		}
		
		com.wubu.myshop.dao.domain.UserInfoBean userInfo=new com.wubu.myshop.dao.domain.UserInfoBean();
		UserInfoExample example=new UserInfoExample();
		Criteria criteria=example.createCriteria();
		criteria.andOpenidEqualTo(openid);
		List<com.wubu.myshop.dao.domain.UserInfoBean> list=null;
		try {
			list=userInfoMapper.selectByExample(example);
		} catch (Exception e) {
			log.error(tag+"用户信息查询异常","UserService","queryUserByOpenID",correlationID,e);
			throw new UserQueryFailException();
		}
		if(list.size()==0){
			log.info(tag+"用户信息查询不存在","UserService","queryUserByOpenID",correlationID);
			return null;
		}
		userInfo=list.get(0);
		log.info(tag+"用户信息查询成功{}","UserService","queryUserByOpenID",correlationID,JSON.toJSONString(userInfo));
		return JSON.parseObject(JSON.toJSONString(userInfo),UserInfo.class);
	}

	@Override
	public boolean userBindOpenid(String oid_userno, String openid,
			String correlationID) {
		log.info(tag+"进入绑定用户微信方法，请求参数:oid_userno[{}],openid[{}]","UserService","userBindOpenid",correlationID,oid_userno,openid);
		//参数校验
		if(FuncUtils.isNull(oid_userno)||FuncUtils.isNull(openid)){
			throw new ParamException();
		}
		
		UserInfo user=new UserInfo();
		user.setCorrelationID(correlationID);
		user.setOpenid(openid);
		user.setOidUserno(oid_userno);
		
		user=updateUserInfo(user);
		
		log.info(tag+"绑定用户[{}]微信关系成功","UserService","userBindOpenid",correlationID,oid_userno);
		return true;
	}

}
