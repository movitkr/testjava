import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class JsnDB {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/mov";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
public static void main(String[] args) {
	
	 Connection conn = null;
     PreparedStatement prSt = null;
	
	try {
		
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to a selected database...");
		   conn = DriverManager.getConnection(DB_URL,USER, PASS);
		    System.out.println("Connected database successfully...");
		    
		 
		 //STEP 3: Open a connection
		    FileInputStream in = new FileInputStream("/home/movit/movit/JSNtoDB/test.json");
		    JsonReader jsonReader = Json.createReader(in);
		    JsonObject jo = jsonReader.readObject();
		    
		    jsonReader.close(); 
		   System.out.println(jo); 
		   
		   String name = jo.getString("name");
		   String dept = jo.getString("dept");
		   int sal= jo.getInt("sal");
		   System.out.println(""+name+"---"+dept+"---"+sal);
		   
		    
       
		/*FileInputStream json = new FileInputStream("/home/movit/movit/nwparser/mock.json");
		JsonParser jr = Json.createParser(json);
		
		String name=jr.getString();
		System.out.println(name);*/
		
		
		 String query = "insert into emp(ename,dept,sal) values(?,?,?)";
		 prSt = conn.prepareStatement(query);
		 prSt.setString(1, name);
         prSt.setString(2, dept);
         prSt.setInt(3, sal);
         int count = prSt.executeUpdate();
         System.out.println(count);
         System.out.println("done");
		
	}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
