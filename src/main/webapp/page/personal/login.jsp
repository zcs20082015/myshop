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
		<title>登录</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="initial-scale=1, maximum-scale=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link rel="shortcut icon" href="img/favicon.ico">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		 <link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm.min.css">
         <link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm-extend.min.css">
		<style type="text/css">
			p{margin: 0;}
			.login-bar {background-color: #2d2a3d;}
			.login-title {color: #ffffff; font-size: 0.8rem;}
			.login-left {color: #ffffff;}
			.login-content {background-color: #f4f4f4;}
			.login-logo {width: 6.5rem; height: 2.75rem; background-image: url(img/ubeLogo.png);background-size: 100% 100%; margin: 4.1rem auto;}
			.login-formWp {padding: 0 0.75rem;}
			.login-form {width: 100%; border: 1px solid #ccccce;border-radius: 0.3rem; overflow: hidden; z-index: 1000000;}
			.margin0 {margin: 0;}
			.login-list-block {margin: 0; font-size: 0.7rem; border-radius: 0.3rem; overflow: hidden;}
			.login-list-block ul {border-radius: 0.3rem; overflow: hidden;}
			.login-list-block input[type=text], .login-list-block input[type=password] {font-size: 0.65rem;}
			.login-list-block .login-item-content {padding-left: 0; min-height: 2.4rem;}
			.login-list-block .login-item-content .item-inner {padding-left: 0.65rem;}
			.login-list-block .login-item-content .item-inner:after {background-color: #ccccce;}
			.login-list-block .item-title.label {width: 25%;}
			.login-phone-logo,.login-password-logo {width: 0.8rem; height: 1.25rem; /*background-color: red;*/ position: absolute; right: 0.65rem; background-image: url(img/loginPhone.png); background-size: 100% 100%;}
			.login-password-logo {background-image: url(img/loginPassw.png);}
			.login-btn {width: 96%; margin: 1.52rem auto 0;}
			.login-btn button {width: 100%; height: 2rem; line-height: 2rem; background-color: #2d2a3d; color: #fff; font-size: 0.75rem; border: 1px solid #2d2a3d; border-radius: 0.2rem;}
			.login-btn .disabledBtn {background-color: #ccc; border-color: #ccc;}
			.login-btn>p {position: relative; text-align: right;font-size: 0.65rem; color: #24c4fe; margin: 0.25rem 0;}
			.message-login {position: absolute; left: 0;}
			.message-login>a {color: #24c4fe;}
			/*popup样式*/
			.login-screen.modal-in, .login-screen.modal-out, .popup.modal-in, .popup.modal-out {
			    -webkit-transition-duration: .01s;
			    transition-duration: .01s;
			}
			.popup {background-color: transparent;}
			.pop-content {position: absolute; top: 50%; left: 9.5%; width: 81%; height: 8.5rem; background-color: #ffffff; margin: -4.25rem auto 0; border-radius: 0.3rem; overflow: hidden;}
			.pop-content-text {width: 100%; height: 5.7rem; border-bottom: 1px solid #ededed; }
			.pop-content-btns {width: 100%; height: 2.7rem;line-height: 2.7rem; font-size: 0.8rem;text-align: center;color: #7bc7d7; }
			.pop-content-btns>a {color: #7bc7d7;}
			.pop-content-text>p {text-align: center; font-size: 0.8rem; padding-top: 2.2rem;}
			.popclose {display: block; width: 0.8rem; height: 0.8rem; background-image: url(img/close.png); background-size: 100% 100%; position: absolute; top: 0.5rem; right: 0.5rem;}
			
			
			
		</style>
	</head>

	<body>
		<div class="page-group"> 
			<!-- 所有的popup Sta-->
			<div class="popup popup-login-message">
				<div class="pop-content">
					<span class="popclose close-popup"></span>
					<div class="pop-content-text">
						<p>您可以选择验证码登录</p>
					</div>
					<div class="pop-content-btns close-popup">
						<a href="page/h5/login_verify.jsp" external>验证码登录</a>
					</div>
				</div>
			</div>
			<!-- 所有的Popup End-->

			<div class="page page-current">
				<!-- 你的html代码 -->
				<header class="bar bar-nav login-bar">
					<a class="icon icon-left pull-left login-left"></a>
					<h1 class="title login-title">登录</h1>
				</header>
				<div class="content login-content">
					<div class="content-block">
						<div class="login-logo"></div>
						<div class="login-formWp">
							<div class="login-form">
								<div class="list-block login-list-block">
									<ul>
										<!-- Text inputs -->
										<li>
											<div class="item-content login-item-content">
												<div class="item-inner">
													<div class="item-title label">账号</div>
													<div class="item-input">
														<input id="user_id" type="text" placeholder="请输入登录账号" >
													</div>
													<div class="login-phone-logo"></div>
												</div>
											</div>
										</li>

										<li>
											<div class="item-content">
												<div class="item-inner">
													<div class="item-title label">密码</div>
													<div class="item-input">
														<input id="passwd" type="password" placeholder="请输入登录密码" >
													</div>
													<div class="login-password-logo"></div>
												</div>
											</div>
										</li>
									</ul>
								</div>
							</div>
							<div class="login-btn">
								<button id="loginBtn" class="disabledBtn" disabled="disabled" type="button">登录</button>
								<p><span class="message-login"><a href="page/h5/login_verify.jsp" external >短信登录</a></span><span class="password-login">忘记密码?</span></p>
							</div>
						</div>
					</div>
					<!-- 你的html代码 -->
	<!--脚本-->
	<script type='text/javascript' src='//g.alicdn.com/sj/lib/zepto/zepto.min.js' charset='utf-8'></script>
    <script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm.min.js' charset='utf-8'></script>
    <script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm-extend.min.js' charset='utf-8'></script>
<script type="text/javascript">
						//$.popup('.popup-login-message');
						$(function(){
							
							//登录按钮样式
							function loginBtn (){
								if($("#user_id").val() != "" && $("#passwd").val() != ""){
									$("#loginBtn").removeClass("disabledBtn").removeAttr("disabled");
								}else{
									$("#loginBtn").addClass("disabledBtn").attr("disabled","disabled");
								}
							}

							//手机号输入的事件
							$("#user_id").on("input",function(){
								loginBtn ();
							});
							
							//密码框输入事件
							$("#passwd").on("input",function(){
								loginBtn ();
							});
							//登录
							$("#loginBtn").click(function(){
								$("#loginBtn").attr("disabled","disabled");
								if(!$("#user_id").val()){
									$.alert("请输入登陆账号");
									$("#loginBtn").removeAttr("disabled");
									return;
								}
								if(!$("#passwd").val()){
									$.alert("请输入登录密码");
									$("#loginBtn").removeAttr("disabled");
									return;
								}
								//$.alert("11");
								$.ajax({
									url:"${pageContext.request.contextPath}/login/login.htm",
									type:"POST",
							        data:{
							              user_id:$("#user_id").val(),
							              password:$("#passwd").val()
									},
									dataType:'json',
									success:function (json) {
										if(json.ret_code != '0000'){
											/* if(json.ret_code == '2003'){
												$.alert("销售人员信息不存在，请先注册。");
												return;
											}
											if(json.ret_code == '2005'){
												$.alert(json.ret_msg);
												return;
											} */
											$.alert("登录失败-"+json.ret_msg);
											$("#loginBtn").removeAttr("disabled");
											return;
										}
										//登录成功
										window.location.href="${pageContext.request.contextPath}/login/afterLogin.htm";
									}
								});
							});
							//忘记密码弹框
							$(".password-login").click(function(){
								$.popup('.popup-login-message');
							});
						});
					</script>
				</div>
			</div>
	</body>

</html>