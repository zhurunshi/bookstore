package junit.test;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.rush.bookstore.service.IOrderService;
import pers.rush.bookstore.vo.Orders;

public class OrderTest {
	private static IOrderService iorderService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			ApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
			iorderService = (IOrderService)act.getBean("orderService");
		} catch (RuntimeException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void save(){ //添加订单
		iorderService.saveOrder(new Orders(null,null,new Date()));
	}
}
