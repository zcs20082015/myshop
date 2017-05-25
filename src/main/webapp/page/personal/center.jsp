<%@ page language="java" import="java.util.*,com.wubu.share.util.Property" pageEncoding="utf-8" buffer="none"%>

<%
//将过期日期设置为一个过去时间 
response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
//设置 HTTP/1.1 no-cache 头 
response.setHeader("Cache-Control", "no-store,no-cache,must-revalidate"); 
//设置 IE 扩展 HTTP/1.1 no-cache headers， 用户自己添加 
response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
//设置标准 HTTP/1.0 no-cache header. 
response.setHeader("Pragma", "no-cache");
String path = request.getContextPath();
System.out.println("path:"+path);
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
basePath = Property.getProperty("url_project");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
	<base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>会员中心</title>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" href="/favicon.ico">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">

    <link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm.min.css">
    <link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm-extend.min.css">

  </head>
  <body>
    <div class="page-group">
        <div class="page page-current">
           
<div class="content">
 
  <div class="content-block-title"><b>会员信息</b></div>
  <div class="list-block">
    <ul>
      <li class="item-content item-link" id="reg">
        <div class="item-media"><i class="icon icon-f7"></i></div>
        <div class="item-inner">
          <div class="item-title">我要入会</div>
          <div class="item-after"></div>
        </div>
      </li>
      <li class="item-content item-link" id="jf">
        <div class="item-media"><i class="icon icon-f7"></i></div>
        <div class="item-inner">
          <div class="item-title">我的积分</div>
          <div class="item-after"></div>
        </div>
      </li>
    </ul>
  </div>
  <div class="content-block-title"><b>订单信息</b></div>
  <div class="list-block">
    <ul>
      <li class="item-content item-link" id="order">
        <div class="item-media"><i class="icon icon-f7"></i></div>
        <div class="item-inner">
          <div class="item-title">我的订单</div>
          <div class="item-after"></div>
        </div>
      </li>
     
    </ul>
  </div>
</div>
<jsp:include page="/page/bottom.jsp" flush="true" />
        </div>
    </div>

    <script type='text/javascript' src='//g.alicdn.com/sj/lib/zepto/zepto.min.js' charset='utf-8'></script>
    <script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm.min.js' charset='utf-8'></script>
    <script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm-extend.min.js' charset='utf-8'></script>
<script type="text/javascript">
$(function(){
	$("#a1").removeClass("active");
	$("#a2").removeClass("active");
	$("#a3").addClass("active");
	
	$("#reg").on("click",function(){
		window.location.href="${pageContext.request.contextPath}/page/personal/regist.jsp";
		return;
	});
	$("#jf").on("click",function(){
		window.location.href="${pageContext.request.contextPath}/info/jifen.htm";
		return;
	});
	$("#order").on("click",function(){
		window.location.href="${pageContext.request.contextPath}/info/order.htm";
		return;
	});
});
</script>
  </body>
</html>