package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CommitnRoll {
	
	public static final String url= "com.mysql.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost/mov";
	
	 static final String USER = "root";
	 static final String PASS = "root";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Connecting to database...");
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
			   //Assume a valid connection object conn
			  conn.setAutoCommit(false);
			   
			  stmt = conn.createStatement();
			  System.out.println("1st update");
			  String sql = "INSERT INTO Emp  " +
			                "VALUES ('Rita', 'Tez',1000)";
			   stmt.executeUpdate(sql);  
			   //Submit a malformed SQL statement that breaks
			   System.out.println("2st update");
			   String sql1 = "INSERT IN Emp  " +
			                "VALUES ('Sita', 'Singh',10000)";
			   stmt.executeUpdate(sql1);
			   // If there is no error.
			   conn.commit();
			}
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException se){
			   // If there is any error.
			   conn.rollback();
			}

	}

}
