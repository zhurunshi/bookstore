package pers.rush.bookstore.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.rush.bookstore.dao.IBookDAO;
import pers.rush.bookstore.vo.Book;

@Service @Transactional
public class BookDAO extends HibernateDaoSupport implements IBookDAO{
	@Resource SessionFactory factory;
	public void saveBook(Book book) {
		this.getHibernateTemplate().save(book);
	}
	public void deleteBook(Integer bookid) {
		this.getHibernateTemplate().delete(this.getHibernateTemplate().load(Book.class, bookid));
	}
	public void updateBook(Book book) {
		factory.getCurrentSession().merge(book);//saveOrUpdate
	}
	public Book findBook(Integer bookid) {
		return (Book)factory.getCurrentSession().get(Book.class, bookid);
	}
	public List<?> getRequiredBookByName(String name) {
		try {
			List<?> books = this.getHibernateTemplate().find("from Book where bookname like '%" + name + "%'");
			return books;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public Book getBookById(Integer bookid) {
		return (Book)this.getHibernateTemplate().get(Book.class, bookid);
	}
}
