package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.BookPojo;

public class BookDaoDatabaseImpl implements BookDao{
	
	 
	@Override
	public BookPojo addBook(BookPojo bookPojo){
		Connection conn;
		try {
			conn=DBUtils.makeConnection();
			Statement stmt;
			stmt = conn.createStatement();
			String query="Insert into books_details values("+bookPojo.getBook_id()+", '"+bookPojo.getBook_name()+"', '"+bookPojo.getBook_description()+"', '"+bookPojo.getAuthor_name()+"', '"+bookPojo.getPublisher_name()+"', '')";
			int updates=stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return bookPojo;
		
	} 
	

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int book_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookPojo> readAllBooks() {
		List<BookPojo> allBooks=new ArrayList<BookPojo>();
		Connection conn=DBUtils.makeConnection();
		try {
			Statement stmt = conn.createStatement();
			String query="SELECT * FROM  books_details";
			ResultSet resultSet=stmt.executeQuery(query);
			while(resultSet.next()) {
				BookPojo bp=new BookPojo(resultSet.getInt(1),resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
				allBooks.add(bp);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return allBooks;
		
	}

	@Override
	public BookPojo readABook(int book_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
