<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
   <base href="<%=basePath%>">
    
	<title>编辑用户</title>
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="/favicon.ico" >
<LINK rel="Shortcut Icon" href="/favicon.ico" />

<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui/css/style.css" />

</head>
<body>
<article class="page-container">
	<form action="user/update.do" method="get" class="form form-horizontal"	id="form-member-add">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>用户名：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="userName" name="userName">
			</div>
		</div>
			<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>邮箱：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="userEmail" name="userEmail">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>性别：</label>
			<div class="formControls col-xs-8 col-sm-9 skin-minimal">
				<div class="radio-box">
					<input name="userSex" type="radio" id="sex-1" checked value="man">
					<label for="sex-1">男</label>
				</div>
				<div class="radio-box">
					<input type="radio" id="sex-2" name="userSex" value="fmale">
					<label for="sex-2">女</label>
				</div>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>手机：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="userTel" name="userTel">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>备注：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="userHobby" name="userHobby">
			</div>
		</div>  
	</form>
</article>
<article class="page-container">
	<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button  class="btn btn-primary radius" id="submit"  onclick="submit()">&nbsp;&nbsp;提交更新&nbsp;&nbsp;</button>
			
			</div>
		</div>    
</article>
<%
String usid=request.getParameter("id");
%>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.min.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.min.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.admin.js"></script> 

<script type="text/javascript">
var uid;
var upd;
var uac;

$(function(){
	
	
	var id=<%=usid %>;
	$.ajax({
		url : "user/findbyid.do?id="+id,
		dataType : "json",
		type : "post",
		success :function(data) 
		{
			var a_uid = data.User.userId;
			var a_uname = data.User.userName;
			var a_uem = data.User.userEmail;
			var a_utel = data.User.userTel;
			var a_ubz = data.User.userHobby;
			var a_upd = data.User.userPassword;
			var a_uac = data.User.userAccount;
			$("#userName").attr("value",a_uname);
			$("#userEmail").attr("value",a_uem);
			$("#userTel").attr("value",a_utel);
			$("#userHobby").attr("value",a_ubz);
			uid = a_uid;
			upd = a_upd;
			uac = a_uac;
		}
	});
	
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-member-add").validate({
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
			userSex:{
				required:true,
			},
			userTel:{
				required:true,
				isMobile:true,
			},
			userEmail:{
				required:true,
				email:true,
			},
			
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:$('#submit').click(function() 
		{
			var inputs = $("input");
			var data = {};
			for (var i = 0; i < inputs.length; i++) 
			{
				var name = inputs[i].name;
				var value = inputs[i].value;
				data[name] = value;
			}
				var s1 = $('input:radio[name=userSex]:checked').val();
				var name = "userSex";
				var value = s1;
				data[name] = value;

				var b_uid=uid;
				var name = "userId";
				var value = b_uid;
				data[name] = value;
				
				var b_upd=upd;
				var name = "userPassword";
				var value = b_upd;
				data[name] = value;
				
				var b_uac=uac;
				var name = "userAccount";
				var value = b_uac;
				data[name] = value;
			$.ajax({
				url : "user/update.do",
				data : data,
				dataType : "json",
				type : "post",
				success :alert("更新成功!")
			});
		})
	});
});

</script> 
</body>
</html>