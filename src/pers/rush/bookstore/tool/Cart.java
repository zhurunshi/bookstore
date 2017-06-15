package pers.rush.bookstore.tool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import pers.rush.bookstore.vo.Book;
import pers.rush.bookstore.vo.Orderitem;

public class Cart {
	protected Map<Integer, Orderitem> items;
	public Map<Integer, Orderitem> getItems() {
		return items;
	}
	public void setItems(Map<Integer, Orderitem> items) {
		this.items = items;
	}
	//默认构造函数，如果购物车为空，生成购物车
	public Cart() {
		if (items == null)
			items = new HashMap<Integer, Orderitem>();
	}
	public void addBook(Integer bookid, Orderitem orderitem) { //添加图书到购物车		
		if (items.containsKey("bookid")) { //如果存在,更改数量
			Orderitem _orderitem = items.get(bookid);
			orderitem.setQuantity(_orderitem.getOrderitemid()
					+ orderitem.getQuantity());
			items.put(bookid, _orderitem);
		} 
		else { //如果不存在的话,添加入集合
			items.put(bookid, orderitem);
		}
	}
	public void updateCart(Integer bookid, int quantity) { //更新购物车的购买书籍数量
		Orderitem orderitem = items.get(bookid);
		orderitem.setQuantity(quantity);
		items.put(bookid, orderitem);
	}
	public float getTotalPrice() { //计算总价格
		float totalPrice = 0;
		for (Iterator<Orderitem> it = items.values().iterator(); it.hasNext();) {
			Orderitem orderitem = (Orderitem) it.next();
			Book book = orderitem.getBook();
			int quantity = orderitem.getQuantity();
			totalPrice += book.getPrice() * quantity;
		}
		return totalPrice;
	}
}
