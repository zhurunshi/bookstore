package pers.rush.bookstore.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.rush.bookstore.dao.IUserDAO;
import pers.rush.bookstore.service.IUserService;
import pers.rush.bookstore.vo.User;

@Service @Transactional
public class UserService implements IUserService {
	@Resource private IUserDAO userDAO;

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public void saveUser(User user) {
		this.userDAO.saveUser(user);
	}
	public void deleteUser(String username) {
		this.userDAO.deleteUser(username);
	}
	public User validateUser(String username, String password) {
		return userDAO.validateUser(username, password);
	}
	public boolean exitUser(String username) {
		return userDAO.exitUser(username);
	}
	public User findUser(String username) {
		return userDAO.findUser(username);
	}
	public void updateUser(User user) {
		this.userDAO.updateUser(user);
	}
}
