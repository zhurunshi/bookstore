package pers.rush.bookstore.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import pers.rush.bookstore.service.IBookService;
import pers.rush.bookstore.vo.Book;

public class BookAction {
	private String bookname;
	protected Book book;
	protected IBookService bookService;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public IBookService getBookService() {
		return bookService;
	}
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String add() throws Exception {
		System.out.println(book.getBookname());
		Book book1 = new Book();
		book1.setBookid(book.getBookid());
		book1.setBookname(book.getBookname());
		book1.setPrice(book.getPrice());
		book1.setPicture(book.getPicture());
		bookService.saveBook(book1);
		return "success";
	}
	public String delete() throws Exception{
		bookService.deleteBook(book.getBookid());
		return "success";
	}
	public String update() throws Exception{
		Integer tmpBookid=book.getBookid();
		String tmpBookname=book.getBookname();
		Double tmpPrice=book.getPrice();
		String tmpPicture=book.getPicture();
		Book book=bookService.findBook(tmpBookid);
		book.setBookname(tmpBookname);
		book.setPrice(tmpPrice);
		book.setPicture(tmpPicture);
		bookService.updateBook(book);
		return "success";
	}
	public String search() throws Exception {
		List books = bookService.getRequiredBookByName(this.getBookname());
		Map request = (Map) ActionContext.getContext().get("request");
		System.out.println(bookname);
		request.put("books", books);
		return "success";
	}
	public String browseBookPaging() throws Exception {
		List books = bookService.getRequiredBookByName(this.getBookname());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("books", books);
		return "success";
	}
}
