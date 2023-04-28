package service;

import java.util.List;

import dao.BookDao;
import dao.BookDaoCollectionImpl;
import dao.BookDaoDatabaseImpl;
import model.BookPojo;

public class BookServiceImpl implements BookService{
	
	BookDao bookDao;

	public BookServiceImpl() {
		//bookDao=new BookDaoCollectionImpl();
		bookDao=new BookDaoDatabaseImpl();
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		return bookDao.addBook(bookPojo);
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		return bookDao.updateBook(bookPojo);
	}

	@Override
	public void deleteBook(int book_id) {
		bookDao.deleteBook(book_id);		
	}

	@Override
	public List<BookPojo> readAllBooks(){
		return bookDao.readAllBooks();
	}

	@Override
	public BookPojo readABook(int book_id) {
		return bookDao.readABook(book_id);
	}

}
