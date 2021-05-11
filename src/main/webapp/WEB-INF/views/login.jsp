<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${id }님 환영합니다
	
	<button value="LOGOUT" id="btn" onclick="admin(this)">LOGOUT</button>
	<button value="ADMIN" id="admin" onclick="admin(this)">관리자</button>
</body>
</html>
<script>

	function admin(obj) {
		var form = document.createElement("form");

		var admin = document.getElementById("admin");
		form.action = obj.value;
		form.method = "post";

		document.body.appendChild(form);

		form.appendChild(admin);
		form.appendChild(btn);
	}
</script>