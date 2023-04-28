package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	static Connection conn;
	
	static
	{
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static Connection makeConnection() 
	{

			String username="postgres";
			String password="Cjlp@982";
			String connectionUrl="jdbc:postgresql://localhost:5432/bm";
			try {
				conn=DriverManager.getConnection(connectionUrl, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return conn;
	}
	
	

}
