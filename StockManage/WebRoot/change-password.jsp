<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改密码</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />

</head>
<body>
<div class="pd-20">
	<form action="/" method="post" class="form form-horizontal" id="form-change-password">
		<div class="row cl">
			<label class="form-label col-4"><span class="c-red">*</span>账户：</label>
			<div class="formControls col-4"> 张三 </div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-4"><span class="c-red">*</span>新密码：</label>
			<div class="formControls col-4">
				<input type="password" class="input-text" autocomplete="off" placeholder="不修改请留空" name="new-password" id="new-password" datatype="*6-18" ignore="ignore" >
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-4"><span class="c-red">*</span>确认密码：</label>
			<div class="formControls col-4">
				<input type="password" class="input-text" autocomplete="off" placeholder="不修改请留空" name="new-password2" id="new-password2" recheck="new-password" datatype="*6-18" errormsg="您两次输入的密码不一致！" ignore="ignore" >
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<div class="col-8 col-offset-4">
				<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;保存&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script>
<script>
$(function(){
	$("#form-change-password").Validform({
		tiptype:2,
		callback:function(form){
			form[0].submit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.layer.close(index);
		}
	});
	
});
</script>
</body>
</html>