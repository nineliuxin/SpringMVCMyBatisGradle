<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>bennycake欢迎您</title>
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
  <script type="text/javascript" src="js/showname.js"></script> 


	
	
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
	.row{
		margin-top:100px;
		margin-left:15%;
	}
	#image1{
		float:left;
		width:10%;
		height:80px;
		margin-left:20%px;
		margin-top:60px;
	}
	pre{
		border:none;background:white;
		
	}

</style>
</head>
<body>
<!--  <h2>[${user.user_name }]bennycake欢迎您！</h2>-->

</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top"">
  		<div class="container">
    			<ul  id="list1" float="left">
				<li style="width:140px;">bennycake</li>
				<li  id="li1"style="display:inline"><a href="loginForm" style="display:inline" id="login">请登录</a></li>
				<li  id="li2"style="display:inline"><a href="registerForm" style="display:inline" id="reg">免费注册</a></li>
				<li  id="li3">欢迎你，</li>
				<li  id="li4">${user.user_name}</li>
			</ul>
			<ul float="left" id="list2">
				<li><a href="mycart.action?user_name=${user.user_name }"><span class="glyphicon glyphicon-shopping-cart"></span>&nbsp;购物车</a></li>
				<li><a href="mycollection.action?user_name=${user.user_name }"><span class="glyphicon glyphicon-heart"></span>&nbsp;收藏夹</a></li>
				<li><a href="myorder.action?user_name=${user.user_name }">我的订单</a></li>
			</ul>
  		</div>
		
	</nav>
	<div class="container">
	<img  src="image/logo.jpg" id="image1" />
	<div class="row"  >
		<div class="col-lg-7">
			<div class="input-group">
				<input type="text" class="form-control" placeholder="search for">
				<span class="input-group-btn">
        					<button class="btn btn-default" type="submit">搜索</button>
      				</span>
			</div>
		</div>
	</div>
<div style="width:10%;margin-left:1%;text-align:center;float:left;">
		
		<div class="list-group">
  			<a href="page1.action?num=1" class="list-group-item list-group-item-success">慕斯蛋糕</a>
  			<a href="page1.action?num=2" class="list-group-item list-group-item-info">奶油蛋糕</a>
  			<a href="page1.action?num=3" class="list-group-item list-group-item-warning">芝士蛋糕</a>
  			<a href="page1.action?num=4" class="list-group-item list-group-item-danger">翻糖蛋糕</a>
  			<a href="page1.action?num=5" class="list-group-item list-group-item-success">黑森林蛋糕</a>
  			<a href="page1.action?num=6" class="list-group-item list-group-item-info">海绵蛋糕</a>
  			<a href="page1.action?num=7"class="list-group-item list-group-item-warning">戚风蛋糕</a>
  			<a href="page1.action?num=8" class="list-group-item list-group-item-danger">天使蛋糕</a>
  			
		</div>
	</div>
<div style="float:right;width:52%;height:400px;margin-right:30%;">
	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
    <li data-target="#carousel-example-generic" data-slide-to="4"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="image/01.jpg" alt="">
      <div class="carousel-caption">
       
      </div>
    </div>
    <div class="item">
      <img src="image/02.jpg" alt="">
      <div class="carousel-caption">
        
      </div>
    </div>
    <div class="item">
      <img src="image/03.jpg" alt="">
      <div class="carousel-caption">
        
      </div>
    </div>
    <div class="item">
      <img src="image/04.jpg" alt="">
      <div class="carousel-caption">
        
      </div>
    </div>
    <div class="item">
      <img src="image/05.jpg" alt="">
      <div class="carousel-caption">
        
      </div>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>
	<div style="clear:both;"><span style="font-family:黑体；font-size:50px;">热销商品</span></div>
	<hr />
	<div>
		<table>
		<tr>
			<td><a href="page1-1.action?suk=10001"><img src="image/10001.jpg"  width="200" height="150">
			<pre><span style="color:red;">￥15.00</span>
草莓慕斯蛋糕</pre>
			</a>
			</td>
			<td>
				<a href="page1-1.action?suk=20012"><img src="image/20012.jpg"  width="200" height="150">
				<pre><span style="color:red;">￥18.00</span>
菠萝奶油蛋糕</pre>
				</a>
			</td>
			<td>
			<a href="page1-1.action?suk=30015"><img src="image/30015.jpg"  width="200" height="150">
				<pre><span style="color:red;">￥22.40</span>
冻芝士蛋糕</pre>
				</a>
			</td>
			<td>
			<a href="page1-1.action?suk=40018"><img src="image/40018.jpg"  width="200" height="150">
					<pre><span style="color:red;">￥19.70</span>
卡通翻糖蛋糕</pre>
				</a>
			</td>
			<td>
			<a href="page1-1.action?suk=50022"><img src="image/50022.jpg"  width="200" height="150">
					<pre><span style="color:red;">￥22.00</span>
巧克力黑森林</pre>
				</a>
			</td>
		</tr>
		</table>
	</div>
	<div>新品上市</div>
	<hr />
	<div>
		<table>
		<tr>
		
			<td>
			<a href="page1-1.action?suk=50021"><img src="image/50021.jpg" style="width:280px;height:180px;" />
				<pre><span style="color:red;">  ￥20.00</span>
  果酱黑森林</pre>
			</a>
			</td>
		
		
			<td>
			<a href="page1-1.action?suk=70027">
				<img src="image/70027.jpg" style="width:280px;height:180px;"/>
				<pre><span style="color:red;">	    ￥19.50</span>
            抹茶戚风蛋糕
				</pre>
			</a>
			</td>

			<td>
			<a href="page1-1.action?suk=50019"><img src="image/50019.jpg" style="width:280px;height:180px;" />
				<pre><span style="color:red;">      ￥21.00</span>
    樱桃黑森林
				</pre>
			</a>
			</td>
		
		<td><a href="page1-1.action?suk=20009">
			<img src="image/20009.jpg" style="width:280px;height:180px;" />
				<pre><span style="color:red;">  ￥18.80</span>
香草奶油蛋糕
				</pre>
			</a>
			</td>
		
			</tr>
		</table>
	</div>
	 当前在线人数：${sessions.size()}
</div>
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    
    <script src="js/bootstrap.min.js"></script>
   
  </body>
</html>


