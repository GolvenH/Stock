<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    
    <title>欢乐股后台管理登录系统--欢乐股</title>
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/h-ui/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<link href="static/h-ui/css/style.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
<meta name="keywords" content="欢乐股后台管理系统,欢乐股网站管理,Admain登录">
<meta name="description" content="欢乐股网站是一款由国人开发的轻量级扁平化股票自选模拟学习网站，完全免费注册，模拟炒股，在线论坛，网站现已开源">
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header"></div>
<div class="loginWraper">
  <div id="loginform" class="loginBox">
    <form class="form form-horizontal" method="post" id="loginform">
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
        <div class="formControls col-xs-8">
          <input id="userName" name="userName" type="text" placeholder="账户" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="userPassword" name="userPassword" type="password" placeholder="密码" class="input-text size-L">
        </div>
      </div>

      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
         <button  class="btn btn-success radius size-L" onclick="ajaxsubmit()">&nbsp;&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;&nbsp;</button>
          <button type="reset" class="btn btn-default radius size-L">&nbsp;&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;&nbsp;</button>
        </div>
      </div>
    </form>
  </div>
</div>
<div class="footer">Copyright &copy;欢乐网络科技有限公司</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#loginform").validate({
		rules:{
			userName:{
				required:true,
				minlength:4,
				maxlength:16
			},
			userPassword:{
				required:true,
				minlength:6,
				maxlength:16
			},
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function ajaxmit() {
		
		}
	});
});

function login(){
    var userName=document.getElementById('userName').value;
    var userPassword=document.getElementById('userPassword').value;
    	var data={};
   		data["userName"]=userName;
   		data["userPassword"]=userPassword;
	 $.ajax({ url: "user/userlogin.do",
		 type:"post",
		 data :data,
		 dataType : "json",
		/*  success: function(data){
				 window.location.href("redirect:http://localhost:8080//WZStock/aindex.html");
			
			},
			error:{
			alert("用户名或密码不正确！");
			} */
			
			});
    }
function ajaxsubmit() {

 	var inputs = $("input");
	var data = {};
	for (var i = 0; i < inputs.length; i++) {
		var name = inputs[i].name;
		var value = inputs[i].value;
		data[name] = value;
	}
	$.ajax({
		url : "user/login.do",
		data : data,
		dataType : "json",
		type : "post",
		success: function(data) {
			if(data==1)
				{
	           	window.location.href = "index.jsp";
				}
			else{
				alert("登录失败，请重试");

			}
		}
	});
}
</script> 
</body>
</html>