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

<title>评论管理</title>
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->

<link rel="stylesheet" type="text/css"
	href="lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui/css/style.css" />
<link href="easyui-1.4.4/themes/default/easyui.css" rel="stylesheet"
	type="text/css" />
<link href="easyui-1.4.4/themes/icon.css" rel="stylesheet"
	type="text/css" />
<style type="text/css">
.page-container {
	padding: 20px
}

.breadcrumb {
	background-color: #f5f5f5;
	padding: 0 20px
}

@media ( max-width : 767px) {
	.breadcrumb {
		padding: 0 15px
	}
}

.bg-1 {
	background-color: #f5fafe
}

h4 {
	line-height: 30px
}

.bk-gray {
	border: none
}

.mt-10 {
	margin-top: 5px;
	height: 30px;
	font-size: 14px;
}

.mt-20 {
	margin-top: 0px;
	height: 30px;
	font-size: 20px;
}

.pd-5 {
	padding: 5px
}

.pd-10 {
	padding: 10px
}

.pd-15 {
	padding: 15px
}

.pd-20 {
	padding: 20px
}

.pd-30 {
	padding: 30px
}

.pd-40 {
	padding: 40px
}

.bk-gray {
	border: solid 1px #eee
}

.Hui-iconfont {
	position: absolute;
	top: 9px;
	right: 10px;
	line-height: 20px;
	cursor: pointer;
	color: #000;
	opacity: 0.2;
	_color: #666
}

.btn-secondary {
	color: #fff;
	background-color: #3bb4f2;
	border-color: #3bb4f2
}

.radius {
	border-radius: 4px
}

.text-l {
	text-align: left
}

.text-r {
	text-align: right
}

.text-c {
	text-align: center
}

.btn-success {
	color: #fff;
	background-color: #5eb95e;
	border-color: #5eb95e
}

.btn-warning {
	color: #fff;
	background-color: #f37b1d;
	border-color: #f37b1d
}

.btn-secondary {
	color: #fff;
	background-color: #3bb4f2;
	border-color: #3bb4f2
}

.btn-primary {
	color: #fff;
	background-color: #5a98de;
	border-color: #5a98de
}

.btn, .btn.size-M {
	padding: 4px 12px
}

.input-text.size-MINI, .btn.size-MINI {
	font-size: 12px;
	height: 23px;
	padding: 1px 2px;
	line-height: 1.42857
} /*迷你*/
.r, .f-r {
	float: right !important;
	_display: inline
}

.l, .f-l {
	float: left !important;
	_display: inline
}

.en {
	font-family: Arial !important
}

.cl:after, .clearfix:after {
	content: "\20";
	display: block;
	height: 0;
	clear: both;
	visibility: hidden
}

.cl, .clearfix {
	zoom: 1
}
</style>
</head>
<body class="easyui-layout ">
	<div region="north" border="true" split="true"
		style="overflow: hidden; height: 135px;">
		<div class="top-bg">

			<nav class="breadcrumb mt-10">首页 <span class="c-gray en">&gt;</span>
			评论列表 <span class="c-gray en">&gt;</span> 评论管理 </nav>
			<div class="page-container">

				<div class="cl pd-5 bg-1 bk-gray mt-20">
					<span class="l"> <input onclick="user_delete()"
						type="submit" value="删除评论" class="btn btn-warning radius">
					</span> <span class="r text-c"><input type="text"
						class="input-text" style="width:250px ;font-size:18px"
						placeholder="请输入用户名或股票代码...." id="" name="">
						<button " class="btn btn-success radius" style="font-size:18px"
							id="" name="">搜索</button></span>
				</div>
			</div>
		</div>
	</div>



	<div region="south" style="overflow: hidden; height: 40px;">
		<div class="footer" style="font-size:18px ">
			<div style="text-align:center;margin:0 auto;">Copyright
				&copy;欢乐网络科技有限公司</div>
		</div>
	</div>

	<div id="mainPanle" region="center" style="overflow: hidden;"
		class=" laydate_box laydate_box *  datagrid combo-p  datagrid * ">

		<table id="datatable" style="height:95%">
		</table>

	</div>

	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="lib/layer/2.1/layer.js"></script>
	<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript"
		src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.admin.js"></script>
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="easyui-1.4.4/jquery.easyui.min.js"></script>
	<script type="text/javascript">
	$(function($) {
		$('#datatable').datagrid({
			//fit:true,
			url : 'bbs/findall.do',
			fitColumns : true, //下面滚动条
			nowrap : false, //显示单个单元格全显示
			border : false, //边框
			idField : 'bbsId', //分页记住所勾选的
			fitColumns : true,
			pagination : true,
			singleSelect : true,//是否单选 
			pageSize : 5,//每页显示的记录条数，默认为10 
			pageList : [ 5, 10, 15, 20, 30 ],//可以设置每页记录条数的列表 
			rownumbers : true,//行号 
			columns : [ [//多级表头 列数
			{
				field : 'bbsId',
				checkbox : true
			}, {
				title : '用户名',
				field : 'userName',
				width : 80
			}, {
				title : '股票名称',
				field : 'stockinfoName',
				width : 100
			}, {
				title : '股票代码',
				field : 'stockinfoSymbol',
				width : 40
			}, {
				title : '评论内容',
				field : 'bbsContent',
				width : 80
			}, {
				title : '评论时间',
				field : 'bbsTime',
				width : 80
			},

			] ]
		});
	});
	function user_delete() {
		var row = $('#datatable').datagrid('getSelected');
		alert(row.userName);
		alert(row.userId);

		$.ajax({
			url : "bbs/deletebyid.do?id=" + row.userId,
			dataType : "json",
			type : "post",
			success : alert("删除成功!"),

		});
	}
</script>
</body>
</html>
