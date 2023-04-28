package dao;

import java.sql.SQLException;
import java.util.List;

import model.BookPojo;
import exception.SystemException;
public interface BookDao {
	
	BookPojo addBook(BookPojo bookPojo);
	BookPojo updateBook(BookPojo bookPojo);
	void deleteBook(int book_id);
	List<BookPojo> readAllBooks() throws SystemException;
	BookPojo readABook(int book_id);
	
	
}
