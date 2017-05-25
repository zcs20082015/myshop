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
    <title>我的生活</title>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" href="/favicon.ico">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">

    <link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm.min.css">
    <link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm-extend.min.css">

  </head>
  <body>
   <nav class="bar bar-tab">
  <a class="tab-item external" href="#">
    <span class="icon icon-cart"></span>
    <span class="tab-label">商品浏览</span>
  </a>
  <a class="tab-item external" href="#">
    <span class="icon icon-gift"></span>
    <span class="tab-label">精彩活动</span>
    <span class="badge">2</span>
  </a>
  <a id="a3" class="tab-item external" href="page/personal/center.jsp">
    <span class="icon icon-me"></span>
    <span class="tab-label">个人中心</span>
  </a>
</nav>

    <script type='text/javascript' src='//g.alicdn.com/sj/lib/zepto/zepto.min.js' charset='utf-8'></script>
    <script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm.min.js' charset='utf-8'></script>
    <script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm-extend.min.js' charset='utf-8'></script>

<script type="text/javascript">
$(function(){

});
</script>
  </body>
</html>