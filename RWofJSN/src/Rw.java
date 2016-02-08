import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.json.JsonException;
import javax.json.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class Rw {

	public static void main(String[] args)throws JSONException {
		// TODO Auto-generated method stub

		String fileName="c:/temp/test.json";
		jsonFileWrite(fileName);(fileName);eWrite(fileName);(fileName);ileWrite(fileName);
		jsonFileRead(fileName);
		}
		 
		//writing JSON
		public static void jsonFileWrite(String fileName) throws JsonException
		{
		 
		JsonObject allEmps=new JsonObject();
		 
		JSONArray empArray=new JSONArray();
		JSONObject empObj;
		JSONArray phoneNumbers =null;
		JSONObject phoneObj;
		 
		empObj = new JSONObject();
		empObj.put("Name", "ABC");
		empObj.put("Designation", "Manager");
		empObj.put("Pay", "Rs. 60000/-");
		 
		phoneNumbers= new JSONArray();
		phoneObj=new JSONObject();
		phoneObj.put("LandLine", "11-2xxxx99");
		phoneObj.put("Mobile", "99xxxxxx11");
		phoneNumbers.put(phoneObj);
		 
		empObj.put("PhoneNumbers", phoneNumbers);
		 
		empArray.put(empObj);
		 
		empObj = new JSONObject();
		empObj.put("Name", "ABC");
		empObj.put("Designation", "Sr.Manager");
		empObj.put("Pay", "Rs. 60000/-");
		 
		phoneNumbers= new JSONArray();
		phoneObj=new JSONObject();
		phoneObj.put("LandLine", "12-2xxxx129");
		phoneObj.put("Mobile", "45xxxxxx11");
		phoneNumbers.put(phoneObj);
		 
		empObj.put("PhoneNumbers", phoneNumbers);
		 
		empArray.put(empObj);
		 
		allEmps.put("Employees", empArray);
		 
		try {
		 
		// Writing to a file
		FileWriter file = new FileWriter(fileName);
		file.write(allEmps.toString());
		file.flush();
		file.close();
		 
		System.out.println("JSon file created");
		} catch (IOException e) {
		e.printStackTrace();
		}
		 
		}

	}

}
