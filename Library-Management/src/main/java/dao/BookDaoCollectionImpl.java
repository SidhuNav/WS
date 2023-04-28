package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.BookPojo;

public class BookDaoCollectionImpl implements BookDao{
	List<BookPojo> allBooks= new ArrayList<BookPojo>();
	
	
	public BookDaoCollectionImpl() {
		BookPojo book1=new BookPojo(101,"Let us C", "Learn C language","yashwant", "Kalyani Publication", "" );
		BookPojo book2=new BookPojo(102,"Let us C++", "C++ language","Takis", "TechMax Publication", "" );
		BookPojo book3=new BookPojo(103,"Let us Java", "OOPS JAVA","Rajesh BVansal", "SunSoft Technologies", "" );
		BookPojo book4=new BookPojo(104,"AWS Cloud computing", "Introduction to Cloud Computing","Sidhu", "SSS Publication", "" );
		allBooks.add(book1);
		allBooks.add(book2);
		allBooks.add(book3);
		allBooks.add(book4);
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		int id=allBooks.get(allBooks.size()-1).getBook_id()+1;
		bookPojo.setBook_id(id);
		
		allBooks.add(bookPojo);
		return bookPojo;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		for(int i=0;i<allBooks.size();i++)
		{
			if(allBooks.get(i).getBook_id()==bookPojo.getBook_id())
			{
				allBooks.set(i, bookPojo);
				break;
			}
		}
		return bookPojo;
	}

	@Override
	public void deleteBook(int book_id) {
		Iterator<BookPojo> itr=allBooks.iterator();
		while(itr.hasNext())
		{
			BookPojo getBook=itr.next();
			if(getBook.getBook_id()==book_id)
			{
				allBooks.remove(getBook);
				break;
			}
		}
		
	}

	@Override
	public List<BookPojo> readAllBooks() {
		
		return allBooks;
	}

	@Override
	public BookPojo readABook(int book_id) {
		BookPojo findBook=null;
		for(int i=0;i<allBooks.size();i++)
		{
			if(allBooks.get(i).getBook_id()==book_id)
			{
				findBook=allBooks.get(i);
				break;
			}
		}
		return findBook;
	}
	

}
