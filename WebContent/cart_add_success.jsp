<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功加入至购物车-网上书店</title>
<link href="css/bookstore.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
		<div class=content>
			<div class=right>
				<div class=right_box>
				<table>
				<tr>
					<td><img src="images/yes.png"></td>
					<td><font face=宋体>&nbsp;图书已成功添加至购物车！</font></td>
				</tr>
				</table>
					<form action="browseBookPaging.action" method="post">
					<br>
					<a href="cart_show.jsp"><input type="button" name="submit"
							value="去购物车结算" style= "color:#FFFFFF;background-color:#f75000;height:30px;font-size:16px;width:150px"/></a>
					<font size=2>&nbsp;&nbsp;<font color=grey>您还可以&nbsp;</font><a href="browseBookPaging.action"><font color=blue>继续购物</font></a></font>
							
					</form>
				</div>
			</div>
		</div>
</body>
</html>