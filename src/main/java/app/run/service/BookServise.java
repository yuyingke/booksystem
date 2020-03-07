package app.run.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import app.run.entity.Book;

public interface BookServise {
	
	public int insertBook(Book book);
	
	public int deleteBook(String bookSn);
	
	public int updateBook(Book book);
	
	public Book getBook(String bookSn);
	
	public List<Book> findBook(String bookName, RowBounds rowBounds);

}
