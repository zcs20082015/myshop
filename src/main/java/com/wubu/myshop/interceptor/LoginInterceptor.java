package com.wubu.myshop.interceptor;


import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.wubu.myshop.service.ICacheService;
import com.wubu.myshop.service.IUserService;
import com.wubu.share.util.Property;

/**
 * <p>Title: LoginInterceptor </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2016年7月28日 上午10:59:19
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

	private static Logger log = Logger.getLogger(LoginInterceptor.class);

	
	private final String H5_WEIXIN_OPENID = "h5_weixin_openid";
	// 读取配置文件
	private static final String UB_SERVER_URL = Property.getProperty("url_project");
    
	@Autowired
	private HttpSession session;
	//@Autowired
	private ICacheService cacheService;
	//@Autowired
	private IUserService userService;

	@Override  
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String uri = request.getRequestURI();
		log.info("uri:" + uri);
		// 去掉开头的斜杠,便于后续匹配
		uri = StringUtils.substring(uri, 1);
		/*// 标记外部请求
		String mark = request.getParameter("mark");
		log.info("forwardMark:" + mark);*/
		
		// 请求是否可以被放行
		if (isAllowUrl(request.getServletPath())) {
			return true;
		}
		// 是否已经登录
		if (isLogin(request)) {
			return true;
		}

		// 校验登陆地址
		if (uri.indexOf("queryOrder.htm") < 0 && uri.indexOf("mySetting.htm") < 0) {
			log.info("登陆地址不对，拒绝");
			request.setAttribute("errorCode", "9901");
			request.setAttribute("errorMsg", "请求地址拒绝");
			RequestDispatcher rd = request.getRequestDispatcher("/page/common/error.jsp");
			rd.forward(request, response);
			return false;
		}
		if(null==session.getAttribute("mark")){
			log.info("登陆地址不对，拒绝");
			request.setAttribute("errorCode", "9901");
			request.setAttribute("errorMsg", "请求地址拒绝");
			RequestDispatcher rd = request.getRequestDispatcher("/page/common/error.jsp");
			rd.forward(request, response);
			return false;
		}
		//来源于外部商户请求
		String oid_partner=request.getParameter("oid_partner");
		if(null!=oid_partner){
			session.setAttribute("oid_partner", oid_partner);
		}
		if(null==session.getAttribute("flag_action")){
			if (request.getServletPath().indexOf("queryOrder.htm") > 0) {// 订单
				session.setAttribute("flag_action", "order");
			} else {
				session.setAttribute("flag_action", "set");// 设置
			}
			session.setAttribute("url_first", request.getServletPath());
		}
		
		if (!isWeixin(request)) {
			log.info("不是微信浏览器，进入登陆页面");
			response.sendRedirect(UB_SERVER_URL + "page/h5/login.jsp");
			return false;
		}
		String flag_guanzhu = (String) session.getAttribute("flag_guanzhu");
		if ("0".equals(flag_guanzhu)) {
			log.info("是微信浏览器，但是没有关注公众号，获取不到openid，进入登陆页面");
			response.sendRedirect(UB_SERVER_URL + "page/h5/login.jsp");
			return false;
		}
		String openId = (String) session.getAttribute(H5_WEIXIN_OPENID);
		if (StringUtils.isEmpty(openId)) {
			log.info("openid不存在，获取openid");
			response.sendRedirect(UB_SERVER_URL + "common/getCode.htm");
			return false;
		}
		// 判断openid是否存在用户绑定
		log.info("微信客户端登录，openId=[" + openId + "]");
		//UserWeixin user = loginService.queryUserInfoByOpenId(openId);
		// 出现异常
		
		if (null == null) {
			// TODO 重定向到错误页面
			log.info("微信客户端登录,用户微信绑定关系查询失败");
			response.sendRedirect(UB_SERVER_URL + "page/h5/error.jsp");
			return false;
		}
		// 微信和用户关系不存在,重定向到 登录页面
		/*if (!"000000".equals(user.getRetcode())) {
			log.info("微信客户端登录，openId=[" + openId + "]，微信和用户关系不存在，进入登录页面");
			response.sendRedirect(UB_SERVER_URL + "page/h5/login.jsp");
			return false;
		}*/
		log.info("微信客户端登录，openId=[" + openId + "]，微信和用户已绑定，直接登录");
	/*	// 保存用户信息到session
		session.put("oid_userno", user.getOid_userno());
		session.put("user_login", user.getUser_login());*/
		response.sendRedirect(UB_SERVER_URL + "login/afterLogin.htm");
		return false;
	}

	/**
	 * 是否登录判断
	 * 
	 * @param request
	 * @return
	 */
	private boolean isLogin(HttpServletRequest request) {
		if(null!=request.getParameter("mark")){
			session.invalidate();
			session.setAttribute("mark", request.getParameter("mark"));
		}
		if (session.getAttribute("oid_userno") == null) {
			return false;
		}
		return true;
	}

	/**
	 * TODO 是否容许url通过
	 * 
	 * @param url
	 * @return
	 */
	private boolean isAllowUrl(String url) {
		return true;
		/*if (url.indexOf("login.htm") > 0) {
			if(null==session.getAttribute("mark")){
				return false;
			}
			return true;
		}
		if(url.indexOf("smssend") > 0){
			return true;
		}
		if (url.indexOf("getCode") > 0 || url.indexOf("getOpenid") > 0 
				|| url.indexOf("confirm") > 0 || url.indexOf("async") > 0
				|| url.indexOf("bkuan") > 0) {
			return true;
		}
		return false;*/
	}

	/**
	 * 判断是否微信浏览器
	 * 
	 * @param request
	 * @return
	 */
	private boolean isWeixin(HttpServletRequest request) {
		String ua = request.getHeader("user-agent");
		if (ua != null) {
			ua = ua.toLowerCase();
			if (ua.indexOf("micromessenger") > 0) {
				return true;
			}
		}
		return false;
	}
}
