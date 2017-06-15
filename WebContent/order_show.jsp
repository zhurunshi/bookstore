<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单展示-网上书店</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<p align="center">订单号：<s:property value="#request.order.orderid" /></p>
<p align="center">用户名：<s:property value="#session.user.username" /></p>
<p align="center">订单完成时间：<s:property value="#request.order.orderdate" /></p>
<br><br><br><br><br><br><br><br><br><br><br>
<div id="footer"><%@ include file="footer.jsp" %></div>
</body>
</html>