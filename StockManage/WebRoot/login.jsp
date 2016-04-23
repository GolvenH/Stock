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
    <link href="static/h-ui/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/h-ui/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="static/h-ui/css/animate.min.css" rel="stylesheet">
    <link href="static/h-ui/css/style.min.css" rel="stylesheet">
    <link href="static/h-ui/css/login.min.css" rel="stylesheet">
<meta name="keywords" content="欢乐股后台管理系统,欢乐股网站管理,Admain登录">
<meta name="description" content="欢乐股网站是一款由国人开发的轻量级扁平化股票自选模拟学习网站，完全免费注册，模拟炒股，在线论坛，网站现已开源">



</head>

<body class="signin">
    <div class="signinpanel">
        <div class="row">
            <div class="col-sm-7">
                <div class="signin-info">
                    <div class="logopanel m-b">
                        <h1>[ 欢乐股 ]</h1>
                    </div>
                    <div class="m-b"></div>
                    <h4>欢迎使用 <strong>欢乐股网站 后台管理系统</strong></h4>
                    <ul class="m-b">
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势一</li>
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势二</li>
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势三</li>
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势四</li>
                        <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势五</li>
                    </ul>
                </div>
            </div>
            <div class="col-sm-5">
                <form method="post" id="loginform">
                    <h4 class="no-margins">登录：</h4>
                    <p class="m-taction="" -md">登录到欢乐股网站 后台管理系统</p>
                    <input type="text" id="userName" name="userName" class="form-control uname" placeholder="账户" >
                    <input type="password" id="userPassword" name="userPassword" class="form-control pword m-b" placeholder="密码" >
                    <button class="btn btn-success btn-block" onclick="ajaxsubmit()">登录</button>
                </form>
            </div>
        </div>
        <div class="signup-footer">
            <div class="pull-left">
                &copy; 2015 All Rights Reserved. StockPlus.
            </div>
        </div>
    </div>
</body>
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

<!-- Mirrored from www.zi-han.net/theme/hplus/login_v2.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:19:52 GMT -->
</html>
