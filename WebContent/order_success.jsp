<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物完成-网上书店</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h3 align="center">订单添加成功</h3>
<p align="center"><strong><s:property value="#session.user.username" /></strong>，您的订单已经下达，您的订单号是<strong><s:property value="#request.order.orderid" /></strong>，我们会在24小时内寄送图书给您！</p>
<p align="center"><a href="viewOrders.action" style="text-decoration:none">查看订单</a></p>
<p align="center"><a href="logout.action" style="text-decoration:none">退出登录</a></p>
<br><br><br><br><br><br><br><br>
<div id="footer"><%@ include file="footer.jsp" %></div>
</body>
</html>