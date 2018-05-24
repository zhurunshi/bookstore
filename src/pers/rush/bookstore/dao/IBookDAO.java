package pers.rush.bookstore.dao;

import java.util.List;

import pers.rush.bookstore.vo.Book;

public interface IBookDAO {
	public void saveBook(Book book); //添加图书
	public void deleteBook(Integer bookid); //删除图书
	public void updateBook(Book book); //修改图书
	public Book findBook(Integer bookid); //查找图书，结合更新使用
	public List<Book> getRequiredBookByName(String name); //根据书名查找图书
	public Book getBookById(Integer bookid); //根据书号查找图书，结合OrderAction使用
}
