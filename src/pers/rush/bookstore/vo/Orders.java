package pers.rush.bookstore.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Orders {
	private Integer orderid;
	private User user;
	private Date orderdate;
	private Set<Orderitem> orderitems = new HashSet<>();
	//构造方法
	public Orders(){}
	public Orders(Integer orderid,User user,Date orderdate){
		this.orderid = orderid;
		this.user=user;
		this.orderdate = orderdate;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public Set<Orderitem> getOrderitems() {
		return orderitems;
	}
	public void setOrderitems(Set<Orderitem> orderitems) {
		this.orderitems = orderitems;
	}
}
