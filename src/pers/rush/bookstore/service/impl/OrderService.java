package pers.rush.bookstore.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.rush.bookstore.dao.IOrderDAO;
import pers.rush.bookstore.service.IOrderService;
import pers.rush.bookstore.vo.Orders;

@Service @Transactional
public class OrderService implements IOrderService{
	@Resource private IOrderDAO orderDAO;
	public void saveOrder(Orders order) {
		this.orderDAO.saveOrder(order);
	}
	public void setOrderDAO(IOrderDAO orderDAO){
		this.orderDAO=orderDAO;
	}
}
