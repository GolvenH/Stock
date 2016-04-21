<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'stockinfo-list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

    
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.admin.css" />

<link href="easyui-1.4.4/themes/default/easyui.css" rel="stylesheet" type="text/css" />
<link href="easyui-1.4.4/themes/icon.css" rel="stylesheet" type="text/css" /> 

    
 <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
 <script type="text/javascript" src="easyui-1.4.4/jquery.easyui.min.js"></script>
 
 
<style type="text/css">
.panel-header, .panel-body {  
border-width: 0px;  
}  
.datagrid,.combo-p{  
border:solid 1px #D4D4D4;  
}  
.datagrid *{  
-webkit-box-sizing: content-box;  
-moz-box-sizing: content-box;  
box-sizing: content-box;  
}  
</style>
    
 
</head>
  
<body class="easyui-layout  panel-header panel-body">
    <div region="north" border="true" split="true" style="overflow: hidden; height: 80px;">
        <div class="top-bg"></div>
    </div>
  
    <div id="mainPanle" region="center" style="overflow:scrollbar ;" class="datagrid combo-p datagrid *{" >

      
       <table id="datatable" class="easyui-datagrid" style="height:95%">
       </table>
    
    </div>
</body>


<script type="text/javascript">
$(function($) {
	$('#datatable').datagrid({
				//fit:true,
				url: 'stock/findallstock.do',
				fitColumns:true, //下面滚动条
				nowrap:false, //显示单个单元格全显示
				border:false, //边框
				idField:'stockinfoId', //分页记住所勾选的
				fitColumns:true,
				pagination:true,
				singleSelect:true,//是否单选 
	 	        pageSize: 5,//每页显示的记录条数，默认为10 
		        pageList: [5,10,15,20,30],//可以设置每页记录条数的列表 
	 	        rownumbers:true,//行号 
				columns:[[//多级表头 列数
					          {field: 'stockinfoId', checkbox: true},
							  {title:'股票名称',field:'stockinfoName',width:80},	 
							  {title:'股票代码',field:'stockinfoNum',width:80},
							  {title:'股票发行价格',field:'stockinfoPrice',width:110},
							  {title:'当前价格',field:'stockinfoCurrent',width:110},
							  {title:'股票发行时间',field:'stockinfoTime',width:120},
						]]
			});
});
function selectrow(){
  var row=$('#datatable').datagrid('getSelected');
  alert(row.stockinfoName);
  alert(row.stockinfoId);
  
}
</script>

</html>

