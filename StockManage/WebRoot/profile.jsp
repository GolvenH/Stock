<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>个人资料</title>
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
<meta name="description"
	content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

<title>H+ 后台主题UI框架 - 个人资料</title>

<link rel="shortcut icon" href="favicon.ico">
<link href="user/css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
<link href="user/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
<link href="user/css/animate.min.css" rel="stylesheet">
<link href="user/css/style.min862f.css?v=4.1.0" rel="stylesheet">
</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content">
		<div class="row animated fadeInRight">
			<div class="col-sm-4">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>个人资料</h5>
					</div>
					<div>
						<div class="ibox-content no-padding  ">
							<div style="text-align:center;margin:0 auto;">
								<img alt="image" class="img-circle"
									style="text-align:center;margin:0 auto;"
									src="user/img/profile.jpg">
								<h4>
									<strong>我的账户信息</strong>
								</h4>
								<h4>
									<strong> </strong>
								</h4>
								<li></li>
								<h4>
									<strong> </strong>
								</h4>
								<h4>
									<strong id="username">用户名 </strong>
								</h4>
								<h4>
									<strong> </strong>
								</h4>
								<li></li>
							</div>

							<div class="ibox-title">
								<div style=" margin:0 auto; clear:both">
									<div style="float:left;">
										<h4>
											<strong>性别</strong>
										</h4>
										<p id="usersex">
											<i class="fa"></i> 性别
										</p>
										<h4>
											<strong>手机号</strong>
										</h4>
										<p id="usertel">
											<i class="fa"></i> 手机号
										</p>
									</div>
									<div style="float:right; ">
										<h4>
											<strong>账号类型</strong>
										</h4>
										<p id="useraccd">
											<i class="fa"></i> 网站管理员
										</p>
										<h4>
											<strong>邮箱</strong>
										</h4>
										<p id="useremail">
											<i class="fa"></i> 邮箱
										</p>

									</div>

								</div>
								<div style="text-align:center;margin:0 auto;clear:both">
									<button type="button" class="btn btn-primary ">
										<i class="fa fa-edit"></i> 修改个人信息
									</button>
								</div>
							</div>
							<div class="user-button ">
								<div class="row">
									<div class="col-sm-6"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
	<!-- 		<div class="col-sm-8">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>我的关注</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<div>
							<div class="feed-activity-list">
								<div class="feed-element">1</div>
							</div>

						</div>

					</div>



					<div class="ibox float-e-margins">
						<div class="ibox-title">
							<h5>我的自选股</h5>
							<div class="ibox-tools">
								<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
								</a>
							</div>
						</div>
						<div class="ibox-content">
							<div>
								<div class="feed-activity-list">
									<div class="feed-element">2</div>
								</div>

							</div>

						</div>



					</div>
				</div>
			</div>
 -->
			<%
				String usid = "1";
			%>
			<script src="user/js/jquery.min.js?v=2.1.4"></script>
			<script src="user/js/bootstrap.min.js?v=3.3.6"></script>
			<script src="user/js/content.min.js?v=1.0.0"></script>
			<script src="user/js/jquery.peity.min.js"></script>
			<script src="user/js/peity-demo.min.js"></script>
			<script type="text/javascript">
				var uid;
				var uac;
				var uname;
				var uem;
				var uac;
				var usex;
				var utel;
				$(function() {
					var id =<%=usid%>
				;
					$.ajax({
						url : "admin/findbyid.do?id=" + id,
						dataType : "json",
						type : "post",
						success : function(data) {
							var a_uid = data.Admin.adminId;
							var a_uname = data.Admin.adminName;
							var a_uem = data.Admin.adminEmail;
							var a_utel = data.Admin.adminTel;
							var a_upd = data.Admin.userPassword;
							var a_sex = data.Admin.adminSex;

							uid = a_uid;
							upd = a_upd;
							uem = a_uem;
							utel = a_utel;
							usex = a_sex;
							uname = a_uname;
							$("#username").text(uname);
							$("#usertel").text(utel);
							$("#useremail").text(uem);
							if (usex == "man")
								usex = "男";
							else
								usex = "女";
							$("#usersex").text(usex);
							
						}
					});
				});
			</script>
</body>
</html>