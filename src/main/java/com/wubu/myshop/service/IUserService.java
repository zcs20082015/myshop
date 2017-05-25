package com.wubu.myshop.service;

import java.util.List;

import com.wubu.myshop.domain.UserInfo;
import com.wubu.share.wrapper.ModelListResult;


/**
 * <p>Title: IUserService </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年5月3日 下午9:47:17
 */
public interface IUserService{
	
	/**
	 * <p>Function: 用户注册</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月4日 下午5:33:49
	 */
	public UserInfo userRegist(UserInfo user);
	/**
	 * <p>Function: 用户信息更新</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月4日 下午5:39:46
	 */
	public UserInfo updateUserInfo(UserInfo user);
	/**
	 * <p>Function: 用户信息单条查询</P>
	 * 条件：oid_userno/user_login/user_id/mob_user
	 * @author zhengcs@uubee.com
	 * @date 2017年5月4日 下午5:39:58
	 */
	public UserInfo singleQuery(UserInfo user);
	/**
	 * <p>Function: 多条查询</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月4日 下午5:41:12
	 */
	public ModelListResult<UserInfo> queryList(UserInfo user);
	/**
	 * <p>Function: 根据openid查询用户信息</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月4日 下午5:45:57
	 */
	public UserInfo queryUserByOpenID(String openid,String correlationID);
	/**
	 * <p>Function: 绑定微信</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月4日 下午5:45:42
	 */
	public boolean userBindOpenid(String oid_userno,String openid,String correlationID);
	
}

