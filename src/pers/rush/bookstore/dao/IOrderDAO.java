package pers.rush.bookstore.dao;

import pers.rush.bookstore.vo.Orders;

public interface IOrderDAO {
	public void saveOrder(Orders order);
}
