<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
	<style>
		.box{
			width:340px;
			height:60px;
			background:skyblue;
			margin:50px auto;
			padding:15px;
			font-size:14px;
		}
		#msg{
			font-size:14px;
			text-align:center;
			padding-top:12px;
		}
	</style>
	<script type="text/javascript">
		$(function(){
			$("#btn").click(function(){
				var str = $("#tel").val();
				$.ajax({
   					type:"get",
   					url:"http://localhost:8080/day05_work/service/s/find/"+str+"?_type=json",
					datetype:"json",
   					success:function(d){
   						$("#msg").html("号码归属地为： "+d.mobilearea+"   "+d.mobiletype);
   					},
   				});
				
			});
			
		
		});	
	</script>

  </head>
  
  <body>
    <div class="box">
    	请输入手机号码<input type="text" id="tel"/><button id="btn">查询</button>
    	<div id="msg" style="color:red;"></div>
    </div>
    
  </body>
</html>
