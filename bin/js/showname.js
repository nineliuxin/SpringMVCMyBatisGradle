$(document).ready(function(){
	var user_name="${user.user_name}"
	if(user_name==""){
		document.getElementById("li1").style.display="inline";
		document.getElementById("li2").style.display="inline";
		document.getElementById("login").style.display="inline";
		document.getElementById("reg").style.display="inline";
		document.getElementById("li3").style.display="none";
		document.getElementById("li4").style.display="none";
		
		
	}else{
		document.getElementById("li1").style.display="none";
		document.getElementById("li2").style.display="none";
		document.getElementById("login").style.display="none";
		document.getElementById("reg").style.display="none";
		document.getElementById("li3").style.display="inline";
		document.getElementById("li4").style.display="inline";
		
	}
})


