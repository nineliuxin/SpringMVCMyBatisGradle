<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>注册</title>
<link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
    	#zj{
    	width:100%;
    	height:600px;
    	background-image:url(image/background2.jpg);   
    }
    form{
    margin-top:20px;
    width:600px;
    height:400px;
    margin-left:800px;
   
    }
    tr{
    height:40px;
    }
    </style>
</head>
<body>
<div style="height:80px;">
	<img src="image/logo.jpg" style="margin-left:200px;">
	<span style="font-family:楷体 ;font-size:24px;">欢迎注册</span>
	
	</div>
	
	<div id="zj" >
	
<form action="register" method="post">
     <table>
         <tr>
         	<td><label>用户名: </label></td>
             <td><input type="text" id="loginname" name="loginname" ></td>
         </tr>
         <tr>
         	<td><label>密码: </label></td>
             <td><input type="password" id="password" name="password" ></td>
         </tr>
           <tr>
         	<td><label>地址: </label></td>
             <td><input type="text" id="adress" name="adress" ></td>
         </tr>
           <tr>
         	<td><label>邮箱: </label></td>
             <td><input type="text" id="email" name="email" ></td>
         </tr>
         <tr>
         	<td><label>电话号码: </label></td>
             <td><input type="text" id="telnumber" name="telnumber" ></td>
         </tr>
         <tr>
             <td><input type="submit" value="提交"></td>
         </tr>
     </table>
</form>
</div>


</body>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    
<script src="js/bootstrap.min.js"></script>
</html>