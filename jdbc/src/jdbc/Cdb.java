package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class Cdb {
    
	static final String JD_DRIVER = "com.mysql.jdbc.Driver"; 
	static final String DB_URL="jdbc:mysql://localhost/";
	
	static final String USER = "root";
	static final String PASS = "root";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Connection conn=null;
  Statement stmt=null;
   
  try {
	Class.forName("com.mysql.jdbc.Driver");
	
		conn= DriverManager.getConnection(DB_URL, USER, PASS);
	    stmt= conn.createStatement();
	    String sql;
	    sql="create database mov2";
	    stmt.executeUpdate(sql);
	
} catch(SQLException se){
    //Handle errors for JDBC
    se.printStackTrace();
 }catch(Exception e){
    //Handle errors for Class.forName
    e.printStackTrace();
 }finally{
    //finally block used to close resources
    try{
       if(stmt!=null)
          stmt.close();
    }catch(SQLException se2){
    }// nothing we can do
    try{
       if(conn!=null)
          conn.close();
    }catch(SQLException se){
       se.printStackTrace();
    }//end finally try
 }//end try
 System.out.println("Goodbye!");
  
	}

}
