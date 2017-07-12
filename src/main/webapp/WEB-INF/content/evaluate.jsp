<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>评价</title>
<link href="css/pinfen.css" rel="stylesheet">
<script type="text/javascript" >
var pinfen="";
window.onload = function(){

	  var stargood= document.getElementById("star");
	    var star_li= stargood.getElementsByTagName("li");
	    var star_word = document.getElementById("star_word");
	    var result = document.getElementById("result");
	    var i=0;
	    var j=0;
	    var len = star_li.length;
	    var word = ['很差','差','一般',"好","很好"];
	    
	    for(i=0;i<len;i++){
	    	star_li[i].index=i;
	    	star_li[i].onmouseover=function(){
	    		star_word.style.display="block";
	    		star_word.innerHTML=word[this.index];
	    		for(i=0;i<=this.index;i++){
	    			star_li[i].className="act";
	    			
	    		}
	    	}
	    	star_li[i].onmouseout=function(){
	    		star_word.style.display="none";
	    		for(i=0;i<len;i++){
	    			star_li[i].className="";
	    			
	    		}
	    	}
	    	star_li[i].onclick=function(){
	    		result.innerHTML=(this.index+1)+"分";
	    		pinfen=(this.index+1)+"分";
	    	}
  }
	    function pinfen(){
	    	
	    	$("#pinfen").val(pinfen);
	    }
	    	
}	   
	    

</script>
</head>
<body>
<form>
<div class="wrapper">
给我们个好评吧！ 
<span id="result"></span>
<ul id="star">
<li >★</li>
<li >★</li>
<li >★</li>
<li >★</li>
<li >★</li>
</ul>
<div id="star_word">一般</div>
<input type="text" id="pinfen" />
<input type="submit" onclick="pinfen()">

</div>  
</form>
</body>
</html>