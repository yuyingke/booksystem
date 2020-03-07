package app.run.entity;

import java.sql.Timestamp;

public class Book {

	//书籍SN码
	String bookSn;
	//书名
	String bookName;
	
	//作者
	String bookAuthor;
	
	//出版日期
	Timestamp  bookPublicationDate;
	
	//入库日期
	Timestamp  bookStorageDate;
	
	//书籍简介
	String bookInfomation;
	
	//库存
	Integer bookStock;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookSn, String bookName, String bookAuthor, Timestamp  bookPublicationDate,
			Timestamp  bookStorageDate, String bookInfomation, Integer bookStock) {
			super();
			this.bookSn = bookSn;
			this.bookName = bookName;
			this.bookAuthor = bookAuthor;
			this.bookPublicationDate = bookPublicationDate;
			this.bookStorageDate = bookStorageDate;
			this.bookInfomation = bookInfomation;
			this.bookStock = bookStock;
		}

	public String getBookSn() {
		return bookSn;
	}

	public void setBookSn(String bookSn) {
		this.bookSn = bookSn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Timestamp  getBookPublicationDate() {
		return bookPublicationDate;
	}

	public void setBookPublicationDate(Timestamp  bookPublicationDate) {
		this.bookPublicationDate = bookPublicationDate;
	}

	public Timestamp  getBookStorageDate() {
		return bookStorageDate;
	}

	public void setBookStorageDate(Timestamp  bookStorageDate) {
		this.bookStorageDate = bookStorageDate;
	}

	public String getBookInfomation() {
		return bookInfomation;
	}

	public void setBookInfomation(String bookInfomation) {
		this.bookInfomation = bookInfomation;
	}

	public Integer getBookStock() {
		return bookStock;
	}

	public void setBookStock(Integer bookStock) {
		this.bookStock = bookStock;
	}
	
}
