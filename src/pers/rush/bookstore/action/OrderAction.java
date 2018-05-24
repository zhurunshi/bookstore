package pers.rush.bookstore.action;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import pers.rush.bookstore.service.IBookService;
import pers.rush.bookstore.service.IOrderService;
import pers.rush.bookstore.tool.Cart;
import pers.rush.bookstore.vo.Book;
import pers.rush.bookstore.vo.Orderitem;
import pers.rush.bookstore.vo.Orders;
import pers.rush.bookstore.vo.User;

public class OrderAction extends ActionSupport {
	protected int bookid;
	protected int quantity;
	protected Orders order;
	protected IBookService bookService;
	protected IOrderService orderService;
    public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public IBookService getBookService() {
		return bookService;
	}
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}
	public IOrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(IOrderService orderService) {
		this.orderService = orderService;
	}
	public String addToCart() throws Exception {
		Book book = bookService.getBookById(bookid);
		Orderitem orderitem = new Orderitem();
		orderitem.setBook(book);
		orderitem.setQuantity(quantity);
		Map<String, Object> session = ActionContext.getContext().getSession();
		Cart cart = (Cart) session.get("cart");
		if (cart == null) {
			cart = new Cart();
		}
		cart.addBook(bookid, orderitem);
		session.put("cart", cart);
		return SUCCESS;
	}
	public String updateCart() throws Exception { //更新购物车
		Map<String, Object> session = ActionContext.getContext().getSession();
		Cart cart = (Cart) session.get("cart");
		//直接调用购物车模型中的方法实现修改图书数量
		cart.updateCart(bookid, this.getQuantity());
		System.out.println(this.getQuantity());
		session.put("cart", cart);
		return SUCCESS;
	}
	public String checkout() throws Exception { //结算
		Map<String, Object> session = ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		Cart cart = (Cart) session.get("cart");
		if (user == null || cart == null)
			return ActionSupport.ERROR; //如果没有登录返回登录界面
		Orders order = new Orders();
		order.setOrderdate(new Date());
		order.setUser(user);
		for (Iterator<Orderitem> it = cart.getItems().values().iterator(); it.hasNext();) {
			Orderitem orderitem = (Orderitem) it.next();
			orderitem.setOrders(order);
			order.getOrderitems().add(orderitem);
		}
		orderService.saveOrder(order);
		Map<String, Object> Session = ActionContext.getContext().getSession();
		Session.put("orders", order);
		Map<String, Object> request = (Map) ActionContext.getContext().get("request");
		request.put("order", order);
		return SUCCESS;
	}
	public String viewOrders()throws Exception { //展示订单
		Map<String, Object> Session = ActionContext.getContext().getSession();
		Orders order = (Orders) Session.get("orders");
		Map<String, Object> request = (Map) ActionContext.getContext().get("request");
		request.put("order", order);
		System.out.println(order.getOrderdate());
		return SUCCESS;
	}
}
