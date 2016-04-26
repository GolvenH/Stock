<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<button onclick="test1()">11</button>
<button onclick="test2()">22</button>

 <div id="test1">
            <input id="input_text1" type="text" value="test1" style="width: 100px;" />
            <button id="button_text1">test1</button>
        </div>
        <!-- 获取文本框的值：方式二 -->
        <div id="test2">
            <input id="input_text2" type="text" value="test2" style="width: 100px;" />
            <button id="button_text2">test2</button>
        </div>
        <!-- 获取文本框的值：方式三 -->
        <div id="test3">
<!--             <input id="input_text3" type="text" value="test3" style="width: 100px;" />
 -->            
            <textarea id="input_text3" rows="" cols=""></textarea>
            <button id="button_text3">test3</button>
        </div>

  </body>
  <script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
  
  <script type="text/javascript">
  function test1() {
		var id=1;

		alert(id);
	}
  function test2() {
		var id=1;

		alert("id");
	}
  
  
  $(document).ready(function(){
      //1
      $("#button_text1").click(function(){
          var result1 = $("#input_text1").val();
          alert("result1 = " + result1);
      });
      //2
      $("#button_text2").click(function(){
          var result2 = $("input[id='input_text2']").val();
          alert("result2 = " + result2);
      });
      //3
      $("#button_text3").click(function(){
          var result3 = $("#input_text3").val();
          alert("result3 = " + result3);
      });
  });
  </script> 
</html>
