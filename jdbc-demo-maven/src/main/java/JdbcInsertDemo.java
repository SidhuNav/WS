import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo {
	
	public static void main (String args[])
	{
		
		try {
			// Load the driver class into the memory
			Class.forName("org.postgresql.Driver"); //now my java is the client not psql
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {//Step 2 establish connection to the database server
			//1)Protocol 2)Credentials 3)IP Address 4)Port Number5)network
			//connectionUrl has the protocol, IP Address (where server is running eg local host or computer ip address)and port number
			String connectionUrl="jdbc:postgresql://localhost:5432/sample";
			String username="postgres";
			String password="Cjlp@982";
			Connection conn=DriverManager.getConnection(connectionUrl, username, password);
			System.out.println("Connection Established..... . . . ");
			
			//Step3: -create a statement and execute it
			Statement stmt=conn.createStatement();
			String query="INSERT INTO employee_details VALUES (106,502,'jot Sidhu',2400)";
			int rowsAffected=stmt.executeUpdate(query);	//return int to show how many rows added
			//boolean result=stmt.execute(query); - for DDL
			//int rows=stmt.executeUpdate(query); - for DML
			//ResultSet resultSet=stmt.executeQuery(query); - for DQL
			System.out.println(rowsAffected+"'s Affected");
			//Statement is an API
			
		} catch (SQLException e) {
			// Step4 Handle exception
			e.printStackTrace();
		}
	}

}
