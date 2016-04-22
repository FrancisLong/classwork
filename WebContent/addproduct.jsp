 <%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加</title>
</head>
<body>
	<center>
		<h1>添加商品</h1>
		<form action="add" method="post">
			商品名称：<input type="text" name="name"><br> 
			商品价格：<input type="text"name="price"><br> 
			生产地址：<input type="text"name="productPlace"><br>
			<input type="submit" value="添加">
		</form>
	</center>
</body>
</html>