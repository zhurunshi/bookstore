package pers.rush.bookstore.vo;

public class Orderitem {
	private Integer orderitemid;
	private Book book;
	private Orders orders; //该订单项属于哪个订单
	private Integer quantity; //数量
	public Integer getOrderitemid() {
		return orderitemid;
	}
	public void setOrderitemid(Integer orderitemid) {
		this.orderitemid = orderitemid;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
