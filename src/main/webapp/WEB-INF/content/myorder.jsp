<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的订单</title>
</head>
<body>
<c:forEach items="${requestScope.orderlist }"  var="orderlist">
<tr>
<td>${orderlist.ordernum}</td>
</tr>
<tr>
<td>${orderlist.ordertime}</td>
</tr>
<tr>
<td>${orderlist.ordergood}</td>
</tr>
<tr>
<td>${orderlist.orderstate}</td>
</tr>
<tr>
<td><input type="button" value="确认收货"></td>
</tr>
</c:forEach>
</body>
</html>