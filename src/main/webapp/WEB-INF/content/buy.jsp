<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单信息确认</title>

</head>
<body>
<form action="pay" method="post">
<table>
         <tr>
         <td>收货人：<input type="text" name="recipient" value="${user.user_name }"/></td>
         </tr>
         <tr>
         <td>地址：<input type="text" name="address" value="${user.adress }"/></td>
         </tr>
         <tr>
         <td>联系电话：<input type="text" name="telephone" value="${user.telnumber }"/></td>
         </tr>
         <tr>
         <td>购买物品：${goods2.goodname }${goods2.price}×${quantity}<br/>
         <img src="${goods2.image }"/><br/>
         总价：${goods2.price*quantity} <br>
         </td>
        </tr>
        <tr>
             <td><input type="submit" value="提交订单" onClick=""></td>
         </tr>
</table>
</form>
</body>
</html>