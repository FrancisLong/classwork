<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.briup.ch08.bean.Product"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询结果</title>
</head>
<body>
     <table  width="450"  border="100"  cellSpacing=1> 
<% Product product = (Product)pageContext.getRequest().getAttribute("product"); %>
		<tr>
			<td>id</td>
			<td>name</td> 
			<td>price</td>
			<td>productPlace</td>
		</tr>
		<tr>
			<td>${product.id}</td>
			<td>${product.name}</td>
			<td>${product.price}</td>
			<td>${product.productPlace}</td>
			</tr>
	</table>
</body>
</html>