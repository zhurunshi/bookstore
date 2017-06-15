package pers.rush.bookstore.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.rush.bookstore.dao.IUserDAO;
import pers.rush.bookstore.vo.User;

@Service @Transactional
public class UserDAO extends HibernateDaoSupport implements IUserDAO {
	@Resource SessionFactory factory;
	public void saveUser(User user) {
		this.getHibernateTemplate().save(user);
	}
	public void deleteUser(String username) {
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(User.class, username));
	}
	public User validateUser(String username, String password) {
		String str[] = { username, password };
		List<?> list = this.getHibernateTemplate().find(
				"from User u where u.username=? and u.password=?", str);
		if (list.size() > 0) {
			User user = (User) list.get(0);
			return user;
		} else
			return null;
	}
	public boolean exitUser(String username) {
		List<?> list = this.getHibernateTemplate().find(
				"from User where username=?", username);
		if (list.size() > 0)
			return true;
		else
			return false;
	}
	public User findUser(String username) {
		return (User)factory.getCurrentSession().get(User.class, username);
	}
	public void updateUser(User user) {
		factory.getCurrentSession().merge(user);
	}
}
