package com.wubu.share.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.wubu.share.controller.BaseController;
import com.wubu.share.domain.base.BaseResBean;
import com.wubu.share.exception.json.JsonRetException;
import com.wubu.share.exception.page.PageRetException;
import com.wubu.share.util.Property;

/**
 * <p>
 * Title: FlowAspect
 * </p>
 * <p>
 * Description: 切面处理
 * </p>
 * <p>
 * Company: http://www.uubee.com/
 * </p>
 * 
 * @author zhengcs@uubee.com
 * @date 2017年4月12日 下午8:54:15
 */
@Aspect
@Component
public class FlowAspect {

	protected Logger log = LoggerFactory.getLogger(getClass());
	protected final String UB_SERVER_URL = Property.getProperty("url_project");

	@Around(value = "execution(* com.wubu.myshop.controller.*.*.*(..))")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		Object result = null;
		String correlationID = null;
		HttpServletRequest request = null;
		HttpServletResponse response = null;
		try {
			BaseController baseController = (BaseController) pjp.getTarget();

			request = ((ServletRequestAttributes) RequestContextHolder
					.currentRequestAttributes()).getRequest();
			response = ((ServletRequestAttributes) RequestContextHolder
					.currentRequestAttributes()).getResponse();
			correlationID = (String) request.getSession().getId();
			
			log.info("消息id[" + correlationID + "]方法调用开始。");
			result = pjp.proceed();
			log.info("消息id[" + correlationID + "]方法调用完成。");
			return result;
		} catch (PageRetException e) {
			log.error("消息id[" + correlationID + "]系统异常，错误码：" + e.getErrorCode()
					+ ";错误信息：" + e.getErrorMsg());
			request.setAttribute("errorCode", e.getErrorCode());
			request.setAttribute("errorMsg", e.getErrorMsg());

			return "error";
		} catch (JsonRetException e) {
			log.error("消息id[" + correlationID + "]系统异常，错误码：" + e.getErrorCode()
					+ ";错误信息：" + e.getErrorMsg());
			BaseResBean baseResBean = new BaseResBean();
			baseResBean.setRet_code(e.getErrorCode());
			baseResBean.setRet_msg(e.getErrorMsg());
			return baseResBean;
		} catch (Exception e) {
			log.error("流程出错，错误为：" + e);
			request.setAttribute("errorCode", "9999");
			request.setAttribute("errorMsg", "系统错误");
			return "error";
		}
	}

}
