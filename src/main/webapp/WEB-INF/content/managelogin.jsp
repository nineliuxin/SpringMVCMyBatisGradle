<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登陆</title>
</head>
<body>
<div style="height:80px;">
	<img src="image/logo.jpg" style="margin-left:200px;">
	<span style="font-family:楷体 ;font-size:24px;">欢迎管理员登录</span>
</div>
<div id="zj">
<form action="login" method="post">
<div class="row" >
	<div class="col-lg-8" style="margin-top:50px;margin-left:60px;">
	<div class="input-group" >
		<span class="input-group-addon" id="input1"><span class="glyphicon glyphicon-user"></span></span>
		<input type="text" class="form-control" placeholder="用户名" aria-describedby="input1" name="loginname" id="loginname"/>
	</div>
	<div class="input-group" style="margin-top:35px;">
		<span class="input-group-addon" id="input2"><span class="glyphicon glyphicon-lock"></span></span>
		<input type="password" class="form-control" placeholder="密码" aria-describedby="input2" name="password"  id="password"/>
	</div>
	<div style="float:right;margin-top:25px;">
	
	<a href="getcode">忘记密码</a></div>
	<input type="submit" class="form-control" value="登录"  onclick="Save()" style="margin-top:100px;background-color:gray;" />
	<c:if test="${er!=null }"><c:out value="${er}" /></c:if>
	</div>
</div>

</form>

</div>


 
</body>
</html>