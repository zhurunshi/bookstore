<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书搜索-网上书店</title>
<link href="css/bookstore.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
		<div class=content>
			<div class=right>
				<div class=right_box>
					<s:set name="books" value="#request.books" />
					<s:if test="#books.size != 0">
						<h3>
							<font color="blue">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 所有符合条件的图书</font>
						</h3>
						<br />
						<s:iterator value="#books" id="book">
							<table width=600 border=0>
								<tr>
									<td width=200 align="center">
										<img
											src="
												<s:property  value="#book.picture"/>"
											width="100">
									</td>
									<td valign="top" width=400>
										<table>
											<tr>
												<td>
												<s:property  value="#book.bookname" />
												<br><br>
												</td>
											</tr>
											<td>
												<font color=#f75000><strong>¥<s:property value="#book.price" /></strong></font>
													<br><br>
													<form action="addToCart.action" method="post">
													数量:
			<!--name属性与Action中对应-->						<input type="text" name="quantity" 
													value="1" size="4" />
													<input  type="hidden"value="
													<s:property value="#book.bookid"/>" 
															name="bookid">
															<br><br>
													<input style= "color:#FFFFFF;background-color:#f75000;height:30px;font-size:16px;width:98px" type="submit" name="submit"
													value="加入购物车" />
													</form>
											</td>
												
										</table>
									</td>
								</tr>
							</table>
							<br><br><br>
						</s:iterator>
					</s:if>
					<s:else>
			&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;对不起,没有合适的图书!
		</s:else>
				</div>
				
			</div>
			
		</div>
		
</body>
</html>