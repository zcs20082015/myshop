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
           
<header class="bar bar-nav">
  <h1 class='title'>会员注册</h1>
</header>
<div class="content">
  <div class="list-block">
  <span> 已注册？<a href="page/personal/login.jsp">去登陆</a></span>
    <ul>
    <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-mobile"></i></div>
          <div class="item-inner">
            <div class="item-title label">用户名</div>
            <div class="item-input">
              <input type="text" name="user_id" id="user_id" maxlength="32" placeholder="Your ID">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-mobile"></i></div>
          <div class="item-inner">
            <div class="item-title label">手机号</div>
            <div class="item-input">
              <input type="text" name="mob_user" id="mob_user" maxlength="11" placeholder="Your mobile">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-name"></i></div>
          <div class="item-inner">
            <div class="item-title label">姓名</div>
            <div class="item-input">
              <input type="text" name="name_user" id="name_user" placeholder="Your name">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-email"></i></div>
          <div class="item-inner">
            <div class="item-title label">邮箱</div>
            <div class="item-input">
              <input id="email" type="email" placeholder="E-mail">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-gender"></i></div>
          <div class="item-inner">
            <div class="item-title label">性别</div>
            <div class="item-input">
              <select id="sex_user">
                <option>男</option>
                <option>女</option>
              </select>
            </div>
          </div>
        </div>
      </li>
      <!-- Date -->
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-calendar"></i></div>
          <div class="item-inner">
            <div class="item-title label">生日</div>
            <div class="item-input">
              <input id="date_birthday" type="date" placeholder="Birth day" value="2014-04-30">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-password"></i></div>
          <div class="item-inner">
            <div class="item-title label">密码</div>
            <div class="item-input">
              <input type="password" id="password" name="password" placeholder="Password" class="">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-password"></i></div>
          <div class="item-inner">
            <div class="item-title label">重复密码</div>
            <div class="item-input">
              <input type="password" id="password2" placeholder="Password" class="">
            </div>
          </div>
        </div>
      </li>
    </ul>
  </div>
  <div class="content-block">
    <div class="row">
      <div class="col-50"><a id="cancel" class="button button-big button-fill button-danger">取消</a></div>
      <div class="col-50"><a id="submit" class="button button-big button-fill button-success">提交</a></div>
    </div>
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
	$("#user_id").on("change",function(){
		
		$.ajax({

			url:"${pageContext.request.contextPath}/login/exist.htm",
			data:{
				user_id:$("#user_id").val()
			},
			type:"POST",
			dataType:"json",
			success:function(json){
				if(json.ret_code != '0000'){
					$.alert(json.ret_msg);
					return;
				}
			}
		});
	});
	$("#mob_user").on("change",function(){
		var mob=$("#mob_user").val();
		if(!mob){
			$.alert("手机号不能为空");
			return;
		}
		if(!/^1[3|5|6|7|8|9][0-9]{9}$/.test(mob)){
			$.alert("手机号格式错误");
			return;
		}
		$.ajax({
			url:"${pageContext.request.contextPath}/login/exist.htm",
			data:{
				mob_user:$("#mob_user").val()
			},
			type:"POST",
			dataType:"json",
			success:function(json){
				if(json.ret_code != '0000'){
					$.alert(json.ret_msg);
					return;
				}
			}
		});
	});
	$("#submit").on("click",function(){
		if(!$("#user_id").val()){
			$.alert("id不能为空");
			return;
		}
		var mob=$("#mob_user").val();
		if(!mob){
			$.alert("手机号不能为空");
			return;
		}
		if(!/^1[3|5|6|7|8|9][0-9]{9}$/.test(mob)){
			$.alert("手机号格式错误");
			return;
		}
		var pass1=$("#password").val();
		var pass2=$("#password2").val();
		if(!pass1){
			$.alert("请设置密码");
			return;
		}
		if(!pass2){
			$.alert("请重复输入密码");
			return;
		}
		if(pass1 != pass2){
			$.alert("两次输入密码不一致");
			return;
		}
		
		$.ajax({
			url:"${pageContext.request.contextPath}/login/regist.htm",
			type:"POST",
			contentType:"application/json;charset=UTF-8",
			data:JSON.stringify({
				user_id:$("#user_id").val(),
				mob_user:$("#mob_user").val(),
				name_user:$("#name_user").val(),
				sex_user:$("#sex_user").val(),
				email:$("#email").val(),
				date_birthday:$("#date_birthday").val(), 
				password:$("#password").val()
				
			}),
			
			dataType:"json",
			success:function(json){
				if(json.ret_code != '0000'){
					$.alert(json.ret_msg);
					return;
				}
				
				//注册成功，跳转登录页面
				$.alert("注册成功，去登陆",function(){
					window.location.href="${pageContext.request.contextPath}/page/personal/login.jsp";
				});
			}
		});
	});
	
});
</script>
  </body>
</html>