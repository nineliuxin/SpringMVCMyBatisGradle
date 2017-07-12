<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/jquery.cookie.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js"></script>

<script type="text/javascript">
$(document).ready(function(){
	if($.cookie("rmbUser")=="true"){
		$("#checkbox").attr("checked",true);
		$("#loginname").val($.cookie("username"));
		$("#password").val($.cookie("pwd"));
		
	}
	
});

function Save(){
	if($("#checkbox:checked").length==1){
		var str_username=$("#loginname").val();
		var str_password=$("#password").val();
		$.cookie("rmbUser","true",{expires:7});
		$.cookie("username",str_username,{expires:7});
		$.cookie("pwd",str_password,{expires:7});
	}else{
		$.cookie("rmbUser","false",{expires:-1});
		$.cookie("username","",{expires:-1});
		$.cookie("pwd","",{expires:-1});
	}
	
};

</script>
<link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
    form{
    	float:right;
    	width:400px;
    	height:450px;
    	background-color:#FFECF5;
    	margin-right:200px;
    	text-aligin:center;
    	margin-top:20px;
    	padding:0 auto;
    }
    div,span,input{
     margin:0px;
     padding:0px;
    }
    #zj{
    	width:100%;
    	height:600px;
    	background-image:url(image/background2.jpg);   
    }
    </style>
</head>
<body>
<div style="height:80px;">
	<img src="image/logo.jpg" style="margin-left:200px;">
	<span style="font-family:楷体 ;font-size:24px;">欢迎登录</span>
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
	<input type="checkbox"  id="checkbox"/>记住密码
	<a href="getcode">忘记密码</a></div>
	<input type="submit" class="form-control" value="登录"  onclick="Save()" style="margin-top:100px;background-color:gray;" />
	<c:if test="${er!=null }"><c:out value="${er}" /></c:if>
	</div>
</div>

</form>

</div>


 
</body>
</html>