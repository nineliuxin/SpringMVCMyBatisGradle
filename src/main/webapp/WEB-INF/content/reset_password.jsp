<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>重新设置密码</title>
<script type="text/javascript" src="js/jsreset_pwd.js">
</script>
</head>
<body>
<form action="successreset_pwd" method="post" name="form2">
输入密码<input type="password" name="reset_pwd"/>
<input type="submit" name="submit" value="确定" onClick="reset_alter()"/>
</form>
</body>
</html>