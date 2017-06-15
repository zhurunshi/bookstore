<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据库管理-网上书店</title>
</head>
<body>
		<div id="header&top">
		<s:if test="#session.user.username != null">
<p align="right" style="font-size:13px;">你好，<s:property value="#session.user.username" />。&nbsp;<a href="cart_show.jsp" style="text-decoration:none"><img src="images/cart.png">&nbsp;<font color=black>购物车</font></a>&nbsp;<a href="logout.action" style="text-decoration:none"><font color=red>退出</font></a></p>
</s:if>
<s:else>
<p align="right" style="font-size:14px;">欢迎光临网上书店，请<a href="user_login.jsp" style="text-decoration:none" ><font color=red>登录</font></a>
<a href="user_register.jsp" style="text-decoration:none"><font color=blue>免费注册</font></a>
<a href="cart_show.jsp" style="text-decoration:none"><img src="images/cart.png">&nbsp;<font color=black>购物车</font></a>
 <a href="admin_manage.jsp" style="text-decoration:none"><font color=black>我是管理员</font></a>

</p>
</s:else>
		</div>
<table>
				<tr>
					<td style="width:100px"></td>
					<td><a href="index.jsp" ><img src="images/logo.png"></a></td>
					<td ><a href="index.jsp" ><img src="images/slogn.png"></a></td>
				</tr>
</table>

<p align="center">用&nbsp;&nbsp;户&nbsp;&nbsp;管&nbsp;&nbsp;理</p>
<p align="center"><a href="user_register.jsp" ><input style= "color:#FFFFFF;background-color:#009393;font-size:16px;width:210px" type="button" value="添加用户" ></a></p>
<p align="center"><a href="user_update.jsp" ><input style= "color:#FFFFFF;background-color:#009393;font-size:16px;width:210px" type="button" value="更新用户" ></a></p>
<p align="center"><a href="user_delete.jsp" ><input style= "color:#FFFFFF;background-color:#009393;font-size:16px;width:210px" type="button" value="删除用户" ></a></p>

<p align="center">图&nbsp;&nbsp;书&nbsp;&nbsp;管&nbsp;&nbsp;理</p>
<p align="center"><a href="book_add.jsp" ><input style= "color:#FFFFFF;background-color:#009393;font-size:16px;width:210px" type="button" value="添加图书" ></a></p>
<p align="center"><a href="book_update.jsp" ><input style= "color:#FFFFFF;background-color:#009393;font-size:16px;width:210px" type="button" value="更新图书" ></a></p>
<p align="center"><a href="book_delete.jsp" ><input style= "color:#FFFFFF;background-color:#009393;font-size:16px;width:210px" type="button" value="删除图书" ></a></p>
<div id="footer"><%@ include file="footer.jsp" %></div>
</body>
</html>