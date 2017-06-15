<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车-网上书店</title>
<link href="css/bookstore.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
		<div class=content>
			<div class=right>
				<div class=right_box>
					<s:set name="items" value="#session.cart.items" />
					<s:if test="#items.size != 0">
						<h3>
							<font color="blue">您购物车中图书</font>
						</h3>
						<div class="info_bk1">
						<s:iterator value="items" id="item">
							<s:form action="updateCart.action" method="post">
								<table width="600" border="0">
									<tr align="left">
										<td width="40">
											书名：
										</td>
										<td width="150">
											<s:property value="value.book.bookname" />
										</td>
										<td width="40">
											价格：
										</td>
										<td width="5">
											<font color=red>¥<s:property value="value.book.price" /></font>
										</td>
										<td width="40">
											数量：
										</td>
										<td width="50">
											<input type="text" name="quantity" value="<s:property  value="value.quantity"/>" size="4"
												onblur="check(this)" />
											<input type="hidden" name="bookid" value="
											<s:property  value="value.book.bookid"/>" />
										</td>
										<td width="50">
											<input type="submit" value="更新数量" />
										</td>
									</tr>
								</table>
							</s:form>
						</s:iterator>
						</div>
					应付总额:&nbsp;
					<font color=red><strong>¥<s:property value="#session.cart.totalPrice" />
					</strong></font>&nbsp;&nbsp;&nbsp;
					<a href="checkout.action"><input style= "color:#FFFFFF;background-color:#f75000;height:30px;font-size:16px;width:98px" type="submit" name="submit"
													value="确认结算" /></a>
					<br><br><font size=2 color=red>已结算订单中的图书及数量无法修改，请您<font color=red><strong>仔细</strong></font>确认图书信息后，确认结算。</font>
					</s:if>
					<s:else>
					
			            &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; 您的购物车中暂时没有图书！
			        
					</s:else>
				</div>
			</div>
		</div>
</body>
</html>