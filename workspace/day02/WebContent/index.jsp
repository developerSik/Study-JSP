<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP로 만든 페이지</title>
</head>
<body>
	<form action="MyServlet" method="get">
		<label>
			이름 <input type="text" name="name">
		</label>
		<input type="submit" value="완료">
	</form>
</body>
</html>