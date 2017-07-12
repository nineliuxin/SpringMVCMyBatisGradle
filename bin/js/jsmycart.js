//点击“全选/全不选”
function checkboxall(Allname,name){
	var ischecked=document.getElementById(Allname).checked;
	if(ischecked){
		checkallbox(name);
	}else{
		discheckallbox(name);
	}
}
//选中全部复选框
function checkallbox(name){
	var boxarray=document.getElementsByName(name);
	for (var i=0;i<boxarray.length;i++){
		boxarray[i].checked=true;
	}
}
//取消选择全部复选框
function discheckallbox(name){
	var boxarray=document.getElementsByName(name);
	for(var i=0;i<boxarray.length;i++){
		boxarray[i].checked=false;
	}
}
//点击某个复选框，如果所有复选框选中，“全选/全不选”也选中
//否则如果全部复选框都取消选中，“全选/全不选”也取消选中
function checkonebox(Allname,name){
	if(isallchecked(name)){
		document.getElementById(Allname).checked=true;
	}
	if(isalldischecked(name)){
		document.getElementById(Allname).checked=false;
	}
}
//是否全部选中
function isallchecked(name){
	var boxarray=document.getElementsByName(name);
	for(var i=0;i<boxarray.length;i++){
		if(!boxarray[i].checked){
			return false;
		}
	}
	return true;
}

//是否全部没有选中
function isalldischecked(name){
	var boxarray=document.getElementsByName(name);
	for(var i=0;i<boxarray.length;i++){
		if(boxarray[i].checked){
			return false;
		}
	}
	return true;
}

function getallcheckedvalue(name){
	var boxvalues="";
	var boxarray=document.getElementsByName(name);
	for(var i=0;i<boxarray.length;i++){
		if(boxarray[i].checked){
			var boxvalue=boxarray[i].value;
			if(boxvalues=""){
				boxvalues=boxvalue;
			}else{
				boxvalues=boxvalues+","+boxvalue;
			}
		}
	}
	return boxvalues;
}

//点击编辑，可修改商品数量，勾选多个删除
function alterinfo(){
	//显示完成按钮
	document.getElementById("finish").style.display="inline";
	//显示删除按钮
	document.getElementById("delete").style.display="inline";
	//显示数量字符标签
	var q=document.getElementsByClassName("quan");
	for(var i=0;i<q.length;i++){
		q[i].style.display="block";
	}
	//显示更改数量的文本框
	var aqs=document.getElementsByName("quantity");
	for(var i=0;i<aqs.length;i++){
		aqs[i].style.display="inline";
	}
	
	//隐藏编辑按钮
	document.getElementById("alter").style.display="none";
	//隐藏价格*数量
	var sd=document.getElementsByClassName("showdiv");
	for(var i=0;i<sd.length;i++){
		sd[i].style.display="none";
	}
	document.getElementsByClassName("showdiv").style.display="none";
}

//点击完成，更新表的信息，然后显示
