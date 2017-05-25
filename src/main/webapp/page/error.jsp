<%@ page language="java" import="java.util.*" pageEncoding="utf-8" buffer="none"%>
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
/* basePath = Property.getProperty("url_project"); */
%>
<!DOCTYPE html>
<html>

	<head>
		<base href="<%=basePath%>">
		<meta charset="utf-8">
		<title>错误</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<meta http-equiv="Pragma" content="no-cache" />
		<meta http-equiv="Cache-Control" content="no-cache"> 
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link rel="shortcut icon" href="img/favicon.ico">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<link rel="stylesheet" type="text/css" href="css/sm.min.css"/>
		<script src="js/zepto.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/sm.js" type="text/javascript" charset="utf-8"></script>
		<style type="text/css">
p {
	margin: 0;
	text-align: center;
}

.title-bg {
	background-color: #3cb486;
	border-color: #3cb486;
	color: #ffffff;
}

.title {
	color: #fff;
}

.content {
	background-color: #ffffff;
}

.content-block {
	margin: 0;
	padding: 0;
	border-top: 1px solid #ffffff;
}

.reviewLogo {
	width: 4.5rem;
	height: 4.5rem;
	background-image: url(img/resultE.png);
	background-size: 100% 100%;
	margin: 4rem auto 0;
}

.p-reviewing {
	font-size: 0.76rem;
	color: #2dc491;
	line-height: 0.76rem;
	margin: 1rem 0;
}

.p-msg {
	font-size: 0.7rem;
	line-height: 1.5rem;
	color: #333333;
	padding: 0 1.5rem;
}

.p-error {
	font-size: 0.7rem;
	line-height: 0.7rem;
	margin: 1rem 0;
	color: #ddd7e3;
}

.nextBtn {
	width: 90%;
	height: 2rem;
	border-radius: 0.4rem;
	color: #ffffff;
	background-color: #3cb486;
	border: 1px solid #3cb486;
	display: block;
	margin: 0 auto;
	font-size: 0.75rem;
	line-height: 2rem;
}

.nextBtn:active {
	background-color: #cccccc;
	border: 1px solid #cccccc;
}

.marTop {
	margin-top: 1.4rem;
}

.logoBtm {
	display: inline-block;
	width: 4.7rem;
	height: 2rem;
	text-align: center;
	margin: 8rem 0 0.5rem;
	background-image: url(img/uubeeLogo.png);
	background-size: 100% 100%;
}

.p-phone {
	margin-bottom: 0.5rem;
	font-size: 0.7rem;
}
</style>
</head>

<body>
	<div class="page-group">
		<div class="page page-current">
			<!-- 你的html代码 -->
			<header class="bar bar-nav title-bg">
			<h1 class='title' style="">错误</h1>
			</header>
			<div class="content">
				<div class="content-block">
					<div class="reviewLogo"></div>
					<p class="p-reviewing">${errorTitle }</p>
					<p class="p-error">${errorCode }</p>
					<p class="p-msg">${errorMsg }</p>
					
					<p class="marTop">
						<button id="next" class="nextBtn">返回</button>
					</p>
					<p class="text-center">
						<span class="logoBtm"></span>
					</p>
					<p class="p-phone">
						如有问题，联系客服：<a href="tel:400-9936-111">400-9936-111</a>
					</p>
				</div>
			</div>
			<!-- 你的html代码 -->

		</div>
	</div>
	<form id="backform" action="${back_url}" method="post">
		<input type="hidden" name="ret_code" value="${errorCode}"> <input
			type="hidden" name="ret_msg" value="${errorMsg}">
	</form>
</body>

<script type="text/javascript">
	$(function() {
		$("#next").click(function() {
			window.history.go(-1);
		});
	});
</script>
</html>