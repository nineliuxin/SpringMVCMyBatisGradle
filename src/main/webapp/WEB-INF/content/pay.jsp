<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/reset.css">
<title>Insert title here</title>

</head>
<body>
<div class="content">
 <div class="title">请输入支付宝支付密码：</div>
 <div class="box"></div>
 <div class="forget">忘记密码？</div>
 <div class="point">请输入6位数字密码</div>
<a href="successpay.action?ordernum=${ordernum }" ><button class="getPasswordBtn">确定支付</button></a>
 <div class="errorPoint">请输入数字！</div>
 
</div>
<script language="javascript" src="js/main.js"></script>
</body>
</html>