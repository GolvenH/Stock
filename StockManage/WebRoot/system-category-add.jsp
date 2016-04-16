<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>栏目设置</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />

</head>
<body>
<div class="pd-20">
	<form action="" method="post" class="form form-horizontal" id="form-category-add">
		<div id="tab-category" class="HuiTab">
			<div class="tabBar cl"><span>基本设置</span><span>模版设置</span><span>SEO</span></div>
			<div class="tabCon">
				<div class="row cl">
					<label class="form-label col-3">栏目ID：</label>
					<div class="formControls col-6">11230</div>
				</div>
				<div class="row cl">
					<label class="form-label col-3"><span class="c-red">*</span>上级栏目：</label>
					<div class="formControls col-6"> <span class="select-box">
						<select class="select" id="sel_Sub" name="sel_Sub" onchange="SetSubID(this);">
							<option value="0">顶级分类</option>
							<option value="10">分类一级</option>
							<option value="101">&nbsp;&nbsp;├ 分类二级</option>
							<option value="102">&nbsp;&nbsp;├ 分类二级</option>
							<option value="20">分类一级</option>
							<option value="200">&nbsp;&nbsp;├ 分类二级</option>
						</select>
						</span> </div>
					<div class="col-3"> </div>
				</div>
				<div class="row cl">
					<label class="form-label col-3"><span class="c-red">*</span>分类名称：</label>
					<div class="formControls col-6">
						<input type="text" class="input-text" value="" placeholder="" id="" name="" datatype="*2-16" nullmsg="用户名不能为空">
					</div>
					<div class="col-3"> </div>
				</div>
				<div class="row cl">
					<label class="form-label col-3">别名：</label>
					<div class="formControls col-6">
						<input type="text" class="input-text" value="" placeholder="" id="" name="">
					</div>
					<div class="col-3"> </div>
				</div>
				<div class="row cl">
					<label class="form-label col-3">目录：</label>
					<div class="formControls col-6">
						<input type="text" class="input-text" value="" placeholder="" id="" name="">
					</div>
					<div class="col-3"> </div>
				</div>
				<div class="row cl">
					<label class="form-label col-3">内容类型：</label>
					<div class="formControls col-6"> <span class="select-box">
						<select name="" class="select">
							<option value="1">文章</option>
							<option value="2">图片</option>
							<option value="3">商品</option>
							<option value="4">视频</option>
							<option value="5">专题</option>
							<option value="6">链接</option>
						</select>
						</span> </div>
					<div class="col-3"> </div>
				</div>
				<div class="row cl">
					<label class="form-label col-3">是否生成静态html：</label>
					<div class="formControls col-6 skin-minimal">
						<div class="check-box">
							<input type="checkbox" id="checkbox-pinglun">
							<label for="checkbox-pinglun">&nbsp;</label>
						</div>
					</div>
					<div class="col-3"> </div>
				</div>
			</div>
			<div class="tabCon">
				<div class="row cl">
					<label class="form-label col-3">首页模版：</label>
					<div class="formControls col-6">
						<input type="text" class="input-text" value="" style="width:200px;">
						<input type="button" class="btn btn-default" value="浏览">
					</div>
					<div class="col-3"> </div>
				</div>
				<div class="row cl">
					<label class="form-label col-3">列表页模版：</label>
					<div class="formControls col-6">
						<input type="text" class="input-text" value="" style="width:200px;">
						<input type="button" class="btn btn-default" value="浏览">
					</div>
					<div class="col-3"> </div>
				</div>
				<div class="row cl">
					<label class="form-label col-3">详情页模版：</label>
					<div class="formControls col-6">
						<input type="text" class="input-text" value="" style="width:200px;">
						<input type="button" class="btn btn-default" value="浏览">
					</div>
					<div class="col-3"> </div>
				</div>
				<div class="row cl">
					<label class="form-label col-3">详细页存储规则：</label>
					<div class="formControls col-6"> <span class="select-box">
						<select class="select" id="" name="">
							<option value="1">按年度划子目录</option>
							<option value="2">按年/月划分子目录</option>
							<option value="3">按年/月/日划分子目录</option>
						</select>
						</span> </div>
					<div class="col-3"> </div>
				</div>
				<div class="row cl">
					<label class="form-label col-3">每页显示多少条：</label>
					<div class="formControls col-6">
						<input type="text" class="input-text" value="20" style="width:200px;">
					</div>
					<div class="col-3"> </div>
				</div>
			</div>
			<div class="tabCon">
				<div class="row cl">
					<label class="form-label col-3">首页文件名：</label>
					<div class="formControls col-6">
						<input type="text" class="input-text" value="index.html" style="width:200px;">
					</div>
					<div class="col-3"> </div>
				</div>
				<div class="row cl">
					<label class="form-label col-3">关键词：</label>
					<div class="formControls col-6">
						<input type="text" class="input-text" value="">
					</div>
					<div class="col-3"> </div>
				</div>
				<div class="row cl">
					<label class="form-label col-3">描述：</label>
					<div class="formControls col-6">
						<textarea name="" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="textarealength(this,100)"></textarea>
						<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
					</div>
					<div class="col-3"> </div>
				</div>
			</div>
		</div>
		<div class="row cl">
			<div class="col-9 col-offset-3">
				<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</div>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-article-category-add").Validform({
		tiptype:2,
		callback:function(form){
			form[0].submit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			parent.layer.close(index);
		}
	});
	$.Huitab("#tab-category .tabBar span","#tab-category .tabCon","current","click","0");
});
</script>
</body>
</html>