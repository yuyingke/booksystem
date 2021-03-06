package app.run.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import app.run.entity.Book;

@Repository
public interface BookDao {
	
	public int insertBook(Book book);
	
	public int deleteBook(String bookSn);
	
	public int updateBook(Book book);
	
	public Book getBook(String bookSn);
	
	public List<Book> findBook(String bookName, RowBounds rowBounds);
}
