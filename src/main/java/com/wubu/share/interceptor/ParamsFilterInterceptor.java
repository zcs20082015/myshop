package com.wubu.share.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wubu.share.util.UtilTool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 非法参数过滤
 * @Date 2017年3月30日 下午6:04:46
 * @Author maxm@uubee.com
 */
public class ParamsFilterInterceptor implements HandlerInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(ParamsFilterInterceptor.class);
	Set<Pattern> excludeParams = Collections.emptySet();
	Set<Pattern> excludeValues = Collections.emptySet();

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Enumeration<String> paramNames = request.getParameterNames();
		StringBuilder requestBuilder = new StringBuilder(
				"requestLog[IP:"+request.getRemoteHost()
				+"URI:"+ request.getRequestURI() +"]{");
		while (paramNames.hasMoreElements()) {
			String paramName = paramNames.nextElement();
			requestBuilder.append(paramName + ":");
			if (isExcludedParams(paramName)) { // 参数名称中包含非法参数
				return paramError(request, response, paramName);
			} else {
				String[] paramValues = request.getParameterValues(paramName);
				if (paramValues != null) {  // 参数值中包含非法参数
					for (String paramValue : paramValues) {
						requestBuilder.append(paramValue + "&");
						if (isExcludedValues(paramValue)) {
							return paramError(request, response, paramName);
						}
					}
					requestBuilder.deleteCharAt(requestBuilder.lastIndexOf("&"));
					requestBuilder.append(",");
				}
			}
		}
		requestBuilder.append("}");
		logger.info(requestBuilder.toString());
		return true;
	}

	/**
	 * 非法参数
	 * @param request
	 * @param paramName
	 * @Date 2017年3月30日 下午5:09:54
	 * @Author maxm@uubee.com
	 */
	private boolean paramError(HttpServletRequest request, HttpServletResponse response, String paramName) {
		logger.info("请求地址:{}中存在非法参数:{}", UtilTool.getIpAddr(request), paramName);
//		response.setStatus(Integer.valueOf(ErrorCode.VALIDATE_PARAM_ERROR.code));
		return false;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

	protected boolean isExcludedParams(String paramName) {
		if (!this.excludeParams.isEmpty()) {
			for (Pattern pattern : excludeParams) {
				Matcher matcher = pattern.matcher(paramName);
				if (matcher.matches()) {
					return true;
				}
			}
		}
		return false;
	}

	protected boolean isExcludedValues(String paramValue) {
		if (!this.excludeValues.isEmpty()) {
			for (Pattern pattern : excludeValues) {
				Matcher matcher = pattern.matcher(paramValue);
				if (matcher.matches()) {
					return true;
				}
			}
		}
		return false;
	}

	protected boolean isExcluded(String paramName) {
		if (!this.excludeParams.isEmpty()) {
			for (Pattern pattern : excludeParams) {
				Matcher matcher = pattern.matcher(paramName);
				if (matcher.matches()) {
					return true;
				}
			}
		}
		return false;
	}

	private Collection<String> asCollection(String commaDelim) {
		if (commaDelim == null || commaDelim.trim().length() == 0) {
			return null;
		}
		return UtilTool.commaDelimitedStringToSet(commaDelim);
	}

	public void setExcludeParams(String commaDelim) {
		Collection<String> excludePatterns = asCollection(commaDelim);
		if (excludePatterns != null) {
			excludeParams = new HashSet<Pattern>();
			for (String pattern : excludePatterns) {
				excludeParams.add(Pattern.compile(pattern));
			}
		}
	}

	public void setExcludeValues(String commaDelim) {
		Collection<String> excludePatterns = asCollection(commaDelim);
		if (excludePatterns != null) {
			excludeValues = new HashSet<Pattern>();
			for (String pattern : excludePatterns) {
				excludeValues.add(Pattern.compile(pattern));
			}
		}
	}

	protected Set<Pattern> getExcludeParamsSet() {
		return excludeParams;
	}

	protected Set<Pattern> getExcludeValuesSet() {
		return excludeValues;
	}

}
