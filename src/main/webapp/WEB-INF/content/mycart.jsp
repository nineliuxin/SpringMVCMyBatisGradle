<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的购物车</title>
<script type="text/javascript" src="js/jsmycart.js">
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

<form action="" method="post">
<input type="button"  id="alter" name="alter" value="编辑" onclick="alterinfo()" style="display:inline"/>
<input type="submit"  id="finish" name="finish" value="完成" onclick="action='mycartfinish'" style="display:none"/>
<table border="none">
<c:forEach items="${requestScope.cartlist }"  var="cartlist">
<div id="container" style=";margin-top:80px;">
<tr>
<td><img src="${cartlist.image }" width="200"  height="160" class="img-rounded"></td>
</tr>
<tr>
<td><input id="box"  name="box" type="checkbox" value="${cartlist.suk}" onclick="checkonebox('checkall','box')"/>${cartlist.goodname }
<input type="text" name="suklist"  style="display:none" value="${cartlist.suk }"/></td>
</tr>
<tr>
<td><div class="showdiv" style="display:block">${cartlist.price}×${cartlist.quantity }</div>
<div class="quan" style="display:none;float:left" >数量：</div><input type="text" name="quantity" value="${cartlist.quantity }" style="display:none">
</td>
</tr>
</div>
</c:forEach>
</table>
<input id="checkall"  type="checkbox"  value=""  onclick="checkboxall('checkall','box')"/>全选/全不选
<input type="submit"  id="delete" name="delete" value="删除" style="display:none" onclick="action='mycartdelete'"/>
<input type="submit"   name="submit" value="结算" onclick="action='mycartsubmit'"/>
</form>

</body>
</html>