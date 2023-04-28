package service;

import java.util.List;

import model.BookPojo;

public interface BookService {
	
	BookPojo addBook(BookPojo bookPojo);
	BookPojo updateBook(BookPojo bookPojo);
	void deleteBook(int book_id);
	List<BookPojo> readAllBooks();
	BookPojo readABook(int book_id);
}
