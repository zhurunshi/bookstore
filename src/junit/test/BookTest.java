package junit.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.rush.bookstore.service.IBookService;
import pers.rush.bookstore.vo.Book;

public class BookTest {
private static IBookService ibookService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			ApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
			ibookService = (IBookService)act.getBean("bookService");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	@Test
//	public void save(){ //添加图书
//		ibookService.saveBook(new Book("测试",10.0,"picture.jpg"));	
//	}
//	@Test
//	public void delete(){ //删除图书
//		ibookService.deleteBook(6);
//	}
	@Test
	public void update(){ //更新图书
		Book book = ibookService.findBook(5);
		System.out.println(book.getBookname());
		book.setPicture("images/JavaEE轻量级框架.jpg");
		ibookService.updateBook(book);
	}
//	@Test
//	public void find(){ //查找图书
//		Book book = ibookService.findBook(11);
//		System.out.println(book.getBookid());
//	}
}
