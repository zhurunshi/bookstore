<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
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
					<td>
					<form action="book_search.action" method="post">
						<input type="text" name="bookname" size="50" style="height:32px;font-size:16px">
						<input type="submit" name="submit" value="搜索" style= "color:#FFFFFF;background-color:#009393;height:32px;width:100px;font-size:16px;border:0px">
					</form>
					</td>
				</tr>
</table>