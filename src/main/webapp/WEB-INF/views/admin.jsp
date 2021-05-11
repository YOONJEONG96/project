<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onLoad="init()">
	<div id="div"></div>
</body>
<script>
	function init(){
	var json = JSON.parse('${Admin}');
		 alert(json);
		 alert(admin);
		var div = document.getElementById("div");
		var id = document.createElement("div");
		id.innerHTML =json[0].mId;
		div.appendChild(id);'
	}
</script>
</html>
