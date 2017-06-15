package junit.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.rush.bookstore.service.IUserService;
import pers.rush.bookstore.vo.User;

public class UserTest {
	private static IUserService iuserService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			ApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
			iuserService = (IUserService)act.getBean("userService");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	@Test
//	public void save(){ //添加用户
//		iuserService.saveUser(new User("test","000000"));	
//	}
//	@Test
//	public void delete(){ //删除用户
//		iuserService.deleteUser("ttttt");
//	}
//	@Test
//	public void find(){ //查找用户
//		User user = iuserService.findUser("Rush");
//		System.out.println(user.getPassword());
//	}
//	@Test
//	public void update(){
//		User user = iuserService.findUser("test");
//		user.setPassword("111111");
//		iuserService.updateUser(user);
//	}
}
