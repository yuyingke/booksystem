package app.run.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import app.run.dao.BookDao;
import app.run.entity.Book;
import app.run.service.BookServise;

@Service
public class BookServiceImpl implements BookServise{

	@Autowired
	BookDao bookDao = null;
	
	@Override
	//@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public int insertBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.insertBook(book);
	}

	@Override
	//@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public int deleteBook(String bookSn) {
		// TODO Auto-generated method stub
		return bookDao.deleteBook(bookSn);
	}

	@Override
	//@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.updateBook(book);
	}

	@Override
	//@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public Book getBook(String bookSn) {
		// TODO Auto-generated method stub
		return bookDao.getBook(bookSn);
	}

	@Override
	//@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public List<Book> findBook(String bookName, RowBounds rowBounds) {
		// TODO Auto-generated method stub
		return bookDao.findBook(bookName, rowBounds);
	}

}
