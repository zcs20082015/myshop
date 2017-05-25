package com.wubu.share.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.wubu.share.util.Globals;


/**
 * <p>Title: EncodingFilter </p>
 * <p>Description: 编码方式过滤器</p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author liuzhy@uubee.com
 * @date 2015-9-17 下午5:02:27
 */
public class EncodingFilter implements Filter{
	
    protected String encoding = null;
    protected FilterConfig filterConfig = null;

    public void destroy(){
        this.encoding = null;
        this.filterConfig = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        String encoding = selectEncoding(request);
        if (encoding != null){
            request.setCharacterEncoding(encoding);
            response.setCharacterEncoding(encoding);
            response.setContentType(Globals.CONTENT_TYPE_JSON_UTF8);
        }
        chain.doFilter(request, response);
    }

    public void init(FilterConfig filterConfig) throws ServletException{
        this.filterConfig = filterConfig;
        this.encoding = filterConfig.getInitParameter("encoding");
    }

    protected String selectEncoding(ServletRequest request){
        return (this.encoding);
    }

}