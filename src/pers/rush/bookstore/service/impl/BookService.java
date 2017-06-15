package pers.rush.bookstore.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.rush.bookstore.dao.IBookDAO;
import pers.rush.bookstore.service.IBookService;
import pers.rush.bookstore.vo.Book;

@Service @Transactional
public class BookService implements IBookService{
	@Resource private IBookDAO bookDAO;
	
	public void setBookDAO(IBookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}	
	public void saveBook(Book book) {
		this.bookDAO.saveBook(book);
	}
	public void deleteBook(Integer bookid) {
		this.bookDAO.deleteBook(bookid);
	}
	public void updateBook(Book book) {
		this.bookDAO.updateBook(book);
	}
	public Book findBook(Integer bookid) {
		return bookDAO.findBook(bookid);
	}
	public List<?> getRequiredBookByName(String name) {
		return bookDAO.getRequiredBookByName(name);
	}
	public Book getBookById(Integer bookid) {
		return bookDAO.getBookById(bookid);
	}
}
