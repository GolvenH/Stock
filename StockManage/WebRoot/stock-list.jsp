<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
	<title>股票管理</title>
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui/css/style.css" />
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 股票中心 <span class="c-gray en">&gt;</span> 股票管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c">
		<input type="text" class="input-text" style="width:250px" placeholder="请输入股票名称或代码...." id="" name="">
		<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
	</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l">
		
			<a href="javascript:;" onclick="findall()" class="btn btn-success radius">
			<i class="Hui-iconfont">&#xe601;</i>查询全部</a> 
		
			<a href="javascript:;" onclick="user_edit()" class="btn btn-secondary radius">
			<i class="Hui-iconfont">&#xe603;</i>编辑股票</a> 
			
			<a href="javascript:;" onclick="user_delete()" class="btn btn-danger radius">
			<i class="Hui-iconfont">&#xe6e2;</i>删除股票</a> 
			
			<a href="javascript:;"	onclick="member_add('添加用户','member-add.jsp','','510')"class="btn btn-primary radius">
			<i class="Hui-iconfont">&#xe600;</i>添加股票</a></span> 
			
			<span class="r">共有数据：<strong>88</strong> 条</span>
		</div>
			<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg ">
		<thead>
			<tr class="text-c">
				<th width="60">ID</th>
				<th width="80">股票名称</th>
				<th width="80">股票代码</th>				
				<th width="120">股票发行时间</th>
				<th width="100">股票发行价格</th>
				<th width="120">当前价格</th>
			</tr>
		</thead>
		<tbody class="text-c" id="tabless">
		
		</tbody>
	</table>
	</div>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.admin.js"></script> 
<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
		]
	});
	$('.table-sort tbody').on( 'click', 'tr', function () {
		if ( $(this).hasClass('selected') ) {
			$(this).removeClass('selected');
		}
		else {
			table.$('tr.selected').removeClass('selected');
			$(this).addClass('selected');
		}
	});
});
//股票查询全部
function findall(){
	
	 $.ajax({ url: "stock/findall.do",dataType:"json", success: function(data){		
		 var table=  $("#tabless");
		 var tem="";
		  for(var i=0;i<data.length;i++){
			  tem+=" <tr> <td>"+data[i].stockinfoId+"</td>"+
			  "<td>"+data[i].stockinfoName+"</td>"+
			  "<td>"+data[i].stockinfoNum+"</td> "+
			  "<td>"+data[i].stockinfoTime+"</td>"+
			  " <td>"+data[i].stockinfoPrice+"</td>"+
			  " <td>"+data[i].stockinfoCurrent+"</td>"+
			  "</tr>";
		  }
		  table.empty();
		  table.append(tem);
	  }
    }).submit();
}
/*股票-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*股票-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
</script> 
</body>
</html>
