package pers.rush.bookstore.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pers.rush.bookstore.dao.IOrderDAO;
import pers.rush.bookstore.vo.Orders;

public class OrderDAO extends HibernateDaoSupport implements IOrderDAO{
	public void saveOrder(Orders order) {
		this.getHibernateTemplate().save(order);
	}
}
