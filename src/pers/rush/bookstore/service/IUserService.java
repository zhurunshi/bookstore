package pers.rush.bookstore.service;

import pers.rush.bookstore.vo.User;

public interface IUserService {
	public void saveUser(User user); //添加用户
	public void deleteUser(String username); //删除用户
	public User validateUser(String username, String password); //校验用户身份
	public boolean exitUser(String username); //用户退出
	public User findUser(String username); //查找用户，结合更新使用
	public void updateUser(User user); //修改密码
}
