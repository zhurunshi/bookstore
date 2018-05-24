package pers.rush.bookstore.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import pers.rush.bookstore.service.IUserService;
import pers.rush.bookstore.vo.User;

public class UserAction extends ActionSupport {
	protected User user;
	protected IUserService userService;
	public User getUser() {
		return this.user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public String register() throws Exception {
		System.out.println(user.getUsername());
		User user1 = new User();
		user1.setUsername(user.getUsername());
		user1.setPassword(user.getPassword());
		userService.saveUser(user1);
		return SUCCESS;
	}
	public String delete() throws Exception {
		userService.deleteUser(user.getUsername());
		return SUCCESS;
	}
	public String update() throws Exception{
		String tmpUsername=user.getUsername();
		String tmpPassword=user.getPassword();
		
		User user=userService.findUser(tmpUsername);
		user.setPassword(tmpPassword);
		userService.updateUser(user);
		return SUCCESS;
	}
	public String login() throws Exception{
		User u=userService.validateUser(user.getUsername(), user.getPassword());
		if(u!=null){
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("user", u);
			return SUCCESS;
		} 
		else {
			return ERROR;
		}
	}
	public String logout() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("user");
		session.remove("cart");
		return SUCCESS;
	}
}
