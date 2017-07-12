<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bennycake蛋糕</title>
<link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script  src="js/unslider.min.js">
	</script>
	<script  src="js/jquery-1.11.1.min.js">
	</script>
	
	
	
<style type="text/css">
	body{
		padding:0px;
		margin:0px;
	}
	
	.container #list1 li{
		float:left;
		line-height:20px;
		width:80px;
		list-style-type:none;
		padding:10px;
		margin:0px;
		font-size:14px;
		font-family:楷体;
	}
	#list2{
		float:right;
	}
	#list2 li{
		list-style-type:none;
		display:inline;
	}
	a:hover{
		text-decoration:none;
	}
	a{
		text-decoration:none;
	}
</style>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top"">
  		<div class="container">
    			<ul  id="list1" float="left">
				<li style="width:140px;">bennycake</li>
				<li ><a href="loginForm">请登录</a></li>
				<li ><a href="registerForm">免费注册</a></li>
			</ul>
			<ul float="left" id="list2">
				<li><a href=""><span class="glyphicon glyphicon-shopping-cart"></span>&nbsp;购物车</a></li>
				<li><a href=""><span class="glyphicon glyphicon-heart"></span>&nbsp;收藏夹</a></li>
				<li><a href="">我的订单</a></li>
			</ul>
  		</div>
		
	</nav>
<c:forEach items="${requestScope.goods }"  var="good">
<div id="container" style=";margin-top:80px;">
		<div id="left" style="float:left;"></div>
		<a href="page1-1.action?suk=${good.suk}"><img src="${good.image }" style="margin-left:250px;width:300px;height:260px;" /></a>
		<div id="right" style="float:right;margin-right:300px;">
		
			<span style="font-weight:bold;font-size:25px;">${good.description }</span>
			<div style="width:400px;height:50px;background-color:pink;"><span style="color:red;text-align:center;font-size:25px;line-height:50px;">￥${good.price }</span></div>
		
			
			<div style="height:50px;line-height:50px;font-size:20px;"><a href="page1-1.action?suk=${good.suk}">${good.goodname }</a>
			</div>
			
		
		</div>
	</div>
</c:forEach>
  	 <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    
    <script src="js/bootstrap.min.js"></script>	
  	
</body>
</html>