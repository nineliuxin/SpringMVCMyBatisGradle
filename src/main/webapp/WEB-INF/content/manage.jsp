<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>
</head>
<body>
<link href="css/jquery-accordion-menu.css" rel="stylesheet" type="text/css" />
<link href="css/font-awesome.css" rel="stylesheet" type="text/css" />

<style type="text/css">
*{box-sizing:border-box;-moz-box-sizing:border-box;-webkit-box-sizing:border-box;}
body{background:#f0f0f0;}
.content{width:260px;margin:100px auto;}
.filterinput{
	background-color:rgba(249, 244, 244, 0);
	border-radius:15px;
	width:90%;
	height:30px;
	border:thin solid #FFF;
	text-indent:0.5em;
	font-weight:bold;
	color:#FFF;
}
#demo-list a{
	overflow:hidden;
	text-overflow:ellipsis;
	-o-text-overflow:ellipsis;
	white-space:nowrap;
	width:100%;
}
</style>

<script src="js/jquery-1.11.2.min.js" type="text/javascript"></script>
<script src="js/jquery-accordion-menu.js" type="text/javascript"></script>
<script type="text/javascript">
jQuery(document).ready(function () {
	jQuery("#jquery-accordion-menu").jqueryAccordionMenu();
	
});

$(function(){	
	//顶部导航切换
	$("#demo-list li").click(function(){
		$("#demo-list li.active").removeClass("active")
		$(this).addClass("active");
	})	
})	
</script>
</head>
<body>
<div style="height:80px;">
	<img src="image/logo.jpg" style="margin-left:10px;">
	<span style="font-family:楷体 ;font-size:24px;">bennycake后台管理</span>
</div>
<div class="content" style="float:left" >

	<div id="jquery-accordion-menu" class="jquery-accordion-menu red">
		<div class="jquery-accordion-menu-header" id="form"></div>
		<ul id="demo-list">
		 
		   <li class="active"><a href="showgood"><i class="fa fa-home"></i>商品管理 </a>
		   <ul class="submenu">
							<li><a href="addgood">商品添加 </a></li>
							<li><a href="deletegood">商品删除</a></li>
							<li><a href="modgood">商品修改</a></li>
						</ul></li>
			<li><a href="#"><i class="fa fa-glass"></i>订单管理 </a>
			<ul class="submenu">
					<li><a href="">订单修改 </a></li>
					<li><a href="#">订单删除 </a>
			</li>
			</ul>
			
			<li><a href="#"><i class="fa fa-cog"></i>用户管理</a>
				<ul class="submenu">
					<li><a href="#">用户注销 </a></li>
					<li><a href="#">修改密码 </a>
					
						
					</li>
				</ul>
			</li>
			<li><a href="#"><i class="fa fa-home"></i>系统管理 </a>
			<ul class="submenu">
					<li><a href="#">添加管理员 </a></li>
			<li><a href="#"><i class="fa fa-user"></i>About </a></li>
			<li><a href="#"><i class="fa fa-envelope"></i>Contact </a></li>
		   
		</ul>
		<div class="jquery-accordion-menu-footer">
			Footer
		</div>
	</div>
</div>
<div>

</div>

<script type="text/javascript">
(function($) {
$.expr[":"].Contains = function(a, i, m) {
	return (a.textContent || a.innerText || "").toUpperCase().indexOf(m[3].toUpperCase()) >= 0;
};
function filterList(header, list) {
	//@header 头部元素
	//@list 无需列表
	//创建一个搜素表单
	var form = $("<form>").attr({
		"class":"filterform",
		action:"#"
	}), input = $("<input>").attr({
		"class":"filterinput",
		type:"text"
	});
	$(form).append(input).appendTo(header);
	$(input).change(function() {
		var filter = $(this).val();
		if (filter) {
			$matches = $(list).find("a:Contains(" + filter + ")").parent();
			$("li", list).not($matches).slideUp();
			$matches.slideDown();
		} else {
			$(list).find("li").slideDown();
		}
		return false;
	}).keyup(function() {
		$(this).change();
	});
}
$(function() {
	filterList($("#form"), $("#demo-list"));
});
})(jQuery);	
</script>



</body>
</html>
