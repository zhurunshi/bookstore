package pers.rush.bookstore.vo;

public class Book {
	private Integer bookid;
	private String bookname;
	private Double price;
	private String picture;
	//构造方法
	public Book() {}
	public Book(String bookname, Double price, String picture) {
		this.setBookname(bookname);
		this.setPrice(price);
		this.setPicture(picture);
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
}
