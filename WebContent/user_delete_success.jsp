<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户删除成功-网上书店</title>
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
					<td><h2>&nbsp;&nbsp;&nbsp;用户删除</h2></td>
				</tr>
</table>
<div class=content>
			<div class=right>
				<div class=right_box>
					<div class=info_bk1>
						<div align="center">
							<form action="user_delete.action" method="post" >

								<br><br><br><br><br><br><br>
								用户名:
								<input type="text" id="name" name="user.username" size=20
									onblur="validate()" value="<s:property  value="user.username"/>" disabled>
								<br><br>
								<br>
								<font color=red>该用户信息已被成功删除！</font>
								<br>
								<br>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<br><br><br><br><br><br><div id="footer"><%@ include file="footer.jsp" %></div>
</body>
</html>